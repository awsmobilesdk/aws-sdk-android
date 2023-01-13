/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains information about the hierarchy level to update.
 * </p>
 */
public class HierarchyLevelUpdate implements Serializable {
    /**
     * <p>
     * The name of the user hierarchy level. Must not be more than 50
     * characters.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The name of the user hierarchy level. Must not be more than 50
     * characters.
     * </p>
     *
     * @return <p>
     *         The name of the user hierarchy level. Must not be more than 50
     *         characters.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the user hierarchy level. Must not be more than 50
     * characters.
     * </p>
     *
     * @param name <p>
     *            The name of the user hierarchy level. Must not be more than 50
     *            characters.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the user hierarchy level. Must not be more than 50
     * characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the user hierarchy level. Must not be more than 50
     *            characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HierarchyLevelUpdate withName(String name) {
        this.name = name;
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
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HierarchyLevelUpdate == false)
            return false;
        HierarchyLevelUpdate other = (HierarchyLevelUpdate) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
