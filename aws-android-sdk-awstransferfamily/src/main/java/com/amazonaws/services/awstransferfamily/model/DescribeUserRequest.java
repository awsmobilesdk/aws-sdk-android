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

package com.amazonaws.services.awstransferfamily.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the user assigned to the specific file transfer protocol-enabled
 * server, as identified by its <code>ServerId</code> property.
 * </p>
 * <p>
 * The response from this call returns the properties of the user associated
 * with the <code>ServerId</code> value that was specified.
 * </p>
 */
public class DescribeUserRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server that has this user assigned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     */
    private String serverId;

    /**
     * <p>
     * The name of the user assigned to one or more file transfer
     * protocol-enabled servers. User names are part of the sign-in credentials
     * to use the AWS Transfer Family service and perform file transfer tasks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     */
    private String userName;

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server that has this user assigned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @return <p>
     *         A system-assigned unique identifier for a file transfer
     *         protocol-enabled server that has this user assigned.
     *         </p>
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server that has this user assigned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @param serverId <p>
     *            A system-assigned unique identifier for a file transfer
     *            protocol-enabled server that has this user assigned.
     *            </p>
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server that has this user assigned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @param serverId <p>
     *            A system-assigned unique identifier for a file transfer
     *            protocol-enabled server that has this user assigned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * <p>
     * The name of the user assigned to one or more file transfer
     * protocol-enabled servers. User names are part of the sign-in credentials
     * to use the AWS Transfer Family service and perform file transfer tasks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @return <p>
     *         The name of the user assigned to one or more file transfer
     *         protocol-enabled servers. User names are part of the sign-in
     *         credentials to use the AWS Transfer Family service and perform
     *         file transfer tasks.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name of the user assigned to one or more file transfer
     * protocol-enabled servers. User names are part of the sign-in credentials
     * to use the AWS Transfer Family service and perform file transfer tasks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @param userName <p>
     *            The name of the user assigned to one or more file transfer
     *            protocol-enabled servers. User names are part of the sign-in
     *            credentials to use the AWS Transfer Family service and perform
     *            file transfer tasks.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user assigned to one or more file transfer
     * protocol-enabled servers. User names are part of the sign-in credentials
     * to use the AWS Transfer Family service and perform file transfer tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @param userName <p>
     *            The name of the user assigned to one or more file transfer
     *            protocol-enabled servers. User names are part of the sign-in
     *            credentials to use the AWS Transfer Family service and perform
     *            file transfer tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserRequest withUserName(String userName) {
        this.userName = userName;
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
        if (getServerId() != null)
            sb.append("ServerId: " + getServerId() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserRequest == false)
            return false;
        DescribeUserRequest other = (DescribeUserRequest) obj;

        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }
}
