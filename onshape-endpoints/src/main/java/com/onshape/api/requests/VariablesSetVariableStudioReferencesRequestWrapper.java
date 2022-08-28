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
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Object used in calls to setVariableStudioReferences API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class VariablesSetVariableStudioReferencesRequestWrapper {
  /**
   * variable studio references array
   */
  @JsonProperty("references")
  public Map[] references;

  VariablesSetVariableStudioReferencesRequestWrapper(Map[] references) {
    this.references = references;
  }

  /**
   * Get variable studio references array
   *
   * @return variable studio references array
   *
   */
  public final Map[] getReferences() {
    return this.references;
  }

  public static final Builder builder() {
    Builder builder = new Builder();
    return builder;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final class Builder {
    /**
     * variable studio references array
     */
    private Map[] references;

    Builder() {
    }

    /**
     * Get variable studio references array
     *
     * @return variable studio references array
     *
     */
    public final Map[] references() {
      return this.references;
    }

    /**
     * Set variable studio references array
     *
     * @param value variable studio references array
     *
     * @return the Builder object.
     */
    public final Builder references(Map[] value) {
      this.references = value;
      return this;
    }

    public final VariablesSetVariableStudioReferencesRequestWrapper build() {
      return new com.onshape.api.requests.VariablesSetVariableStudioReferencesRequestWrapper(references);
    }
  }
}
