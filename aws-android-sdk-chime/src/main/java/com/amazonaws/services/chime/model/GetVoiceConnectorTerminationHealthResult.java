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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

public class GetVoiceConnectorTerminationHealthResult implements Serializable {
    /**
     * <p>
     * The termination health details.
     * </p>
     */
    private TerminationHealth terminationHealth;

    /**
     * <p>
     * The termination health details.
     * </p>
     *
     * @return <p>
     *         The termination health details.
     *         </p>
     */
    public TerminationHealth getTerminationHealth() {
        return terminationHealth;
    }

    /**
     * <p>
     * The termination health details.
     * </p>
     *
     * @param terminationHealth <p>
     *            The termination health details.
     *            </p>
     */
    public void setTerminationHealth(TerminationHealth terminationHealth) {
        this.terminationHealth = terminationHealth;
    }

    /**
     * <p>
     * The termination health details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminationHealth <p>
     *            The termination health details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVoiceConnectorTerminationHealthResult withTerminationHealth(
            TerminationHealth terminationHealth) {
        this.terminationHealth = terminationHealth;
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
        if (getTerminationHealth() != null)
            sb.append("TerminationHealth: " + getTerminationHealth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTerminationHealth() == null) ? 0 : getTerminationHealth().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVoiceConnectorTerminationHealthResult == false)
            return false;
        GetVoiceConnectorTerminationHealthResult other = (GetVoiceConnectorTerminationHealthResult) obj;

        if (other.getTerminationHealth() == null ^ this.getTerminationHealth() == null)
            return false;
        if (other.getTerminationHealth() != null
                && other.getTerminationHealth().equals(this.getTerminationHealth()) == false)
            return false;
        return true;
    }
}
