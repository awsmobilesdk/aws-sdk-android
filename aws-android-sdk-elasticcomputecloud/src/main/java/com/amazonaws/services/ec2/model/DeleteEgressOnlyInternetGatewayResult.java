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

public class DeleteEgressOnlyInternetGatewayResult implements Serializable {
    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, it returns
     * an error.
     * </p>
     */
    private Boolean returnCode;

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, it returns
     * an error.
     * </p>
     *
     * @return <p>
     *         Returns <code>true</code> if the request succeeds; otherwise, it
     *         returns an error.
     *         </p>
     */
    public Boolean isReturnCode() {
        return returnCode;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, it returns
     * an error.
     * </p>
     *
     * @return <p>
     *         Returns <code>true</code> if the request succeeds; otherwise, it
     *         returns an error.
     *         </p>
     */
    public Boolean getReturnCode() {
        return returnCode;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, it returns
     * an error.
     * </p>
     *
     * @param returnCode <p>
     *            Returns <code>true</code> if the request succeeds; otherwise,
     *            it returns an error.
     *            </p>
     */
    public void setReturnCode(Boolean returnCode) {
        this.returnCode = returnCode;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, it returns
     * an error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param returnCode <p>
     *            Returns <code>true</code> if the request succeeds; otherwise,
     *            it returns an error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteEgressOnlyInternetGatewayResult withReturnCode(Boolean returnCode) {
        this.returnCode = returnCode;
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
        if (getReturnCode() != null)
            sb.append("ReturnCode: " + getReturnCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReturnCode() == null) ? 0 : getReturnCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEgressOnlyInternetGatewayResult == false)
            return false;
        DeleteEgressOnlyInternetGatewayResult other = (DeleteEgressOnlyInternetGatewayResult) obj;

        if (other.getReturnCode() == null ^ this.getReturnCode() == null)
            return false;
        if (other.getReturnCode() != null
                && other.getReturnCode().equals(this.getReturnCode()) == false)
            return false;
        return true;
    }
}