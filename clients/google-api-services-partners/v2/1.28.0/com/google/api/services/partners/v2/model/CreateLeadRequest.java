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

package com.google.api.services.partners.v2.model;

/**
 * Request message for CreateLead.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Partners API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateLeadRequest extends com.google.api.client.json.GenericJson {

  /**
   * The lead resource. The `LeadType` must not be `LEAD_TYPE_UNSPECIFIED` and either `email` or
   * `phone_number` must be provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Lead lead;

  /**
   * reCaptcha challenge info.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RecaptchaChallenge recaptchaChallenge;

  /**
   * Current request metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RequestMetadata requestMetadata;

  /**
   * The lead resource. The `LeadType` must not be `LEAD_TYPE_UNSPECIFIED` and either `email` or
   * `phone_number` must be provided.
   * @return value or {@code null} for none
   */
  public Lead getLead() {
    return lead;
  }

  /**
   * The lead resource. The `LeadType` must not be `LEAD_TYPE_UNSPECIFIED` and either `email` or
   * `phone_number` must be provided.
   * @param lead lead or {@code null} for none
   */
  public CreateLeadRequest setLead(Lead lead) {
    this.lead = lead;
    return this;
  }

  /**
   * reCaptcha challenge info.
   * @return value or {@code null} for none
   */
  public RecaptchaChallenge getRecaptchaChallenge() {
    return recaptchaChallenge;
  }

  /**
   * reCaptcha challenge info.
   * @param recaptchaChallenge recaptchaChallenge or {@code null} for none
   */
  public CreateLeadRequest setRecaptchaChallenge(RecaptchaChallenge recaptchaChallenge) {
    this.recaptchaChallenge = recaptchaChallenge;
    return this;
  }

  /**
   * Current request metadata.
   * @return value or {@code null} for none
   */
  public RequestMetadata getRequestMetadata() {
    return requestMetadata;
  }

  /**
   * Current request metadata.
   * @param requestMetadata requestMetadata or {@code null} for none
   */
  public CreateLeadRequest setRequestMetadata(RequestMetadata requestMetadata) {
    this.requestMetadata = requestMetadata;
    return this;
  }

  @Override
  public CreateLeadRequest set(String fieldName, Object value) {
    return (CreateLeadRequest) super.set(fieldName, value);
  }

  @Override
  public CreateLeadRequest clone() {
    return (CreateLeadRequest) super.clone();
  }

}