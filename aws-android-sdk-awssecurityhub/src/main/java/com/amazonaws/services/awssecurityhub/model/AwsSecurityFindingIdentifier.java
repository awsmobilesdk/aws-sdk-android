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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Identifies a finding to update using <code>BatchUpdateFindings</code>.
 * </p>
 */
public class AwsSecurityFindingIdentifier implements Serializable {
    /**
     * <p>
     * The identifier of the finding that was specified by the finding provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String id;

    /**
     * <p>
     * The ARN generated by Security Hub that uniquely identifies a product that
     * generates findings. This can be the ARN for a third-party product that is
     * integrated with Security Hub, or the ARN for a custom integration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String productArn;

    /**
     * <p>
     * The identifier of the finding that was specified by the finding provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The identifier of the finding that was specified by the finding
     *         provider.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the finding that was specified by the finding provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param id <p>
     *            The identifier of the finding that was specified by the
     *            finding provider.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the finding that was specified by the finding provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param id <p>
     *            The identifier of the finding that was specified by the
     *            finding provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsSecurityFindingIdentifier withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The ARN generated by Security Hub that uniquely identifies a product that
     * generates findings. This can be the ARN for a third-party product that is
     * integrated with Security Hub, or the ARN for a custom integration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN generated by Security Hub that uniquely identifies a
     *         product that generates findings. This can be the ARN for a
     *         third-party product that is integrated with Security Hub, or the
     *         ARN for a custom integration.
     *         </p>
     */
    public String getProductArn() {
        return productArn;
    }

    /**
     * <p>
     * The ARN generated by Security Hub that uniquely identifies a product that
     * generates findings. This can be the ARN for a third-party product that is
     * integrated with Security Hub, or the ARN for a custom integration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param productArn <p>
     *            The ARN generated by Security Hub that uniquely identifies a
     *            product that generates findings. This can be the ARN for a
     *            third-party product that is integrated with Security Hub, or
     *            the ARN for a custom integration.
     *            </p>
     */
    public void setProductArn(String productArn) {
        this.productArn = productArn;
    }

    /**
     * <p>
     * The ARN generated by Security Hub that uniquely identifies a product that
     * generates findings. This can be the ARN for a third-party product that is
     * integrated with Security Hub, or the ARN for a custom integration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param productArn <p>
     *            The ARN generated by Security Hub that uniquely identifies a
     *            product that generates findings. This can be the ARN for a
     *            third-party product that is integrated with Security Hub, or
     *            the ARN for a custom integration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsSecurityFindingIdentifier withProductArn(String productArn) {
        this.productArn = productArn;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getProductArn() != null)
            sb.append("ProductArn: " + getProductArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getProductArn() == null) ? 0 : getProductArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsSecurityFindingIdentifier == false)
            return false;
        AwsSecurityFindingIdentifier other = (AwsSecurityFindingIdentifier) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getProductArn() == null ^ this.getProductArn() == null)
            return false;
        if (other.getProductArn() != null
                && other.getProductArn().equals(this.getProductArn()) == false)
            return false;
        return true;
    }
}
