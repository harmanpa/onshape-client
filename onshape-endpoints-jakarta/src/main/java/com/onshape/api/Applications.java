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

import com.onshape.api.requests.ApplicationsDeleteAppSettingsRequest;
import com.onshape.api.requests.ApplicationsDeleteCompanyAppSettingsRequest;
import com.onshape.api.requests.ApplicationsGetApplicableExtensionsForClientRequest;
import com.onshape.api.requests.ApplicationsGetCompanyAppSettingsRequest;
import com.onshape.api.requests.ApplicationsGetUserAppSettingsRequest;
import com.onshape.api.requests.ApplicationsUpdateAppCompanySettingsRequest;
import com.onshape.api.requests.ApplicationsUpdateAppSettingsRequest;

/**
 * Applications: API endpoints for Applications group.
 * &copy; 2018-Present Onshape Inc.
 */
public final class Applications {
  final Onshape onshape;

  Applications(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for deleteAppSettings
   *  @return Request builder object
   */
  public final ApplicationsDeleteAppSettingsRequest.Builder deleteAppSettings() {
    return ApplicationsDeleteAppSettingsRequest.builder(onshape);
  }

  /**
   * Create request for deleteCompanyAppSettings
   *  @return Request builder object
   */
  public final ApplicationsDeleteCompanyAppSettingsRequest.Builder deleteCompanyAppSettings() {
    return ApplicationsDeleteCompanyAppSettingsRequest.builder(onshape);
  }

  /**
   * Create request for getApplicableExtensionsForClient
   *  @return Request builder object
   */
  public final ApplicationsGetApplicableExtensionsForClientRequest.Builder getApplicableExtensionsForClient() {
    return ApplicationsGetApplicableExtensionsForClientRequest.builder(onshape);
  }

  /**
   * Create request for getCompanyAppSettings
   *  @return Request builder object
   */
  public final ApplicationsGetCompanyAppSettingsRequest.Builder getCompanyAppSettings() {
    return ApplicationsGetCompanyAppSettingsRequest.builder(onshape);
  }

  /**
   * Create request for getUserAppSettings
   *  @return Request builder object
   */
  public final ApplicationsGetUserAppSettingsRequest.Builder getUserAppSettings() {
    return ApplicationsGetUserAppSettingsRequest.builder(onshape);
  }

  /**
   * Create request for updateAppSettings
   *  @return Request builder object
   */
  public final ApplicationsUpdateAppSettingsRequest.Builder updateAppSettings() {
    return ApplicationsUpdateAppSettingsRequest.builder(onshape);
  }

  /**
   * Create request for updateAppCompanySettings
   *  @return Request builder object
   */
  public final ApplicationsUpdateAppCompanySettingsRequest.Builder updateAppCompanySettings() {
    return ApplicationsUpdateAppCompanySettingsRequest.builder(onshape);
  }
}
