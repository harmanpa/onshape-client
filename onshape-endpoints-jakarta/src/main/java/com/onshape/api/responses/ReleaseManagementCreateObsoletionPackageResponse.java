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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.types.AbstractResponseObject;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.ResponseWithDocument;
import jakarta.validation.constraints.NotNull;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Response object for createObsoletionPackage API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ReleaseManagementCreateObsoletionPackageResponse extends AbstractResponseObject implements ResponseWithDocument {
  /**
   * ID of the obsoletion package.
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * Company ID for the obsoletion package
   */
  @JsonProperty("companyId")
  @NotNull
  String companyId;

  /**
   * Document ID of the revision
   */
  @JsonProperty("documentId")
  @NotNull
  String documentId;

  /**
   * Version ID of the revision
   */
  @JsonProperty("versionId")
  @NotNull
  String versionId;

  /**
   * Array of properties for the package
   */
  @JsonProperty("properties")
  @NotNull
  ReleaseManagementCreateObsoletionPackageResponseProperties[] properties;

  /**
   * in the package as determined by the revision. Always just one item
   */
  @JsonProperty("Items")
  @NotNull
  Map[] Items;

  /**
   * Information about the workflow state of the package
   */
  @JsonProperty("workflow")
  @NotNull
  ReleaseManagementCreateObsoletionPackageResponseWorkflow workflow;

  /**
   * Returns an OnshapeDocument object that can be used in subsequent calls to the related document
   * @return The OnshapeDocument object.
   */
  @JsonIgnore
  @Override
  public final OnshapeDocument getDocument() {
    return new OnshapeDocument(documentId, null, null, null, null);
  }

  /**
   * Get ID of the obsoletion package.
   *
   * @return ID of the obsoletion package.
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Company ID for the obsoletion package
   *
   * @return Company ID for the obsoletion package
   *
   */
  public final String getCompanyId() {
    return this.companyId;
  }

  /**
   * Get Document ID of the revision
   *
   * @return Document ID of the revision
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Version ID of the revision
   *
   * @return Version ID of the revision
   *
   */
  public final String getVersionId() {
    return this.versionId;
  }

  /**
   * Get Array of properties for the package
   *
   * @return Array of properties for the package
   *
   */
  public final ReleaseManagementCreateObsoletionPackageResponseProperties[] getProperties() {
    return this.properties;
  }

  /**
   * Get in the package as determined by the revision. Always just one item
   *
   * @return in the package as determined by the revision. Always just one item
   *
   */
  public final Map[] getItems() {
    return this.Items;
  }

  /**
   * Get Information about the workflow state of the package
   *
   * @return Information about the workflow state of the package
   *
   */
  public final ReleaseManagementCreateObsoletionPackageResponseWorkflow getWorkflow() {
    return this.workflow;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
