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

package org.apache.toree.kernel.api

/**
 * Represents a "wrapper" for information needed to stream stdout/stderr from
 * the kernel to a client.
 *
 * @note This exists because the KernelMessage instance is defined in the
 *       protocol project, which is not brought into this project. Furthermore,
 *       it is better practice to provide an explicit wrapper type rather than
 *       a more common type for implicit use.
 */
trait StreamInfo
