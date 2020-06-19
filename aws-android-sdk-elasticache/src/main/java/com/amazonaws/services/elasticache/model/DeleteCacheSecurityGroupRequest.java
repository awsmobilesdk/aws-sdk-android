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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a cache security group.
 * </p>
 * <note>
 * <p>
 * You cannot delete a cache security group if it is associated with any
 * clusters.
 * </p>
 * </note>
 */
public class DeleteCacheSecurityGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the cache security group to delete.
     * </p>
     * <note>
     * <p>
     * You cannot delete the default security group.
     * </p>
     * </note>
     */
    private String cacheSecurityGroupName;

    /**
     * <p>
     * The name of the cache security group to delete.
     * </p>
     * <note>
     * <p>
     * You cannot delete the default security group.
     * </p>
     * </note>
     *
     * @return <p>
     *         The name of the cache security group to delete.
     *         </p>
     *         <note>
     *         <p>
     *         You cannot delete the default security group.
     *         </p>
     *         </note>
     */
    public String getCacheSecurityGroupName() {
        return cacheSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cache security group to delete.
     * </p>
     * <note>
     * <p>
     * You cannot delete the default security group.
     * </p>
     * </note>
     *
     * @param cacheSecurityGroupName <p>
     *            The name of the cache security group to delete.
     *            </p>
     *            <note>
     *            <p>
     *            You cannot delete the default security group.
     *            </p>
     *            </note>
     */
    public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cache security group to delete.
     * </p>
     * <note>
     * <p>
     * You cannot delete the default security group.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSecurityGroupName <p>
     *            The name of the cache security group to delete.
     *            </p>
     *            <note>
     *            <p>
     *            You cannot delete the default security group.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteCacheSecurityGroupRequest withCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
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
        if (getCacheSecurityGroupName() != null)
            sb.append("CacheSecurityGroupName: " + getCacheSecurityGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCacheSecurityGroupName() == null) ? 0 : getCacheSecurityGroupName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCacheSecurityGroupRequest == false)
            return false;
        DeleteCacheSecurityGroupRequest other = (DeleteCacheSecurityGroupRequest) obj;

        if (other.getCacheSecurityGroupName() == null ^ this.getCacheSecurityGroupName() == null)
            return false;
        if (other.getCacheSecurityGroupName() != null
                && other.getCacheSecurityGroupName().equals(this.getCacheSecurityGroupName()) == false)
            return false;
        return true;
    }
}