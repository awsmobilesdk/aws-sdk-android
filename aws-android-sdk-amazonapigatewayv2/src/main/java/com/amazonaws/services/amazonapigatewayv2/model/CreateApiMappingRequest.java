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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an API mapping.
 * </p>
 */
public class CreateApiMappingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;

    /**
     * The API mapping key.
     */
    private String apiMappingKey;

    /**
     * <p>
     * The domain name.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The API stage.
     * </p>
     */
    private String stage;

    /**
     * <p>
     * The API identifier.
     * </p>
     *
     * @return <p>
     *         The API identifier.
     *         </p>
     */
    public String getApiId() {
        return apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     *
     * @param apiId <p>
     *            The API identifier.
     *            </p>
     */
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiId <p>
     *            The API identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApiMappingRequest withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * The API mapping key.
     *
     * @return The API mapping key.
     */
    public String getApiMappingKey() {
        return apiMappingKey;
    }

    /**
     * The API mapping key.
     *
     * @param apiMappingKey The API mapping key.
     */
    public void setApiMappingKey(String apiMappingKey) {
        this.apiMappingKey = apiMappingKey;
    }

    /**
     * The API mapping key.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiMappingKey The API mapping key.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApiMappingRequest withApiMappingKey(String apiMappingKey) {
        this.apiMappingKey = apiMappingKey;
        return this;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     *
     * @return <p>
     *         The domain name.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     *
     * @param domainName <p>
     *            The domain name.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            The domain name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApiMappingRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The API stage.
     * </p>
     *
     * @return <p>
     *         The API stage.
     *         </p>
     */
    public String getStage() {
        return stage;
    }

    /**
     * <p>
     * The API stage.
     * </p>
     *
     * @param stage <p>
     *            The API stage.
     *            </p>
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The API stage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stage <p>
     *            The API stage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApiMappingRequest withStage(String stage) {
        this.stage = stage;
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
        if (getApiId() != null)
            sb.append("ApiId: " + getApiId() + ",");
        if (getApiMappingKey() != null)
            sb.append("ApiMappingKey: " + getApiMappingKey() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getStage() != null)
            sb.append("Stage: " + getStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode
                + ((getApiMappingKey() == null) ? 0 : getApiMappingKey().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApiMappingRequest == false)
            return false;
        CreateApiMappingRequest other = (CreateApiMappingRequest) obj;

        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getApiMappingKey() == null ^ this.getApiMappingKey() == null)
            return false;
        if (other.getApiMappingKey() != null
                && other.getApiMappingKey().equals(this.getApiMappingKey()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        return true;
    }
}
