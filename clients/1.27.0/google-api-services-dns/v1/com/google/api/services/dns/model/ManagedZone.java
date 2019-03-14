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

package com.google.api.services.dns.model;

/**
 * Model definition for ManagedZone.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ManagedZone extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dnsName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedZoneDnsSecConfig dnssecConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#managedZone".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nameServerSet;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> nameServers;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedZonePrivateVisibilityConfig privateVisibilityConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String visibility;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTime() {
    return creationTime;
  }

  /**
   * @param creationTime creationTime or {@code null} for none
   */
  public ManagedZone setCreationTime(java.lang.String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public ManagedZone setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDnsName() {
    return dnsName;
  }

  /**
   * @param dnsName dnsName or {@code null} for none
   */
  public ManagedZone setDnsName(java.lang.String dnsName) {
    this.dnsName = dnsName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ManagedZoneDnsSecConfig getDnssecConfig() {
    return dnssecConfig;
  }

  /**
   * @param dnssecConfig dnssecConfig or {@code null} for none
   */
  public ManagedZone setDnssecConfig(ManagedZoneDnsSecConfig dnssecConfig) {
    this.dnssecConfig = dnssecConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public ManagedZone setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#managedZone".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#managedZone".
   * @param kind kind or {@code null} for none
   */
  public ManagedZone setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * @param labels labels or {@code null} for none
   */
  public ManagedZone setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public ManagedZone setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNameServerSet() {
    return nameServerSet;
  }

  /**
   * @param nameServerSet nameServerSet or {@code null} for none
   */
  public ManagedZone setNameServerSet(java.lang.String nameServerSet) {
    this.nameServerSet = nameServerSet;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNameServers() {
    return nameServers;
  }

  /**
   * @param nameServers nameServers or {@code null} for none
   */
  public ManagedZone setNameServers(java.util.List<java.lang.String> nameServers) {
    this.nameServers = nameServers;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ManagedZonePrivateVisibilityConfig getPrivateVisibilityConfig() {
    return privateVisibilityConfig;
  }

  /**
   * @param privateVisibilityConfig privateVisibilityConfig or {@code null} for none
   */
  public ManagedZone setPrivateVisibilityConfig(ManagedZonePrivateVisibilityConfig privateVisibilityConfig) {
    this.privateVisibilityConfig = privateVisibilityConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getVisibility() {
    return visibility;
  }

  /**
   * @param visibility visibility or {@code null} for none
   */
  public ManagedZone setVisibility(java.lang.String visibility) {
    this.visibility = visibility;
    return this;
  }

  @Override
  public ManagedZone set(String fieldName, Object value) {
    return (ManagedZone) super.set(fieldName, value);
  }

  @Override
  public ManagedZone clone() {
    return (ManagedZone) super.clone();
  }

}
