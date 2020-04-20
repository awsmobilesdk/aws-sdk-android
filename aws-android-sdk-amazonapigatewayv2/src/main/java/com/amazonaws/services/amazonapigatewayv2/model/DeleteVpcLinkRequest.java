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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a VPC link.
 * </p>
 */
public class DeleteVpcLinkRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     */
    private String vpcLinkId;

    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC link.
     *         </p>
     */
    public String getVpcLinkId() {
        return vpcLinkId;
    }

    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     *
     * @param vpcLinkId <p>
     *            The ID of the VPC link.
     *            </p>
     */
    public void setVpcLinkId(String vpcLinkId) {
        this.vpcLinkId = vpcLinkId;
    }

    /**
     * <p>
     * The ID of the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcLinkId <p>
     *            The ID of the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteVpcLinkRequest withVpcLinkId(String vpcLinkId) {
        this.vpcLinkId = vpcLinkId;
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
        if (getVpcLinkId() != null)
            sb.append("VpcLinkId: " + getVpcLinkId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcLinkId() == null) ? 0 : getVpcLinkId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVpcLinkRequest == false)
            return false;
        DeleteVpcLinkRequest other = (DeleteVpcLinkRequest) obj;

        if (other.getVpcLinkId() == null ^ this.getVpcLinkId() == null)
            return false;
        if (other.getVpcLinkId() != null
                && other.getVpcLinkId().equals(this.getVpcLinkId()) == false)
            return false;
        return true;
    }
}
