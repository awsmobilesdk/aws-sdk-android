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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class ModifyInstanceMetadataOptionsResult implements Serializable {
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The metadata options for the instance.
     * </p>
     */
    private InstanceMetadataOptionsResponse instanceMetadataOptions;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceMetadataOptionsResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The metadata options for the instance.
     * </p>
     *
     * @return <p>
     *         The metadata options for the instance.
     *         </p>
     */
    public InstanceMetadataOptionsResponse getInstanceMetadataOptions() {
        return instanceMetadataOptions;
    }

    /**
     * <p>
     * The metadata options for the instance.
     * </p>
     *
     * @param instanceMetadataOptions <p>
     *            The metadata options for the instance.
     *            </p>
     */
    public void setInstanceMetadataOptions(InstanceMetadataOptionsResponse instanceMetadataOptions) {
        this.instanceMetadataOptions = instanceMetadataOptions;
    }

    /**
     * <p>
     * The metadata options for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceMetadataOptions <p>
     *            The metadata options for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceMetadataOptionsResult withInstanceMetadataOptions(
            InstanceMetadataOptionsResponse instanceMetadataOptions) {
        this.instanceMetadataOptions = instanceMetadataOptions;
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
        if (getInstanceMetadataOptions() != null)
            sb.append("InstanceMetadataOptions: " + getInstanceMetadataOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceMetadataOptions() == null) ? 0 : getInstanceMetadataOptions()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceMetadataOptionsResult == false)
            return false;
        ModifyInstanceMetadataOptionsResult other = (ModifyInstanceMetadataOptionsResult) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceMetadataOptions() == null ^ this.getInstanceMetadataOptions() == null)
            return false;
        if (other.getInstanceMetadataOptions() != null
                && other.getInstanceMetadataOptions().equals(this.getInstanceMetadataOptions()) == false)
            return false;
        return true;
    }
}