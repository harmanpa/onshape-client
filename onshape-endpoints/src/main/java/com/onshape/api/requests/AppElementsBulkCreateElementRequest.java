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
import com.onshape.api.responses.AppElementsBulkCreateElementResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Request object for bulkCreateElement API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsBulkCreateElementRequest {
  /**
   * The data type of the application. This string allows an application to distinguish their elements from elements of another application.
   */
  @JsonProperty("formatId")
  @NotNull
  String formatId;

  /**
   * The names of the element being created. The number of provided names controls how many elements will be created.
   */
  @JsonProperty("names")
  @NotNull
  String[] names;

  /**
   * The label that will appear in the document&#39;s edit history. If blank, a value will be auto-generated.
   */
  @JsonProperty("description")
  @NotNull
  String description;

  /**
   * Location at which element should be inserted.
   */
  @JsonProperty("location")
  AppElementsBulkCreateElementRequestLocation location;

  AppElementsBulkCreateElementRequest(String formatId, String[] names, String description,
      AppElementsBulkCreateElementRequestLocation location) {
    this.formatId = formatId;
    this.names = names;
    this.description = description;
    this.location = location;
  }

  /**
   * Get The data type of the application. This string allows an application to distinguish their elements from elements of another application.
   *
   * @return The data type of the application. This string allows an application to distinguish their elements from elements of another application.
   *
   */
  public final String getFormatId() {
    return this.formatId;
  }

  /**
   * Get The names of the element being created. The number of provided names controls how many elements will be created.
   *
   * @return The names of the element being created. The number of provided names controls how many elements will be created.
   *
   */
  public final String[] getNames() {
    return this.names;
  }

  /**
   * Get The label that will appear in the document&#39;s edit history. If blank, a value will be auto-generated.
   *
   * @return The label that will appear in the document&#39;s edit history. If blank, a value will be auto-generated.
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Location at which element should be inserted.
   *
   * @return Location at which element should be inserted.
   *
   */
  public final AppElementsBulkCreateElementRequestLocation getLocation() {
    return this.location;
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
     * The data type of the application. This string allows an application to distinguish their elements from elements of another application.
     */
    private String formatId;

    /**
     * The names of the element being created. The number of provided names controls how many elements will be created.
     */
    private String[] names;

    /**
     * The label that will appear in the document&#39;s edit history. If blank, a value will be auto-generated.
     */
    private String description;

    /**
     * Location at which element should be inserted.
     */
    private AppElementsBulkCreateElementRequestLocation location;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get The data type of the application. This string allows an application to distinguish their elements from elements of another application.
     *
     * @return The data type of the application. This string allows an application to distinguish their elements from elements of another application.
     *
     */
    public final String formatId() {
      return this.formatId;
    }

    /**
     * Set The data type of the application. This string allows an application to distinguish their elements from elements of another application.
     *
     * @param value The data type of the application. This string allows an application to distinguish their elements from elements of another application.
     *
     * @return the Builder object.
     */
    public final Builder formatId(String value) {
      this.formatId = value;
      return this;
    }

    /**
     * Get The names of the element being created. The number of provided names controls how many elements will be created.
     *
     * @return The names of the element being created. The number of provided names controls how many elements will be created.
     *
     */
    public final String[] names() {
      return this.names;
    }

    /**
     * Set The names of the element being created. The number of provided names controls how many elements will be created.
     *
     * @param value The names of the element being created. The number of provided names controls how many elements will be created.
     *
     * @return the Builder object.
     */
    public final Builder names(String[] value) {
      this.names = value;
      return this;
    }

    /**
     * Get The label that will appear in the document&#39;s edit history. If blank, a value will be auto-generated.
     *
     * @return The label that will appear in the document&#39;s edit history. If blank, a value will be auto-generated.
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set The label that will appear in the document&#39;s edit history. If blank, a value will be auto-generated.
     *
     * @param value The label that will appear in the document&#39;s edit history. If blank, a value will be auto-generated.
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    /**
     * Get Location at which element should be inserted.
     *
     * @return Location at which element should be inserted.
     *
     */
    public final AppElementsBulkCreateElementRequestLocation location() {
      return this.location;
    }

    /**
     * Set Location at which element should be inserted.
     *
     * @param value Location at which element should be inserted.
     *
     * @return the Builder object.
     */
    public final Builder location(AppElementsBulkCreateElementRequestLocation value) {
      this.location = value;
      return this;
    }

    private AppElementsBulkCreateElementRequest build() {
      return new com.onshape.api.requests.AppElementsBulkCreateElementRequest(formatId,names,description,location);
    }

    /**
     * Calls bulkCreateElement method, Create multiple empty app elements. Faster than creating app elements one at a time or in
     *                 parallel.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     */
    public final AppElementsBulkCreateElementResponse call(String did, String wid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid/bulkcreate", build(), onshape.buildMap("did", did, "wid", wid), onshape.buildMap(), com.onshape.api.responses.AppElementsBulkCreateElementResponse.class);
    }

    /**
     * Calls bulkCreateElement method, Create multiple empty app elements. Faster than creating app elements one at a time or in
     *                 parallel.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AppElementsBulkCreateElementResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid/bulkcreate", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId()), onshape.buildMap(), com.onshape.api.responses.AppElementsBulkCreateElementResponse.class);
    }
  }
}
