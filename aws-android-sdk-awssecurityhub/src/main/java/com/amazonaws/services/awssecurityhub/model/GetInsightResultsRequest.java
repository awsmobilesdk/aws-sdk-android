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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the results of the Security Hub insight specified by the insight ARN.
 * </p>
 */
public class GetInsightResultsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the insight for which to return results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String insightArn;

    /**
     * <p>
     * The ARN of the insight for which to return results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN of the insight for which to return results.
     *         </p>
     */
    public String getInsightArn() {
        return insightArn;
    }

    /**
     * <p>
     * The ARN of the insight for which to return results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param insightArn <p>
     *            The ARN of the insight for which to return results.
     *            </p>
     */
    public void setInsightArn(String insightArn) {
        this.insightArn = insightArn;
    }

    /**
     * <p>
     * The ARN of the insight for which to return results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param insightArn <p>
     *            The ARN of the insight for which to return results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInsightResultsRequest withInsightArn(String insightArn) {
        this.insightArn = insightArn;
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
        if (getInsightArn() != null)
            sb.append("InsightArn: " + getInsightArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightArn() == null) ? 0 : getInsightArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInsightResultsRequest == false)
            return false;
        GetInsightResultsRequest other = (GetInsightResultsRequest) obj;

        if (other.getInsightArn() == null ^ this.getInsightArn() == null)
            return false;
        if (other.getInsightArn() != null
                && other.getInsightArn().equals(this.getInsightArn()) == false)
            return false;
        return true;
    }
}
