/*
 * Copyright 2017 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mongodb.scala

import com.mongodb.{ClientSessionOptions => JClientSessionOptions}

/**
 * The options to apply to a `ClientSession`.
 *
 * @see ClientSession
 * @since 2.2
 */
object ClientSessionOptions {

  /**
   * Gets an instance of a builder
   *
   * @return a builder instance
   */
  def builder(): Builder = JClientSessionOptions.builder

  /**
   * Gets an instance of a builder initialized with the given options
   *
   * @param clientSessionOptions the options with which to initialize the builder
   * @return a builder instance
   * @since 2.4
   */
  def builder(clientSessionOptions: ClientSessionOptions): Builder = JClientSessionOptions.builder(clientSessionOptions)

  /**
   * ClientSession builder
   */
  type Builder = JClientSessionOptions.Builder

}
