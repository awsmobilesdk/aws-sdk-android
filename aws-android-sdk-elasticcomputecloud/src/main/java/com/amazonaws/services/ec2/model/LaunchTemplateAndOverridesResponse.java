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
 * Describes a launch template and overrides.
 * </p>
 */
public class LaunchTemplateAndOverridesResponse implements Serializable {
    /**
     * <p>
     * The launch template.
     * </p>
     */
    private FleetLaunchTemplateSpecification launchTemplateSpecification;

    /**
     * <p>
     * Any parameters that you specify override the same parameters in the
     * launch template.
     * </p>
     */
    private FleetLaunchTemplateOverrides overrides;

    /**
     * <p>
     * The launch template.
     * </p>
     *
     * @return <p>
     *         The launch template.
     *         </p>
     */
    public FleetLaunchTemplateSpecification getLaunchTemplateSpecification() {
        return launchTemplateSpecification;
    }

    /**
     * <p>
     * The launch template.
     * </p>
     *
     * @param launchTemplateSpecification <p>
     *            The launch template.
     *            </p>
     */
    public void setLaunchTemplateSpecification(
            FleetLaunchTemplateSpecification launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
    }

    /**
     * <p>
     * The launch template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateSpecification <p>
     *            The launch template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateAndOverridesResponse withLaunchTemplateSpecification(
            FleetLaunchTemplateSpecification launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
        return this;
    }

    /**
     * <p>
     * Any parameters that you specify override the same parameters in the
     * launch template.
     * </p>
     *
     * @return <p>
     *         Any parameters that you specify override the same parameters in
     *         the launch template.
     *         </p>
     */
    public FleetLaunchTemplateOverrides getOverrides() {
        return overrides;
    }

    /**
     * <p>
     * Any parameters that you specify override the same parameters in the
     * launch template.
     * </p>
     *
     * @param overrides <p>
     *            Any parameters that you specify override the same parameters
     *            in the launch template.
     *            </p>
     */
    public void setOverrides(FleetLaunchTemplateOverrides overrides) {
        this.overrides = overrides;
    }

    /**
     * <p>
     * Any parameters that you specify override the same parameters in the
     * launch template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param overrides <p>
     *            Any parameters that you specify override the same parameters
     *            in the launch template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateAndOverridesResponse withOverrides(FleetLaunchTemplateOverrides overrides) {
        this.overrides = overrides;
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
        if (getLaunchTemplateSpecification() != null)
            sb.append("LaunchTemplateSpecification: " + getLaunchTemplateSpecification() + ",");
        if (getOverrides() != null)
            sb.append("Overrides: " + getOverrides());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLaunchTemplateSpecification() == null) ? 0
                        : getLaunchTemplateSpecification().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateAndOverridesResponse == false)
            return false;
        LaunchTemplateAndOverridesResponse other = (LaunchTemplateAndOverridesResponse) obj;

        if (other.getLaunchTemplateSpecification() == null
                ^ this.getLaunchTemplateSpecification() == null)
            return false;
        if (other.getLaunchTemplateSpecification() != null
                && other.getLaunchTemplateSpecification().equals(
                        this.getLaunchTemplateSpecification()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null
                && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        return true;
    }
}