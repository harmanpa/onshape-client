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

import com.onshape.api.requests.AppElementsAbortTransactionRequest;
import com.onshape.api.requests.AppElementsBulkCreateElementRequest;
import com.onshape.api.requests.AppElementsCommitTransactionsRequest;
import com.onshape.api.requests.AppElementsCompareAppElementJsonRequest;
import com.onshape.api.requests.AppElementsCreateElementRequest;
import com.onshape.api.requests.AppElementsCreateReferenceRequest;
import com.onshape.api.requests.AppElementsDeleteBlobSubelementRequest;
import com.onshape.api.requests.AppElementsDeleteContentRequest;
import com.onshape.api.requests.AppElementsDeleteReferenceRequest;
import com.onshape.api.requests.AppElementsDownloadBlobSubelementRequest;
import com.onshape.api.requests.AppElementsGetBlobSubelementIdsRequest;
import com.onshape.api.requests.AppElementsGetHistoryByWorkspaceRequest;
import com.onshape.api.requests.AppElementsGetJsonPathsRequest;
import com.onshape.api.requests.AppElementsGetJsonRequest;
import com.onshape.api.requests.AppElementsGetSubElementContentRequest;
import com.onshape.api.requests.AppElementsGetSubElementIdsRequest;
import com.onshape.api.requests.AppElementsListTransactionsRequest;
import com.onshape.api.requests.AppElementsResolveReferenceRequest;
import com.onshape.api.requests.AppElementsResolveReferencesRequest;
import com.onshape.api.requests.AppElementsStartTransactionRequest;
import com.onshape.api.requests.AppElementsUpdateElementRequest;
import com.onshape.api.requests.AppElementsUpdateReferenceRequest;
import com.onshape.api.requests.AppElementsUploadBlobSubelementRequest;

/**
 * AppElements: API endpoints for AppElements group.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElements {
  final Onshape onshape;

  AppElements(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for abortTransaction
   *  @return Request builder object
   */
  public final AppElementsAbortTransactionRequest.Builder abortTransaction() {
    return AppElementsAbortTransactionRequest.builder(onshape);
  }

  /**
   * Create request for commitTransactions
   *  @return Request builder object
   */
  public final AppElementsCommitTransactionsRequest.Builder commitTransactions() {
    return AppElementsCommitTransactionsRequest.builder(onshape);
  }

  /**
   * Create request for compareAppElementJson
   *  @return Request builder object
   */
  public final AppElementsCompareAppElementJsonRequest.Builder compareAppElementJson() {
    return AppElementsCompareAppElementJsonRequest.builder(onshape);
  }

  /**
   * Create request for createReference
   *  @return Request builder object
   */
  public final AppElementsCreateReferenceRequest.Builder createReference() {
    return AppElementsCreateReferenceRequest.builder(onshape);
  }

  /**
   * Create request for createElement
   *  @return Request builder object
   */
  public final AppElementsCreateElementRequest.Builder createElement() {
    return AppElementsCreateElementRequest.builder(onshape);
  }

  /**
   * Create request for bulkCreateElement
   *  @return Request builder object
   */
  public final AppElementsBulkCreateElementRequest.Builder bulkCreateElement() {
    return AppElementsBulkCreateElementRequest.builder(onshape);
  }

  /**
   * Create request for deleteReference
   *  @return Request builder object
   */
  public final AppElementsDeleteReferenceRequest.Builder deleteReference() {
    return AppElementsDeleteReferenceRequest.builder(onshape);
  }

  /**
   * Create request for deleteContent
   *  @return Request builder object
   */
  public final AppElementsDeleteContentRequest.Builder deleteContent() {
    return AppElementsDeleteContentRequest.builder(onshape);
  }

  /**
   * Create request for deleteBlobSubelement
   *  @return Request builder object
   */
  public final AppElementsDeleteBlobSubelementRequest.Builder deleteBlobSubelement() {
    return AppElementsDeleteBlobSubelementRequest.builder(onshape);
  }

  /**
   * Create request for downloadBlobSubelement
   *  @return Request builder object
   */
  public final AppElementsDownloadBlobSubelementRequest.Builder downloadBlobSubelement() {
    return AppElementsDownloadBlobSubelementRequest.builder(onshape);
  }

  /**
   * Create request for getBlobSubelementIds
   *  @return Request builder object
   */
  public final AppElementsGetBlobSubelementIdsRequest.Builder getBlobSubelementIds() {
    return AppElementsGetBlobSubelementIdsRequest.builder(onshape);
  }

  /**
   * Create request for getSubElementContent
   *  @return Request builder object
   */
  public final AppElementsGetSubElementContentRequest.Builder getSubElementContent() {
    return AppElementsGetSubElementContentRequest.builder(onshape);
  }

  /**
   * Create request for getHistoryByWorkspace
   *  @return Request builder object
   */
  public final AppElementsGetHistoryByWorkspaceRequest.Builder getHistoryByWorkspace() {
    return AppElementsGetHistoryByWorkspaceRequest.builder(onshape);
  }

  /**
   * Create request for getJson
   *  @return Request builder object
   */
  public final AppElementsGetJsonRequest.Builder getJson() {
    return AppElementsGetJsonRequest.builder(onshape);
  }

  /**
   * Create request for getJsonPaths
   *  @return Request builder object
   */
  public final AppElementsGetJsonPathsRequest.Builder getJsonPaths() {
    return AppElementsGetJsonPathsRequest.builder(onshape);
  }

  /**
   * Create request for getSubElementIds
   *  @return Request builder object
   */
  public final AppElementsGetSubElementIdsRequest.Builder getSubElementIds() {
    return AppElementsGetSubElementIdsRequest.builder(onshape);
  }

  /**
   * Create request for listTransactions
   *  @return Request builder object
   */
  public final AppElementsListTransactionsRequest.Builder listTransactions() {
    return AppElementsListTransactionsRequest.builder(onshape);
  }

  /**
   * Create request for resolveReference
   *  @return Request builder object
   */
  public final AppElementsResolveReferenceRequest.Builder resolveReference() {
    return AppElementsResolveReferenceRequest.builder(onshape);
  }

  /**
   * Create request for resolveReferences
   *  @return Request builder object
   */
  public final AppElementsResolveReferencesRequest.Builder resolveReferences() {
    return AppElementsResolveReferencesRequest.builder(onshape);
  }

  /**
   * Create request for startTransaction
   *  @return Request builder object
   */
  public final AppElementsStartTransactionRequest.Builder startTransaction() {
    return AppElementsStartTransactionRequest.builder(onshape);
  }

  /**
   * Create request for updateElement
   *  @return Request builder object
   */
  public final AppElementsUpdateElementRequest.Builder updateElement() {
    return AppElementsUpdateElementRequest.builder(onshape);
  }

  /**
   * Create request for updateReference
   *  @return Request builder object
   */
  public final AppElementsUpdateReferenceRequest.Builder updateReference() {
    return AppElementsUpdateReferenceRequest.builder(onshape);
  }

  /**
   * Create request for uploadBlobSubelement
   *  @return Request builder object
   */
  public final AppElementsUploadBlobSubelementRequest.Builder uploadBlobSubelement() {
    return AppElementsUploadBlobSubelementRequest.builder(onshape);
  }
}
