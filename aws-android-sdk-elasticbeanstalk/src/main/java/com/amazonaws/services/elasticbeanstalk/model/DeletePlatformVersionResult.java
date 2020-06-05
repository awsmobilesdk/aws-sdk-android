/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

public class DeletePlatformVersionResult implements Serializable {
    /**
     * <p>
     * Detailed information about the version of the custom platform.
     * </p>
     */
    private PlatformSummary platformSummary;

    /**
     * <p>
     * Detailed information about the version of the custom platform.
     * </p>
     *
     * @return <p>
     *         Detailed information about the version of the custom platform.
     *         </p>
     */
    public PlatformSummary getPlatformSummary() {
        return platformSummary;
    }

    /**
     * <p>
     * Detailed information about the version of the custom platform.
     * </p>
     *
     * @param platformSummary <p>
     *            Detailed information about the version of the custom platform.
     *            </p>
     */
    public void setPlatformSummary(PlatformSummary platformSummary) {
        this.platformSummary = platformSummary;
    }

    /**
     * <p>
     * Detailed information about the version of the custom platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformSummary <p>
     *            Detailed information about the version of the custom platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeletePlatformVersionResult withPlatformSummary(PlatformSummary platformSummary) {
        this.platformSummary = platformSummary;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPlatformSummary() != null)
            sb.append("PlatformSummary: " + getPlatformSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPlatformSummary() == null) ? 0 : getPlatformSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePlatformVersionResult == false)
            return false;
        DeletePlatformVersionResult other = (DeletePlatformVersionResult) obj;

        if (other.getPlatformSummary() == null ^ this.getPlatformSummary() == null)
            return false;
        if (other.getPlatformSummary() != null
                && other.getPlatformSummary().equals(this.getPlatformSummary()) == false)
            return false;
        return true;
    }
}