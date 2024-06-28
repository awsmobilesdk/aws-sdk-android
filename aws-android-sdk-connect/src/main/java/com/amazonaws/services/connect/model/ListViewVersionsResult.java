/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListViewVersionsResult implements Serializable {
    /**
     * <p>
     * A list of view version summaries.
     * </p>
     */
    private java.util.List<ViewVersionSummary> viewVersionSummaryList;

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=\/+_.-]+$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of view version summaries.
     * </p>
     *
     * @return <p>
     *         A list of view version summaries.
     *         </p>
     */
    public java.util.List<ViewVersionSummary> getViewVersionSummaryList() {
        return viewVersionSummaryList;
    }

    /**
     * <p>
     * A list of view version summaries.
     * </p>
     *
     * @param viewVersionSummaryList <p>
     *            A list of view version summaries.
     *            </p>
     */
    public void setViewVersionSummaryList(
            java.util.Collection<ViewVersionSummary> viewVersionSummaryList) {
        if (viewVersionSummaryList == null) {
            this.viewVersionSummaryList = null;
            return;
        }

        this.viewVersionSummaryList = new java.util.ArrayList<ViewVersionSummary>(
                viewVersionSummaryList);
    }

    /**
     * <p>
     * A list of view version summaries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param viewVersionSummaryList <p>
     *            A list of view version summaries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListViewVersionsResult withViewVersionSummaryList(
            ViewVersionSummary... viewVersionSummaryList) {
        if (getViewVersionSummaryList() == null) {
            this.viewVersionSummaryList = new java.util.ArrayList<ViewVersionSummary>(
                    viewVersionSummaryList.length);
        }
        for (ViewVersionSummary value : viewVersionSummaryList) {
            this.viewVersionSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of view version summaries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param viewVersionSummaryList <p>
     *            A list of view version summaries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListViewVersionsResult withViewVersionSummaryList(
            java.util.Collection<ViewVersionSummary> viewVersionSummaryList) {
        setViewVersionSummaryList(viewVersionSummaryList);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=\/+_.-]+$<br/>
     *
     * @return <p>
     *         The token for the next set of results. Use the value returned in
     *         the previous response in the next request to retrieve the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=\/+_.-]+$<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=\/+_.-]+$<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListViewVersionsResult withNextToken(String nextToken) {
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
        if (getViewVersionSummaryList() != null)
            sb.append("ViewVersionSummaryList: " + getViewVersionSummaryList() + ",");
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
                + ((getViewVersionSummaryList() == null) ? 0 : getViewVersionSummaryList()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListViewVersionsResult == false)
            return false;
        ListViewVersionsResult other = (ListViewVersionsResult) obj;

        if (other.getViewVersionSummaryList() == null ^ this.getViewVersionSummaryList() == null)
            return false;
        if (other.getViewVersionSummaryList() != null
                && other.getViewVersionSummaryList().equals(this.getViewVersionSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
