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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns domain configuration information about the specified Elasticsearch
 * domains, including the domain ID, domain endpoint, and domain ARN.
 * </p>
 */
public class DescribeElasticsearchDomainsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Elasticsearch domains for which you want information.
     * </p>
     */
    private java.util.List<String> domainNames;

    /**
     * <p>
     * The Elasticsearch domains for which you want information.
     * </p>
     *
     * @return <p>
     *         The Elasticsearch domains for which you want information.
     *         </p>
     */
    public java.util.List<String> getDomainNames() {
        return domainNames;
    }

    /**
     * <p>
     * The Elasticsearch domains for which you want information.
     * </p>
     *
     * @param domainNames <p>
     *            The Elasticsearch domains for which you want information.
     *            </p>
     */
    public void setDomainNames(java.util.Collection<String> domainNames) {
        if (domainNames == null) {
            this.domainNames = null;
            return;
        }

        this.domainNames = new java.util.ArrayList<String>(domainNames);
    }

    /**
     * <p>
     * The Elasticsearch domains for which you want information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainNames <p>
     *            The Elasticsearch domains for which you want information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticsearchDomainsRequest withDomainNames(String... domainNames) {
        if (getDomainNames() == null) {
            this.domainNames = new java.util.ArrayList<String>(domainNames.length);
        }
        for (String value : domainNames) {
            this.domainNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Elasticsearch domains for which you want information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainNames <p>
     *            The Elasticsearch domains for which you want information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticsearchDomainsRequest withDomainNames(
            java.util.Collection<String> domainNames) {
        setDomainNames(domainNames);
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
        if (getDomainNames() != null)
            sb.append("DomainNames: " + getDomainNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDomainNames() == null) ? 0 : getDomainNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeElasticsearchDomainsRequest == false)
            return false;
        DescribeElasticsearchDomainsRequest other = (DescribeElasticsearchDomainsRequest) obj;

        if (other.getDomainNames() == null ^ this.getDomainNames() == null)
            return false;
        if (other.getDomainNames() != null
                && other.getDomainNames().equals(this.getDomainNames()) == false)
            return false;
        return true;
    }
}
