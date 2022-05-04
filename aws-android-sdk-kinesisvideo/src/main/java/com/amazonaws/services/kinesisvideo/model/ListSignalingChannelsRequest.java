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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns an array of <code>ChannelInfo</code> objects. Each object describes a
 * signaling channel. To retrieve only those channels that satisfy a specific
 * condition, you can specify a <code>ChannelNameCondition</code>.
 * </p>
 */
public class ListSignalingChannelsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The maximum number of channels to return in the response. The default is
     * 500.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * If you specify this parameter, when the result of a
     * <code>ListSignalingChannels</code> operation is truncated, the call
     * returns the <code>NextToken</code> in the response. To get another batch
     * of channels, provide this token in your next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Optional: Returns only the channels that satisfy a specific condition.
     * </p>
     */
    private ChannelNameCondition channelNameCondition;

    /**
     * <p>
     * The maximum number of channels to return in the response. The default is
     * 500.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return <p>
     *         The maximum number of channels to return in the response. The
     *         default is 500.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of channels to return in the response. The default is
     * 500.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of channels to return in the response. The
     *            default is 500.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of channels to return in the response. The default is
     * 500.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of channels to return in the response. The
     *            default is 500.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSignalingChannelsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * If you specify this parameter, when the result of a
     * <code>ListSignalingChannels</code> operation is truncated, the call
     * returns the <code>NextToken</code> in the response. To get another batch
     * of channels, provide this token in your next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     *
     * @return <p>
     *         If you specify this parameter, when the result of a
     *         <code>ListSignalingChannels</code> operation is truncated, the
     *         call returns the <code>NextToken</code> in the response. To get
     *         another batch of channels, provide this token in your next
     *         request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If you specify this parameter, when the result of a
     * <code>ListSignalingChannels</code> operation is truncated, the call
     * returns the <code>NextToken</code> in the response. To get another batch
     * of channels, provide this token in your next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     *
     * @param nextToken <p>
     *            If you specify this parameter, when the result of a
     *            <code>ListSignalingChannels</code> operation is truncated, the
     *            call returns the <code>NextToken</code> in the response. To
     *            get another batch of channels, provide this token in your next
     *            request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify this parameter, when the result of a
     * <code>ListSignalingChannels</code> operation is truncated, the call
     * returns the <code>NextToken</code> in the response. To get another batch
     * of channels, provide this token in your next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     *
     * @param nextToken <p>
     *            If you specify this parameter, when the result of a
     *            <code>ListSignalingChannels</code> operation is truncated, the
     *            call returns the <code>NextToken</code> in the response. To
     *            get another batch of channels, provide this token in your next
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSignalingChannelsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Optional: Returns only the channels that satisfy a specific condition.
     * </p>
     *
     * @return <p>
     *         Optional: Returns only the channels that satisfy a specific
     *         condition.
     *         </p>
     */
    public ChannelNameCondition getChannelNameCondition() {
        return channelNameCondition;
    }

    /**
     * <p>
     * Optional: Returns only the channels that satisfy a specific condition.
     * </p>
     *
     * @param channelNameCondition <p>
     *            Optional: Returns only the channels that satisfy a specific
     *            condition.
     *            </p>
     */
    public void setChannelNameCondition(ChannelNameCondition channelNameCondition) {
        this.channelNameCondition = channelNameCondition;
    }

    /**
     * <p>
     * Optional: Returns only the channels that satisfy a specific condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelNameCondition <p>
     *            Optional: Returns only the channels that satisfy a specific
     *            condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSignalingChannelsRequest withChannelNameCondition(
            ChannelNameCondition channelNameCondition) {
        this.channelNameCondition = channelNameCondition;
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
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getChannelNameCondition() != null)
            sb.append("ChannelNameCondition: " + getChannelNameCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getChannelNameCondition() == null) ? 0 : getChannelNameCondition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSignalingChannelsRequest == false)
            return false;
        ListSignalingChannelsRequest other = (ListSignalingChannelsRequest) obj;

        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getChannelNameCondition() == null ^ this.getChannelNameCondition() == null)
            return false;
        if (other.getChannelNameCondition() != null
                && other.getChannelNameCondition().equals(this.getChannelNameCondition()) == false)
            return false;
        return true;
    }
}
