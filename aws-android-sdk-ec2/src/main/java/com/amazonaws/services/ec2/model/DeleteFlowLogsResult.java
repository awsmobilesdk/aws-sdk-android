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

public class DeleteFlowLogsResult implements Serializable {
    /**
     * <p>
     * Information about the flow logs that could not be deleted successfully.
     * </p>
     */
    private java.util.List<UnsuccessfulItem> unsuccessful;

    /**
     * <p>
     * Information about the flow logs that could not be deleted successfully.
     * </p>
     *
     * @return <p>
     *         Information about the flow logs that could not be deleted
     *         successfully.
     *         </p>
     */
    public java.util.List<UnsuccessfulItem> getUnsuccessful() {
        return unsuccessful;
    }

    /**
     * <p>
     * Information about the flow logs that could not be deleted successfully.
     * </p>
     *
     * @param unsuccessful <p>
     *            Information about the flow logs that could not be deleted
     *            successfully.
     *            </p>
     */
    public void setUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
            return;
        }

        this.unsuccessful = new java.util.ArrayList<UnsuccessfulItem>(unsuccessful);
    }

    /**
     * <p>
     * Information about the flow logs that could not be deleted successfully.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessful <p>
     *            Information about the flow logs that could not be deleted
     *            successfully.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFlowLogsResult withUnsuccessful(UnsuccessfulItem... unsuccessful) {
        if (getUnsuccessful() == null) {
            this.unsuccessful = new java.util.ArrayList<UnsuccessfulItem>(unsuccessful.length);
        }
        for (UnsuccessfulItem value : unsuccessful) {
            this.unsuccessful.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the flow logs that could not be deleted successfully.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessful <p>
     *            Information about the flow logs that could not be deleted
     *            successfully.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFlowLogsResult withUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        setUnsuccessful(unsuccessful);
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
        if (getUnsuccessful() != null)
            sb.append("Unsuccessful: " + getUnsuccessful());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUnsuccessful() == null) ? 0 : getUnsuccessful().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFlowLogsResult == false)
            return false;
        DeleteFlowLogsResult other = (DeleteFlowLogsResult) obj;

        if (other.getUnsuccessful() == null ^ this.getUnsuccessful() == null)
            return false;
        if (other.getUnsuccessful() != null
                && other.getUnsuccessful().equals(this.getUnsuccessful()) == false)
            return false;
        return true;
    }
}
