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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * Command describes a step performed as part of the build pipeline.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Command extends com.google.api.client.json.GenericJson {

  /**
   * Command-line arguments used when executing this Command.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> args;

  /**
   * Working directory (relative to project source root) used when running this Command.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dir;

  /**
   * Environment variables set before running this Command.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> env;

  /**
   * Optional unique identifier for this Command, used in wait_for to reference this Command as a
   * dependency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Name of the command, as presented on the command line, or if the command is packaged as a
   * Docker container, as presented to `docker pull`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The ID(s) of the Command(s) that this Command depends on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> waitFor;

  /**
   * Command-line arguments used when executing this Command.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getArgs() {
    return args;
  }

  /**
   * Command-line arguments used when executing this Command.
   * @param args args or {@code null} for none
   */
  public Command setArgs(java.util.List<java.lang.String> args) {
    this.args = args;
    return this;
  }

  /**
   * Working directory (relative to project source root) used when running this Command.
   * @return value or {@code null} for none
   */
  public java.lang.String getDir() {
    return dir;
  }

  /**
   * Working directory (relative to project source root) used when running this Command.
   * @param dir dir or {@code null} for none
   */
  public Command setDir(java.lang.String dir) {
    this.dir = dir;
    return this;
  }

  /**
   * Environment variables set before running this Command.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEnv() {
    return env;
  }

  /**
   * Environment variables set before running this Command.
   * @param env env or {@code null} for none
   */
  public Command setEnv(java.util.List<java.lang.String> env) {
    this.env = env;
    return this;
  }

  /**
   * Optional unique identifier for this Command, used in wait_for to reference this Command as a
   * dependency.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Optional unique identifier for this Command, used in wait_for to reference this Command as a
   * dependency.
   * @param id id or {@code null} for none
   */
  public Command setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Name of the command, as presented on the command line, or if the command is packaged as a
   * Docker container, as presented to `docker pull`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the command, as presented on the command line, or if the command is packaged as a
   * Docker container, as presented to `docker pull`.
   * @param name name or {@code null} for none
   */
  public Command setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The ID(s) of the Command(s) that this Command depends on.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getWaitFor() {
    return waitFor;
  }

  /**
   * The ID(s) of the Command(s) that this Command depends on.
   * @param waitFor waitFor or {@code null} for none
   */
  public Command setWaitFor(java.util.List<java.lang.String> waitFor) {
    this.waitFor = waitFor;
    return this;
  }

  @Override
  public Command set(String fieldName, Object value) {
    return (Command) super.set(fieldName, value);
  }

  @Override
  public Command clone() {
    return (Command) super.clone();
  }

}