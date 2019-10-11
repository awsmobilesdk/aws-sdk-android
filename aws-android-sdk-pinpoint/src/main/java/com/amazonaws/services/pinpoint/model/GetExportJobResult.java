/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class GetExportJobResult implements Serializable {
    /**
     * <p>
     * Provides information about the status and settings of a job that exports
     * endpoint definitions to a file. The file can be added directly to an
     * Amazon Simple Storage Service (Amazon S3) bucket by using the Amazon
     * Pinpoint API or downloaded directly to a computer by using the Amazon
     * Pinpoint console.
     * </p>
     */
    private ExportJobResponse exportJobResponse;

    /**
     * <p>
     * Provides information about the status and settings of a job that exports
     * endpoint definitions to a file. The file can be added directly to an
     * Amazon Simple Storage Service (Amazon S3) bucket by using the Amazon
     * Pinpoint API or downloaded directly to a computer by using the Amazon
     * Pinpoint console.
     * </p>
     *
     * @return <p>
     *         Provides information about the status and settings of a job that
     *         exports endpoint definitions to a file. The file can be added
     *         directly to an Amazon Simple Storage Service (Amazon S3) bucket
     *         by using the Amazon Pinpoint API or downloaded directly to a
     *         computer by using the Amazon Pinpoint console.
     *         </p>
     */
    public ExportJobResponse getExportJobResponse() {
        return exportJobResponse;
    }

    /**
     * <p>
     * Provides information about the status and settings of a job that exports
     * endpoint definitions to a file. The file can be added directly to an
     * Amazon Simple Storage Service (Amazon S3) bucket by using the Amazon
     * Pinpoint API or downloaded directly to a computer by using the Amazon
     * Pinpoint console.
     * </p>
     *
     * @param exportJobResponse <p>
     *            Provides information about the status and settings of a job
     *            that exports endpoint definitions to a file. The file can be
     *            added directly to an Amazon Simple Storage Service (Amazon S3)
     *            bucket by using the Amazon Pinpoint API or downloaded directly
     *            to a computer by using the Amazon Pinpoint console.
     *            </p>
     */
    public void setExportJobResponse(ExportJobResponse exportJobResponse) {
        this.exportJobResponse = exportJobResponse;
    }

    /**
     * <p>
     * Provides information about the status and settings of a job that exports
     * endpoint definitions to a file. The file can be added directly to an
     * Amazon Simple Storage Service (Amazon S3) bucket by using the Amazon
     * Pinpoint API or downloaded directly to a computer by using the Amazon
     * Pinpoint console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportJobResponse <p>
     *            Provides information about the status and settings of a job
     *            that exports endpoint definitions to a file. The file can be
     *            added directly to an Amazon Simple Storage Service (Amazon S3)
     *            bucket by using the Amazon Pinpoint API or downloaded directly
     *            to a computer by using the Amazon Pinpoint console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportJobResult withExportJobResponse(ExportJobResponse exportJobResponse) {
        this.exportJobResponse = exportJobResponse;
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
        if (getExportJobResponse() != null)
            sb.append("ExportJobResponse: " + getExportJobResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExportJobResponse() == null) ? 0 : getExportJobResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExportJobResult == false)
            return false;
        GetExportJobResult other = (GetExportJobResult) obj;

        if (other.getExportJobResponse() == null ^ this.getExportJobResponse() == null)
            return false;
        if (other.getExportJobResponse() != null
                && other.getExportJobResponse().equals(this.getExportJobResponse()) == false)
            return false;
        return true;
    }
}
