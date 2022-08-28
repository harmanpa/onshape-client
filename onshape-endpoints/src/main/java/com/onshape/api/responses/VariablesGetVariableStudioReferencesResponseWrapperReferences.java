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
 * Object used in calls to getVariableStudioReferences API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class VariablesGetVariableStudioReferencesResponseWrapperReferences extends AbstractResponseObject {
  /**
   * referenced document id
   */
  @JsonProperty("referenceDocumentId")
  public String referenceDocumentId;

  /**
   * referenced version id
   */
  @JsonProperty("referenceVersionId")
  public String referenceVersionId;

  /**
   * referenced element id
   */
  @JsonProperty("referenceElementId")
  public String referenceElementId;

  /**
   * whether all variables in referenced variable studio are included
   */
  @JsonProperty("entireVariableStudio")
  public Boolean entireVariableStudio;

  /**
   * names of selected variables in referenced variable studio
   */
  @JsonProperty("variableNames")
  public String[] variableNames;

  /**
   * Get referenced document id
   *
   * @return referenced document id
   *
   */
  public final String getReferenceDocumentId() {
    return this.referenceDocumentId;
  }

  /**
   * Get referenced version id
   *
   * @return referenced version id
   *
   */
  public final String getReferenceVersionId() {
    return this.referenceVersionId;
  }

  /**
   * Get referenced element id
   *
   * @return referenced element id
   *
   */
  public final String getReferenceElementId() {
    return this.referenceElementId;
  }

  /**
   * Get whether all variables in referenced variable studio are included
   *
   * @return whether all variables in referenced variable studio are included
   *
   */
  public final Boolean getEntireVariableStudio() {
    return this.entireVariableStudio;
  }

  /**
   * Get names of selected variables in referenced variable studio
   *
   * @return names of selected variables in referenced variable studio
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
