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
import com.onshape.api.responses.WorkflowGetAllowedApproversResponse;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getAllowedApprovers API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class WorkflowGetAllowedApproversRequest {
  /**
   * Search query string
   */
  @JsonProperty("q")
  String q;

  /**
   * Include team members in addition to the teams themselves (default: true)
   */
  @JsonProperty("expandTeams")
  Boolean expandTeams;

  /**
   * Include the current user in the results (default: true)
   */
  @JsonProperty("includeSelf")
  Boolean includeSelf;

  WorkflowGetAllowedApproversRequest(String q, Boolean expandTeams, Boolean includeSelf) {
    this.q = q;
    this.expandTeams = expandTeams;
    this.includeSelf = includeSelf;
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
     * Search query string
     */
    private String q;

    /**
     * Include team members in addition to the teams themselves (default: true)
     */
    private Boolean expandTeams;

    /**
     * Include the current user in the results (default: true)
     */
    private Boolean includeSelf;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Search query string
     *
     * @return Search query string
     *
     */
    public final String q() {
      return this.q;
    }

    /**
     * Set Search query string
     *
     * @param value Search query string
     *
     * @return the Builder object.
     */
    public final Builder q(String value) {
      this.q = value;
      return this;
    }

    /**
     * Get Include team members in addition to the teams themselves (default: true)
     *
     * @return Include team members in addition to the teams themselves (default: true)
     *
     */
    public final Boolean expandTeams() {
      return this.expandTeams;
    }

    /**
     * Set Include team members in addition to the teams themselves (default: true)
     *
     * @param value Include team members in addition to the teams themselves (default: true)
     *
     * @return the Builder object.
     */
    public final Builder expandTeams(Boolean value) {
      this.expandTeams = value;
      return this;
    }

    /**
     * Get Include the current user in the results (default: true)
     *
     * @return Include the current user in the results (default: true)
     *
     */
    public final Boolean includeSelf() {
      return this.includeSelf;
    }

    /**
     * Set Include the current user in the results (default: true)
     *
     * @param value Include the current user in the results (default: true)
     *
     * @return the Builder object.
     */
    public final Builder includeSelf(Boolean value) {
      this.includeSelf = value;
      return this;
    }

    private WorkflowGetAllowedApproversRequest build() {
      return new com.onshape.api.requests.WorkflowGetAllowedApproversRequest(q,expandTeams,includeSelf);
    }

    /**
     * Calls getAllowedApprovers method, Get identities (users and/or teams) allowed to be approvers on a workflow object for the company.
     *                 Not object- or property-specific; used for delegation and company settings
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param companyId Company id
     */
    public final WorkflowGetAllowedApproversResponse call(String companyId) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/workflow/c/:companyId/approvers", build(), onshape.buildMap("companyId", companyId), onshape.buildMap("q", q, "expandTeams", expandTeams, "includeSelf", includeSelf), com.onshape.api.responses.WorkflowGetAllowedApproversResponse.class);
    }
  }
}
