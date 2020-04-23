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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new segment for an application or updates the configuration,
 * dimension, and other settings for an existing segment that's associated with
 * an application.
 * </p>
 */
public class UpdateSegmentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     */
    private String segmentId;

    /**
     * <p>
     * Specifies the configuration, dimension, and other settings for a segment.
     * A WriteSegmentRequest object can include a Dimensions object or a
     * SegmentGroups object, but not both.
     * </p>
     */
    private WriteSegmentRequest writeSegmentRequest;

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application. This identifier is
     *         displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *         console.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSegmentRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the segment.
     *         </p>
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     *
     * @param segmentId <p>
     *            The unique identifier for the segment.
     *            </p>
     */
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentId <p>
     *            The unique identifier for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSegmentRequest withSegmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    /**
     * <p>
     * Specifies the configuration, dimension, and other settings for a segment.
     * A WriteSegmentRequest object can include a Dimensions object or a
     * SegmentGroups object, but not both.
     * </p>
     *
     * @return <p>
     *         Specifies the configuration, dimension, and other settings for a
     *         segment. A WriteSegmentRequest object can include a Dimensions
     *         object or a SegmentGroups object, but not both.
     *         </p>
     */
    public WriteSegmentRequest getWriteSegmentRequest() {
        return writeSegmentRequest;
    }

    /**
     * <p>
     * Specifies the configuration, dimension, and other settings for a segment.
     * A WriteSegmentRequest object can include a Dimensions object or a
     * SegmentGroups object, but not both.
     * </p>
     *
     * @param writeSegmentRequest <p>
     *            Specifies the configuration, dimension, and other settings for
     *            a segment. A WriteSegmentRequest object can include a
     *            Dimensions object or a SegmentGroups object, but not both.
     *            </p>
     */
    public void setWriteSegmentRequest(WriteSegmentRequest writeSegmentRequest) {
        this.writeSegmentRequest = writeSegmentRequest;
    }

    /**
     * <p>
     * Specifies the configuration, dimension, and other settings for a segment.
     * A WriteSegmentRequest object can include a Dimensions object or a
     * SegmentGroups object, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param writeSegmentRequest <p>
     *            Specifies the configuration, dimension, and other settings for
     *            a segment. A WriteSegmentRequest object can include a
     *            Dimensions object or a SegmentGroups object, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSegmentRequest withWriteSegmentRequest(WriteSegmentRequest writeSegmentRequest) {
        this.writeSegmentRequest = writeSegmentRequest;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getSegmentId() != null)
            sb.append("SegmentId: " + getSegmentId() + ",");
        if (getWriteSegmentRequest() != null)
            sb.append("WriteSegmentRequest: " + getWriteSegmentRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        hashCode = prime * hashCode
                + ((getWriteSegmentRequest() == null) ? 0 : getWriteSegmentRequest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSegmentRequest == false)
            return false;
        UpdateSegmentRequest other = (UpdateSegmentRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getSegmentId() == null ^ this.getSegmentId() == null)
            return false;
        if (other.getSegmentId() != null
                && other.getSegmentId().equals(this.getSegmentId()) == false)
            return false;
        if (other.getWriteSegmentRequest() == null ^ this.getWriteSegmentRequest() == null)
            return false;
        if (other.getWriteSegmentRequest() != null
                && other.getWriteSegmentRequest().equals(this.getWriteSegmentRequest()) == false)
            return false;
        return true;
    }
}
