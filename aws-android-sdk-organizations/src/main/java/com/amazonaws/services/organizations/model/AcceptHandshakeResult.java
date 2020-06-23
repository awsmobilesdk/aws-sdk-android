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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

public class AcceptHandshakeResult implements Serializable {
    /**
     * <p>
     * A structure that contains details about the accepted handshake.
     * </p>
     */
    private Handshake handshake;

    /**
     * <p>
     * A structure that contains details about the accepted handshake.
     * </p>
     *
     * @return <p>
     *         A structure that contains details about the accepted handshake.
     *         </p>
     */
    public Handshake getHandshake() {
        return handshake;
    }

    /**
     * <p>
     * A structure that contains details about the accepted handshake.
     * </p>
     *
     * @param handshake <p>
     *            A structure that contains details about the accepted
     *            handshake.
     *            </p>
     */
    public void setHandshake(Handshake handshake) {
        this.handshake = handshake;
    }

    /**
     * <p>
     * A structure that contains details about the accepted handshake.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param handshake <p>
     *            A structure that contains details about the accepted
     *            handshake.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptHandshakeResult withHandshake(Handshake handshake) {
        this.handshake = handshake;
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
        if (getHandshake() != null)
            sb.append("Handshake: " + getHandshake());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHandshake() == null) ? 0 : getHandshake().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptHandshakeResult == false)
            return false;
        AcceptHandshakeResult other = (AcceptHandshakeResult) obj;

        if (other.getHandshake() == null ^ this.getHandshake() == null)
            return false;
        if (other.getHandshake() != null
                && other.getHandshake().equals(this.getHandshake()) == false)
            return false;
        return true;
    }
}
