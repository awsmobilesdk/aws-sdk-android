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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Starts an existing channel
 */
public class StartChannelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * A request to start a channel
     */
    private String channelId;

    /**
     * A request to start a channel
     *
     * @return A request to start a channel
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * A request to start a channel
     *
     * @param channelId A request to start a channel
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * A request to start a channel
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelId A request to start a channel
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartChannelRequest withChannelId(String channelId) {
        this.channelId = channelId;
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
        if (getChannelId() != null)
            sb.append("ChannelId: " + getChannelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartChannelRequest == false)
            return false;
        StartChannelRequest other = (StartChannelRequest) obj;

        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null
                && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        return true;
    }
}
