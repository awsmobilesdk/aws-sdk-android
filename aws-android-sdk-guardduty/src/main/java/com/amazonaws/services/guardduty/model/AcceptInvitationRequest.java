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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Accepts the invitation to be monitored by a master GuardDuty account.
 * </p>
 */
public class AcceptInvitationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of the detector of the GuardDuty member account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The account ID of the master GuardDuty account whose invitation you're
     * accepting.
     * </p>
     */
    private String masterId;

    /**
     * <p>
     * The value that is used to validate the master account to the member
     * account.
     * </p>
     */
    private String invitationId;

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty member account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The unique ID of the detector of the GuardDuty member account.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty member account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector of the GuardDuty member account.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty member account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector of the GuardDuty member account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptInvitationRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The account ID of the master GuardDuty account whose invitation you're
     * accepting.
     * </p>
     *
     * @return <p>
     *         The account ID of the master GuardDuty account whose invitation
     *         you're accepting.
     *         </p>
     */
    public String getMasterId() {
        return masterId;
    }

    /**
     * <p>
     * The account ID of the master GuardDuty account whose invitation you're
     * accepting.
     * </p>
     *
     * @param masterId <p>
     *            The account ID of the master GuardDuty account whose
     *            invitation you're accepting.
     *            </p>
     */
    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    /**
     * <p>
     * The account ID of the master GuardDuty account whose invitation you're
     * accepting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterId <p>
     *            The account ID of the master GuardDuty account whose
     *            invitation you're accepting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptInvitationRequest withMasterId(String masterId) {
        this.masterId = masterId;
        return this;
    }

    /**
     * <p>
     * The value that is used to validate the master account to the member
     * account.
     * </p>
     *
     * @return <p>
     *         The value that is used to validate the master account to the
     *         member account.
     *         </p>
     */
    public String getInvitationId() {
        return invitationId;
    }

    /**
     * <p>
     * The value that is used to validate the master account to the member
     * account.
     * </p>
     *
     * @param invitationId <p>
     *            The value that is used to validate the master account to the
     *            member account.
     *            </p>
     */
    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * <p>
     * The value that is used to validate the master account to the member
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invitationId <p>
     *            The value that is used to validate the master account to the
     *            member account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptInvitationRequest withInvitationId(String invitationId) {
        this.invitationId = invitationId;
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
        if (getDetectorId() != null)
            sb.append("DetectorId: " + getDetectorId() + ",");
        if (getMasterId() != null)
            sb.append("MasterId: " + getMasterId() + ",");
        if (getInvitationId() != null)
            sb.append("InvitationId: " + getInvitationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getMasterId() == null) ? 0 : getMasterId().hashCode());
        hashCode = prime * hashCode
                + ((getInvitationId() == null) ? 0 : getInvitationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptInvitationRequest == false)
            return false;
        AcceptInvitationRequest other = (AcceptInvitationRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getMasterId() == null ^ this.getMasterId() == null)
            return false;
        if (other.getMasterId() != null && other.getMasterId().equals(this.getMasterId()) == false)
            return false;
        if (other.getInvitationId() == null ^ this.getInvitationId() == null)
            return false;
        if (other.getInvitationId() != null
                && other.getInvitationId().equals(this.getInvitationId()) == false)
            return false;
        return true;
    }
}
