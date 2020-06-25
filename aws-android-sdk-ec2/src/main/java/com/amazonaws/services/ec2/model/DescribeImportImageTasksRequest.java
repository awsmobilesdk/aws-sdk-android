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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Displays details about an import virtual machine or import snapshot tasks
 * that are already created.
 * </p>
 */
public class DescribeImportImageTasksRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * Filter tasks using the <code>task-state</code> filter and one of the
     * following values: <code>active</code>, <code>completed</code>,
     * <code>deleting</code>, or <code>deleted</code>.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The IDs of the import image tasks.
     * </p>
     */
    private java.util.List<String> importTaskIds;

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A token that indicates the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImportImageTasksRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Filter tasks using the <code>task-state</code> filter and one of the
     * following values: <code>active</code>, <code>completed</code>,
     * <code>deleting</code>, or <code>deleted</code>.
     * </p>
     *
     * @return <p>
     *         Filter tasks using the <code>task-state</code> filter and one of
     *         the following values: <code>active</code>, <code>completed</code>, <code>deleting</code>, or <code>deleted</code>.
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filter tasks using the <code>task-state</code> filter and one of the
     * following values: <code>active</code>, <code>completed</code>,
     * <code>deleting</code>, or <code>deleted</code>.
     * </p>
     *
     * @param filters <p>
     *            Filter tasks using the <code>task-state</code> filter and one
     *            of the following values: <code>active</code>,
     *            <code>completed</code>, <code>deleting</code>, or
     *            <code>deleted</code>.
     *            </p>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * Filter tasks using the <code>task-state</code> filter and one of the
     * following values: <code>active</code>, <code>completed</code>,
     * <code>deleting</code>, or <code>deleted</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Filter tasks using the <code>task-state</code> filter and one
     *            of the following values: <code>active</code>,
     *            <code>completed</code>, <code>deleting</code>, or
     *            <code>deleted</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImportImageTasksRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Filter tasks using the <code>task-state</code> filter and one of the
     * following values: <code>active</code>, <code>completed</code>,
     * <code>deleting</code>, or <code>deleted</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Filter tasks using the <code>task-state</code> filter and one
     *            of the following values: <code>active</code>,
     *            <code>completed</code>, <code>deleting</code>, or
     *            <code>deleted</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImportImageTasksRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The IDs of the import image tasks.
     * </p>
     *
     * @return <p>
     *         The IDs of the import image tasks.
     *         </p>
     */
    public java.util.List<String> getImportTaskIds() {
        return importTaskIds;
    }

    /**
     * <p>
     * The IDs of the import image tasks.
     * </p>
     *
     * @param importTaskIds <p>
     *            The IDs of the import image tasks.
     *            </p>
     */
    public void setImportTaskIds(java.util.Collection<String> importTaskIds) {
        if (importTaskIds == null) {
            this.importTaskIds = null;
            return;
        }

        this.importTaskIds = new java.util.ArrayList<String>(importTaskIds);
    }

    /**
     * <p>
     * The IDs of the import image tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importTaskIds <p>
     *            The IDs of the import image tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImportImageTasksRequest withImportTaskIds(String... importTaskIds) {
        if (getImportTaskIds() == null) {
            this.importTaskIds = new java.util.ArrayList<String>(importTaskIds.length);
        }
        for (String value : importTaskIds) {
            this.importTaskIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the import image tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importTaskIds <p>
     *            The IDs of the import image tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImportImageTasksRequest withImportTaskIds(
            java.util.Collection<String> importTaskIds) {
        setImportTaskIds(importTaskIds);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     *
     * @return <p>
     *         The maximum number of results to return in a single call.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImportImageTasksRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A token that indicates the next page of results.
     * </p>
     *
     * @return <p>
     *         A token that indicates the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token that indicates the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            A token that indicates the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token that indicates the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImportImageTasksRequest withNextToken(String nextToken) {
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getImportTaskIds() != null)
            sb.append("ImportTaskIds: " + getImportTaskIds() + ",");
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

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getImportTaskIds() == null) ? 0 : getImportTaskIds().hashCode());
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

        if (obj instanceof DescribeImportImageTasksRequest == false)
            return false;
        DescribeImportImageTasksRequest other = (DescribeImportImageTasksRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getImportTaskIds() == null ^ this.getImportTaskIds() == null)
            return false;
        if (other.getImportTaskIds() != null
                && other.getImportTaskIds().equals(this.getImportTaskIds()) == false)
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
