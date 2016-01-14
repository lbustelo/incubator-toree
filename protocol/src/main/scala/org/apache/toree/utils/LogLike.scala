/*
 * Copyright 2014 IBM Corp.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.toree.utils

import org.slf4j.LoggerFactory

/**
 * A trait for mixing in logging. This trait
 * exposes a {@link org.slf4j.Logger}
 * through a protected field called logger
 */
trait LogLike {
  val loggerName = this.getClass.getName
  protected val logger = LoggerFactory.getLogger(loggerName)
}
