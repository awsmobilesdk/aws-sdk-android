/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the name and description of a quick connect. The request accepts the
 * following data in JSON format. At least <code>Name</code> or
 * <code>Description</code> must be provided.
 * </p>
 */
public class UpdateQuickConnectNameRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     */
    private String quickConnectId;

    /**
     * <p>
     * The name of the quick connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the quick connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     */
    private String description;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateQuickConnectNameRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     *
     * @return <p>
     *         The identifier for the quick connect.
     *         </p>
     */
    public String getQuickConnectId() {
        return quickConnectId;
    }

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     *
     * @param quickConnectId <p>
     *            The identifier for the quick connect.
     *            </p>
     */
    public void setQuickConnectId(String quickConnectId) {
        this.quickConnectId = quickConnectId;
    }

    /**
     * <p>
     * The identifier for the quick connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quickConnectId <p>
     *            The identifier for the quick connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateQuickConnectNameRequest withQuickConnectId(String quickConnectId) {
        this.quickConnectId = quickConnectId;
        return this;
    }

    /**
     * <p>
     * The name of the quick connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @return <p>
     *         The name of the quick connect.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the quick connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param name <p>
     *            The name of the quick connect.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the quick connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     *
     * @param name <p>
     *            The name of the quick connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateQuickConnectNameRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the quick connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     *
     * @return <p>
     *         The description of the quick connect.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the quick connect.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     *
     * @param description <p>
     *            The description of the quick connect.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the quick connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     *
     * @param description <p>
     *            The description of the quick connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateQuickConnectNameRequest withDescription(String description) {
        this.description = description;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getQuickConnectId() != null)
            sb.append("QuickConnectId: " + getQuickConnectId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getQuickConnectId() == null) ? 0 : getQuickConnectId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateQuickConnectNameRequest == false)
            return false;
        UpdateQuickConnectNameRequest other = (UpdateQuickConnectNameRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getQuickConnectId() == null ^ this.getQuickConnectId() == null)
            return false;
        if (other.getQuickConnectId() != null
                && other.getQuickConnectId().equals(this.getQuickConnectId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
