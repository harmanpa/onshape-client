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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import java.util.Date;

/**
 * Object used in calls to getAuditLog API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class WorkflowGetAuditLogResponseEntries extends AbstractResponseObject {
  /**
   * Entry id
   */
  @JsonProperty("id")
  public String id;

  /**
   * UTC date/time of the event
   */
  @JsonProperty("date")
  public Date date;

  /**
   * Workflowable object id
   */
  @JsonProperty("objectId")
  public String objectId;

  /**
   * Event type code
   */
  @JsonProperty("entryType")
  public Number entryType;

  /**
   * User who created the entry
   */
  @JsonProperty("userId")
  public String userId;

  /**
   * State of the object at the time of the event
   */
  @JsonProperty("workflowState")
  public String workflowState;

  /**
   * Transition during which the event occurred
   */
  @JsonProperty("workflowTransition")
  public String workflowTransition;

  /**
   * Action during which the event occurred
   */
  @JsonProperty("workflowAction")
  public String workflowAction;

  /**
   * Updates to workflow property values
   */
  @JsonProperty("propertyUpdates")
  public WorkflowGetAuditLogResponseEntriesPropertyUpdates[] propertyUpdates;

  /**
   * Console output of FeatureScript execution
   */
  @JsonProperty("featureScriptConsole")
  public String featureScriptConsole;

  /**
   * Notices generated by FeatureScript execution
   */
  @JsonProperty("featureScriptNotices")
  public String[] featureScriptNotices;

  /**
   * Return value of FeatureScript execution
   */
  @JsonProperty("featureScriptResult")
  public String featureScriptResult;

  /**
   * Error message associated with the event
   */
  @JsonProperty("errorMessage")
  public String errorMessage;

  /**
   * Support code associated with the event
   */
  @JsonProperty("supportCode")
  public String supportCode;

  /**
   * Id of the added comment
   */
  @JsonProperty("commentId")
  public String commentId;

  /**
   * Ids of users/teams that were updated by an approve/reject
   */
  @JsonProperty("approverIds")
  public String approverIds;

  /**
   * Whether an approve/reject was an admin override
   */
  @JsonProperty("approvalOverride")
  public String approvalOverride;

  /**
   * Get Entry id
   *
   * @return Entry id
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get UTC date/time of the event
   *
   * @return UTC date/time of the event
   *
   */
  public final Date getDate() {
    return this.date;
  }

  /**
   * Get Workflowable object id
   *
   * @return Workflowable object id
   *
   */
  public final String getObjectId() {
    return this.objectId;
  }

  /**
   * Get Event type code
   *
   * @return Event type code
   *
   */
  public final Number getEntryType() {
    return this.entryType;
  }

  /**
   * Get User who created the entry
   *
   * @return User who created the entry
   *
   */
  public final String getUserId() {
    return this.userId;
  }

  /**
   * Get State of the object at the time of the event
   *
   * @return State of the object at the time of the event
   *
   */
  public final String getWorkflowState() {
    return this.workflowState;
  }

  /**
   * Get Transition during which the event occurred
   *
   * @return Transition during which the event occurred
   *
   */
  public final String getWorkflowTransition() {
    return this.workflowTransition;
  }

  /**
   * Get Action during which the event occurred
   *
   * @return Action during which the event occurred
   *
   */
  public final String getWorkflowAction() {
    return this.workflowAction;
  }

  /**
   * Get Updates to workflow property values
   *
   * @return Updates to workflow property values
   *
   */
  public final WorkflowGetAuditLogResponseEntriesPropertyUpdates[] getPropertyUpdates() {
    return this.propertyUpdates;
  }

  /**
   * Get Console output of FeatureScript execution
   *
   * @return Console output of FeatureScript execution
   *
   */
  public final String getFeatureScriptConsole() {
    return this.featureScriptConsole;
  }

  /**
   * Get Notices generated by FeatureScript execution
   *
   * @return Notices generated by FeatureScript execution
   *
   */
  public final String[] getFeatureScriptNotices() {
    return this.featureScriptNotices;
  }

  /**
   * Get Return value of FeatureScript execution
   *
   * @return Return value of FeatureScript execution
   *
   */
  public final String getFeatureScriptResult() {
    return this.featureScriptResult;
  }

  /**
   * Get Error message associated with the event
   *
   * @return Error message associated with the event
   *
   */
  public final String getErrorMessage() {
    return this.errorMessage;
  }

  /**
   * Get Support code associated with the event
   *
   * @return Support code associated with the event
   *
   */
  public final String getSupportCode() {
    return this.supportCode;
  }

  /**
   * Get Id of the added comment
   *
   * @return Id of the added comment
   *
   */
  public final String getCommentId() {
    return this.commentId;
  }

  /**
   * Get Ids of users/teams that were updated by an approve/reject
   *
   * @return Ids of users/teams that were updated by an approve/reject
   *
   */
  public final String getApproverIds() {
    return this.approverIds;
  }

  /**
   * Get Whether an approve/reject was an admin override
   *
   * @return Whether an approve/reject was an admin override
   *
   */
  public final String getApprovalOverride() {
    return this.approvalOverride;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
