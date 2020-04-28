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

package com.amazonaws.services.amazonec2containerregistry.model;

import java.io.Serializable;

/**
 * <p>
 * The type of action to be taken.
 * </p>
 */
public class LifecyclePolicyRuleAction implements Serializable {
    /**
     * <p>
     * The type of action to be taken.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPIRE
     */
    private String type;

    /**
     * <p>
     * The type of action to be taken.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPIRE
     *
     * @return <p>
     *         The type of action to be taken.
     *         </p>
     * @see ImageActionType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of action to be taken.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPIRE
     *
     * @param type <p>
     *            The type of action to be taken.
     *            </p>
     * @see ImageActionType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of action to be taken.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPIRE
     *
     * @param type <p>
     *            The type of action to be taken.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageActionType
     */
    public LifecyclePolicyRuleAction withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of action to be taken.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPIRE
     *
     * @param type <p>
     *            The type of action to be taken.
     *            </p>
     * @see ImageActionType
     */
    public void setType(ImageActionType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of action to be taken.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPIRE
     *
     * @param type <p>
     *            The type of action to be taken.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageActionType
     */
    public LifecyclePolicyRuleAction withType(ImageActionType type) {
        this.type = type.toString();
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
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicyRuleAction == false)
            return false;
        LifecyclePolicyRuleAction other = (LifecyclePolicyRuleAction) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
