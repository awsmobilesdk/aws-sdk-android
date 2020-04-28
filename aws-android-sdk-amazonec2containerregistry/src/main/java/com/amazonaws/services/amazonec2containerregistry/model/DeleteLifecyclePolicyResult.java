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
package com.amazonaws.services.amazonec2containerregistry.model;

import java.io.Serializable;


public class DeleteLifecyclePolicyResult implements Serializable {
    /**
     * <p>The registry ID associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String registryId;

    /**
     * <p>The repository name associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     */
    private String repositoryName;

    /**
     * <p>The JSON lifecycle policy text.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>100 - 30720<br/>
     */
    private String lifecyclePolicyText;

    /**
     * <p>The time stamp of the last time that the lifecycle policy was run.</p>
     */
    private java.util.Date lastEvaluatedAt;

    /**
     * <p>The registry ID associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>The registry ID associated with the request.</p>
     */
    public String getRegistryId() {
        return registryId;
    }

    /**
     * <p>The registry ID associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The registry ID associated with the request.</p>
     */
    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>The registry ID associated with the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>The registry ID associated with the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeleteLifecyclePolicyResult withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * <p>The repository name associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @return <p>The repository name associated with the request.</p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>The repository name associated with the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The repository name associated with the request.</p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>The repository name associated with the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*<br/>
     *
     * @param repositoryName <p>The repository name associated with the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeleteLifecyclePolicyResult withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>The JSON lifecycle policy text.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>100 - 30720<br/>
     *
     * @return <p>The JSON lifecycle policy text.</p>
     */
    public String getLifecyclePolicyText() {
        return lifecyclePolicyText;
    }

    /**
     * <p>The JSON lifecycle policy text.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>100 - 30720<br/>
     *
     * @param lifecyclePolicyText <p>The JSON lifecycle policy text.</p>
     */
    public void setLifecyclePolicyText(String lifecyclePolicyText) {
        this.lifecyclePolicyText = lifecyclePolicyText;
    }

    /**
     * <p>The JSON lifecycle policy text.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>100 - 30720<br/>
     *
     * @param lifecyclePolicyText <p>The JSON lifecycle policy text.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeleteLifecyclePolicyResult withLifecyclePolicyText(String lifecyclePolicyText) {
        this.lifecyclePolicyText = lifecyclePolicyText;
        return this;
    }

    /**
     * <p>The time stamp of the last time that the lifecycle policy was run.</p>
     *
     * @return <p>The time stamp of the last time that the lifecycle policy was run.</p>
     */
    public java.util.Date getLastEvaluatedAt() {
        return lastEvaluatedAt;
    }

    /**
     * <p>The time stamp of the last time that the lifecycle policy was run.</p>
     *
     * @param lastEvaluatedAt <p>The time stamp of the last time that the lifecycle policy was run.</p>
     */
    public void setLastEvaluatedAt(java.util.Date lastEvaluatedAt) {
        this.lastEvaluatedAt = lastEvaluatedAt;
    }

    /**
     * <p>The time stamp of the last time that the lifecycle policy was run.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastEvaluatedAt <p>The time stamp of the last time that the lifecycle policy was run.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeleteLifecyclePolicyResult withLastEvaluatedAt(java.util.Date lastEvaluatedAt) {
        this.lastEvaluatedAt = lastEvaluatedAt;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRegistryId() != null) sb.append("registryId: " + getRegistryId() + ",");
        if (getRepositoryName() != null) sb.append("repositoryName: " + getRepositoryName() + ",");
        if (getLifecyclePolicyText() != null) sb.append("lifecyclePolicyText: " + getLifecyclePolicyText() + ",");
        if (getLastEvaluatedAt() != null) sb.append("lastEvaluatedAt: " + getLastEvaluatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getLifecyclePolicyText() == null) ? 0 : getLifecyclePolicyText().hashCode());
        hashCode = prime * hashCode + ((getLastEvaluatedAt() == null) ? 0 : getLastEvaluatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteLifecyclePolicyResult == false) return false;
        DeleteLifecyclePolicyResult other = (DeleteLifecyclePolicyResult)obj;

        if (other.getRegistryId() == null ^ this.getRegistryId() == null) return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false) return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null) return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false) return false;
        if (other.getLifecyclePolicyText() == null ^ this.getLifecyclePolicyText() == null) return false;
        if (other.getLifecyclePolicyText() != null && other.getLifecyclePolicyText().equals(this.getLifecyclePolicyText()) == false) return false;
        if (other.getLastEvaluatedAt() == null ^ this.getLastEvaluatedAt() == null) return false;
        if (other.getLastEvaluatedAt() != null && other.getLastEvaluatedAt().equals(this.getLastEvaluatedAt()) == false) return false;
        return true;
    }
}
