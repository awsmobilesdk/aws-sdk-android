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

public class DescribeCoipPoolsResult implements Serializable {
    /**
     * <p>
     * Information about the address pools.
     * </p>
     */
    private java.util.List<CoipPool> coipPools;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the address pools.
     * </p>
     *
     * @return <p>
     *         Information about the address pools.
     *         </p>
     */
    public java.util.List<CoipPool> getCoipPools() {
        return coipPools;
    }

    /**
     * <p>
     * Information about the address pools.
     * </p>
     *
     * @param coipPools <p>
     *            Information about the address pools.
     *            </p>
     */
    public void setCoipPools(java.util.Collection<CoipPool> coipPools) {
        if (coipPools == null) {
            this.coipPools = null;
            return;
        }

        this.coipPools = new java.util.ArrayList<CoipPool>(coipPools);
    }

    /**
     * <p>
     * Information about the address pools.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coipPools <p>
     *            Information about the address pools.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCoipPoolsResult withCoipPools(CoipPool... coipPools) {
        if (getCoipPools() == null) {
            this.coipPools = new java.util.ArrayList<CoipPool>(coipPools.length);
        }
        for (CoipPool value : coipPools) {
            this.coipPools.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the address pools.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coipPools <p>
     *            Information about the address pools.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCoipPoolsResult withCoipPools(java.util.Collection<CoipPool> coipPools) {
        setCoipPools(coipPools);
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
    public DescribeCoipPoolsResult withNextToken(String nextToken) {
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
        if (getCoipPools() != null)
            sb.append("CoipPools: " + getCoipPools() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoipPools() == null) ? 0 : getCoipPools().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCoipPoolsResult == false)
            return false;
        DescribeCoipPoolsResult other = (DescribeCoipPoolsResult) obj;

        if (other.getCoipPools() == null ^ this.getCoipPools() == null)
            return false;
        if (other.getCoipPools() != null
                && other.getCoipPools().equals(this.getCoipPools()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}