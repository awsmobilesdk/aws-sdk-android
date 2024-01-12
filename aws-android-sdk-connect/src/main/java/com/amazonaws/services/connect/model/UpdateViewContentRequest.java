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
 * Updates the view content of the given view identifier in the specified Amazon
 * Connect instance.
 * </p>
 * <p>
 * It performs content validation if <code>Status</code> is set to
 * <code>SAVED</code> and performs full content validation if
 * <code>Status</code> is <code>PUBLISHED</code>. Note that the
 * <code>$SAVED</code> alias' content will always be updated, but the
 * <code>$LATEST</code> alias' content will only be updated if
 * <code>Status</code> is <code>PUBLISHED</code>.
 * </p>
 */
public class UpdateViewContentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/]+$<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier of the view. Both <code>ViewArn</code> and
     * <code>ViewId</code> can be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     */
    private String viewId;

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     */
    private String status;

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data and the runtime input schema, which is auto-generated
     * by this operation.
     * </p>
     * <p>
     * The total uncompressed content has a maximum file size of 400kB.
     * </p>
     */
    private ViewInputContent content;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/]+$<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/]+$<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/]+$<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateViewContentRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the view. Both <code>ViewArn</code> and
     * <code>ViewId</code> can be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     *
     * @return <p>
     *         The identifier of the view. Both <code>ViewArn</code> and
     *         <code>ViewId</code> can be used.
     *         </p>
     */
    public String getViewId() {
        return viewId;
    }

    /**
     * <p>
     * The identifier of the view. Both <code>ViewArn</code> and
     * <code>ViewId</code> can be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     *
     * @param viewId <p>
     *            The identifier of the view. Both <code>ViewArn</code> and
     *            <code>ViewId</code> can be used.
     *            </p>
     */
    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    /**
     * <p>
     * The identifier of the view. Both <code>ViewArn</code> and
     * <code>ViewId</code> can be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     *
     * @param viewId <p>
     *            The identifier of the view. Both <code>ViewArn</code> and
     *            <code>ViewId</code> can be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateViewContentRequest withViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @return <p>
     *         Indicates the view status as either <code>SAVED</code> or
     *         <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *         initiate validation on the content.
     *         </p>
     * @see ViewStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @see ViewStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewStatus
     */
    public UpdateViewContentRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @see ViewStatus
     */
    public void setStatus(ViewStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Indicates the view status as either <code>SAVED</code> or
     * <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will initiate
     * validation on the content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param status <p>
     *            Indicates the view status as either <code>SAVED</code> or
     *            <code>PUBLISHED</code>. The <code>PUBLISHED</code> status will
     *            initiate validation on the content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViewStatus
     */
    public UpdateViewContentRequest withStatus(ViewStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data and the runtime input schema, which is auto-generated
     * by this operation.
     * </p>
     * <p>
     * The total uncompressed content has a maximum file size of 400kB.
     * </p>
     *
     * @return <p>
     *         View content containing all content necessary to render a view
     *         except for runtime input data and the runtime input schema, which
     *         is auto-generated by this operation.
     *         </p>
     *         <p>
     *         The total uncompressed content has a maximum file size of 400kB.
     *         </p>
     */
    public ViewInputContent getContent() {
        return content;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data and the runtime input schema, which is auto-generated
     * by this operation.
     * </p>
     * <p>
     * The total uncompressed content has a maximum file size of 400kB.
     * </p>
     *
     * @param content <p>
     *            View content containing all content necessary to render a view
     *            except for runtime input data and the runtime input schema,
     *            which is auto-generated by this operation.
     *            </p>
     *            <p>
     *            The total uncompressed content has a maximum file size of
     *            400kB.
     *            </p>
     */
    public void setContent(ViewInputContent content) {
        this.content = content;
    }

    /**
     * <p>
     * View content containing all content necessary to render a view except for
     * runtime input data and the runtime input schema, which is auto-generated
     * by this operation.
     * </p>
     * <p>
     * The total uncompressed content has a maximum file size of 400kB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            View content containing all content necessary to render a view
     *            except for runtime input data and the runtime input schema,
     *            which is auto-generated by this operation.
     *            </p>
     *            <p>
     *            The total uncompressed content has a maximum file size of
     *            400kB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateViewContentRequest withContent(ViewInputContent content) {
        this.content = content;
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
        if (getViewId() != null)
            sb.append("ViewId: " + getViewId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getViewId() == null) ? 0 : getViewId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateViewContentRequest == false)
            return false;
        UpdateViewContentRequest other = (UpdateViewContentRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getViewId() == null ^ this.getViewId() == null)
            return false;
        if (other.getViewId() != null && other.getViewId().equals(this.getViewId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }
}
