// The MIT License (MIT)
//
// Copyright (c) 2018 - Present Onshape Inc. 
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.
//
package com.onshape.api.requests;

import com.onshape.api.Onshape;
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.responses.AccountsCancelPurchaseNewResponse;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for cancelPurchaseNew API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AccountsCancelPurchaseNewRequest {
  AccountsCancelPurchaseNewRequest() {
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final Builder builder(Onshape onshape) {
    Builder builder = new Builder();
    builder.onshape = onshape;
    return builder;
  }

  public static final class Builder {
    Onshape onshape;

    Builder() {
    }

    private AccountsCancelPurchaseNewRequest build() {
      return new com.onshape.api.requests.AccountsCancelPurchaseNewRequest();
    }

    /**
     * Calls cancelPurchaseNew method, Cancel a recurring subscription. This API is can be used in a context of OAuth-enabled
     *                 application.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param pid Purchase id
     *
     * @param aid account id
     */
    public final AccountsCancelPurchaseNewResponse call(String pid, String aid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("delete", "/accounts/:aid/purchases/:pid", build(), onshape.buildMap("pid", pid, "aid", aid), onshape.buildMap(), com.onshape.api.responses.AccountsCancelPurchaseNewResponse.class);
    }
  }
}
