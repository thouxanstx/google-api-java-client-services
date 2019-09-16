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

package com.google.api.services.directory.model;

/**
 * JSON template for User object in Directory API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin Directory API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class User extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object addresses;

  /**
   * Indicates if user has agreed to terms (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean agreedToTerms;

  /**
   * List of aliases (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> aliases;

  /**
   * Indicates if user is archived.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean archived;

  /**
   * Boolean indicating if the user should change password in next login
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean changePasswordAtNextLogin;

  /**
   * User's G Suite account creation time. (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime creationTime;

  /**
   * Custom fields of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.util.Map<String, java.lang.Object>> customSchemas;

  /**
   * CustomerId of User (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime deletionTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object emails;

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object externalIds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object gender;

  /**
   * Hash function name for password. Supported are MD5, SHA-1 and crypt
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hashFunction;

  /**
   * Unique identifier of User (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object ims;

  /**
   * Boolean indicating if user is included in Global Address List
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeInGlobalAddressList;

  /**
   * Boolean indicating if ip is whitelisted
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ipWhitelisted;

  /**
   * Boolean indicating if the user is admin (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isAdmin;

  /**
   * Boolean indicating if the user is delegated admin (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDelegatedAdmin;

  /**
   * Is 2-step verification enforced (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isEnforcedIn2Sv;

  /**
   * Is enrolled in 2-step verification (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isEnrolledIn2Sv;

  /**
   * Is mailbox setup (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isMailboxSetup;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object keywords;

  /**
   * Kind of resource this is.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object languages;

  /**
   * User's last login time. (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime lastLoginTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object locations;

  /**
   * User's name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UserName name;

  /**
   * List of non editable aliases (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> nonEditableAliases;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object notes;

  /**
   * OrgUnit of User
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orgUnitPath;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object organizations;

  /**
   * User's password
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object phones;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object posixAccounts;

  /**
   * username of User
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String primaryEmail;

  /**
   * Recovery email of the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recoveryEmail;

  /**
   * Recovery phone of the user. The phone number must be in the E.164 format, starting with the
   * plus sign (+). Example: +16506661212.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recoveryPhone;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object relations;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object sshPublicKeys;

  /**
   * Indicates if user is suspended.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean suspended;

  /**
   * Suspension reason if user is suspended (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suspensionReason;

  /**
   * ETag of the user's photo (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbnailPhotoEtag;

  /**
   * Photo Url of the user (Read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbnailPhotoUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object websites;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getAddresses() {
    return addresses;
  }

  /**
   * @param addresses addresses or {@code null} for none
   */
  public User setAddresses(java.lang.Object addresses) {
    this.addresses = addresses;
    return this;
  }

  /**
   * Indicates if user has agreed to terms (Read-only)
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAgreedToTerms() {
    return agreedToTerms;
  }

  /**
   * Indicates if user has agreed to terms (Read-only)
   * @param agreedToTerms agreedToTerms or {@code null} for none
   */
  public User setAgreedToTerms(java.lang.Boolean agreedToTerms) {
    this.agreedToTerms = agreedToTerms;
    return this;
  }

  /**
   * List of aliases (Read-only)
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAliases() {
    return aliases;
  }

  /**
   * List of aliases (Read-only)
   * @param aliases aliases or {@code null} for none
   */
  public User setAliases(java.util.List<java.lang.String> aliases) {
    this.aliases = aliases;
    return this;
  }

  /**
   * Indicates if user is archived.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getArchived() {
    return archived;
  }

  /**
   * Indicates if user is archived.
   * @param archived archived or {@code null} for none
   */
  public User setArchived(java.lang.Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Boolean indicating if the user should change password in next login
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getChangePasswordAtNextLogin() {
    return changePasswordAtNextLogin;
  }

  /**
   * Boolean indicating if the user should change password in next login
   * @param changePasswordAtNextLogin changePasswordAtNextLogin or {@code null} for none
   */
  public User setChangePasswordAtNextLogin(java.lang.Boolean changePasswordAtNextLogin) {
    this.changePasswordAtNextLogin = changePasswordAtNextLogin;
    return this;
  }

  /**
   * User's G Suite account creation time. (Read-only)
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCreationTime() {
    return creationTime;
  }

  /**
   * User's G Suite account creation time. (Read-only)
   * @param creationTime creationTime or {@code null} for none
   */
  public User setCreationTime(com.google.api.client.util.DateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Custom fields of the user.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.util.Map<String, java.lang.Object>> getCustomSchemas() {
    return customSchemas;
  }

  /**
   * Custom fields of the user.
   * @param customSchemas customSchemas or {@code null} for none
   */
  public User setCustomSchemas(java.util.Map<String, java.util.Map<String, java.lang.Object>> customSchemas) {
    this.customSchemas = customSchemas;
    return this;
  }

  /**
   * CustomerId of User (Read-only)
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerId() {
    return customerId;
  }

  /**
   * CustomerId of User (Read-only)
   * @param customerId customerId or {@code null} for none
   */
  public User setCustomerId(java.lang.String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getDeletionTime() {
    return deletionTime;
  }

  /**
   * @param deletionTime deletionTime or {@code null} for none
   */
  public User setDeletionTime(com.google.api.client.util.DateTime deletionTime) {
    this.deletionTime = deletionTime;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getEmails() {
    return emails;
  }

  /**
   * @param emails emails or {@code null} for none
   */
  public User setEmails(java.lang.Object emails) {
    this.emails = emails;
    return this;
  }

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   * @param etag etag or {@code null} for none
   */
  public User setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getExternalIds() {
    return externalIds;
  }

  /**
   * @param externalIds externalIds or {@code null} for none
   */
  public User setExternalIds(java.lang.Object externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getGender() {
    return gender;
  }

  /**
   * @param gender gender or {@code null} for none
   */
  public User setGender(java.lang.Object gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Hash function name for password. Supported are MD5, SHA-1 and crypt
   * @return value or {@code null} for none
   */
  public java.lang.String getHashFunction() {
    return hashFunction;
  }

  /**
   * Hash function name for password. Supported are MD5, SHA-1 and crypt
   * @param hashFunction hashFunction or {@code null} for none
   */
  public User setHashFunction(java.lang.String hashFunction) {
    this.hashFunction = hashFunction;
    return this;
  }

  /**
   * Unique identifier of User (Read-only)
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Unique identifier of User (Read-only)
   * @param id id or {@code null} for none
   */
  public User setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getIms() {
    return ims;
  }

  /**
   * @param ims ims or {@code null} for none
   */
  public User setIms(java.lang.Object ims) {
    this.ims = ims;
    return this;
  }

  /**
   * Boolean indicating if user is included in Global Address List
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeInGlobalAddressList() {
    return includeInGlobalAddressList;
  }

  /**
   * Boolean indicating if user is included in Global Address List
   * @param includeInGlobalAddressList includeInGlobalAddressList or {@code null} for none
   */
  public User setIncludeInGlobalAddressList(java.lang.Boolean includeInGlobalAddressList) {
    this.includeInGlobalAddressList = includeInGlobalAddressList;
    return this;
  }

  /**
   * Boolean indicating if ip is whitelisted
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIpWhitelisted() {
    return ipWhitelisted;
  }

  /**
   * Boolean indicating if ip is whitelisted
   * @param ipWhitelisted ipWhitelisted or {@code null} for none
   */
  public User setIpWhitelisted(java.lang.Boolean ipWhitelisted) {
    this.ipWhitelisted = ipWhitelisted;
    return this;
  }

  /**
   * Boolean indicating if the user is admin (Read-only)
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsAdmin() {
    return isAdmin;
  }

  /**
   * Boolean indicating if the user is admin (Read-only)
   * @param isAdmin isAdmin or {@code null} for none
   */
  public User setIsAdmin(java.lang.Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  /**
   * Boolean indicating if the user is delegated admin (Read-only)
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDelegatedAdmin() {
    return isDelegatedAdmin;
  }

  /**
   * Boolean indicating if the user is delegated admin (Read-only)
   * @param isDelegatedAdmin isDelegatedAdmin or {@code null} for none
   */
  public User setIsDelegatedAdmin(java.lang.Boolean isDelegatedAdmin) {
    this.isDelegatedAdmin = isDelegatedAdmin;
    return this;
  }

  /**
   * Is 2-step verification enforced (Read-only)
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsEnforcedIn2Sv() {
    return isEnforcedIn2Sv;
  }

  /**
   * Is 2-step verification enforced (Read-only)
   * @param isEnforcedIn2Sv isEnforcedIn2Sv or {@code null} for none
   */
  public User setIsEnforcedIn2Sv(java.lang.Boolean isEnforcedIn2Sv) {
    this.isEnforcedIn2Sv = isEnforcedIn2Sv;
    return this;
  }

  /**
   * Is enrolled in 2-step verification (Read-only)
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsEnrolledIn2Sv() {
    return isEnrolledIn2Sv;
  }

  /**
   * Is enrolled in 2-step verification (Read-only)
   * @param isEnrolledIn2Sv isEnrolledIn2Sv or {@code null} for none
   */
  public User setIsEnrolledIn2Sv(java.lang.Boolean isEnrolledIn2Sv) {
    this.isEnrolledIn2Sv = isEnrolledIn2Sv;
    return this;
  }

  /**
   * Is mailbox setup (Read-only)
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsMailboxSetup() {
    return isMailboxSetup;
  }

  /**
   * Is mailbox setup (Read-only)
   * @param isMailboxSetup isMailboxSetup or {@code null} for none
   */
  public User setIsMailboxSetup(java.lang.Boolean isMailboxSetup) {
    this.isMailboxSetup = isMailboxSetup;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getKeywords() {
    return keywords;
  }

  /**
   * @param keywords keywords or {@code null} for none
   */
  public User setKeywords(java.lang.Object keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * Kind of resource this is.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Kind of resource this is.
   * @param kind kind or {@code null} for none
   */
  public User setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getLanguages() {
    return languages;
  }

  /**
   * @param languages languages or {@code null} for none
   */
  public User setLanguages(java.lang.Object languages) {
    this.languages = languages;
    return this;
  }

  /**
   * User's last login time. (Read-only)
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getLastLoginTime() {
    return lastLoginTime;
  }

  /**
   * User's last login time. (Read-only)
   * @param lastLoginTime lastLoginTime or {@code null} for none
   */
  public User setLastLoginTime(com.google.api.client.util.DateTime lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getLocations() {
    return locations;
  }

  /**
   * @param locations locations or {@code null} for none
   */
  public User setLocations(java.lang.Object locations) {
    this.locations = locations;
    return this;
  }

  /**
   * User's name
   * @return value or {@code null} for none
   */
  public UserName getName() {
    return name;
  }

  /**
   * User's name
   * @param name name or {@code null} for none
   */
  public User setName(UserName name) {
    this.name = name;
    return this;
  }

  /**
   * List of non editable aliases (Read-only)
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNonEditableAliases() {
    return nonEditableAliases;
  }

  /**
   * List of non editable aliases (Read-only)
   * @param nonEditableAliases nonEditableAliases or {@code null} for none
   */
  public User setNonEditableAliases(java.util.List<java.lang.String> nonEditableAliases) {
    this.nonEditableAliases = nonEditableAliases;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getNotes() {
    return notes;
  }

  /**
   * @param notes notes or {@code null} for none
   */
  public User setNotes(java.lang.Object notes) {
    this.notes = notes;
    return this;
  }

  /**
   * OrgUnit of User
   * @return value or {@code null} for none
   */
  public java.lang.String getOrgUnitPath() {
    return orgUnitPath;
  }

  /**
   * OrgUnit of User
   * @param orgUnitPath orgUnitPath or {@code null} for none
   */
  public User setOrgUnitPath(java.lang.String orgUnitPath) {
    this.orgUnitPath = orgUnitPath;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getOrganizations() {
    return organizations;
  }

  /**
   * @param organizations organizations or {@code null} for none
   */
  public User setOrganizations(java.lang.Object organizations) {
    this.organizations = organizations;
    return this;
  }

  /**
   * User's password
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * User's password
   * @param password password or {@code null} for none
   */
  public User setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getPhones() {
    return phones;
  }

  /**
   * @param phones phones or {@code null} for none
   */
  public User setPhones(java.lang.Object phones) {
    this.phones = phones;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getPosixAccounts() {
    return posixAccounts;
  }

  /**
   * @param posixAccounts posixAccounts or {@code null} for none
   */
  public User setPosixAccounts(java.lang.Object posixAccounts) {
    this.posixAccounts = posixAccounts;
    return this;
  }

  /**
   * username of User
   * @return value or {@code null} for none
   */
  public java.lang.String getPrimaryEmail() {
    return primaryEmail;
  }

  /**
   * username of User
   * @param primaryEmail primaryEmail or {@code null} for none
   */
  public User setPrimaryEmail(java.lang.String primaryEmail) {
    this.primaryEmail = primaryEmail;
    return this;
  }

  /**
   * Recovery email of the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecoveryEmail() {
    return recoveryEmail;
  }

  /**
   * Recovery email of the user.
   * @param recoveryEmail recoveryEmail or {@code null} for none
   */
  public User setRecoveryEmail(java.lang.String recoveryEmail) {
    this.recoveryEmail = recoveryEmail;
    return this;
  }

  /**
   * Recovery phone of the user. The phone number must be in the E.164 format, starting with the
   * plus sign (+). Example: +16506661212.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecoveryPhone() {
    return recoveryPhone;
  }

  /**
   * Recovery phone of the user. The phone number must be in the E.164 format, starting with the
   * plus sign (+). Example: +16506661212.
   * @param recoveryPhone recoveryPhone or {@code null} for none
   */
  public User setRecoveryPhone(java.lang.String recoveryPhone) {
    this.recoveryPhone = recoveryPhone;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getRelations() {
    return relations;
  }

  /**
   * @param relations relations or {@code null} for none
   */
  public User setRelations(java.lang.Object relations) {
    this.relations = relations;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getSshPublicKeys() {
    return sshPublicKeys;
  }

  /**
   * @param sshPublicKeys sshPublicKeys or {@code null} for none
   */
  public User setSshPublicKeys(java.lang.Object sshPublicKeys) {
    this.sshPublicKeys = sshPublicKeys;
    return this;
  }

  /**
   * Indicates if user is suspended.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSuspended() {
    return suspended;
  }

  /**
   * Indicates if user is suspended.
   * @param suspended suspended or {@code null} for none
   */
  public User setSuspended(java.lang.Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Suspension reason if user is suspended (Read-only)
   * @return value or {@code null} for none
   */
  public java.lang.String getSuspensionReason() {
    return suspensionReason;
  }

  /**
   * Suspension reason if user is suspended (Read-only)
   * @param suspensionReason suspensionReason or {@code null} for none
   */
  public User setSuspensionReason(java.lang.String suspensionReason) {
    this.suspensionReason = suspensionReason;
    return this;
  }

  /**
   * ETag of the user's photo (Read-only)
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbnailPhotoEtag() {
    return thumbnailPhotoEtag;
  }

  /**
   * ETag of the user's photo (Read-only)
   * @param thumbnailPhotoEtag thumbnailPhotoEtag or {@code null} for none
   */
  public User setThumbnailPhotoEtag(java.lang.String thumbnailPhotoEtag) {
    this.thumbnailPhotoEtag = thumbnailPhotoEtag;
    return this;
  }

  /**
   * Photo Url of the user (Read-only)
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbnailPhotoUrl() {
    return thumbnailPhotoUrl;
  }

  /**
   * Photo Url of the user (Read-only)
   * @param thumbnailPhotoUrl thumbnailPhotoUrl or {@code null} for none
   */
  public User setThumbnailPhotoUrl(java.lang.String thumbnailPhotoUrl) {
    this.thumbnailPhotoUrl = thumbnailPhotoUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getWebsites() {
    return websites;
  }

  /**
   * @param websites websites or {@code null} for none
   */
  public User setWebsites(java.lang.Object websites) {
    this.websites = websites;
    return this;
  }

  @Override
  public User set(String fieldName, Object value) {
    return (User) super.set(fieldName, value);
  }

  @Override
  public User clone() {
    return (User) super.clone();
  }

}
