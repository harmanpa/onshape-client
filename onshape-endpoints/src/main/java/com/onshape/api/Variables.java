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

import com.onshape.api.requests.VariablesCreateVariableStudioRequest;
import com.onshape.api.requests.VariablesGetVariableStudioReferencesRequest;
import com.onshape.api.requests.VariablesGetVariableStudioScopeRequest;
import com.onshape.api.requests.VariablesGetVariablesRequest;
import com.onshape.api.requests.VariablesSetVariableStudioReferencesRequest;
import com.onshape.api.requests.VariablesSetVariableStudioScopeRequest;
import com.onshape.api.requests.VariablesSetVariablesRequest;

/**
 * Variables: API endpoints for Variables group.
 * &copy; 2018-Present Onshape Inc.
 */
public final class Variables {
  final Onshape onshape;

  Variables(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for getVariableStudioReferences
   *  @return Request builder object
   */
  public final VariablesGetVariableStudioReferencesRequest.Builder getVariableStudioReferences() {
    return VariablesGetVariableStudioReferencesRequest.builder(onshape);
  }

  /**
   * Create request for getVariables
   *  @return Request builder object
   */
  public final VariablesGetVariablesRequest.Builder getVariables() {
    return VariablesGetVariablesRequest.builder(onshape);
  }

  /**
   * Create request for getVariableStudioScope
   *  @return Request builder object
   */
  public final VariablesGetVariableStudioScopeRequest.Builder getVariableStudioScope() {
    return VariablesGetVariableStudioScopeRequest.builder(onshape);
  }

  /**
   * Create request for setVariableStudioReferences
   *  @return Request builder object
   */
  public final VariablesSetVariableStudioReferencesRequest.Builder setVariableStudioReferences() {
    return VariablesSetVariableStudioReferencesRequest.builder(onshape);
  }

  /**
   * Create request for setVariables
   *  @return Request builder object
   */
  public final VariablesSetVariablesRequest.Builder setVariables() {
    return VariablesSetVariablesRequest.builder(onshape);
  }

  /**
   * Create request for setVariableStudioScope
   *  @return Request builder object
   */
  public final VariablesSetVariableStudioScopeRequest.Builder setVariableStudioScope() {
    return VariablesSetVariableStudioScopeRequest.builder(onshape);
  }

  /**
   * Create request for createVariableStudio
   *  @return Request builder object
   */
  public final VariablesCreateVariableStudioRequest.Builder createVariableStudio() {
    return VariablesCreateVariableStudioRequest.builder(onshape);
  }
}
