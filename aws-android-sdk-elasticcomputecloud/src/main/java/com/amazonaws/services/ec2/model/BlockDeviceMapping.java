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
 * Describes a block device mapping.
 * </p>
 */
public class BlockDeviceMapping implements Serializable {
    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>
     * ).
     * </p>
     */
    private String deviceName;

    /**
     * <p>
     * The virtual device name (<code>ephemeral</code>N). Instance store volumes
     * are numbered starting from 0. An instance type with 2 available instance
     * store volumes can specify mappings for <code>ephemeral0</code> and
     * <code>ephemeral1</code>. The number of available instance store volumes
     * depends on the instance type. After you connect to the instance, you must
     * mount the volume.
     * </p>
     * <p>
     * NVMe instance store volumes are automatically enumerated and assigned a
     * device name. Including them in your block device mapping has no effect.
     * </p>
     * <p>
     * Constraints: For M3 instances, you must specify instance store volumes in
     * the block device mapping for the instance. When you launch an M3
     * instance, we ignore any instance store volumes specified in the block
     * device mapping for the AMI.
     * </p>
     */
    private String virtualName;

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when the instance is
     * launched.
     * </p>
     */
    private EbsBlockDevice ebs;

    /**
     * <p>
     * Suppresses the specified device included in the block device mapping of
     * the AMI.
     * </p>
     */
    private String noDevice;

    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>
     * ).
     * </p>
     *
     * @return <p>
     *         The device name (for example, <code>/dev/sdh</code> or
     *         <code>xvdh</code>).
     *         </p>
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>
     * ).
     * </p>
     *
     * @param deviceName <p>
     *            The device name (for example, <code>/dev/sdh</code> or
     *            <code>xvdh</code>).
     *            </p>
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>
     * ).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceName <p>
     *            The device name (for example, <code>/dev/sdh</code> or
     *            <code>xvdh</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockDeviceMapping withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * <p>
     * The virtual device name (<code>ephemeral</code>N). Instance store volumes
     * are numbered starting from 0. An instance type with 2 available instance
     * store volumes can specify mappings for <code>ephemeral0</code> and
     * <code>ephemeral1</code>. The number of available instance store volumes
     * depends on the instance type. After you connect to the instance, you must
     * mount the volume.
     * </p>
     * <p>
     * NVMe instance store volumes are automatically enumerated and assigned a
     * device name. Including them in your block device mapping has no effect.
     * </p>
     * <p>
     * Constraints: For M3 instances, you must specify instance store volumes in
     * the block device mapping for the instance. When you launch an M3
     * instance, we ignore any instance store volumes specified in the block
     * device mapping for the AMI.
     * </p>
     *
     * @return <p>
     *         The virtual device name (<code>ephemeral</code>N). Instance store
     *         volumes are numbered starting from 0. An instance type with 2
     *         available instance store volumes can specify mappings for
     *         <code>ephemeral0</code> and <code>ephemeral1</code>. The number
     *         of available instance store volumes depends on the instance type.
     *         After you connect to the instance, you must mount the volume.
     *         </p>
     *         <p>
     *         NVMe instance store volumes are automatically enumerated and
     *         assigned a device name. Including them in your block device
     *         mapping has no effect.
     *         </p>
     *         <p>
     *         Constraints: For M3 instances, you must specify instance store
     *         volumes in the block device mapping for the instance. When you
     *         launch an M3 instance, we ignore any instance store volumes
     *         specified in the block device mapping for the AMI.
     *         </p>
     */
    public String getVirtualName() {
        return virtualName;
    }

    /**
     * <p>
     * The virtual device name (<code>ephemeral</code>N). Instance store volumes
     * are numbered starting from 0. An instance type with 2 available instance
     * store volumes can specify mappings for <code>ephemeral0</code> and
     * <code>ephemeral1</code>. The number of available instance store volumes
     * depends on the instance type. After you connect to the instance, you must
     * mount the volume.
     * </p>
     * <p>
     * NVMe instance store volumes are automatically enumerated and assigned a
     * device name. Including them in your block device mapping has no effect.
     * </p>
     * <p>
     * Constraints: For M3 instances, you must specify instance store volumes in
     * the block device mapping for the instance. When you launch an M3
     * instance, we ignore any instance store volumes specified in the block
     * device mapping for the AMI.
     * </p>
     *
     * @param virtualName <p>
     *            The virtual device name (<code>ephemeral</code>N). Instance
     *            store volumes are numbered starting from 0. An instance type
     *            with 2 available instance store volumes can specify mappings
     *            for <code>ephemeral0</code> and <code>ephemeral1</code>. The
     *            number of available instance store volumes depends on the
     *            instance type. After you connect to the instance, you must
     *            mount the volume.
     *            </p>
     *            <p>
     *            NVMe instance store volumes are automatically enumerated and
     *            assigned a device name. Including them in your block device
     *            mapping has no effect.
     *            </p>
     *            <p>
     *            Constraints: For M3 instances, you must specify instance store
     *            volumes in the block device mapping for the instance. When you
     *            launch an M3 instance, we ignore any instance store volumes
     *            specified in the block device mapping for the AMI.
     *            </p>
     */
    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }

    /**
     * <p>
     * The virtual device name (<code>ephemeral</code>N). Instance store volumes
     * are numbered starting from 0. An instance type with 2 available instance
     * store volumes can specify mappings for <code>ephemeral0</code> and
     * <code>ephemeral1</code>. The number of available instance store volumes
     * depends on the instance type. After you connect to the instance, you must
     * mount the volume.
     * </p>
     * <p>
     * NVMe instance store volumes are automatically enumerated and assigned a
     * device name. Including them in your block device mapping has no effect.
     * </p>
     * <p>
     * Constraints: For M3 instances, you must specify instance store volumes in
     * the block device mapping for the instance. When you launch an M3
     * instance, we ignore any instance store volumes specified in the block
     * device mapping for the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualName <p>
     *            The virtual device name (<code>ephemeral</code>N). Instance
     *            store volumes are numbered starting from 0. An instance type
     *            with 2 available instance store volumes can specify mappings
     *            for <code>ephemeral0</code> and <code>ephemeral1</code>. The
     *            number of available instance store volumes depends on the
     *            instance type. After you connect to the instance, you must
     *            mount the volume.
     *            </p>
     *            <p>
     *            NVMe instance store volumes are automatically enumerated and
     *            assigned a device name. Including them in your block device
     *            mapping has no effect.
     *            </p>
     *            <p>
     *            Constraints: For M3 instances, you must specify instance store
     *            volumes in the block device mapping for the instance. When you
     *            launch an M3 instance, we ignore any instance store volumes
     *            specified in the block device mapping for the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockDeviceMapping withVirtualName(String virtualName) {
        this.virtualName = virtualName;
        return this;
    }

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when the instance is
     * launched.
     * </p>
     *
     * @return <p>
     *         Parameters used to automatically set up EBS volumes when the
     *         instance is launched.
     *         </p>
     */
    public EbsBlockDevice getEbs() {
        return ebs;
    }

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when the instance is
     * launched.
     * </p>
     *
     * @param ebs <p>
     *            Parameters used to automatically set up EBS volumes when the
     *            instance is launched.
     *            </p>
     */
    public void setEbs(EbsBlockDevice ebs) {
        this.ebs = ebs;
    }

    /**
     * <p>
     * Parameters used to automatically set up EBS volumes when the instance is
     * launched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebs <p>
     *            Parameters used to automatically set up EBS volumes when the
     *            instance is launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockDeviceMapping withEbs(EbsBlockDevice ebs) {
        this.ebs = ebs;
        return this;
    }

    /**
     * <p>
     * Suppresses the specified device included in the block device mapping of
     * the AMI.
     * </p>
     *
     * @return <p>
     *         Suppresses the specified device included in the block device
     *         mapping of the AMI.
     *         </p>
     */
    public String getNoDevice() {
        return noDevice;
    }

    /**
     * <p>
     * Suppresses the specified device included in the block device mapping of
     * the AMI.
     * </p>
     *
     * @param noDevice <p>
     *            Suppresses the specified device included in the block device
     *            mapping of the AMI.
     *            </p>
     */
    public void setNoDevice(String noDevice) {
        this.noDevice = noDevice;
    }

    /**
     * <p>
     * Suppresses the specified device included in the block device mapping of
     * the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noDevice <p>
     *            Suppresses the specified device included in the block device
     *            mapping of the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockDeviceMapping withNoDevice(String noDevice) {
        this.noDevice = noDevice;
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
        if (getDeviceName() != null)
            sb.append("DeviceName: " + getDeviceName() + ",");
        if (getVirtualName() != null)
            sb.append("VirtualName: " + getVirtualName() + ",");
        if (getEbs() != null)
            sb.append("Ebs: " + getEbs() + ",");
        if (getNoDevice() != null)
            sb.append("NoDevice: " + getNoDevice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualName() == null) ? 0 : getVirtualName().hashCode());
        hashCode = prime * hashCode + ((getEbs() == null) ? 0 : getEbs().hashCode());
        hashCode = prime * hashCode + ((getNoDevice() == null) ? 0 : getNoDevice().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlockDeviceMapping == false)
            return false;
        BlockDeviceMapping other = (BlockDeviceMapping) obj;

        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null
                && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getVirtualName() == null ^ this.getVirtualName() == null)
            return false;
        if (other.getVirtualName() != null
                && other.getVirtualName().equals(this.getVirtualName()) == false)
            return false;
        if (other.getEbs() == null ^ this.getEbs() == null)
            return false;
        if (other.getEbs() != null && other.getEbs().equals(this.getEbs()) == false)
            return false;
        if (other.getNoDevice() == null ^ this.getNoDevice() == null)
            return false;
        if (other.getNoDevice() != null && other.getNoDevice().equals(this.getNoDevice()) == false)
            return false;
        return true;
    }
}