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

package com.amazonaws.services.amazonpinpoint.model;

import java.io.Serializable;

public class RemoveAttributesResult implements Serializable {
    /**
     * <p>
     * Provides information about the type and the names of attributes that were
     * removed from all the endpoints that are associated with an application.
     * </p>
     */
    private AttributesResource attributesResource;

    /**
     * <p>
     * Provides information about the type and the names of attributes that were
     * removed from all the endpoints that are associated with an application.
     * </p>
     *
     * @return <p>
     *         Provides information about the type and the names of attributes
     *         that were removed from all the endpoints that are associated with
     *         an application.
     *         </p>
     */
    public AttributesResource getAttributesResource() {
        return attributesResource;
    }

    /**
     * <p>
     * Provides information about the type and the names of attributes that were
     * removed from all the endpoints that are associated with an application.
     * </p>
     *
     * @param attributesResource <p>
     *            Provides information about the type and the names of
     *            attributes that were removed from all the endpoints that are
     *            associated with an application.
     *            </p>
     */
    public void setAttributesResource(AttributesResource attributesResource) {
        this.attributesResource = attributesResource;
    }

    /**
     * <p>
     * Provides information about the type and the names of attributes that were
     * removed from all the endpoints that are associated with an application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributesResource <p>
     *            Provides information about the type and the names of
     *            attributes that were removed from all the endpoints that are
     *            associated with an application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveAttributesResult withAttributesResource(AttributesResource attributesResource) {
        this.attributesResource = attributesResource;
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
        if (getAttributesResource() != null)
            sb.append("AttributesResource: " + getAttributesResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttributesResource() == null) ? 0 : getAttributesResource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveAttributesResult == false)
            return false;
        RemoveAttributesResult other = (RemoveAttributesResult) obj;

        if (other.getAttributesResource() == null ^ this.getAttributesResource() == null)
            return false;
        if (other.getAttributesResource() != null
                && other.getAttributesResource().equals(this.getAttributesResource()) == false)
            return false;
        return true;
    }
}