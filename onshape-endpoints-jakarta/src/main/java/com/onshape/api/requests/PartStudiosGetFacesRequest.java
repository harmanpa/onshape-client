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
import com.onshape.api.responses.PartStudiosGetFacesResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getFaces API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosGetFacesRequest {
  /**
   * IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with faceId
   */
  @JsonProperty("partId")
  String partId;

  /**
   * If true, output vertex normals corresponding to surface normals at facet vertex points.
   */
  @JsonProperty("outputVertexNormals")
  Boolean outputVertexNormals;

  /**
   * Output facet normals
   */
  @JsonProperty("outputFacetNormals")
  Boolean outputFacetNormals;

  /**
   * Output texture coordinates
   */
  @JsonProperty("outputTextureCoordinates")
  Boolean outputTextureCoordinates;

  /**
   * Output index table
   */
  @JsonProperty("outputIndexTable")
  Boolean outputIndexTable;

  /**
   * Whether or not to output faces that cause an error
   */
  @JsonProperty("outputErrorFaces")
  Boolean outputErrorFaces;

  /**
   * Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value chosen based on the complexity of the parts being tessellated.
   */
  @JsonProperty("angleTolerance")
  Number angleTolerance;

  /**
   * Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true surface/edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
   */
  @JsonProperty("chordTolerance")
  Number chordTolerance;

  /**
   * Max facet width. This specifies the limit on the size of any side of a tessellation facet.
   */
  @JsonProperty("maxFacetWidth")
  Number maxFacetWidth;

  /**
   * IDs of the faces to tessellate (repeat query param to add more than one, i.e. faceId=JHK&amp;faceId=JHD)
   */
  @JsonProperty("faceId")
  String faceId;

  /**
   * If this parameter is specified, the provided level of detail will be retrieved from cache (if available) and used to return the tessellation in a more timely manner. The level-of-detail setting entails automatically-set chordal and angular tolerances. Hence any tolerances supplied to this API call will be ignored. Accepts the following values: coarse, medium, fine
   */
  @JsonProperty("precomputedLevelOfDetail")
  String precomputedLevelOfDetail;

  /**
   * Determines if face appearance data will be included in the output
   */
  @JsonProperty("outputFaceAppearances")
  Boolean outputFaceAppearances;

  /**
   * Determines if separate nodes will be created for each face or per part.
   */
  @JsonProperty("outputSeparateFaceNodes")
  Boolean outputSeparateFaceNodes;

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

  /**
   * If true, the geometry belonging to the constituents of composite parts will be combined within the parent composite part, rather than each constituent having its own node in the result.
   */
  @JsonProperty("combineCompositePartConstituents")
  String combineCompositePartConstituents;

  PartStudiosGetFacesRequest(String partId, Boolean outputVertexNormals, Boolean outputFacetNormals,
      Boolean outputTextureCoordinates, Boolean outputIndexTable, Boolean outputErrorFaces,
      Number angleTolerance, Number chordTolerance, Number maxFacetWidth, String faceId,
      String precomputedLevelOfDetail, Boolean outputFaceAppearances,
      Boolean outputSeparateFaceNodes, String linkDocumentId, String configuration,
      String combineCompositePartConstituents) {
    this.partId = partId;
    this.outputVertexNormals = outputVertexNormals;
    this.outputFacetNormals = outputFacetNormals;
    this.outputTextureCoordinates = outputTextureCoordinates;
    this.outputIndexTable = outputIndexTable;
    this.outputErrorFaces = outputErrorFaces;
    this.angleTolerance = angleTolerance;
    this.chordTolerance = chordTolerance;
    this.maxFacetWidth = maxFacetWidth;
    this.faceId = faceId;
    this.precomputedLevelOfDetail = precomputedLevelOfDetail;
    this.outputFaceAppearances = outputFaceAppearances;
    this.outputSeparateFaceNodes = outputSeparateFaceNodes;
    this.linkDocumentId = linkDocumentId;
    this.configuration = configuration;
    this.combineCompositePartConstituents = combineCompositePartConstituents;
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
     * IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with faceId
     */
    private String partId;

    /**
     * If true, output vertex normals corresponding to surface normals at facet vertex points.
     */
    private Boolean outputVertexNormals;

    /**
     * Output facet normals
     */
    private Boolean outputFacetNormals;

    /**
     * Output texture coordinates
     */
    private Boolean outputTextureCoordinates;

    /**
     * Output index table
     */
    private Boolean outputIndexTable;

    /**
     * Whether or not to output faces that cause an error
     */
    private Boolean outputErrorFaces;

    /**
     * Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value chosen based on the complexity of the parts being tessellated.
     */
    private Number angleTolerance;

    /**
     * Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true surface/edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
     */
    private Number chordTolerance;

    /**
     * Max facet width. This specifies the limit on the size of any side of a tessellation facet.
     */
    private Number maxFacetWidth;

    /**
     * IDs of the faces to tessellate (repeat query param to add more than one, i.e. faceId=JHK&amp;faceId=JHD)
     */
    private String faceId;

    /**
     * If this parameter is specified, the provided level of detail will be retrieved from cache (if available) and used to return the tessellation in a more timely manner. The level-of-detail setting entails automatically-set chordal and angular tolerances. Hence any tolerances supplied to this API call will be ignored. Accepts the following values: coarse, medium, fine
     */
    private String precomputedLevelOfDetail;

    /**
     * Determines if face appearance data will be included in the output
     */
    private Boolean outputFaceAppearances;

    /**
     * Determines if separate nodes will be created for each face or per part.
     */
    private Boolean outputSeparateFaceNodes;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    /**
     * Configuration string
     */
    private String configuration;

    /**
     * If true, the geometry belonging to the constituents of composite parts will be combined within the parent composite part, rather than each constituent having its own node in the result.
     */
    private String combineCompositePartConstituents;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with faceId
     *
     * @return IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with faceId
     *
     */
    public final String partId() {
      return this.partId;
    }

    /**
     * Set IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with faceId
     *
     * @param value IDs of the parts to tessellate (repeat query param to add more than one, i.e. partId=JHK&amp;partId=JHD). May not be combined with faceId
     *
     * @return the Builder object.
     */
    public final Builder partId(String value) {
      this.partId = value;
      return this;
    }

    /**
     * Get If true, output vertex normals corresponding to surface normals at facet vertex points.
     *
     * @return If true, output vertex normals corresponding to surface normals at facet vertex points.
     *
     */
    public final Boolean outputVertexNormals() {
      return this.outputVertexNormals;
    }

    /**
     * Set If true, output vertex normals corresponding to surface normals at facet vertex points.
     *
     * @param value If true, output vertex normals corresponding to surface normals at facet vertex points.
     *
     * @return the Builder object.
     */
    public final Builder outputVertexNormals(Boolean value) {
      this.outputVertexNormals = value;
      return this;
    }

    /**
     * Get Output facet normals
     *
     * @return Output facet normals
     *
     */
    public final Boolean outputFacetNormals() {
      return this.outputFacetNormals;
    }

    /**
     * Set Output facet normals
     *
     * @param value Output facet normals
     *
     * @return the Builder object.
     */
    public final Builder outputFacetNormals(Boolean value) {
      this.outputFacetNormals = value;
      return this;
    }

    /**
     * Get Output texture coordinates
     *
     * @return Output texture coordinates
     *
     */
    public final Boolean outputTextureCoordinates() {
      return this.outputTextureCoordinates;
    }

    /**
     * Set Output texture coordinates
     *
     * @param value Output texture coordinates
     *
     * @return the Builder object.
     */
    public final Builder outputTextureCoordinates(Boolean value) {
      this.outputTextureCoordinates = value;
      return this;
    }

    /**
     * Get Output index table
     *
     * @return Output index table
     *
     */
    public final Boolean outputIndexTable() {
      return this.outputIndexTable;
    }

    /**
     * Set Output index table
     *
     * @param value Output index table
     *
     * @return the Builder object.
     */
    public final Builder outputIndexTable(Boolean value) {
      this.outputIndexTable = value;
      return this;
    }

    /**
     * Get Whether or not to output faces that cause an error
     *
     * @return Whether or not to output faces that cause an error
     *
     */
    public final Boolean outputErrorFaces() {
      return this.outputErrorFaces;
    }

    /**
     * Set Whether or not to output faces that cause an error
     *
     * @param value Whether or not to output faces that cause an error
     *
     * @return the Builder object.
     */
    public final Builder outputErrorFaces(Boolean value) {
      this.outputErrorFaces = value;
      return this;
    }

    /**
     * Get Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value chosen based on the complexity of the parts being tessellated.
     *
     * @return Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value chosen based on the complexity of the parts being tessellated.
     *
     */
    public final Number angleTolerance() {
      return this.angleTolerance;
    }

    /**
     * Set Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value chosen based on the complexity of the parts being tessellated.
     *
     * @param value Angle tolerance (in radians). This specifies the limit on the sum of the angular deviations of a tessellation chord from the tangent vectors at two chord endpoints. The specified value must be less than PI/2. This parameter currently has a default value chosen based on the complexity of the parts being tessellated.
     *
     * @return the Builder object.
     */
    public final Builder angleTolerance(Number value) {
      this.angleTolerance = value;
      return this;
    }

    /**
     * Get Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true surface/edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
     *
     * @return Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true surface/edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
     *
     */
    public final Number chordTolerance() {
      return this.chordTolerance;
    }

    /**
     * Set Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true surface/edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
     *
     * @param value Chord tolerance (in meters). This specifies the limit on the maximum deviation of a tessellation chord from the true surface/edge. This parameter currently has a default value chosen based on the size and complexity of the parts being tessellated.
     *
     * @return the Builder object.
     */
    public final Builder chordTolerance(Number value) {
      this.chordTolerance = value;
      return this;
    }

    /**
     * Get Max facet width. This specifies the limit on the size of any side of a tessellation facet.
     *
     * @return Max facet width. This specifies the limit on the size of any side of a tessellation facet.
     *
     */
    public final Number maxFacetWidth() {
      return this.maxFacetWidth;
    }

    /**
     * Set Max facet width. This specifies the limit on the size of any side of a tessellation facet.
     *
     * @param value Max facet width. This specifies the limit on the size of any side of a tessellation facet.
     *
     * @return the Builder object.
     */
    public final Builder maxFacetWidth(Number value) {
      this.maxFacetWidth = value;
      return this;
    }

    /**
     * Get IDs of the faces to tessellate (repeat query param to add more than one, i.e. faceId=JHK&amp;faceId=JHD)
     *
     * @return IDs of the faces to tessellate (repeat query param to add more than one, i.e. faceId=JHK&amp;faceId=JHD)
     *
     */
    public final String faceId() {
      return this.faceId;
    }

    /**
     * Set IDs of the faces to tessellate (repeat query param to add more than one, i.e. faceId=JHK&amp;faceId=JHD)
     *
     * @param value IDs of the faces to tessellate (repeat query param to add more than one, i.e. faceId=JHK&amp;faceId=JHD)
     *
     * @return the Builder object.
     */
    public final Builder faceId(String value) {
      this.faceId = value;
      return this;
    }

    /**
     * Get If this parameter is specified, the provided level of detail will be retrieved from cache (if available) and used to return the tessellation in a more timely manner. The level-of-detail setting entails automatically-set chordal and angular tolerances. Hence any tolerances supplied to this API call will be ignored. Accepts the following values: coarse, medium, fine
     *
     * @return If this parameter is specified, the provided level of detail will be retrieved from cache (if available) and used to return the tessellation in a more timely manner. The level-of-detail setting entails automatically-set chordal and angular tolerances. Hence any tolerances supplied to this API call will be ignored. Accepts the following values: coarse, medium, fine
     *
     */
    public final String precomputedLevelOfDetail() {
      return this.precomputedLevelOfDetail;
    }

    /**
     * Set If this parameter is specified, the provided level of detail will be retrieved from cache (if available) and used to return the tessellation in a more timely manner. The level-of-detail setting entails automatically-set chordal and angular tolerances. Hence any tolerances supplied to this API call will be ignored. Accepts the following values: coarse, medium, fine
     *
     * @param value If this parameter is specified, the provided level of detail will be retrieved from cache (if available) and used to return the tessellation in a more timely manner. The level-of-detail setting entails automatically-set chordal and angular tolerances. Hence any tolerances supplied to this API call will be ignored. Accepts the following values: coarse, medium, fine
     *
     * @return the Builder object.
     */
    public final Builder precomputedLevelOfDetail(String value) {
      this.precomputedLevelOfDetail = value;
      return this;
    }

    /**
     * Get Determines if face appearance data will be included in the output
     *
     * @return Determines if face appearance data will be included in the output
     *
     */
    public final Boolean outputFaceAppearances() {
      return this.outputFaceAppearances;
    }

    /**
     * Set Determines if face appearance data will be included in the output
     *
     * @param value Determines if face appearance data will be included in the output
     *
     * @return the Builder object.
     */
    public final Builder outputFaceAppearances(Boolean value) {
      this.outputFaceAppearances = value;
      return this;
    }

    /**
     * Get Determines if separate nodes will be created for each face or per part.
     *
     * @return Determines if separate nodes will be created for each face or per part.
     *
     */
    public final Boolean outputSeparateFaceNodes() {
      return this.outputSeparateFaceNodes;
    }

    /**
     * Set Determines if separate nodes will be created for each face or per part.
     *
     * @param value Determines if separate nodes will be created for each face or per part.
     *
     * @return the Builder object.
     */
    public final Builder outputSeparateFaceNodes(Boolean value) {
      this.outputSeparateFaceNodes = value;
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

    /**
     * Get If true, the geometry belonging to the constituents of composite parts will be combined within the parent composite part, rather than each constituent having its own node in the result.
     *
     * @return If true, the geometry belonging to the constituents of composite parts will be combined within the parent composite part, rather than each constituent having its own node in the result.
     *
     */
    public final String combineCompositePartConstituents() {
      return this.combineCompositePartConstituents;
    }

    /**
     * Set If true, the geometry belonging to the constituents of composite parts will be combined within the parent composite part, rather than each constituent having its own node in the result.
     *
     * @param value If true, the geometry belonging to the constituents of composite parts will be combined within the parent composite part, rather than each constituent having its own node in the result.
     *
     * @return the Builder object.
     */
    public final Builder combineCompositePartConstituents(String value) {
      this.combineCompositePartConstituents = value;
      return this;
    }

    private PartStudiosGetFacesRequest build() {
      return new com.onshape.api.requests.PartStudiosGetFacesRequest(partId,outputVertexNormals,outputFacetNormals,outputTextureCoordinates,outputIndexTable,outputErrorFaces,angleTolerance,chordTolerance,maxFacetWidth,faceId,precomputedLevelOfDetail,outputFaceAppearances,outputSeparateFaceNodes,linkDocumentId,configuration,combineCompositePartConstituents);
    }

    /**
     * Calls getFaces method, Get the tessellated faces of the parts in a Part Studio. The accuracy of the tessellation
     *                 approximation to exact geometry is controlled by the angleTolerance, chordTolerance and
     *                 maxFacetWidth parameters. The tessellation points are computed close enough so that none of these
     *                 parameters are exceeded. All coordinates are in meters.
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
    public final PartStudiosGetFacesResponse call(String did, WVM wvmType, String wvm, String eid)
        throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/tessellatedfaces", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("partId", partId, "outputVertexNormals", outputVertexNormals, "outputFacetNormals", outputFacetNormals, "outputTextureCoordinates", outputTextureCoordinates, "outputIndexTable", outputIndexTable, "outputErrorFaces", outputErrorFaces, "angleTolerance", angleTolerance, "chordTolerance", chordTolerance, "maxFacetWidth", maxFacetWidth, "faceId", faceId, "precomputedLevelOfDetail", precomputedLevelOfDetail, "outputFaceAppearances", outputFaceAppearances, "outputSeparateFaceNodes", outputSeparateFaceNodes, "linkDocumentId", linkDocumentId, "configuration", configuration, "combineCompositePartConstituents", combineCompositePartConstituents), com.onshape.api.responses.PartStudiosGetFacesResponse.class);
    }

    /**
     * Calls getFaces method, Get the tessellated faces of the parts in a Part Studio. The accuracy of the tessellation
     *                 approximation to exact geometry is controlled by the angleTolerance, chordTolerance and
     *                 maxFacetWidth parameters. The tessellation points are computed close enough so that none of these
     *                 parameters are exceeded. All coordinates are in meters.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartStudiosGetFacesResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/partstudios/d/:did/[wvm]/:wvm/e/:eid/tessellatedfaces", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("partId", partId, "outputVertexNormals", outputVertexNormals, "outputFacetNormals", outputFacetNormals, "outputTextureCoordinates", outputTextureCoordinates, "outputIndexTable", outputIndexTable, "outputErrorFaces", outputErrorFaces, "angleTolerance", angleTolerance, "chordTolerance", chordTolerance, "maxFacetWidth", maxFacetWidth, "faceId", faceId, "precomputedLevelOfDetail", precomputedLevelOfDetail, "outputFaceAppearances", outputFaceAppearances, "outputSeparateFaceNodes", outputSeparateFaceNodes, "linkDocumentId", linkDocumentId, "configuration", configuration, "combineCompositePartConstituents", combineCompositePartConstituents), com.onshape.api.responses.PartStudiosGetFacesResponse.class);
    }
  }
}
