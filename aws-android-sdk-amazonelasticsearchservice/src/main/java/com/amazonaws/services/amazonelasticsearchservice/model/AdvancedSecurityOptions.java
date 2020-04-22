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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the advanced security configuration: whether advanced security is
 * enabled, whether the internal database option is enabled.
 * </p>
 */
public class AdvancedSecurityOptions implements Serializable {
    /**
     * <p>
     * True if advanced security is enabled.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * True if the internal user database is enabled.
     * </p>
     */
    private Boolean internalUserDatabaseEnabled;

    /**
     * <p>
     * True if advanced security is enabled.
     * </p>
     *
     * @return <p>
     *         True if advanced security is enabled.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * True if advanced security is enabled.
     * </p>
     *
     * @return <p>
     *         True if advanced security is enabled.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * True if advanced security is enabled.
     * </p>
     *
     * @param enabled <p>
     *            True if advanced security is enabled.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * True if advanced security is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            True if advanced security is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdvancedSecurityOptions withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * True if the internal user database is enabled.
     * </p>
     *
     * @return <p>
     *         True if the internal user database is enabled.
     *         </p>
     */
    public Boolean isInternalUserDatabaseEnabled() {
        return internalUserDatabaseEnabled;
    }

    /**
     * <p>
     * True if the internal user database is enabled.
     * </p>
     *
     * @return <p>
     *         True if the internal user database is enabled.
     *         </p>
     */
    public Boolean getInternalUserDatabaseEnabled() {
        return internalUserDatabaseEnabled;
    }

    /**
     * <p>
     * True if the internal user database is enabled.
     * </p>
     *
     * @param internalUserDatabaseEnabled <p>
     *            True if the internal user database is enabled.
     *            </p>
     */
    public void setInternalUserDatabaseEnabled(Boolean internalUserDatabaseEnabled) {
        this.internalUserDatabaseEnabled = internalUserDatabaseEnabled;
    }

    /**
     * <p>
     * True if the internal user database is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param internalUserDatabaseEnabled <p>
     *            True if the internal user database is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdvancedSecurityOptions withInternalUserDatabaseEnabled(
            Boolean internalUserDatabaseEnabled) {
        this.internalUserDatabaseEnabled = internalUserDatabaseEnabled;
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
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getInternalUserDatabaseEnabled() != null)
            sb.append("InternalUserDatabaseEnabled: " + getInternalUserDatabaseEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getInternalUserDatabaseEnabled() == null) ? 0
                        : getInternalUserDatabaseEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdvancedSecurityOptions == false)
            return false;
        AdvancedSecurityOptions other = (AdvancedSecurityOptions) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getInternalUserDatabaseEnabled() == null
                ^ this.getInternalUserDatabaseEnabled() == null)
            return false;
        if (other.getInternalUserDatabaseEnabled() != null
                && other.getInternalUserDatabaseEnabled().equals(
                        this.getInternalUserDatabaseEnabled()) == false)
            return false;
        return true;
    }
}
