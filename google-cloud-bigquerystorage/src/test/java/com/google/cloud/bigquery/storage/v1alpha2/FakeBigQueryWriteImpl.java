/*
 * Copyright 2016 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery.storage.v1alpha2;

import com.google.cloud.bigquery.storage.v1alpha2.Storage.*;
import com.google.common.base.Optional;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import org.threeten.bp.Duration;

/**
 * A fake implementation of {@link PublisherImplBase}, that can be used to test clients of a Cloud
 * Pub/Sub Publisher.
 */
class FakeBigQueryWriteImpl extends BigQueryWriteGrpc.BigQueryWriteImplBase {

  private static final Logger LOG = Logger.getLogger(FakeBigQueryWriteImpl.class.getName());

  private final LinkedBlockingQueue<AppendRowsRequest> requests = new LinkedBlockingQueue<>();
  private final LinkedBlockingQueue<Response> responses = new LinkedBlockingQueue<>();
  private final AtomicInteger nextMessageId = new AtomicInteger(1);
  private boolean autoPublishResponse;
  private ScheduledExecutorService executor = null;
  private Duration responseDelay = Duration.ZERO;

  /** Class used to save the state of a possible response. */
  private static class Response {
    Optional<AppendRowsResponse> appendResponse;
    Optional<Throwable> error;

    public Response(AppendRowsResponse appendResponse) {
      this.appendResponse = Optional.of(appendResponse);
      this.error = Optional.absent();
    }

    public Response(Throwable exception) {
      this.appendResponse = Optional.absent();
      this.error = Optional.of(exception);
    }

    public AppendRowsResponse getResponse() {
      return appendResponse.get();
    }

    public Throwable getError() {
      return error.get();
    }

    boolean isError() {
      return error.isPresent();
    }

    @Override
    public String toString() {
      if (isError()) {
        return error.get().toString();
      }
      return appendResponse.get().toString();
    }
  }

  @Override
  public StreamObserver<AppendRowsRequest> appendRows(
      final StreamObserver<AppendRowsResponse> responseObserver) {
    LOG.info("appendRows called!!!" + responses.size());
    Thread.dumpStack();
    final Response response = responses.remove();
    StreamObserver<AppendRowsRequest> requestObserver =
        new StreamObserver<AppendRowsRequest>() {
          @Override
          public void onNext(AppendRowsRequest value) {
            if (responseDelay == Duration.ZERO) {
              sendResponse(response, responseObserver);
            } else {
              final Response responseToSend = response;
              executor.schedule(
                  new Runnable() {
                    @Override
                    public void run() {
                      sendResponse(responseToSend, responseObserver);
                    }
                  },
                  responseDelay.toMillis(),
                  TimeUnit.MILLISECONDS);
            }
          }

          @Override
          public void onError(Throwable t) {
            responseObserver.onError(t);
          }

          @Override
          public void onCompleted() {
            responseObserver.onCompleted();
          }
        };
    return requestObserver;
  }

  private void sendResponse(
      Response response, StreamObserver<AppendRowsResponse> responseObserver) {
    if (response.isError()) {
      responseObserver.onError(response.getError());
    } else {
      responseObserver.onNext(response.getResponse());
      responseObserver.onCompleted();
    }
  }

  /** Set an executor to use to delay publish responses. */
  public FakeBigQueryWriteImpl setExecutor(ScheduledExecutorService executor) {
    this.executor = executor;
    return this;
  }

  /** Set an amount of time by which to delay publish responses. */
  public FakeBigQueryWriteImpl setResponseDelay(Duration responseDelay) {
    this.responseDelay = responseDelay;
    return this;
  }

  public FakeBigQueryWriteImpl addResponse(AppendRowsResponse appendRowsResponse) {
    responses.add(new Response(appendRowsResponse));
    return this;
  }

  public FakeBigQueryWriteImpl addResponse(AppendRowsResponse.Builder appendResponseBuilder) {
    return addResponse(appendResponseBuilder.build());
  }

  public FakeBigQueryWriteImpl addConnectionError(Throwable error) {
    responses.add(new Response(error));
    return this;
  }

  public List<AppendRowsRequest> getCapturedRequests() {
    return new ArrayList<AppendRowsRequest>(requests);
  }

  public void reset() {
    requests.clear();
    responses.clear();
  }
}
