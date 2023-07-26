/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.process.internal.health.memory;

/**
 * OS memory status.
 */
public interface OsMemoryStatus {
    /**
     * @return OS total memory in bytes
     * @deprecated Use {@link #getPhysicalMemory()}{@code .}{@link OsMemoryCategory.Limited#getTotal() getTotal()} instead.
     */
    @Deprecated
    long getTotalPhysicalMemory();

    /**
     * @return OS free memory in bytes
     * @deprecated Use {@link #getPhysicalMemory()}{@code .}{@link OsMemoryCategory.Limited#getFree() getFree()} instead.
     */
    @Deprecated
    long getFreePhysicalMemory();

    /**
     * Get the physical memory information.
     *
     * @return the physical memory information
     */
    OsMemoryCategory.Limited getPhysicalMemory();

    /**
     * Get the virtual memory information.
     *
     * @return the virtual memory information
     */
    OsMemoryCategory getVirtualMemory();
}
