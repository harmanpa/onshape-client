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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getVariables API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class VariablesGetVariablesResponseVariableTablesVariableStudioReference extends AbstractResponseObject {
  /**
   * documentId of referenced variable studio
   */
  @JsonProperty("referenceDocumentId")
  public String referenceDocumentId;

  /**
   * versionId of referenced variable studio
   */
  @JsonProperty("referenceVersionId")
  public String referenceVersionId;

  /**
   * elementId of referenced variable studio
   */
  @JsonProperty("referenceElementId")
  public String referenceElementId;

  /**
   * referenced variable studio includes all variables
   */
  @JsonProperty("entireVariableStudio")
  public Boolean entireVariableStudio;

  /**
   * selected variables included from the variable studio
   */
  @JsonProperty("variableNames")
  public String[] variableNames;

  /**
   * Get documentId of referenced variable studio
   *
   * @return documentId of referenced variable studio
   *
   */
  public final String getReferenceDocumentId() {
    return this.referenceDocumentId;
  }

  /**
   * Get versionId of referenced variable studio
   *
   * @return versionId of referenced variable studio
   *
   */
  public final String getReferenceVersionId() {
    return this.referenceVersionId;
  }

  /**
   * Get elementId of referenced variable studio
   *
   * @return elementId of referenced variable studio
   *
   */
  public final String getReferenceElementId() {
    return this.referenceElementId;
  }

  /**
   * Get referenced variable studio includes all variables
   *
   * @return referenced variable studio includes all variables
   *
   */
  public final Boolean getEntireVariableStudio() {
    return this.entireVariableStudio;
  }

  /**
   * Get selected variables included from the variable studio
   *
   * @return selected variables included from the variable studio
   *
   */
  public final String[] getVariableNames() {
    return this.variableNames;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
