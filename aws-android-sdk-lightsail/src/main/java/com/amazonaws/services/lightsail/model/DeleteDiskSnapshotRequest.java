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
 * Deletes the specified disk snapshot.
 * </p>
 * <p>
 * When you make periodic snapshots of a disk, the snapshots are incremental,
 * and only the blocks on the device that have changed since your last snapshot
 * are saved in the new snapshot. When you delete a snapshot, only the data not
 * needed for any other snapshot is removed. So regardless of which prior
 * snapshots have been deleted, all active snapshots will have access to all the
 * information needed to restore the disk.
 * </p>
 * <p>
 * The <code>delete disk snapshot</code> operation supports tag-based access
 * control via resource tags applied to the resource identified by
 * <code>disk snapshot name</code>. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class DeleteDiskSnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the disk snapshot you want to delete (e.g.,
     * <code>my-disk-snapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String diskSnapshotName;

    /**
     * <p>
     * The name of the disk snapshot you want to delete (e.g.,
     * <code>my-disk-snapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the disk snapshot you want to delete (e.g.,
     *         <code>my-disk-snapshot</code>).
     *         </p>
     */
    public String getDiskSnapshotName() {
        return diskSnapshotName;
    }

    /**
     * <p>
     * The name of the disk snapshot you want to delete (e.g.,
     * <code>my-disk-snapshot</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param diskSnapshotName <p>
     *            The name of the disk snapshot you want to delete (e.g.,
     *            <code>my-disk-snapshot</code>).
     *            </p>
     */
    public void setDiskSnapshotName(String diskSnapshotName) {
        this.diskSnapshotName = diskSnapshotName;
    }

    /**
     * <p>
     * The name of the disk snapshot you want to delete (e.g.,
     * <code>my-disk-snapshot</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param diskSnapshotName <p>
     *            The name of the disk snapshot you want to delete (e.g.,
     *            <code>my-disk-snapshot</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDiskSnapshotRequest withDiskSnapshotName(String diskSnapshotName) {
        this.diskSnapshotName = diskSnapshotName;
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
        if (getDiskSnapshotName() != null)
            sb.append("diskSnapshotName: " + getDiskSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDiskSnapshotName() == null) ? 0 : getDiskSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDiskSnapshotRequest == false)
            return false;
        DeleteDiskSnapshotRequest other = (DeleteDiskSnapshotRequest) obj;

        if (other.getDiskSnapshotName() == null ^ this.getDiskSnapshotName() == null)
            return false;
        if (other.getDiskSnapshotName() != null
                && other.getDiskSnapshotName().equals(this.getDiskSnapshotName()) == false)
            return false;
        return true;
    }
}
