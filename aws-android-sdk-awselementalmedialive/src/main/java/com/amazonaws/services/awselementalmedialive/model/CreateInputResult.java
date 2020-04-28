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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for CreateInputResponse
 */
public class CreateInputResult implements Serializable {
    /**
     * Placeholder documentation for Input
     */
    private Input input;

    /**
     * Placeholder documentation for Input
     *
     * @return Placeholder documentation for Input
     */
    public Input getInput() {
        return input;
    }

    /**
     * Placeholder documentation for Input
     *
     * @param input Placeholder documentation for Input
     */
    public void setInput(Input input) {
        this.input = input;
    }

    /**
     * Placeholder documentation for Input
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param input Placeholder documentation for Input
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputResult withInput(Input input) {
        this.input = input;
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
        if (getInput() != null)
            sb.append("Input: " + getInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInputResult == false)
            return false;
        CreateInputResult other = (CreateInputResult) obj;

        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        return true;
    }
}
