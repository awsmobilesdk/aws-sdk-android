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

public class DeregisterInstanceEventNotificationAttributesResult implements Serializable {
    /**
     * <p>
     * The resulting set of tag keys.
     * </p>
     */
    private InstanceTagNotificationAttribute instanceTagAttribute;

    /**
     * <p>
     * The resulting set of tag keys.
     * </p>
     *
     * @return <p>
     *         The resulting set of tag keys.
     *         </p>
     */
    public InstanceTagNotificationAttribute getInstanceTagAttribute() {
        return instanceTagAttribute;
    }

    /**
     * <p>
     * The resulting set of tag keys.
     * </p>
     *
     * @param instanceTagAttribute <p>
     *            The resulting set of tag keys.
     *            </p>
     */
    public void setInstanceTagAttribute(InstanceTagNotificationAttribute instanceTagAttribute) {
        this.instanceTagAttribute = instanceTagAttribute;
    }

    /**
     * <p>
     * The resulting set of tag keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTagAttribute <p>
     *            The resulting set of tag keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeregisterInstanceEventNotificationAttributesResult withInstanceTagAttribute(
            InstanceTagNotificationAttribute instanceTagAttribute) {
        this.instanceTagAttribute = instanceTagAttribute;
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
        if (getInstanceTagAttribute() != null)
            sb.append("InstanceTagAttribute: " + getInstanceTagAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceTagAttribute() == null) ? 0 : getInstanceTagAttribute().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterInstanceEventNotificationAttributesResult == false)
            return false;
        DeregisterInstanceEventNotificationAttributesResult other = (DeregisterInstanceEventNotificationAttributesResult) obj;

        if (other.getInstanceTagAttribute() == null ^ this.getInstanceTagAttribute() == null)
            return false;
        if (other.getInstanceTagAttribute() != null
                && other.getInstanceTagAttribute().equals(this.getInstanceTagAttribute()) == false)
            return false;
        return true;
    }
}