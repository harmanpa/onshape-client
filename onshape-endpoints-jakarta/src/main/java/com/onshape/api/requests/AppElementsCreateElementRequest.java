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
import com.onshape.api.responses.AppElementsCreateElementResponse;
import com.onshape.api.types.OnshapeDocument;
import jakarta.validation.constraints.NotNull;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Request object for createElement API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsCreateElementRequest {
  /**
   * The data type of the application. This string allows an application to distinguish their elements from elements of another application.
   */
  @JsonProperty("formatId")
  @NotNull
  String formatId;

  /**
   * The name of the element being created. If blank, a name will be auto-generated.
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * The label that will appear in the document&#39;s edit history. If blank, a value will be auto-generated.
   */
  @JsonProperty("description")
  @NotNull
  String description;

  /**
   * Initial list of sub-element contents
   */
  @JsonProperty("subelements")
  @NotNull
  AppElementsCreateElementRequestSubelements[] subelements;

  /**
   * Initialization data for the new element&#39;s json tree.
   */
  @JsonProperty("jsonTree")
  @NotNull
  Map jsonTree;

  /**
   * Location at which element should be inserted.
   */
  @JsonProperty("location")
  AppElementsCreateElementRequestLocation location;

  AppElementsCreateElementRequest(String formatId, String name, String description,
      AppElementsCreateElementRequestSubelements[] subelements, Map jsonTree,
      AppElementsCreateElementRequestLocation location) {
    this.formatId = formatId;
    this.name = name;
    this.description = description;
    this.subelements = subelements;
    this.jsonTree = jsonTree;
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
   * Get The name of the element being created. If blank, a name will be auto-generated.
   *
   * @return The name of the element being created. If blank, a name will be auto-generated.
   *
   */
  public final String getName() {
    return this.name;
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
   * Get Initial list of sub-element contents
   *
   * @return Initial list of sub-element contents
   *
   */
  public final AppElementsCreateElementRequestSubelements[] getSubelements() {
    return this.subelements;
  }

  /**
   * Get Initialization data for the new element&#39;s json tree.
   *
   * @return Initialization data for the new element&#39;s json tree.
   *
   */
  public final Map getJsonTree() {
    return this.jsonTree;
  }

  /**
   * Get Location at which element should be inserted.
   *
   * @return Location at which element should be inserted.
   *
   */
  public final AppElementsCreateElementRequestLocation getLocation() {
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
     * The name of the element being created. If blank, a name will be auto-generated.
     */
    private String name;

    /**
     * The label that will appear in the document&#39;s edit history. If blank, a value will be auto-generated.
     */
    private String description;

    /**
     * Initial list of sub-element contents
     */
    private AppElementsCreateElementRequestSubelements[] subelements;

    /**
     * Initialization data for the new element&#39;s json tree.
     */
    private Map jsonTree;

    /**
     * Location at which element should be inserted.
     */
    private AppElementsCreateElementRequestLocation location;

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
     * Get The name of the element being created. If blank, a name will be auto-generated.
     *
     * @return The name of the element being created. If blank, a name will be auto-generated.
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set The name of the element being created. If blank, a name will be auto-generated.
     *
     * @param value The name of the element being created. If blank, a name will be auto-generated.
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
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
     * Get Initial list of sub-element contents
     *
     * @return Initial list of sub-element contents
     *
     */
    public final AppElementsCreateElementRequestSubelements[] subelements() {
      return this.subelements;
    }

    /**
     * Set Initial list of sub-element contents
     *
     * @param value Initial list of sub-element contents
     *
     * @return the Builder object.
     */
    public final Builder subelements(AppElementsCreateElementRequestSubelements[] value) {
      this.subelements = value;
      return this;
    }

    /**
     * Get Initialization data for the new element&#39;s json tree.
     *
     * @return Initialization data for the new element&#39;s json tree.
     *
     */
    public final Map jsonTree() {
      return this.jsonTree;
    }

    /**
     * Set Initialization data for the new element&#39;s json tree.
     *
     * @param value Initialization data for the new element&#39;s json tree.
     *
     * @return the Builder object.
     */
    public final Builder jsonTree(Map value) {
      this.jsonTree = value;
      return this;
    }

    /**
     * Get Location at which element should be inserted.
     *
     * @return Location at which element should be inserted.
     *
     */
    public final AppElementsCreateElementRequestLocation location() {
      return this.location;
    }

    /**
     * Set Location at which element should be inserted.
     *
     * @param value Location at which element should be inserted.
     *
     * @return the Builder object.
     */
    public final Builder location(AppElementsCreateElementRequestLocation value) {
      this.location = value;
      return this;
    }

    private AppElementsCreateElementRequest build() {
      return new com.onshape.api.requests.AppElementsCreateElementRequest(formatId,name,description,subelements,jsonTree,location);
    }

    /**
     * Calls createElement method, Create an app element
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     */
    public final AppElementsCreateElementResponse call(String did, String wid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid", build(), onshape.buildMap("did", did, "wid", wid), onshape.buildMap(), com.onshape.api.responses.AppElementsCreateElementResponse.class);
    }

    /**
     * Calls createElement method, Create an app element
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AppElementsCreateElementResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/appelements/d/:did/w/:wid", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId()), onshape.buildMap(), com.onshape.api.responses.AppElementsCreateElementResponse.class);
    }
  }
}
