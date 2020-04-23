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

public class GetSegmentVersionResult implements Serializable {
    /**
     * <p>
     * Provides information about the configuration, dimension, and other
     * settings for a segment.
     * </p>
     */
    private SegmentResponse segmentResponse;

    /**
     * <p>
     * Provides information about the configuration, dimension, and other
     * settings for a segment.
     * </p>
     *
     * @return <p>
     *         Provides information about the configuration, dimension, and
     *         other settings for a segment.
     *         </p>
     */
    public SegmentResponse getSegmentResponse() {
        return segmentResponse;
    }

    /**
     * <p>
     * Provides information about the configuration, dimension, and other
     * settings for a segment.
     * </p>
     *
     * @param segmentResponse <p>
     *            Provides information about the configuration, dimension, and
     *            other settings for a segment.
     *            </p>
     */
    public void setSegmentResponse(SegmentResponse segmentResponse) {
        this.segmentResponse = segmentResponse;
    }

    /**
     * <p>
     * Provides information about the configuration, dimension, and other
     * settings for a segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentResponse <p>
     *            Provides information about the configuration, dimension, and
     *            other settings for a segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentVersionResult withSegmentResponse(SegmentResponse segmentResponse) {
        this.segmentResponse = segmentResponse;
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
        if (getSegmentResponse() != null)
            sb.append("SegmentResponse: " + getSegmentResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSegmentResponse() == null) ? 0 : getSegmentResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSegmentVersionResult == false)
            return false;
        GetSegmentVersionResult other = (GetSegmentVersionResult) obj;

        if (other.getSegmentResponse() == null ^ this.getSegmentResponse() == null)
            return false;
        if (other.getSegmentResponse() != null
                && other.getSegmentResponse().equals(this.getSegmentResponse()) == false)
            return false;
        return true;
    }
}
