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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to setVariableStudioScope API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class VariablesSetVariableStudioScopeRequestScope {
  /**
   * whether variable studio is global
   */
  @JsonProperty("global")
  public Boolean global;

  VariablesSetVariableStudioScopeRequestScope(Boolean global) {
    this.global = global;
  }

  /**
   * Get whether variable studio is global
   *
   * @return whether variable studio is global
   *
   */
  public final Boolean getGlobal() {
    return this.global;
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
     * whether variable studio is global
     */
    private Boolean global;

    Builder() {
    }

    /**
     * Get whether variable studio is global
     *
     * @return whether variable studio is global
     *
     */
    public final Boolean global() {
      return this.global;
    }

    /**
     * Set whether variable studio is global
     *
     * @param value whether variable studio is global
     *
     * @return the Builder object.
     */
    public final Builder global(Boolean value) {
      this.global = value;
      return this;
    }

    public final VariablesSetVariableStudioScopeRequestScope build() {
      return new com.onshape.api.requests.VariablesSetVariableStudioScopeRequestScope(global);
    }
  }
}
