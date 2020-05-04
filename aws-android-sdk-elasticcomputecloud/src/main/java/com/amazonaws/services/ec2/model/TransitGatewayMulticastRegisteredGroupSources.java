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
 * Describes the members registered with the transit gateway multicast group.
 * </p>
 */
public class TransitGatewayMulticastRegisteredGroupSources implements Serializable {
    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     */
    private String transitGatewayMulticastDomainId;

    /**
     * <p>
     * The IDs of the network interfaces members registered with the transit
     * gateway multicast group.
     * </p>
     */
    private java.util.List<String> registeredNetworkInterfaceIds;

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     */
    private String groupIpAddress;

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     *
     * @return <p>
     *         The ID of the transit gateway multicast domain.
     *         </p>
     */
    public String getTransitGatewayMulticastDomainId() {
        return transitGatewayMulticastDomainId;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     *
     * @param transitGatewayMulticastDomainId <p>
     *            The ID of the transit gateway multicast domain.
     *            </p>
     */
    public void setTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
        this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayMulticastDomainId <p>
     *            The ID of the transit gateway multicast domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastRegisteredGroupSources withTransitGatewayMulticastDomainId(
            String transitGatewayMulticastDomainId) {
        this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId;
        return this;
    }

    /**
     * <p>
     * The IDs of the network interfaces members registered with the transit
     * gateway multicast group.
     * </p>
     *
     * @return <p>
     *         The IDs of the network interfaces members registered with the
     *         transit gateway multicast group.
     *         </p>
     */
    public java.util.List<String> getRegisteredNetworkInterfaceIds() {
        return registeredNetworkInterfaceIds;
    }

    /**
     * <p>
     * The IDs of the network interfaces members registered with the transit
     * gateway multicast group.
     * </p>
     *
     * @param registeredNetworkInterfaceIds <p>
     *            The IDs of the network interfaces members registered with the
     *            transit gateway multicast group.
     *            </p>
     */
    public void setRegisteredNetworkInterfaceIds(
            java.util.Collection<String> registeredNetworkInterfaceIds) {
        if (registeredNetworkInterfaceIds == null) {
            this.registeredNetworkInterfaceIds = null;
            return;
        }

        this.registeredNetworkInterfaceIds = new java.util.ArrayList<String>(
                registeredNetworkInterfaceIds);
    }

    /**
     * <p>
     * The IDs of the network interfaces members registered with the transit
     * gateway multicast group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registeredNetworkInterfaceIds <p>
     *            The IDs of the network interfaces members registered with the
     *            transit gateway multicast group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastRegisteredGroupSources withRegisteredNetworkInterfaceIds(
            String... registeredNetworkInterfaceIds) {
        if (getRegisteredNetworkInterfaceIds() == null) {
            this.registeredNetworkInterfaceIds = new java.util.ArrayList<String>(
                    registeredNetworkInterfaceIds.length);
        }
        for (String value : registeredNetworkInterfaceIds) {
            this.registeredNetworkInterfaceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the network interfaces members registered with the transit
     * gateway multicast group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registeredNetworkInterfaceIds <p>
     *            The IDs of the network interfaces members registered with the
     *            transit gateway multicast group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastRegisteredGroupSources withRegisteredNetworkInterfaceIds(
            java.util.Collection<String> registeredNetworkInterfaceIds) {
        setRegisteredNetworkInterfaceIds(registeredNetworkInterfaceIds);
        return this;
    }

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     *
     * @return <p>
     *         The IP address assigned to the transit gateway multicast group.
     *         </p>
     */
    public String getGroupIpAddress() {
        return groupIpAddress;
    }

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     *
     * @param groupIpAddress <p>
     *            The IP address assigned to the transit gateway multicast
     *            group.
     *            </p>
     */
    public void setGroupIpAddress(String groupIpAddress) {
        this.groupIpAddress = groupIpAddress;
    }

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupIpAddress <p>
     *            The IP address assigned to the transit gateway multicast
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayMulticastRegisteredGroupSources withGroupIpAddress(String groupIpAddress) {
        this.groupIpAddress = groupIpAddress;
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
        if (getTransitGatewayMulticastDomainId() != null)
            sb.append("TransitGatewayMulticastDomainId: " + getTransitGatewayMulticastDomainId()
                    + ",");
        if (getRegisteredNetworkInterfaceIds() != null)
            sb.append("RegisteredNetworkInterfaceIds: " + getRegisteredNetworkInterfaceIds() + ",");
        if (getGroupIpAddress() != null)
            sb.append("GroupIpAddress: " + getGroupIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTransitGatewayMulticastDomainId() == null) ? 0
                        : getTransitGatewayMulticastDomainId().hashCode());
        hashCode = prime
                * hashCode
                + ((getRegisteredNetworkInterfaceIds() == null) ? 0
                        : getRegisteredNetworkInterfaceIds().hashCode());
        hashCode = prime * hashCode
                + ((getGroupIpAddress() == null) ? 0 : getGroupIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayMulticastRegisteredGroupSources == false)
            return false;
        TransitGatewayMulticastRegisteredGroupSources other = (TransitGatewayMulticastRegisteredGroupSources) obj;

        if (other.getTransitGatewayMulticastDomainId() == null
                ^ this.getTransitGatewayMulticastDomainId() == null)
            return false;
        if (other.getTransitGatewayMulticastDomainId() != null
                && other.getTransitGatewayMulticastDomainId().equals(
                        this.getTransitGatewayMulticastDomainId()) == false)
            return false;
        if (other.getRegisteredNetworkInterfaceIds() == null
                ^ this.getRegisteredNetworkInterfaceIds() == null)
            return false;
        if (other.getRegisteredNetworkInterfaceIds() != null
                && other.getRegisteredNetworkInterfaceIds().equals(
                        this.getRegisteredNetworkInterfaceIds()) == false)
            return false;
        if (other.getGroupIpAddress() == null ^ this.getGroupIpAddress() == null)
            return false;
        if (other.getGroupIpAddress() != null
                && other.getGroupIpAddress().equals(this.getGroupIpAddress()) == false)
            return false;
        return true;
    }
}