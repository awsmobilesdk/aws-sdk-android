/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the Amazon Kinesis Data Streams stream to which a Amazon
 * Rekognition Video stream processor streams the results of a video analysis.
 * For more information, see CreateStreamProcessor in the Amazon Rekognition
 * Developer Guide.
 * </p>
 */
public class StreamProcessorOutput implements Serializable {
    /**
     * <p>
     * The Amazon Kinesis Data Streams stream to which the Amazon Rekognition
     * stream processor streams the analysis results.
     * </p>
     */
    private KinesisDataStream kinesisDataStream;

    /**
     * <p>
     * The Amazon S3 bucket location to which Amazon Rekognition publishes the
     * detailed inference results of a video analysis operation.
     * </p>
     */
    private S3Destination s3Destination;

    /**
     * <p>
     * The Amazon Kinesis Data Streams stream to which the Amazon Rekognition
     * stream processor streams the analysis results.
     * </p>
     *
     * @return <p>
     *         The Amazon Kinesis Data Streams stream to which the Amazon
     *         Rekognition stream processor streams the analysis results.
     *         </p>
     */
    public KinesisDataStream getKinesisDataStream() {
        return kinesisDataStream;
    }

    /**
     * <p>
     * The Amazon Kinesis Data Streams stream to which the Amazon Rekognition
     * stream processor streams the analysis results.
     * </p>
     *
     * @param kinesisDataStream <p>
     *            The Amazon Kinesis Data Streams stream to which the Amazon
     *            Rekognition stream processor streams the analysis results.
     *            </p>
     */
    public void setKinesisDataStream(KinesisDataStream kinesisDataStream) {
        this.kinesisDataStream = kinesisDataStream;
    }

    /**
     * <p>
     * The Amazon Kinesis Data Streams stream to which the Amazon Rekognition
     * stream processor streams the analysis results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kinesisDataStream <p>
     *            The Amazon Kinesis Data Streams stream to which the Amazon
     *            Rekognition stream processor streams the analysis results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamProcessorOutput withKinesisDataStream(KinesisDataStream kinesisDataStream) {
        this.kinesisDataStream = kinesisDataStream;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to which Amazon Rekognition publishes the
     * detailed inference results of a video analysis operation.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket location to which Amazon Rekognition
     *         publishes the detailed inference results of a video analysis
     *         operation.
     *         </p>
     */
    public S3Destination getS3Destination() {
        return s3Destination;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to which Amazon Rekognition publishes the
     * detailed inference results of a video analysis operation.
     * </p>
     *
     * @param s3Destination <p>
     *            The Amazon S3 bucket location to which Amazon Rekognition
     *            publishes the detailed inference results of a video analysis
     *            operation.
     *            </p>
     */
    public void setS3Destination(S3Destination s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to which Amazon Rekognition publishes the
     * detailed inference results of a video analysis operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Destination <p>
     *            The Amazon S3 bucket location to which Amazon Rekognition
     *            publishes the detailed inference results of a video analysis
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamProcessorOutput withS3Destination(S3Destination s3Destination) {
        this.s3Destination = s3Destination;
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
        if (getKinesisDataStream() != null)
            sb.append("KinesisDataStream: " + getKinesisDataStream() + ",");
        if (getS3Destination() != null)
            sb.append("S3Destination: " + getS3Destination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKinesisDataStream() == null) ? 0 : getKinesisDataStream().hashCode());
        hashCode = prime * hashCode
                + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamProcessorOutput == false)
            return false;
        StreamProcessorOutput other = (StreamProcessorOutput) obj;

        if (other.getKinesisDataStream() == null ^ this.getKinesisDataStream() == null)
            return false;
        if (other.getKinesisDataStream() != null
                && other.getKinesisDataStream().equals(this.getKinesisDataStream()) == false)
            return false;
        if (other.getS3Destination() == null ^ this.getS3Destination() == null)
            return false;
        if (other.getS3Destination() != null
                && other.getS3Destination().equals(this.getS3Destination()) == false)
            return false;
        return true;
    }
}
