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
 * Updates the specified flow.
 * </p>
 * <p>
 * You can also create and update flows using the <a href=
 * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html"
 * >Amazon Connect Flow language</a>.
 * </p>
 * <p>
 * Use the <code>$SAVED</code> alias in the request to describe the
 * <code>SAVED</code> content of a Flow. For example,
 * <code>arn:aws:.../contact-flow/{id}:$SAVED</code>. Once a contact flow is
 * published, <code>$SAVED</code> needs to be supplied to view saved content
 * that has not been published.
 * </p>
 */
public class UpdateContactFlowContentRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String contactFlowId;

    /**
     * <p>
     * The JSON string that represents the content of the flow. For an example,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language-example.html"
     * >Example flow in Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256000.
     * </p>
     */
    private String content;

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactFlowContentRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The identifier of the flow.
     *         </p>
     */
    public String getContactFlowId() {
        return contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param contactFlowId <p>
     *            The identifier of the flow.
     *            </p>
     */
    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param contactFlowId <p>
     *            The identifier of the flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactFlowContentRequest withContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }

    /**
     * <p>
     * The JSON string that represents the content of the flow. For an example,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language-example.html"
     * >Example flow in Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256000.
     * </p>
     *
     * @return <p>
     *         The JSON string that represents the content of the flow. For an
     *         example, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language-example.html"
     *         >Example flow in Amazon Connect Flow language</a>.
     *         </p>
     *         <p>
     *         Length Constraints: Minimum length of 1. Maximum length of
     *         256000.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The JSON string that represents the content of the flow. For an example,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language-example.html"
     * >Example flow in Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256000.
     * </p>
     *
     * @param content <p>
     *            The JSON string that represents the content of the flow. For
     *            an example, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language-example.html"
     *            >Example flow in Amazon Connect Flow language</a>.
     *            </p>
     *            <p>
     *            Length Constraints: Minimum length of 1. Maximum length of
     *            256000.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The JSON string that represents the content of the flow. For an example,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language-example.html"
     * >Example flow in Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256000.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            The JSON string that represents the content of the flow. For
     *            an example, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language-example.html"
     *            >Example flow in Amazon Connect Flow language</a>.
     *            </p>
     *            <p>
     *            Length Constraints: Minimum length of 1. Maximum length of
     *            256000.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactFlowContentRequest withContent(String content) {
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
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: " + getContactFlowId() + ",");
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
        hashCode = prime * hashCode
                + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContactFlowContentRequest == false)
            return false;
        UpdateContactFlowContentRequest other = (UpdateContactFlowContentRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactFlowId() == null ^ this.getContactFlowId() == null)
            return false;
        if (other.getContactFlowId() != null
                && other.getContactFlowId().equals(this.getContactFlowId()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }
}
