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

public class DescribeExportImageTasksResult implements Serializable {
    /**
     * <p>
     * Information about the export image tasks.
     * </p>
     */
    private java.util.List<ExportImageTask> exportImageTasks;

    /**
     * <p>
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the export image tasks.
     * </p>
     *
     * @return <p>
     *         Information about the export image tasks.
     *         </p>
     */
    public java.util.List<ExportImageTask> getExportImageTasks() {
        return exportImageTasks;
    }

    /**
     * <p>
     * Information about the export image tasks.
     * </p>
     *
     * @param exportImageTasks <p>
     *            Information about the export image tasks.
     *            </p>
     */
    public void setExportImageTasks(java.util.Collection<ExportImageTask> exportImageTasks) {
        if (exportImageTasks == null) {
            this.exportImageTasks = null;
            return;
        }

        this.exportImageTasks = new java.util.ArrayList<ExportImageTask>(exportImageTasks);
    }

    /**
     * <p>
     * Information about the export image tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportImageTasks <p>
     *            Information about the export image tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExportImageTasksResult withExportImageTasks(ExportImageTask... exportImageTasks) {
        if (getExportImageTasks() == null) {
            this.exportImageTasks = new java.util.ArrayList<ExportImageTask>(
                    exportImageTasks.length);
        }
        for (ExportImageTask value : exportImageTasks) {
            this.exportImageTasks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the export image tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportImageTasks <p>
     *            Information about the export image tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExportImageTasksResult withExportImageTasks(
            java.util.Collection<ExportImageTask> exportImageTasks) {
        setExportImageTasks(exportImageTasks);
        return this;
    }

    /**
     * <p>
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to get the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to get the next page of results. This value
     *            is <code>null</code> when there are no more results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to get the next page of results. This value
     *            is <code>null</code> when there are no more results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExportImageTasksResult withNextToken(String nextToken) {
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
        if (getExportImageTasks() != null)
            sb.append("ExportImageTasks: " + getExportImageTasks() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExportImageTasks() == null) ? 0 : getExportImageTasks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExportImageTasksResult == false)
            return false;
        DescribeExportImageTasksResult other = (DescribeExportImageTasksResult) obj;

        if (other.getExportImageTasks() == null ^ this.getExportImageTasks() == null)
            return false;
        if (other.getExportImageTasks() != null
                && other.getExportImageTasks().equals(this.getExportImageTasks()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}