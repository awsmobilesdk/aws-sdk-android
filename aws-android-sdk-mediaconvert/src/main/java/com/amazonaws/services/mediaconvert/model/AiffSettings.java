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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to
 * the value AIFF.
 */
public class AiffSettings implements Serializable {
    /**
     * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding
     * quality for this audio track.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16 - 24<br/>
     */
    private Integer bitDepth;

    /**
     * Specify the number of channels in this output audio track. Valid values
     * are 1 and even numbers up to 64. For example, 1, 2, 4, 6, and so on, up
     * to 64.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 64<br/>
     */
    private Integer channels;

    /**
     * Sample rate in hz.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 192000<br/>
     */
    private Integer sampleRate;

    /**
     * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding
     * quality for this audio track.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16 - 24<br/>
     *
     * @return Specify Bit depth (BitDepth), in bits per sample, to choose the
     *         encoding quality for this audio track.
     */
    public Integer getBitDepth() {
        return bitDepth;
    }

    /**
     * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding
     * quality for this audio track.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16 - 24<br/>
     *
     * @param bitDepth Specify Bit depth (BitDepth), in bits per sample, to
     *            choose the encoding quality for this audio track.
     */
    public void setBitDepth(Integer bitDepth) {
        this.bitDepth = bitDepth;
    }

    /**
     * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding
     * quality for this audio track.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16 - 24<br/>
     *
     * @param bitDepth Specify Bit depth (BitDepth), in bits per sample, to
     *            choose the encoding quality for this audio track.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AiffSettings withBitDepth(Integer bitDepth) {
        this.bitDepth = bitDepth;
        return this;
    }

    /**
     * Specify the number of channels in this output audio track. Valid values
     * are 1 and even numbers up to 64. For example, 1, 2, 4, 6, and so on, up
     * to 64.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 64<br/>
     *
     * @return Specify the number of channels in this output audio track. Valid
     *         values are 1 and even numbers up to 64. For example, 1, 2, 4, 6,
     *         and so on, up to 64.
     */
    public Integer getChannels() {
        return channels;
    }

    /**
     * Specify the number of channels in this output audio track. Valid values
     * are 1 and even numbers up to 64. For example, 1, 2, 4, 6, and so on, up
     * to 64.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 64<br/>
     *
     * @param channels Specify the number of channels in this output audio
     *            track. Valid values are 1 and even numbers up to 64. For
     *            example, 1, 2, 4, 6, and so on, up to 64.
     */
    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    /**
     * Specify the number of channels in this output audio track. Valid values
     * are 1 and even numbers up to 64. For example, 1, 2, 4, 6, and so on, up
     * to 64.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 64<br/>
     *
     * @param channels Specify the number of channels in this output audio
     *            track. Valid values are 1 and even numbers up to 64. For
     *            example, 1, 2, 4, 6, and so on, up to 64.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AiffSettings withChannels(Integer channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Sample rate in hz.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 192000<br/>
     *
     * @return Sample rate in hz.
     */
    public Integer getSampleRate() {
        return sampleRate;
    }

    /**
     * Sample rate in hz.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 192000<br/>
     *
     * @param sampleRate Sample rate in hz.
     */
    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * Sample rate in hz.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 192000<br/>
     *
     * @param sampleRate Sample rate in hz.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AiffSettings withSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
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
        if (getBitDepth() != null)
            sb.append("BitDepth: " + getBitDepth() + ",");
        if (getChannels() != null)
            sb.append("Channels: " + getChannels() + ",");
        if (getSampleRate() != null)
            sb.append("SampleRate: " + getSampleRate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBitDepth() == null) ? 0 : getBitDepth().hashCode());
        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AiffSettings == false)
            return false;
        AiffSettings other = (AiffSettings) obj;

        if (other.getBitDepth() == null ^ this.getBitDepth() == null)
            return false;
        if (other.getBitDepth() != null && other.getBitDepth().equals(this.getBitDepth()) == false)
            return false;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null
                && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        return true;
    }
}
