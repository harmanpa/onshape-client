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
package com.onshape.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.types.AbstractResponseObject;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;

/**
 * Response object for uploadFileCreateElement API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class BlobElementsUploadFileCreateElementResponse extends AbstractResponseObject {
  /**
   * Onshape internal use
   */
  @JsonProperty("translationEventKey")
  @NotNull
  String translationEventKey;

  /**
   * Name of element
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Element ID of created element
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * Onshape internal use
   */
  @JsonProperty("lengthUnits")
  @NotNull
  String lengthUnits;

  /**
   * Onshape internal use
   */
  @JsonProperty("angleUnits")
  @NotNull
  String angleUnits;

  /**
   * Onshape internal use
   */
  @JsonProperty("thumbnails")
  @NotNull
  String thumbnails;

  /**
   * Type of element (always &quot;BLOB&quot; for blob elements)
   */
  @JsonProperty("elementType")
  @NotNull
  String elementType;

  /**
   * MIME type of uploaded file
   */
  @JsonProperty("dataType")
  @NotNull
  String dataType;

  /**
   * Onshape internal use
   */
  @JsonProperty("foreignDataId")
  @NotNull
  String foreignDataId;

  /**
   * Onshape internal use
   */
  @JsonProperty("filename")
  @NotNull
  String filename;

  /**
   * The id of the translation request generated by the upload if the request indicated that the file should be translated
   */
  @JsonProperty("translationId")
  @NotNull
  String translationId;

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getTranslationEventKey() {
    return this.translationEventKey;
  }

  /**
   * Get Name of element
   *
   * @return Name of element
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Element ID of created element
   *
   * @return Element ID of created element
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getLengthUnits() {
    return this.lengthUnits;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getAngleUnits() {
    return this.angleUnits;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getThumbnails() {
    return this.thumbnails;
  }

  /**
   * Get Type of element (always &quot;BLOB&quot; for blob elements)
   *
   * @return Type of element (always &quot;BLOB&quot; for blob elements)
   *
   */
  public final String getElementType() {
    return this.elementType;
  }

  /**
   * Get MIME type of uploaded file
   *
   * @return MIME type of uploaded file
   *
   */
  public final String getDataType() {
    return this.dataType;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getForeignDataId() {
    return this.foreignDataId;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getFilename() {
    return this.filename;
  }

  /**
   * Get The id of the translation request generated by the upload if the request indicated that the file should be translated
   *
   * @return The id of the translation request generated by the upload if the request indicated that the file should be translated
   *
   */
  public final String getTranslationId() {
    return this.translationId;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
