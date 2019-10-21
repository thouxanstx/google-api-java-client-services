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

package com.google.api.services.iap.v1.model;

/**
 * Access related settings for IAP protected apps.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity-Aware Proxy API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccessSettings extends com.google.api.client.json.GenericJson {

  /**
   * Configuration to allow cross-origin requests via IAP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CorsSettings corsSettings;

  /**
   * GCIP claims and endpoint configurations for 3p identity providers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GcipSettings gcipSettings;

  /**
   * Settings to configure IAP's OAuth behavior.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OAuthSettings oauthSettings;

  /**
   * Configuration to allow cross-origin requests via IAP.
   * @return value or {@code null} for none
   */
  public CorsSettings getCorsSettings() {
    return corsSettings;
  }

  /**
   * Configuration to allow cross-origin requests via IAP.
   * @param corsSettings corsSettings or {@code null} for none
   */
  public AccessSettings setCorsSettings(CorsSettings corsSettings) {
    this.corsSettings = corsSettings;
    return this;
  }

  /**
   * GCIP claims and endpoint configurations for 3p identity providers.
   * @return value or {@code null} for none
   */
  public GcipSettings getGcipSettings() {
    return gcipSettings;
  }

  /**
   * GCIP claims and endpoint configurations for 3p identity providers.
   * @param gcipSettings gcipSettings or {@code null} for none
   */
  public AccessSettings setGcipSettings(GcipSettings gcipSettings) {
    this.gcipSettings = gcipSettings;
    return this;
  }

  /**
   * Settings to configure IAP's OAuth behavior.
   * @return value or {@code null} for none
   */
  public OAuthSettings getOauthSettings() {
    return oauthSettings;
  }

  /**
   * Settings to configure IAP's OAuth behavior.
   * @param oauthSettings oauthSettings or {@code null} for none
   */
  public AccessSettings setOauthSettings(OAuthSettings oauthSettings) {
    this.oauthSettings = oauthSettings;
    return this;
  }

  @Override
  public AccessSettings set(String fieldName, Object value) {
    return (AccessSettings) super.set(fieldName, value);
  }

  @Override
  public AccessSettings clone() {
    return (AccessSettings) super.clone();
  }

}
