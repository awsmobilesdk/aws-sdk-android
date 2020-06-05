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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

public class DescribeAccountAttributesResult implements Serializable {
    /**
     * <p>
     * The Elastic Beanstalk resource quotas associated with the calling AWS
     * account.
     * </p>
     */
    private ResourceQuotas resourceQuotas;

    /**
     * <p>
     * The Elastic Beanstalk resource quotas associated with the calling AWS
     * account.
     * </p>
     *
     * @return <p>
     *         The Elastic Beanstalk resource quotas associated with the calling
     *         AWS account.
     *         </p>
     */
    public ResourceQuotas getResourceQuotas() {
        return resourceQuotas;
    }

    /**
     * <p>
     * The Elastic Beanstalk resource quotas associated with the calling AWS
     * account.
     * </p>
     *
     * @param resourceQuotas <p>
     *            The Elastic Beanstalk resource quotas associated with the
     *            calling AWS account.
     *            </p>
     */
    public void setResourceQuotas(ResourceQuotas resourceQuotas) {
        this.resourceQuotas = resourceQuotas;
    }

    /**
     * <p>
     * The Elastic Beanstalk resource quotas associated with the calling AWS
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceQuotas <p>
     *            The Elastic Beanstalk resource quotas associated with the
     *            calling AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountAttributesResult withResourceQuotas(ResourceQuotas resourceQuotas) {
        this.resourceQuotas = resourceQuotas;
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
        if (getResourceQuotas() != null)
            sb.append("ResourceQuotas: " + getResourceQuotas());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceQuotas() == null) ? 0 : getResourceQuotas().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountAttributesResult == false)
            return false;
        DescribeAccountAttributesResult other = (DescribeAccountAttributesResult) obj;

        if (other.getResourceQuotas() == null ^ this.getResourceQuotas() == null)
            return false;
        if (other.getResourceQuotas() != null
                && other.getResourceQuotas().equals(this.getResourceQuotas()) == false)
            return false;
        return true;
    }
}