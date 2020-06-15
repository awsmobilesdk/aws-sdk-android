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

public class GetAttendeeResult implements Serializable {
    /**
     * <p>
     * The Amazon Chime SDK attendee information.
     * </p>
     */
    private Attendee attendee;

    /**
     * <p>
     * The Amazon Chime SDK attendee information.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime SDK attendee information.
     *         </p>
     */
    public Attendee getAttendee() {
        return attendee;
    }

    /**
     * <p>
     * The Amazon Chime SDK attendee information.
     * </p>
     *
     * @param attendee <p>
     *            The Amazon Chime SDK attendee information.
     *            </p>
     */
    public void setAttendee(Attendee attendee) {
        this.attendee = attendee;
    }

    /**
     * <p>
     * The Amazon Chime SDK attendee information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attendee <p>
     *            The Amazon Chime SDK attendee information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAttendeeResult withAttendee(Attendee attendee) {
        this.attendee = attendee;
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
        if (getAttendee() != null)
            sb.append("Attendee: " + getAttendee());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttendee() == null) ? 0 : getAttendee().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAttendeeResult == false)
            return false;
        GetAttendeeResult other = (GetAttendeeResult) obj;

        if (other.getAttendee() == null ^ this.getAttendee() == null)
            return false;
        if (other.getAttendee() != null && other.getAttendee().equals(this.getAttendee()) == false)
            return false;
        return true;
    }
}
