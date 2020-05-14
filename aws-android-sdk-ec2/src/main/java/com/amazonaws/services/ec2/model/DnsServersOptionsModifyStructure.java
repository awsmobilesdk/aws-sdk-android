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
 * Information about the DNS server to be used.
 * </p>
 */
public class DnsServersOptionsModifyStructure implements Serializable {
    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the DNS servers to be used.
     * You can specify up to two DNS servers. Ensure that the DNS servers can be
     * reached by the clients. The specified values overwrite the existing
     * values.
     * </p>
     */
    private java.util.List<String> customDnsServers;

    /**
     * <p>
     * Indicates whether DNS servers should be used. Specify <code>False</code>
     * to delete the existing DNS servers.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the DNS servers to be used.
     * You can specify up to two DNS servers. Ensure that the DNS servers can be
     * reached by the clients. The specified values overwrite the existing
     * values.
     * </p>
     *
     * @return <p>
     *         The IPv4 address range, in CIDR notation, of the DNS servers to
     *         be used. You can specify up to two DNS servers. Ensure that the
     *         DNS servers can be reached by the clients. The specified values
     *         overwrite the existing values.
     *         </p>
     */
    public java.util.List<String> getCustomDnsServers() {
        return customDnsServers;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the DNS servers to be used.
     * You can specify up to two DNS servers. Ensure that the DNS servers can be
     * reached by the clients. The specified values overwrite the existing
     * values.
     * </p>
     *
     * @param customDnsServers <p>
     *            The IPv4 address range, in CIDR notation, of the DNS servers
     *            to be used. You can specify up to two DNS servers. Ensure that
     *            the DNS servers can be reached by the clients. The specified
     *            values overwrite the existing values.
     *            </p>
     */
    public void setCustomDnsServers(java.util.Collection<String> customDnsServers) {
        if (customDnsServers == null) {
            this.customDnsServers = null;
            return;
        }

        this.customDnsServers = new java.util.ArrayList<String>(customDnsServers);
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the DNS servers to be used.
     * You can specify up to two DNS servers. Ensure that the DNS servers can be
     * reached by the clients. The specified values overwrite the existing
     * values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customDnsServers <p>
     *            The IPv4 address range, in CIDR notation, of the DNS servers
     *            to be used. You can specify up to two DNS servers. Ensure that
     *            the DNS servers can be reached by the clients. The specified
     *            values overwrite the existing values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DnsServersOptionsModifyStructure withCustomDnsServers(String... customDnsServers) {
        if (getCustomDnsServers() == null) {
            this.customDnsServers = new java.util.ArrayList<String>(customDnsServers.length);
        }
        for (String value : customDnsServers) {
            this.customDnsServers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the DNS servers to be used.
     * You can specify up to two DNS servers. Ensure that the DNS servers can be
     * reached by the clients. The specified values overwrite the existing
     * values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customDnsServers <p>
     *            The IPv4 address range, in CIDR notation, of the DNS servers
     *            to be used. You can specify up to two DNS servers. Ensure that
     *            the DNS servers can be reached by the clients. The specified
     *            values overwrite the existing values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DnsServersOptionsModifyStructure withCustomDnsServers(
            java.util.Collection<String> customDnsServers) {
        setCustomDnsServers(customDnsServers);
        return this;
    }

    /**
     * <p>
     * Indicates whether DNS servers should be used. Specify <code>False</code>
     * to delete the existing DNS servers.
     * </p>
     *
     * @return <p>
     *         Indicates whether DNS servers should be used. Specify
     *         <code>False</code> to delete the existing DNS servers.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether DNS servers should be used. Specify <code>False</code>
     * to delete the existing DNS servers.
     * </p>
     *
     * @return <p>
     *         Indicates whether DNS servers should be used. Specify
     *         <code>False</code> to delete the existing DNS servers.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether DNS servers should be used. Specify <code>False</code>
     * to delete the existing DNS servers.
     * </p>
     *
     * @param enabled <p>
     *            Indicates whether DNS servers should be used. Specify
     *            <code>False</code> to delete the existing DNS servers.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether DNS servers should be used. Specify <code>False</code>
     * to delete the existing DNS servers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Indicates whether DNS servers should be used. Specify
     *            <code>False</code> to delete the existing DNS servers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DnsServersOptionsModifyStructure withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getCustomDnsServers() != null)
            sb.append("CustomDnsServers: " + getCustomDnsServers() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCustomDnsServers() == null) ? 0 : getCustomDnsServers().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsServersOptionsModifyStructure == false)
            return false;
        DnsServersOptionsModifyStructure other = (DnsServersOptionsModifyStructure) obj;

        if (other.getCustomDnsServers() == null ^ this.getCustomDnsServers() == null)
            return false;
        if (other.getCustomDnsServers() != null
                && other.getCustomDnsServers().equals(this.getCustomDnsServers()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
