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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about reserved Elasticsearch instances for this account.
 * </p>
 */
public class DescribeReservedElasticsearchInstancesRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The reserved instance identifier filter value. Use this parameter to show
     * only the reservation that matches the specified reserved Elasticsearch
     * instance ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\p{XDigit}{8}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{4}-\p
     * {XDigit}{12}<br/>
     */
    private String reservedElasticsearchInstanceId;

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified,
     * defaults to 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result
     * containing NextToken. It is used for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The reserved instance identifier filter value. Use this parameter to show
     * only the reservation that matches the specified reserved Elasticsearch
     * instance ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\p{XDigit}{8}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{4}-\p
     * {XDigit}{12}<br/>
     *
     * @return <p>
     *         The reserved instance identifier filter value. Use this parameter
     *         to show only the reservation that matches the specified reserved
     *         Elasticsearch instance ID.
     *         </p>
     */
    public String getReservedElasticsearchInstanceId() {
        return reservedElasticsearchInstanceId;
    }

    /**
     * <p>
     * The reserved instance identifier filter value. Use this parameter to show
     * only the reservation that matches the specified reserved Elasticsearch
     * instance ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\p{XDigit}{8}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{4}-\p
     * {XDigit}{12}<br/>
     *
     * @param reservedElasticsearchInstanceId <p>
     *            The reserved instance identifier filter value. Use this
     *            parameter to show only the reservation that matches the
     *            specified reserved Elasticsearch instance ID.
     *            </p>
     */
    public void setReservedElasticsearchInstanceId(String reservedElasticsearchInstanceId) {
        this.reservedElasticsearchInstanceId = reservedElasticsearchInstanceId;
    }

    /**
     * <p>
     * The reserved instance identifier filter value. Use this parameter to show
     * only the reservation that matches the specified reserved Elasticsearch
     * instance ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\p{XDigit}{8}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{4}-\p
     * {XDigit}{12}<br/>
     *
     * @param reservedElasticsearchInstanceId <p>
     *            The reserved instance identifier filter value. Use this
     *            parameter to show only the reservation that matches the
     *            specified reserved Elasticsearch instance ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedElasticsearchInstancesRequest withReservedElasticsearchInstanceId(
            String reservedElasticsearchInstanceId) {
        this.reservedElasticsearchInstanceId = reservedElasticsearchInstanceId;
        return this;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified,
     * defaults to 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @return <p>
     *         Set this value to limit the number of results returned. If not
     *         specified, defaults to 100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified,
     * defaults to 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param maxResults <p>
     *            Set this value to limit the number of results returned. If not
     *            specified, defaults to 100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified,
     * defaults to 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param maxResults <p>
     *            Set this value to limit the number of results returned. If not
     *            specified, defaults to 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedElasticsearchInstancesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result
     * containing NextToken. It is used for pagination.
     * </p>
     *
     * @return <p>
     *         NextToken should be sent in case if earlier API call produced
     *         result containing NextToken. It is used for pagination.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result
     * containing NextToken. It is used for pagination.
     * </p>
     *
     * @param nextToken <p>
     *            NextToken should be sent in case if earlier API call produced
     *            result containing NextToken. It is used for pagination.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result
     * containing NextToken. It is used for pagination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            NextToken should be sent in case if earlier API call produced
     *            result containing NextToken. It is used for pagination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservedElasticsearchInstancesRequest withNextToken(String nextToken) {
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
        if (getReservedElasticsearchInstanceId() != null)
            sb.append("ReservedElasticsearchInstanceId: " + getReservedElasticsearchInstanceId()
                    + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
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
                + ((getReservedElasticsearchInstanceId() == null) ? 0
                        : getReservedElasticsearchInstanceId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedElasticsearchInstancesRequest == false)
            return false;
        DescribeReservedElasticsearchInstancesRequest other = (DescribeReservedElasticsearchInstancesRequest) obj;

        if (other.getReservedElasticsearchInstanceId() == null
                ^ this.getReservedElasticsearchInstanceId() == null)
            return false;
        if (other.getReservedElasticsearchInstanceId() != null
                && other.getReservedElasticsearchInstanceId().equals(
                        this.getReservedElasticsearchInstanceId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
