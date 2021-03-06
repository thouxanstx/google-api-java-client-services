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

package com.google.api.services.firestore.v1beta1.model;

/**
 * A filter with a single operand.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UnaryFilter extends com.google.api.client.json.GenericJson {

  /**
   * The field to which to apply the operator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FieldReference field;

  /**
   * The unary operator to apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String op;

  /**
   * The field to which to apply the operator.
   * @return value or {@code null} for none
   */
  public FieldReference getField() {
    return field;
  }

  /**
   * The field to which to apply the operator.
   * @param field field or {@code null} for none
   */
  public UnaryFilter setField(FieldReference field) {
    this.field = field;
    return this;
  }

  /**
   * The unary operator to apply.
   * @return value or {@code null} for none
   */
  public java.lang.String getOp() {
    return op;
  }

  /**
   * The unary operator to apply.
   * @param op op or {@code null} for none
   */
  public UnaryFilter setOp(java.lang.String op) {
    this.op = op;
    return this;
  }

  @Override
  public UnaryFilter set(String fieldName, Object value) {
    return (UnaryFilter) super.set(fieldName, value);
  }

  @Override
  public UnaryFilter clone() {
    return (UnaryFilter) super.clone();
  }

}
