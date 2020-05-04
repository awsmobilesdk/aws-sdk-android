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

public class DescribeLocalGatewayVirtualInterfaceGroupsResult implements Serializable {
    /**
     * <p>
     * The virtual interface groups.
     * </p>
     */
    private java.util.List<LocalGatewayVirtualInterfaceGroup> localGatewayVirtualInterfaceGroups;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The virtual interface groups.
     * </p>
     *
     * @return <p>
     *         The virtual interface groups.
     *         </p>
     */
    public java.util.List<LocalGatewayVirtualInterfaceGroup> getLocalGatewayVirtualInterfaceGroups() {
        return localGatewayVirtualInterfaceGroups;
    }

    /**
     * <p>
     * The virtual interface groups.
     * </p>
     *
     * @param localGatewayVirtualInterfaceGroups <p>
     *            The virtual interface groups.
     *            </p>
     */
    public void setLocalGatewayVirtualInterfaceGroups(
            java.util.Collection<LocalGatewayVirtualInterfaceGroup> localGatewayVirtualInterfaceGroups) {
        if (localGatewayVirtualInterfaceGroups == null) {
            this.localGatewayVirtualInterfaceGroups = null;
            return;
        }

        this.localGatewayVirtualInterfaceGroups = new java.util.ArrayList<LocalGatewayVirtualInterfaceGroup>(
                localGatewayVirtualInterfaceGroups);
    }

    /**
     * <p>
     * The virtual interface groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayVirtualInterfaceGroups <p>
     *            The virtual interface groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLocalGatewayVirtualInterfaceGroupsResult withLocalGatewayVirtualInterfaceGroups(
            LocalGatewayVirtualInterfaceGroup... localGatewayVirtualInterfaceGroups) {
        if (getLocalGatewayVirtualInterfaceGroups() == null) {
            this.localGatewayVirtualInterfaceGroups = new java.util.ArrayList<LocalGatewayVirtualInterfaceGroup>(
                    localGatewayVirtualInterfaceGroups.length);
        }
        for (LocalGatewayVirtualInterfaceGroup value : localGatewayVirtualInterfaceGroups) {
            this.localGatewayVirtualInterfaceGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The virtual interface groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayVirtualInterfaceGroups <p>
     *            The virtual interface groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLocalGatewayVirtualInterfaceGroupsResult withLocalGatewayVirtualInterfaceGroups(
            java.util.Collection<LocalGatewayVirtualInterfaceGroup> localGatewayVirtualInterfaceGroups) {
        setLocalGatewayVirtualInterfaceGroups(localGatewayVirtualInterfaceGroups);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLocalGatewayVirtualInterfaceGroupsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getLocalGatewayVirtualInterfaceGroups() != null)
            sb.append("LocalGatewayVirtualInterfaceGroups: "
                    + getLocalGatewayVirtualInterfaceGroups() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLocalGatewayVirtualInterfaceGroups() == null) ? 0
                        : getLocalGatewayVirtualInterfaceGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLocalGatewayVirtualInterfaceGroupsResult == false)
            return false;
        DescribeLocalGatewayVirtualInterfaceGroupsResult other = (DescribeLocalGatewayVirtualInterfaceGroupsResult) obj;

        if (other.getLocalGatewayVirtualInterfaceGroups() == null
                ^ this.getLocalGatewayVirtualInterfaceGroups() == null)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroups() != null
                && other.getLocalGatewayVirtualInterfaceGroups().equals(
                        this.getLocalGatewayVirtualInterfaceGroups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}