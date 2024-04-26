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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deactivates a user and revokes all access tokens for the user. A deactivated
 * user can't sign in, but still appears in the responses to
 * <code>GetUser</code> and <code>ListUsers</code> API requests.
 * </p>
 * <note>
 * <p>
 * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
 * requests for this API operation. For this operation, you must use IAM
 * credentials to authorize requests, and you must grant yourself the
 * corresponding IAM permission in a policy.
 * </p>
 * <p class="title">
 * <b>Learn more</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
 * >Signing Amazon Web Services API Requests</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
 * >Using the Amazon Cognito user pools API and user pool endpoints</a>
 * </p>
 * </li>
 * </ul>
 * </note>
 */
public class AdminDisableUserRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID for the user pool where you want to disable the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The username of the user that you want to query or modify. The value of
     * this parameter is typically your user's username, but it can be any of
     * their alias attributes. If <code>username</code> isn't an alias attribute
     * in your user pool, this value must be the <code>sub</code> of a local
     * user or the username of a user from a third-party IdP.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * <p>
     * The user pool ID for the user pool where you want to disable the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool where you want to disable the
     *         user.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to disable the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool where you want to disable
     *            the user.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to disable the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool where you want to disable
     *            the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminDisableUserRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The username of the user that you want to query or modify. The value of
     * this parameter is typically your user's username, but it can be any of
     * their alias attributes. If <code>username</code> isn't an alias attribute
     * in your user pool, this value must be the <code>sub</code> of a local
     * user or the username of a user from a third-party IdP.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The username of the user that you want to query or modify. The
     *         value of this parameter is typically your user's username, but it
     *         can be any of their alias attributes. If <code>username</code>
     *         isn't an alias attribute in your user pool, this value must be
     *         the <code>sub</code> of a local user or the username of a user
     *         from a third-party IdP.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The username of the user that you want to query or modify. The value of
     * this parameter is typically your user's username, but it can be any of
     * their alias attributes. If <code>username</code> isn't an alias attribute
     * in your user pool, this value must be the <code>sub</code> of a local
     * user or the username of a user from a third-party IdP.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The username of the user that you want to query or modify. The
     *            value of this parameter is typically your user's username, but
     *            it can be any of their alias attributes. If
     *            <code>username</code> isn't an alias attribute in your user
     *            pool, this value must be the <code>sub</code> of a local user
     *            or the username of a user from a third-party IdP.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username of the user that you want to query or modify. The value of
     * this parameter is typically your user's username, but it can be any of
     * their alias attributes. If <code>username</code> isn't an alias attribute
     * in your user pool, this value must be the <code>sub</code> of a local
     * user or the username of a user from a third-party IdP.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The username of the user that you want to query or modify. The
     *            value of this parameter is typically your user's username, but
     *            it can be any of their alias attributes. If
     *            <code>username</code> isn't an alias attribute in your user
     *            pool, this value must be the <code>sub</code> of a local user
     *            or the username of a user from a third-party IdP.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminDisableUserRequest withUsername(String username) {
        this.username = username;
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminDisableUserRequest == false)
            return false;
        AdminDisableUserRequest other = (AdminDisableUserRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }
}
