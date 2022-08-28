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
import com.onshape.api.responses.PartStudiosGetBoundingBoxesResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getBoundingBoxes API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosGetBoundingBoxesRequest {
  /**
   * Whether or not to include bounding boxes for hidden parts
   */
  @JsonProperty("includeHidden")
  Boolean includeHidden;

  /**
   * Whether to include wire bodies in the bounding box calculation
   */
  @JsonProperty("includeWireBodies")
  Boolean includeWireBodies;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  /**
   * Configuration string
   */
  @JsonProperty("configuration")
  String configuration;

  PartStudiosGetBoundingBoxesRequest(Boolean includeHidden, Boolean includeWireBodies,
      String linkDocumentId, String configuration) {
    this.includeHidden = includeHidden;
    this.includeWireBodies = includeWireBodies;
    this.linkDocumentId = linkDocumentId;
    this.configuration = configuration;
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
     * Whether or not to include bounding boxes for hidden parts
     */
    private Boolean includeHidden;

    /**
     * Whether to include wire bodies in the bounding box calculation
     */
    private Boolean includeWireBodies;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    /**
     * Configuration string
     */
    private String configuration;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Whether or not to include bounding boxes for hidden parts
     *
     * @return Whether or not to include bounding boxes for hidden parts
     *
     */
    public final Boolean includeHidden() {
      return this.includeHidden;
    }

    /**
     * Set Whether or not to include bounding boxes for hidden parts
     *
     * @param value Whether or not to include bounding boxes for hidden parts
     *
     * @return the Builder object.
     */
    public final Builder includeHidden(Boolean value) {
      this.includeHidden = value;
      return this;
    }

    /**
     * Get Whether to include wire bodies in the bounding box calculation
     *
     * @return Whether to include wire bodies in the bounding box calculation
     *
     */
    public final Boolean includeWireBodies() {
      return this.includeWireBodies;
    }

    /**
     * Set Whether to include wire bodies in the bounding box calculation
     *
     * @param value Whether to include wire bodies in the bounding box calculation
     *
     * @return the Builder object.
     */
    public final Builder includeWireBodies(Boolean value) {
      this.includeWireBodies = value;
      return this;
    }

    /**
     * Get Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     */
    public final String linkDocumentId() {
      return this.linkDocumentId;
    }

    /**
     * Set Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @param value Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return the Builder object.
     */
    public final Builder linkDocumentId(String value) {
      this.linkDocumentId = value;
      return this;
    }

    /**
     * Get Configuration string
     *
     * @return Configuration string
     *
     */
    public final String configuration() {
      return this.configuration;
    }

    /**
     * Set Configuration string
     *
     * @param value Configuration string
     *
     * @return the Builder object.
     */
    public final Builder configuration(String value) {
      this.configuration = value;
      return this;
    }

    private PartStudiosGetBoundingBoxesRequest build() {
      return new com.onshape.api.requests.PartStudiosGetBoundingBoxesRequest(includeHidden,includeWireBodies,linkDocumentId,configuration);
    }

    /**
     * Calls getBoundingBoxes method, Get the bounding box of a Part Studio, or an empty object if the Part Studio is empty. All
     *                 coordinates are in meters. Sketches are not used in computing the result.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     *
     * @param eid Element ID
     */
    public final PartStudiosGetBoundingBoxesResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/boundingboxes", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("includeHidden", includeHidden, "includeWireBodies", includeWireBodies, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosGetBoundingBoxesResponse.class);
    }

    /**
     * Calls getBoundingBoxes method, Get the bounding box of a Part Studio, or an empty object if the Part Studio is empty. All
     *                 coordinates are in meters. Sketches are not used in computing the result.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartStudiosGetBoundingBoxesResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/boundingboxes", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("includeHidden", includeHidden, "includeWireBodies", includeWireBodies, "linkDocumentId", linkDocumentId, "configuration", configuration), com.onshape.api.responses.PartStudiosGetBoundingBoxesResponse.class);
    }
  }
}
