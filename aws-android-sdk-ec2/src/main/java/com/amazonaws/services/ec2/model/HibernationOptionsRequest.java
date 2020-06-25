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

/**
 * <p>
 * Indicates whether your instance is configured for hibernation. This parameter
 * is valid only if the instance meets the <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites"
 * >hibernation prerequisites</a>. For more information, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html"
 * >Hibernate your instance</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 */
public class HibernationOptionsRequest implements Serializable {
    /**
     * <p>
     * If you set this parameter to <code>true</code>, your instance is enabled
     * for hibernation.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean configured;

    /**
     * <p>
     * If you set this parameter to <code>true</code>, your instance is enabled
     * for hibernation.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         If you set this parameter to <code>true</code>, your instance is
     *         enabled for hibernation.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean isConfigured() {
        return configured;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, your instance is enabled
     * for hibernation.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         If you set this parameter to <code>true</code>, your instance is
     *         enabled for hibernation.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean getConfigured() {
        return configured;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, your instance is enabled
     * for hibernation.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @param configured <p>
     *            If you set this parameter to <code>true</code>, your instance
     *            is enabled for hibernation.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     */
    public void setConfigured(Boolean configured) {
        this.configured = configured;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, your instance is enabled
     * for hibernation.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configured <p>
     *            If you set this parameter to <code>true</code>, your instance
     *            is enabled for hibernation.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HibernationOptionsRequest withConfigured(Boolean configured) {
        this.configured = configured;
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
        if (getConfigured() != null)
            sb.append("Configured: " + getConfigured());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigured() == null) ? 0 : getConfigured().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HibernationOptionsRequest == false)
            return false;
        HibernationOptionsRequest other = (HibernationOptionsRequest) obj;

        if (other.getConfigured() == null ^ this.getConfigured() == null)
            return false;
        if (other.getConfigured() != null
                && other.getConfigured().equals(this.getConfigured()) == false)
            return false;
        return true;
    }
}
