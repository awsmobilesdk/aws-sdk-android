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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a database snapshot in Amazon Lightsail.
 * </p>
 * <p>
 * The <code>delete relational database snapshot</code> operation supports
 * tag-based access control via resource tags applied to the resource identified
 * by relationalDatabaseName. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class DeleteRelationalDatabaseSnapshotRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the database snapshot that you are deleting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String relationalDatabaseSnapshotName;

    /**
     * <p>
     * The name of the database snapshot that you are deleting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the database snapshot that you are deleting.
     *         </p>
     */
    public String getRelationalDatabaseSnapshotName() {
        return relationalDatabaseSnapshotName;
    }

    /**
     * <p>
     * The name of the database snapshot that you are deleting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseSnapshotName <p>
     *            The name of the database snapshot that you are deleting.
     *            </p>
     */
    public void setRelationalDatabaseSnapshotName(String relationalDatabaseSnapshotName) {
        this.relationalDatabaseSnapshotName = relationalDatabaseSnapshotName;
    }

    /**
     * <p>
     * The name of the database snapshot that you are deleting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseSnapshotName <p>
     *            The name of the database snapshot that you are deleting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteRelationalDatabaseSnapshotRequest withRelationalDatabaseSnapshotName(
            String relationalDatabaseSnapshotName) {
        this.relationalDatabaseSnapshotName = relationalDatabaseSnapshotName;
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
        if (getRelationalDatabaseSnapshotName() != null)
            sb.append("relationalDatabaseSnapshotName: " + getRelationalDatabaseSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseSnapshotName() == null) ? 0
                        : getRelationalDatabaseSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRelationalDatabaseSnapshotRequest == false)
            return false;
        DeleteRelationalDatabaseSnapshotRequest other = (DeleteRelationalDatabaseSnapshotRequest) obj;

        if (other.getRelationalDatabaseSnapshotName() == null
                ^ this.getRelationalDatabaseSnapshotName() == null)
            return false;
        if (other.getRelationalDatabaseSnapshotName() != null
                && other.getRelationalDatabaseSnapshotName().equals(
                        this.getRelationalDatabaseSnapshotName()) == false)
            return false;
        return true;
    }
}
