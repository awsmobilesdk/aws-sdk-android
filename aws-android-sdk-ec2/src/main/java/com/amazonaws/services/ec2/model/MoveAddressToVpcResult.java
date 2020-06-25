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

public class MoveAddressToVpcResult implements Serializable {
    /**
     * <p>
     * The allocation ID for the Elastic IP address.
     * </p>
     */
    private String allocationId;

    /**
     * <p>
     * The status of the move of the IP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MoveInProgress, InVpc, InClassic
     */
    private String status;

    /**
     * <p>
     * The allocation ID for the Elastic IP address.
     * </p>
     *
     * @return <p>
     *         The allocation ID for the Elastic IP address.
     *         </p>
     */
    public String getAllocationId() {
        return allocationId;
    }

    /**
     * <p>
     * The allocation ID for the Elastic IP address.
     * </p>
     *
     * @param allocationId <p>
     *            The allocation ID for the Elastic IP address.
     *            </p>
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * The allocation ID for the Elastic IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocationId <p>
     *            The allocation ID for the Elastic IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MoveAddressToVpcResult withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * <p>
     * The status of the move of the IP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MoveInProgress, InVpc, InClassic
     *
     * @return <p>
     *         The status of the move of the IP address.
     *         </p>
     * @see Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the move of the IP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MoveInProgress, InVpc, InClassic
     *
     * @param status <p>
     *            The status of the move of the IP address.
     *            </p>
     * @see Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the move of the IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MoveInProgress, InVpc, InClassic
     *
     * @param status <p>
     *            The status of the move of the IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public MoveAddressToVpcResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the move of the IP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MoveInProgress, InVpc, InClassic
     *
     * @param status <p>
     *            The status of the move of the IP address.
     *            </p>
     * @see Status
     */
    public void setStatus(Status status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the move of the IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MoveInProgress, InVpc, InClassic
     *
     * @param status <p>
     *            The status of the move of the IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public MoveAddressToVpcResult withStatus(Status status) {
        this.status = status.toString();
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
        if (getAllocationId() != null)
            sb.append("AllocationId: " + getAllocationId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MoveAddressToVpcResult == false)
            return false;
        MoveAddressToVpcResult other = (MoveAddressToVpcResult) obj;

        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null
                && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
