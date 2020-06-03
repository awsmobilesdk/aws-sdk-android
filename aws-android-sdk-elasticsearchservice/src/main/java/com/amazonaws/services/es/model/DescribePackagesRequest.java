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

package com.amazonaws.services.es.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes all packages available to Amazon ES. Includes options for
 * filtering, limiting the number of results, and pagination.
 * </p>
 */
public class DescribePackagesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Only returns packages that match the
     * <code>DescribePackagesFilterList</code> values.
     * </p>
     */
    private java.util.List<DescribePackagesFilter> filters;

    /**
     * <p>
     * Limits results to a maximum number of packages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a
     * non-null NextToken value. If provided, returns results for the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Only returns packages that match the
     * <code>DescribePackagesFilterList</code> values.
     * </p>
     *
     * @return <p>
     *         Only returns packages that match the
     *         <code>DescribePackagesFilterList</code> values.
     *         </p>
     */
    public java.util.List<DescribePackagesFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Only returns packages that match the
     * <code>DescribePackagesFilterList</code> values.
     * </p>
     *
     * @param filters <p>
     *            Only returns packages that match the
     *            <code>DescribePackagesFilterList</code> values.
     *            </p>
     */
    public void setFilters(java.util.Collection<DescribePackagesFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<DescribePackagesFilter>(filters);
    }

    /**
     * <p>
     * Only returns packages that match the
     * <code>DescribePackagesFilterList</code> values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Only returns packages that match the
     *            <code>DescribePackagesFilterList</code> values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagesRequest withFilters(DescribePackagesFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<DescribePackagesFilter>(filters.length);
        }
        for (DescribePackagesFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Only returns packages that match the
     * <code>DescribePackagesFilterList</code> values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Only returns packages that match the
     *            <code>DescribePackagesFilterList</code> values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagesRequest withFilters(java.util.Collection<DescribePackagesFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Limits results to a maximum number of packages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @return <p>
     *         Limits results to a maximum number of packages.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Limits results to a maximum number of packages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param maxResults <p>
     *            Limits results to a maximum number of packages.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Limits results to a maximum number of packages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param maxResults <p>
     *            Limits results to a maximum number of packages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a
     * non-null NextToken value. If provided, returns results for the next page.
     * </p>
     *
     * @return <p>
     *         Used for pagination. Only necessary if a previous API call
     *         includes a non-null NextToken value. If provided, returns results
     *         for the next page.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a
     * non-null NextToken value. If provided, returns results for the next page.
     * </p>
     *
     * @param nextToken <p>
     *            Used for pagination. Only necessary if a previous API call
     *            includes a non-null NextToken value. If provided, returns
     *            results for the next page.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a
     * non-null NextToken value. If provided, returns results for the next page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            Used for pagination. Only necessary if a previous API call
     *            includes a non-null NextToken value. If provided, returns
     *            results for the next page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagesRequest withNextToken(String nextToken) {
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
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

        if (obj instanceof DescribePackagesRequest == false)
            return false;
        DescribePackagesRequest other = (DescribePackagesRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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
