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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

public class CreateAccountResult implements Serializable {
    /**
     * <p>
     * A structure that contains details about the request to create an account.
     * This response structure might not be fully populated when you first
     * receive it because account creation is an asynchronous process. You can
     * pass the returned <code>CreateAccountStatus</code> ID as a parameter to
     * <a>DescribeCreateAccountStatus</a> to get status about the progress of
     * the request at later times. You can also check the AWS CloudTrail log for
     * the <code>CreateAccountResult</code> event. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html"
     * >Monitoring the Activity in Your Organization</a> in the <i>AWS
     * Organizations User Guide</i>.
     * </p>
     */
    private CreateAccountStatus createAccountStatus;

    /**
     * <p>
     * A structure that contains details about the request to create an account.
     * This response structure might not be fully populated when you first
     * receive it because account creation is an asynchronous process. You can
     * pass the returned <code>CreateAccountStatus</code> ID as a parameter to
     * <a>DescribeCreateAccountStatus</a> to get status about the progress of
     * the request at later times. You can also check the AWS CloudTrail log for
     * the <code>CreateAccountResult</code> event. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html"
     * >Monitoring the Activity in Your Organization</a> in the <i>AWS
     * Organizations User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A structure that contains details about the request to create an
     *         account. This response structure might not be fully populated
     *         when you first receive it because account creation is an
     *         asynchronous process. You can pass the returned
     *         <code>CreateAccountStatus</code> ID as a parameter to
     *         <a>DescribeCreateAccountStatus</a> to get status about the
     *         progress of the request at later times. You can also check the
     *         AWS CloudTrail log for the <code>CreateAccountResult</code>
     *         event. For more information, see <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html"
     *         >Monitoring the Activity in Your Organization</a> in the <i>AWS
     *         Organizations User Guide</i>.
     *         </p>
     */
    public CreateAccountStatus getCreateAccountStatus() {
        return createAccountStatus;
    }

    /**
     * <p>
     * A structure that contains details about the request to create an account.
     * This response structure might not be fully populated when you first
     * receive it because account creation is an asynchronous process. You can
     * pass the returned <code>CreateAccountStatus</code> ID as a parameter to
     * <a>DescribeCreateAccountStatus</a> to get status about the progress of
     * the request at later times. You can also check the AWS CloudTrail log for
     * the <code>CreateAccountResult</code> event. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html"
     * >Monitoring the Activity in Your Organization</a> in the <i>AWS
     * Organizations User Guide</i>.
     * </p>
     *
     * @param createAccountStatus <p>
     *            A structure that contains details about the request to create
     *            an account. This response structure might not be fully
     *            populated when you first receive it because account creation
     *            is an asynchronous process. You can pass the returned
     *            <code>CreateAccountStatus</code> ID as a parameter to
     *            <a>DescribeCreateAccountStatus</a> to get status about the
     *            progress of the request at later times. You can also check the
     *            AWS CloudTrail log for the <code>CreateAccountResult</code>
     *            event. For more information, see <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html"
     *            >Monitoring the Activity in Your Organization</a> in the
     *            <i>AWS Organizations User Guide</i>.
     *            </p>
     */
    public void setCreateAccountStatus(CreateAccountStatus createAccountStatus) {
        this.createAccountStatus = createAccountStatus;
    }

    /**
     * <p>
     * A structure that contains details about the request to create an account.
     * This response structure might not be fully populated when you first
     * receive it because account creation is an asynchronous process. You can
     * pass the returned <code>CreateAccountStatus</code> ID as a parameter to
     * <a>DescribeCreateAccountStatus</a> to get status about the progress of
     * the request at later times. You can also check the AWS CloudTrail log for
     * the <code>CreateAccountResult</code> event. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html"
     * >Monitoring the Activity in Your Organization</a> in the <i>AWS
     * Organizations User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createAccountStatus <p>
     *            A structure that contains details about the request to create
     *            an account. This response structure might not be fully
     *            populated when you first receive it because account creation
     *            is an asynchronous process. You can pass the returned
     *            <code>CreateAccountStatus</code> ID as a parameter to
     *            <a>DescribeCreateAccountStatus</a> to get status about the
     *            progress of the request at later times. You can also check the
     *            AWS CloudTrail log for the <code>CreateAccountResult</code>
     *            event. For more information, see <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html"
     *            >Monitoring the Activity in Your Organization</a> in the
     *            <i>AWS Organizations User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAccountResult withCreateAccountStatus(CreateAccountStatus createAccountStatus) {
        this.createAccountStatus = createAccountStatus;
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
        if (getCreateAccountStatus() != null)
            sb.append("CreateAccountStatus: " + getCreateAccountStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreateAccountStatus() == null) ? 0 : getCreateAccountStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccountResult == false)
            return false;
        CreateAccountResult other = (CreateAccountResult) obj;

        if (other.getCreateAccountStatus() == null ^ this.getCreateAccountStatus() == null)
            return false;
        if (other.getCreateAccountStatus() != null
                && other.getCreateAccountStatus().equals(this.getCreateAccountStatus()) == false)
            return false;
        return true;
    }
}
