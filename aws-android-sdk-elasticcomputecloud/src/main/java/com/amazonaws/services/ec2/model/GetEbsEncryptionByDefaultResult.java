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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class GetEbsEncryptionByDefaultResult implements Serializable {
    /**
     * <p>
     * Indicates whether encryption by default is enabled.
     * </p>
     */
    private Boolean ebsEncryptionByDefault;

    /**
     * <p>
     * Indicates whether encryption by default is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether encryption by default is enabled.
     *         </p>
     */
    public Boolean isEbsEncryptionByDefault() {
        return ebsEncryptionByDefault;
    }

    /**
     * <p>
     * Indicates whether encryption by default is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether encryption by default is enabled.
     *         </p>
     */
    public Boolean getEbsEncryptionByDefault() {
        return ebsEncryptionByDefault;
    }

    /**
     * <p>
     * Indicates whether encryption by default is enabled.
     * </p>
     *
     * @param ebsEncryptionByDefault <p>
     *            Indicates whether encryption by default is enabled.
     *            </p>
     */
    public void setEbsEncryptionByDefault(Boolean ebsEncryptionByDefault) {
        this.ebsEncryptionByDefault = ebsEncryptionByDefault;
    }

    /**
     * <p>
     * Indicates whether encryption by default is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsEncryptionByDefault <p>
     *            Indicates whether encryption by default is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetEbsEncryptionByDefaultResult withEbsEncryptionByDefault(Boolean ebsEncryptionByDefault) {
        this.ebsEncryptionByDefault = ebsEncryptionByDefault;
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
        if (getEbsEncryptionByDefault() != null)
            sb.append("EbsEncryptionByDefault: " + getEbsEncryptionByDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEbsEncryptionByDefault() == null) ? 0 : getEbsEncryptionByDefault()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEbsEncryptionByDefaultResult == false)
            return false;
        GetEbsEncryptionByDefaultResult other = (GetEbsEncryptionByDefaultResult) obj;

        if (other.getEbsEncryptionByDefault() == null ^ this.getEbsEncryptionByDefault() == null)
            return false;
        if (other.getEbsEncryptionByDefault() != null
                && other.getEbsEncryptionByDefault().equals(this.getEbsEncryptionByDefault()) == false)
            return false;
        return true;
    }
}