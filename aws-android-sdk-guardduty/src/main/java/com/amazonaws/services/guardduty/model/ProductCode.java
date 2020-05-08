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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the product code for the EC2 instance.
 * </p>
 */
public class ProductCode implements Serializable {
    /**
     * <p>
     * The product code information.
     * </p>
     */
    private String code;

    /**
     * <p>
     * The product code type.
     * </p>
     */
    private String productType;

    /**
     * <p>
     * The product code information.
     * </p>
     *
     * @return <p>
     *         The product code information.
     *         </p>
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The product code information.
     * </p>
     *
     * @param code <p>
     *            The product code information.
     *            </p>
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The product code information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param code <p>
     *            The product code information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductCode withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * The product code type.
     * </p>
     *
     * @return <p>
     *         The product code type.
     *         </p>
     */
    public String getProductType() {
        return productType;
    }

    /**
     * <p>
     * The product code type.
     * </p>
     *
     * @param productType <p>
     *            The product code type.
     *            </p>
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * <p>
     * The product code type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productType <p>
     *            The product code type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProductCode withProductType(String productType) {
        this.productType = productType;
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getProductType() != null)
            sb.append("ProductType: " + getProductType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode
                + ((getProductType() == null) ? 0 : getProductType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductCode == false)
            return false;
        ProductCode other = (ProductCode) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null
                && other.getProductType().equals(this.getProductType()) == false)
            return false;
        return true;
    }
}
