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
package com.onshape.api;

import com.onshape.api.requests.ReleaseManagementCreateObsoletionPackageRequest;
import com.onshape.api.requests.ReleaseManagementCreateReleasePackageRequest;
import com.onshape.api.requests.ReleaseManagementFindByDocumentIdAndVersionIdRequest;
import com.onshape.api.requests.ReleaseManagementFindByDocumentIdRequest;
import com.onshape.api.requests.ReleaseManagementGetReleasePackageRequest;
import com.onshape.api.requests.ReleaseManagementUpdateReleasePackageRequest;

/**
 * ReleaseManagement: API endpoints for ReleaseManagement group.
 * &copy; 2018-Present Onshape Inc.
 */
public final class ReleaseManagement {
  final Onshape onshape;

  ReleaseManagement(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for createObsoletionPackage
   *  @return Request builder object
   */
  public final ReleaseManagementCreateObsoletionPackageRequest.Builder createObsoletionPackage() {
    return ReleaseManagementCreateObsoletionPackageRequest.builder(onshape);
  }

  /**
   * Create request for createReleasePackage
   *  @return Request builder object
   */
  public final ReleaseManagementCreateReleasePackageRequest.Builder createReleasePackage() {
    return ReleaseManagementCreateReleasePackageRequest.builder(onshape);
  }

  /**
   * Create request for findByDocumentId
   *  @return Request builder object
   */
  public final ReleaseManagementFindByDocumentIdRequest.Builder findByDocumentId() {
    return ReleaseManagementFindByDocumentIdRequest.builder(onshape);
  }

  /**
   * Create request for getReleasePackage
   *  @return Request builder object
   */
  public final ReleaseManagementGetReleasePackageRequest.Builder getReleasePackage() {
    return ReleaseManagementGetReleasePackageRequest.builder(onshape);
  }

  /**
   * Create request for findByDocumentIdAndVersionId
   *  @return Request builder object
   */
  public final ReleaseManagementFindByDocumentIdAndVersionIdRequest.Builder findByDocumentIdAndVersionId() {
    return ReleaseManagementFindByDocumentIdAndVersionIdRequest.builder(onshape);
  }

  /**
   * Create request for updateReleasePackage
   *  @return Request builder object
   */
  public final ReleaseManagementUpdateReleasePackageRequest.Builder updateReleasePackage() {
    return ReleaseManagementUpdateReleasePackageRequest.builder(onshape);
  }
}
