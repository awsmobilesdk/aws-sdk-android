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

public class CreateLaunchTemplateVersionResult implements Serializable {
    /**
     * <p>
     * Information about the launch template version.
     * </p>
     */
    private LaunchTemplateVersion launchTemplateVersion;

    /**
     * <p>
     * Information about the launch template version.
     * </p>
     *
     * @return <p>
     *         Information about the launch template version.
     *         </p>
     */
    public LaunchTemplateVersion getLaunchTemplateVersion() {
        return launchTemplateVersion;
    }

    /**
     * <p>
     * Information about the launch template version.
     * </p>
     *
     * @param launchTemplateVersion <p>
     *            Information about the launch template version.
     *            </p>
     */
    public void setLaunchTemplateVersion(LaunchTemplateVersion launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
    }

    /**
     * <p>
     * Information about the launch template version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateVersion <p>
     *            Information about the launch template version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLaunchTemplateVersionResult withLaunchTemplateVersion(
            LaunchTemplateVersion launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
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
        if (getLaunchTemplateVersion() != null)
            sb.append("LaunchTemplateVersion: " + getLaunchTemplateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLaunchTemplateVersion() == null) ? 0 : getLaunchTemplateVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLaunchTemplateVersionResult == false)
            return false;
        CreateLaunchTemplateVersionResult other = (CreateLaunchTemplateVersionResult) obj;

        if (other.getLaunchTemplateVersion() == null ^ this.getLaunchTemplateVersion() == null)
            return false;
        if (other.getLaunchTemplateVersion() != null
                && other.getLaunchTemplateVersion().equals(this.getLaunchTemplateVersion()) == false)
            return false;
        return true;
    }
}