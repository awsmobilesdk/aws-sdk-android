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

public class ListAuthenticationProfilesResult implements Serializable {
    /**
     * <p>
     * A summary of a given authentication profile.
     * </p>
     */
    private java.util.List<AuthenticationProfileSummary> authenticationProfileSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A summary of a given authentication profile.
     * </p>
     *
     * @return <p>
     *         A summary of a given authentication profile.
     *         </p>
     */
    public java.util.List<AuthenticationProfileSummary> getAuthenticationProfileSummaryList() {
        return authenticationProfileSummaryList;
    }

    /**
     * <p>
     * A summary of a given authentication profile.
     * </p>
     *
     * @param authenticationProfileSummaryList <p>
     *            A summary of a given authentication profile.
     *            </p>
     */
    public void setAuthenticationProfileSummaryList(
            java.util.Collection<AuthenticationProfileSummary> authenticationProfileSummaryList) {
        if (authenticationProfileSummaryList == null) {
            this.authenticationProfileSummaryList = null;
            return;
        }

        this.authenticationProfileSummaryList = new java.util.ArrayList<AuthenticationProfileSummary>(
                authenticationProfileSummaryList);
    }

    /**
     * <p>
     * A summary of a given authentication profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authenticationProfileSummaryList <p>
     *            A summary of a given authentication profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuthenticationProfilesResult withAuthenticationProfileSummaryList(
            AuthenticationProfileSummary... authenticationProfileSummaryList) {
        if (getAuthenticationProfileSummaryList() == null) {
            this.authenticationProfileSummaryList = new java.util.ArrayList<AuthenticationProfileSummary>(
                    authenticationProfileSummaryList.length);
        }
        for (AuthenticationProfileSummary value : authenticationProfileSummaryList) {
            this.authenticationProfileSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A summary of a given authentication profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authenticationProfileSummaryList <p>
     *            A summary of a given authentication profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuthenticationProfilesResult withAuthenticationProfileSummaryList(
            java.util.Collection<AuthenticationProfileSummary> authenticationProfileSummaryList) {
        setAuthenticationProfileSummaryList(authenticationProfileSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuthenticationProfilesResult withNextToken(String nextToken) {
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
        if (getAuthenticationProfileSummaryList() != null)
            sb.append("AuthenticationProfileSummaryList: " + getAuthenticationProfileSummaryList()
                    + ",");
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
                + ((getAuthenticationProfileSummaryList() == null) ? 0
                        : getAuthenticationProfileSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAuthenticationProfilesResult == false)
            return false;
        ListAuthenticationProfilesResult other = (ListAuthenticationProfilesResult) obj;

        if (other.getAuthenticationProfileSummaryList() == null
                ^ this.getAuthenticationProfileSummaryList() == null)
            return false;
        if (other.getAuthenticationProfileSummaryList() != null
                && other.getAuthenticationProfileSummaryList().equals(
                        this.getAuthenticationProfileSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
