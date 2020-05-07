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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * The data type name for including resource data sync state. There are four
 * sync states:
 * </p>
 * <p>
 * <code>OrganizationNotExists</code> (Your organization doesn't exist)
 * </p>
 * <p>
 * <code>NoPermissions</code> (The system can't locate the service-linked role.
 * This role is automatically created when a user creates a resource data sync
 * in Explorer.)
 * </p>
 * <p>
 * <code>InvalidOrganizationalUnit</code> (You specified or selected an invalid
 * unit in the resource data sync configuration.)
 * </p>
 * <p>
 * <code>TrustedAccessDisabled</code> (You disabled Systems Manager access in
 * the organization in AWS Organizations.)
 * </p>
 */
public class ResourceDataSyncSourceWithState implements Serializable {
    /**
     * <p>
     * The type of data source for the resource data sync.
     * <code>SourceType</code> is either <code>AwsOrganizations</code> (if an
     * organization is present in AWS Organizations) or
     * <code>singleAccountMultiRegions</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String sourceType;

    /**
     * <p>
     * The field name in <code>SyncSource</code> for the
     * <code>ResourceDataSyncAwsOrganizationsSource</code> type.
     * </p>
     */
    private ResourceDataSyncAwsOrganizationsSource awsOrganizationsSource;

    /**
     * <p>
     * The <code>SyncSource</code> AWS Regions included in the resource data
     * sync.
     * </p>
     */
    private java.util.List<String> sourceRegions;

    /**
     * <p>
     * Whether to automatically synchronize and aggregate data from new AWS
     * Regions when those Regions come online.
     * </p>
     */
    private Boolean includeFutureRegions;

    /**
     * <p>
     * The data type name for including resource data sync state. There are four
     * sync states:
     * </p>
     * <p>
     * <code>OrganizationNotExists</code>: Your organization doesn't exist.
     * </p>
     * <p>
     * <code>NoPermissions</code>: The system can't locate the service-linked
     * role. This role is automatically created when a user creates a resource
     * data sync in Explorer.
     * </p>
     * <p>
     * <code>InvalidOrganizationalUnit</code>: You specified or selected an
     * invalid unit in the resource data sync configuration.
     * </p>
     * <p>
     * <code>TrustedAccessDisabled</code>: You disabled Systems Manager access
     * in the organization in AWS Organizations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String state;

    /**
     * <p>
     * The type of data source for the resource data sync.
     * <code>SourceType</code> is either <code>AwsOrganizations</code> (if an
     * organization is present in AWS Organizations) or
     * <code>singleAccountMultiRegions</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The type of data source for the resource data sync.
     *         <code>SourceType</code> is either <code>AwsOrganizations</code>
     *         (if an organization is present in AWS Organizations) or
     *         <code>singleAccountMultiRegions</code>.
     *         </p>
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <p>
     * The type of data source for the resource data sync.
     * <code>SourceType</code> is either <code>AwsOrganizations</code> (if an
     * organization is present in AWS Organizations) or
     * <code>singleAccountMultiRegions</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param sourceType <p>
     *            The type of data source for the resource data sync.
     *            <code>SourceType</code> is either
     *            <code>AwsOrganizations</code> (if an organization is present
     *            in AWS Organizations) or
     *            <code>singleAccountMultiRegions</code>.
     *            </p>
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of data source for the resource data sync.
     * <code>SourceType</code> is either <code>AwsOrganizations</code> (if an
     * organization is present in AWS Organizations) or
     * <code>singleAccountMultiRegions</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param sourceType <p>
     *            The type of data source for the resource data sync.
     *            <code>SourceType</code> is either
     *            <code>AwsOrganizations</code> (if an organization is present
     *            in AWS Organizations) or
     *            <code>singleAccountMultiRegions</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncSourceWithState withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * <p>
     * The field name in <code>SyncSource</code> for the
     * <code>ResourceDataSyncAwsOrganizationsSource</code> type.
     * </p>
     *
     * @return <p>
     *         The field name in <code>SyncSource</code> for the
     *         <code>ResourceDataSyncAwsOrganizationsSource</code> type.
     *         </p>
     */
    public ResourceDataSyncAwsOrganizationsSource getAwsOrganizationsSource() {
        return awsOrganizationsSource;
    }

    /**
     * <p>
     * The field name in <code>SyncSource</code> for the
     * <code>ResourceDataSyncAwsOrganizationsSource</code> type.
     * </p>
     *
     * @param awsOrganizationsSource <p>
     *            The field name in <code>SyncSource</code> for the
     *            <code>ResourceDataSyncAwsOrganizationsSource</code> type.
     *            </p>
     */
    public void setAwsOrganizationsSource(
            ResourceDataSyncAwsOrganizationsSource awsOrganizationsSource) {
        this.awsOrganizationsSource = awsOrganizationsSource;
    }

    /**
     * <p>
     * The field name in <code>SyncSource</code> for the
     * <code>ResourceDataSyncAwsOrganizationsSource</code> type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsOrganizationsSource <p>
     *            The field name in <code>SyncSource</code> for the
     *            <code>ResourceDataSyncAwsOrganizationsSource</code> type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncSourceWithState withAwsOrganizationsSource(
            ResourceDataSyncAwsOrganizationsSource awsOrganizationsSource) {
        this.awsOrganizationsSource = awsOrganizationsSource;
        return this;
    }

    /**
     * <p>
     * The <code>SyncSource</code> AWS Regions included in the resource data
     * sync.
     * </p>
     *
     * @return <p>
     *         The <code>SyncSource</code> AWS Regions included in the resource
     *         data sync.
     *         </p>
     */
    public java.util.List<String> getSourceRegions() {
        return sourceRegions;
    }

    /**
     * <p>
     * The <code>SyncSource</code> AWS Regions included in the resource data
     * sync.
     * </p>
     *
     * @param sourceRegions <p>
     *            The <code>SyncSource</code> AWS Regions included in the
     *            resource data sync.
     *            </p>
     */
    public void setSourceRegions(java.util.Collection<String> sourceRegions) {
        if (sourceRegions == null) {
            this.sourceRegions = null;
            return;
        }

        this.sourceRegions = new java.util.ArrayList<String>(sourceRegions);
    }

    /**
     * <p>
     * The <code>SyncSource</code> AWS Regions included in the resource data
     * sync.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceRegions <p>
     *            The <code>SyncSource</code> AWS Regions included in the
     *            resource data sync.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncSourceWithState withSourceRegions(String... sourceRegions) {
        if (getSourceRegions() == null) {
            this.sourceRegions = new java.util.ArrayList<String>(sourceRegions.length);
        }
        for (String value : sourceRegions) {
            this.sourceRegions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The <code>SyncSource</code> AWS Regions included in the resource data
     * sync.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceRegions <p>
     *            The <code>SyncSource</code> AWS Regions included in the
     *            resource data sync.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncSourceWithState withSourceRegions(
            java.util.Collection<String> sourceRegions) {
        setSourceRegions(sourceRegions);
        return this;
    }

    /**
     * <p>
     * Whether to automatically synchronize and aggregate data from new AWS
     * Regions when those Regions come online.
     * </p>
     *
     * @return <p>
     *         Whether to automatically synchronize and aggregate data from new
     *         AWS Regions when those Regions come online.
     *         </p>
     */
    public Boolean isIncludeFutureRegions() {
        return includeFutureRegions;
    }

    /**
     * <p>
     * Whether to automatically synchronize and aggregate data from new AWS
     * Regions when those Regions come online.
     * </p>
     *
     * @return <p>
     *         Whether to automatically synchronize and aggregate data from new
     *         AWS Regions when those Regions come online.
     *         </p>
     */
    public Boolean getIncludeFutureRegions() {
        return includeFutureRegions;
    }

    /**
     * <p>
     * Whether to automatically synchronize and aggregate data from new AWS
     * Regions when those Regions come online.
     * </p>
     *
     * @param includeFutureRegions <p>
     *            Whether to automatically synchronize and aggregate data from
     *            new AWS Regions when those Regions come online.
     *            </p>
     */
    public void setIncludeFutureRegions(Boolean includeFutureRegions) {
        this.includeFutureRegions = includeFutureRegions;
    }

    /**
     * <p>
     * Whether to automatically synchronize and aggregate data from new AWS
     * Regions when those Regions come online.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeFutureRegions <p>
     *            Whether to automatically synchronize and aggregate data from
     *            new AWS Regions when those Regions come online.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncSourceWithState withIncludeFutureRegions(Boolean includeFutureRegions) {
        this.includeFutureRegions = includeFutureRegions;
        return this;
    }

    /**
     * <p>
     * The data type name for including resource data sync state. There are four
     * sync states:
     * </p>
     * <p>
     * <code>OrganizationNotExists</code>: Your organization doesn't exist.
     * </p>
     * <p>
     * <code>NoPermissions</code>: The system can't locate the service-linked
     * role. This role is automatically created when a user creates a resource
     * data sync in Explorer.
     * </p>
     * <p>
     * <code>InvalidOrganizationalUnit</code>: You specified or selected an
     * invalid unit in the resource data sync configuration.
     * </p>
     * <p>
     * <code>TrustedAccessDisabled</code>: You disabled Systems Manager access
     * in the organization in AWS Organizations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The data type name for including resource data sync state. There
     *         are four sync states:
     *         </p>
     *         <p>
     *         <code>OrganizationNotExists</code>: Your organization doesn't
     *         exist.
     *         </p>
     *         <p>
     *         <code>NoPermissions</code>: The system can't locate the
     *         service-linked role. This role is automatically created when a
     *         user creates a resource data sync in Explorer.
     *         </p>
     *         <p>
     *         <code>InvalidOrganizationalUnit</code>: You specified or selected
     *         an invalid unit in the resource data sync configuration.
     *         </p>
     *         <p>
     *         <code>TrustedAccessDisabled</code>: You disabled Systems Manager
     *         access in the organization in AWS Organizations.
     *         </p>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The data type name for including resource data sync state. There are four
     * sync states:
     * </p>
     * <p>
     * <code>OrganizationNotExists</code>: Your organization doesn't exist.
     * </p>
     * <p>
     * <code>NoPermissions</code>: The system can't locate the service-linked
     * role. This role is automatically created when a user creates a resource
     * data sync in Explorer.
     * </p>
     * <p>
     * <code>InvalidOrganizationalUnit</code>: You specified or selected an
     * invalid unit in the resource data sync configuration.
     * </p>
     * <p>
     * <code>TrustedAccessDisabled</code>: You disabled Systems Manager access
     * in the organization in AWS Organizations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param state <p>
     *            The data type name for including resource data sync state.
     *            There are four sync states:
     *            </p>
     *            <p>
     *            <code>OrganizationNotExists</code>: Your organization doesn't
     *            exist.
     *            </p>
     *            <p>
     *            <code>NoPermissions</code>: The system can't locate the
     *            service-linked role. This role is automatically created when a
     *            user creates a resource data sync in Explorer.
     *            </p>
     *            <p>
     *            <code>InvalidOrganizationalUnit</code>: You specified or
     *            selected an invalid unit in the resource data sync
     *            configuration.
     *            </p>
     *            <p>
     *            <code>TrustedAccessDisabled</code>: You disabled Systems
     *            Manager access in the organization in AWS Organizations.
     *            </p>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The data type name for including resource data sync state. There are four
     * sync states:
     * </p>
     * <p>
     * <code>OrganizationNotExists</code>: Your organization doesn't exist.
     * </p>
     * <p>
     * <code>NoPermissions</code>: The system can't locate the service-linked
     * role. This role is automatically created when a user creates a resource
     * data sync in Explorer.
     * </p>
     * <p>
     * <code>InvalidOrganizationalUnit</code>: You specified or selected an
     * invalid unit in the resource data sync configuration.
     * </p>
     * <p>
     * <code>TrustedAccessDisabled</code>: You disabled Systems Manager access
     * in the organization in AWS Organizations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param state <p>
     *            The data type name for including resource data sync state.
     *            There are four sync states:
     *            </p>
     *            <p>
     *            <code>OrganizationNotExists</code>: Your organization doesn't
     *            exist.
     *            </p>
     *            <p>
     *            <code>NoPermissions</code>: The system can't locate the
     *            service-linked role. This role is automatically created when a
     *            user creates a resource data sync in Explorer.
     *            </p>
     *            <p>
     *            <code>InvalidOrganizationalUnit</code>: You specified or
     *            selected an invalid unit in the resource data sync
     *            configuration.
     *            </p>
     *            <p>
     *            <code>TrustedAccessDisabled</code>: You disabled Systems
     *            Manager access in the organization in AWS Organizations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceDataSyncSourceWithState withState(String state) {
        this.state = state;
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
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType() + ",");
        if (getAwsOrganizationsSource() != null)
            sb.append("AwsOrganizationsSource: " + getAwsOrganizationsSource() + ",");
        if (getSourceRegions() != null)
            sb.append("SourceRegions: " + getSourceRegions() + ",");
        if (getIncludeFutureRegions() != null)
            sb.append("IncludeFutureRegions: " + getIncludeFutureRegions() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime
                * hashCode
                + ((getAwsOrganizationsSource() == null) ? 0 : getAwsOrganizationsSource()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSourceRegions() == null) ? 0 : getSourceRegions().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeFutureRegions() == null) ? 0 : getIncludeFutureRegions().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDataSyncSourceWithState == false)
            return false;
        ResourceDataSyncSourceWithState other = (ResourceDataSyncSourceWithState) obj;

        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null
                && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getAwsOrganizationsSource() == null ^ this.getAwsOrganizationsSource() == null)
            return false;
        if (other.getAwsOrganizationsSource() != null
                && other.getAwsOrganizationsSource().equals(this.getAwsOrganizationsSource()) == false)
            return false;
        if (other.getSourceRegions() == null ^ this.getSourceRegions() == null)
            return false;
        if (other.getSourceRegions() != null
                && other.getSourceRegions().equals(this.getSourceRegions()) == false)
            return false;
        if (other.getIncludeFutureRegions() == null ^ this.getIncludeFutureRegions() == null)
            return false;
        if (other.getIncludeFutureRegions() != null
                && other.getIncludeFutureRegions().equals(this.getIncludeFutureRegions()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
