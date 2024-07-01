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

public class DescribeAuthenticationProfileResult implements Serializable {
    /**
     * <p>
     * The authentication profile object being described.
     * </p>
     */
    private AuthenticationProfile authenticationProfile;

    /**
     * <p>
     * The authentication profile object being described.
     * </p>
     *
     * @return <p>
     *         The authentication profile object being described.
     *         </p>
     */
    public AuthenticationProfile getAuthenticationProfile() {
        return authenticationProfile;
    }

    /**
     * <p>
     * The authentication profile object being described.
     * </p>
     *
     * @param authenticationProfile <p>
     *            The authentication profile object being described.
     *            </p>
     */
    public void setAuthenticationProfile(AuthenticationProfile authenticationProfile) {
        this.authenticationProfile = authenticationProfile;
    }

    /**
     * <p>
     * The authentication profile object being described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authenticationProfile <p>
     *            The authentication profile object being described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAuthenticationProfileResult withAuthenticationProfile(
            AuthenticationProfile authenticationProfile) {
        this.authenticationProfile = authenticationProfile;
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
        if (getAuthenticationProfile() != null)
            sb.append("AuthenticationProfile: " + getAuthenticationProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAuthenticationProfile() == null) ? 0 : getAuthenticationProfile().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAuthenticationProfileResult == false)
            return false;
        DescribeAuthenticationProfileResult other = (DescribeAuthenticationProfileResult) obj;

        if (other.getAuthenticationProfile() == null ^ this.getAuthenticationProfile() == null)
            return false;
        if (other.getAuthenticationProfile() != null
                && other.getAuthenticationProfile().equals(this.getAuthenticationProfile()) == false)
            return false;
        return true;
    }
}
