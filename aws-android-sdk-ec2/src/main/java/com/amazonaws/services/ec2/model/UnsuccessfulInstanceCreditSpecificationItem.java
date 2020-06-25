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

/**
 * <p>
 * Describes the burstable performance instance whose credit option for CPU
 * usage was not modified.
 * </p>
 */
public class UnsuccessfulInstanceCreditSpecificationItem implements Serializable {
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The applicable error for the burstable performance instance whose credit
     * option for CPU usage was not modified.
     * </p>
     */
    private UnsuccessfulInstanceCreditSpecificationItemError error;

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
    public UnsuccessfulInstanceCreditSpecificationItem withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The applicable error for the burstable performance instance whose credit
     * option for CPU usage was not modified.
     * </p>
     *
     * @return <p>
     *         The applicable error for the burstable performance instance whose
     *         credit option for CPU usage was not modified.
     *         </p>
     */
    public UnsuccessfulInstanceCreditSpecificationItemError getError() {
        return error;
    }

    /**
     * <p>
     * The applicable error for the burstable performance instance whose credit
     * option for CPU usage was not modified.
     * </p>
     *
     * @param error <p>
     *            The applicable error for the burstable performance instance
     *            whose credit option for CPU usage was not modified.
     *            </p>
     */
    public void setError(UnsuccessfulInstanceCreditSpecificationItemError error) {
        this.error = error;
    }

    /**
     * <p>
     * The applicable error for the burstable performance instance whose credit
     * option for CPU usage was not modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param error <p>
     *            The applicable error for the burstable performance instance
     *            whose credit option for CPU usage was not modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnsuccessfulInstanceCreditSpecificationItem withError(
            UnsuccessfulInstanceCreditSpecificationItemError error) {
        this.error = error;
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
        if (getError() != null)
            sb.append("Error: " + getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnsuccessfulInstanceCreditSpecificationItem == false)
            return false;
        UnsuccessfulInstanceCreditSpecificationItem other = (UnsuccessfulInstanceCreditSpecificationItem) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }
}
