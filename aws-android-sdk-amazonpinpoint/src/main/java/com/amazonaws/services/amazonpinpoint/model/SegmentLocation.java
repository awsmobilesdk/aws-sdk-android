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

/**
 * <p>
 * Specifies geographical dimension settings for a segment.
 * </p>
 */
public class SegmentLocation implements Serializable {
    /**
     * <p>
     * The country or region code, in ISO 3166-1 alpha-2 format, for the
     * segment.
     * </p>
     */
    private SetDimension country;

    /**
     * <p>
     * The GPS location and range for the segment.
     * </p>
     */
    private GPSPointDimension gPSPoint;

    /**
     * <p>
     * The country or region code, in ISO 3166-1 alpha-2 format, for the
     * segment.
     * </p>
     *
     * @return <p>
     *         The country or region code, in ISO 3166-1 alpha-2 format, for the
     *         segment.
     *         </p>
     */
    public SetDimension getCountry() {
        return country;
    }

    /**
     * <p>
     * The country or region code, in ISO 3166-1 alpha-2 format, for the
     * segment.
     * </p>
     *
     * @param country <p>
     *            The country or region code, in ISO 3166-1 alpha-2 format, for
     *            the segment.
     *            </p>
     */
    public void setCountry(SetDimension country) {
        this.country = country;
    }

    /**
     * <p>
     * The country or region code, in ISO 3166-1 alpha-2 format, for the
     * segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param country <p>
     *            The country or region code, in ISO 3166-1 alpha-2 format, for
     *            the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentLocation withCountry(SetDimension country) {
        this.country = country;
        return this;
    }

    /**
     * <p>
     * The GPS location and range for the segment.
     * </p>
     *
     * @return <p>
     *         The GPS location and range for the segment.
     *         </p>
     */
    public GPSPointDimension getGPSPoint() {
        return gPSPoint;
    }

    /**
     * <p>
     * The GPS location and range for the segment.
     * </p>
     *
     * @param gPSPoint <p>
     *            The GPS location and range for the segment.
     *            </p>
     */
    public void setGPSPoint(GPSPointDimension gPSPoint) {
        this.gPSPoint = gPSPoint;
    }

    /**
     * <p>
     * The GPS location and range for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gPSPoint <p>
     *            The GPS location and range for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentLocation withGPSPoint(GPSPointDimension gPSPoint) {
        this.gPSPoint = gPSPoint;
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
        if (getCountry() != null)
            sb.append("Country: " + getCountry() + ",");
        if (getGPSPoint() != null)
            sb.append("GPSPoint: " + getGPSPoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getGPSPoint() == null) ? 0 : getGPSPoint().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentLocation == false)
            return false;
        SegmentLocation other = (SegmentLocation) obj;

        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getGPSPoint() == null ^ this.getGPSPoint() == null)
            return false;
        if (other.getGPSPoint() != null && other.getGPSPoint().equals(this.getGPSPoint()) == false)
            return false;
        return true;
    }
}
