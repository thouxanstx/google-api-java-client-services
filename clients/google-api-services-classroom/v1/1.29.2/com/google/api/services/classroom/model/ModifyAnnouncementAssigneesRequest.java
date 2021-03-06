/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.classroom.model;

/**
 * Request to modify assignee mode and options of an announcement.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModifyAnnouncementAssigneesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Mode of the announcement describing whether it will be accessible by all students or specified
   * individual students.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assigneeMode;

  /**
   * Set which students can view or cannot view the announcement. Must be specified only when
   * `assigneeMode` is `INDIVIDUAL_STUDENTS`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ModifyIndividualStudentsOptions modifyIndividualStudentsOptions;

  /**
   * Mode of the announcement describing whether it will be accessible by all students or specified
   * individual students.
   * @return value or {@code null} for none
   */
  public java.lang.String getAssigneeMode() {
    return assigneeMode;
  }

  /**
   * Mode of the announcement describing whether it will be accessible by all students or specified
   * individual students.
   * @param assigneeMode assigneeMode or {@code null} for none
   */
  public ModifyAnnouncementAssigneesRequest setAssigneeMode(java.lang.String assigneeMode) {
    this.assigneeMode = assigneeMode;
    return this;
  }

  /**
   * Set which students can view or cannot view the announcement. Must be specified only when
   * `assigneeMode` is `INDIVIDUAL_STUDENTS`.
   * @return value or {@code null} for none
   */
  public ModifyIndividualStudentsOptions getModifyIndividualStudentsOptions() {
    return modifyIndividualStudentsOptions;
  }

  /**
   * Set which students can view or cannot view the announcement. Must be specified only when
   * `assigneeMode` is `INDIVIDUAL_STUDENTS`.
   * @param modifyIndividualStudentsOptions modifyIndividualStudentsOptions or {@code null} for none
   */
  public ModifyAnnouncementAssigneesRequest setModifyIndividualStudentsOptions(ModifyIndividualStudentsOptions modifyIndividualStudentsOptions) {
    this.modifyIndividualStudentsOptions = modifyIndividualStudentsOptions;
    return this;
  }

  @Override
  public ModifyAnnouncementAssigneesRequest set(String fieldName, Object value) {
    return (ModifyAnnouncementAssigneesRequest) super.set(fieldName, value);
  }

  @Override
  public ModifyAnnouncementAssigneesRequest clone() {
    return (ModifyAnnouncementAssigneesRequest) super.clone();
  }

}
