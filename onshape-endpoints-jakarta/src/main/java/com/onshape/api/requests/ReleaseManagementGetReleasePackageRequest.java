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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.responses.ReleaseManagementGetReleasePackageResponse;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getReleasePackage API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ReleaseManagementGetReleasePackageRequest {
  /**
   * Whether to return detailed property information about all items.
   */
  @JsonProperty("detailed")
  Boolean detailed;

  ReleaseManagementGetReleasePackageRequest(Boolean detailed) {
    this.detailed = detailed;
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
    /**
     * Whether to return detailed property information about all items.
     */
    private Boolean detailed;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Whether to return detailed property information about all items.
     *
     * @return Whether to return detailed property information about all items.
     *
     */
    public final Boolean detailed() {
      return this.detailed;
    }

    /**
     * Set Whether to return detailed property information about all items.
     *
     * @param value Whether to return detailed property information about all items.
     *
     * @return the Builder object.
     */
    public final Builder detailed(Boolean value) {
      this.detailed = value;
      return this;
    }

    private ReleaseManagementGetReleasePackageRequest build() {
      return new com.onshape.api.requests.ReleaseManagementGetReleasePackageRequest(detailed);
    }

    /**
     * Calls getReleasePackage method, Returns detailed information about a release package with specified id
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param rpid ID of package to get detailed information for
     */
    public final ReleaseManagementGetReleasePackageResponse call(String rpid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/releasepackages/:rpid", build(), onshape.buildMap("rpid", rpid), onshape.buildMap("detailed", detailed), com.onshape.api.responses.ReleaseManagementGetReleasePackageResponse.class);
    }
  }
}
