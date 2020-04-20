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
 * Updates a domain name.
 * </p>
 */
public class UpdateDomainNameRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The domain name.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The domain name configurations.
     * </p>
     */
    private java.util.List<DomainNameConfiguration> domainNameConfigurations;

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
    public UpdateDomainNameRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     *
     * @return <p>
     *         The domain name configurations.
     *         </p>
     */
    public java.util.List<DomainNameConfiguration> getDomainNameConfigurations() {
        return domainNameConfigurations;
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     *
     * @param domainNameConfigurations <p>
     *            The domain name configurations.
     *            </p>
     */
    public void setDomainNameConfigurations(
            java.util.Collection<DomainNameConfiguration> domainNameConfigurations) {
        if (domainNameConfigurations == null) {
            this.domainNameConfigurations = null;
            return;
        }

        this.domainNameConfigurations = new java.util.ArrayList<DomainNameConfiguration>(
                domainNameConfigurations);
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainNameConfigurations <p>
     *            The domain name configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainNameRequest withDomainNameConfigurations(
            DomainNameConfiguration... domainNameConfigurations) {
        if (getDomainNameConfigurations() == null) {
            this.domainNameConfigurations = new java.util.ArrayList<DomainNameConfiguration>(
                    domainNameConfigurations.length);
        }
        for (DomainNameConfiguration value : domainNameConfigurations) {
            this.domainNameConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The domain name configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainNameConfigurations <p>
     *            The domain name configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainNameRequest withDomainNameConfigurations(
            java.util.Collection<DomainNameConfiguration> domainNameConfigurations) {
        setDomainNameConfigurations(domainNameConfigurations);
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getDomainNameConfigurations() != null)
            sb.append("DomainNameConfigurations: " + getDomainNameConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDomainNameConfigurations() == null) ? 0 : getDomainNameConfigurations()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainNameRequest == false)
            return false;
        UpdateDomainNameRequest other = (UpdateDomainNameRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDomainNameConfigurations() == null
                ^ this.getDomainNameConfigurations() == null)
            return false;
        if (other.getDomainNameConfigurations() != null
                && other.getDomainNameConfigurations().equals(this.getDomainNameConfigurations()) == false)
            return false;
        return true;
    }
}
