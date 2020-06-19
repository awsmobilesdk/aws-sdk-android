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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Dynamically decreases the number of replicas in a Redis (cluster mode
 * disabled) replication group or the number of replica nodes in one or more
 * node groups (shards) of a Redis (cluster mode enabled) replication group.
 * This operation is performed with no cluster down time.
 * </p>
 */
public class DecreaseReplicaCountRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The id of the replication group from which you want to remove replica
     * nodes.
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * The number of read replica nodes you want at the completion of this
     * operation. For Redis (cluster mode disabled) replication groups, this is
     * the number of replica nodes in the replication group. For Redis (cluster
     * mode enabled) replication groups, this is the number of replica nodes in
     * each of the replication group's node groups.
     * </p>
     * <p>
     * The minimum number of replicas in a shard or replication group is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode disabled)
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is enabled: 1
     * </p>
     * </li>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is not enabled: 0
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): 0 (though you will not be able to failover
     * to a replica if your primary node fails)
     * </p>
     * </li>
     * </ul>
     */
    private Integer newReplicaCount;

    /**
     * <p>
     * A list of <code>ConfigureShard</code> objects that can be used to
     * configure each shard in a Redis (cluster mode enabled) replication group.
     * The <code>ConfigureShard</code> has three members:
     * <code>NewReplicaCount</code>, <code>NodeGroupId</code>, and
     * <code>PreferredAvailabilityZones</code>.
     * </p>
     */
    private java.util.List<ConfigureShard> replicaConfiguration;

    /**
     * <p>
     * A list of the node ids to remove from the replication group or node group
     * (shard).
     * </p>
     */
    private java.util.List<String> replicasToRemove;

    /**
     * <p>
     * If <code>True</code>, the number of replica nodes is decreased
     * immediately. <code>ApplyImmediately=False</code> is not currently
     * supported.
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * The id of the replication group from which you want to remove replica
     * nodes.
     * </p>
     *
     * @return <p>
     *         The id of the replication group from which you want to remove
     *         replica nodes.
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The id of the replication group from which you want to remove replica
     * nodes.
     * </p>
     *
     * @param replicationGroupId <p>
     *            The id of the replication group from which you want to remove
     *            replica nodes.
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The id of the replication group from which you want to remove replica
     * nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The id of the replication group from which you want to remove
     *            replica nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecreaseReplicaCountRequest withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * The number of read replica nodes you want at the completion of this
     * operation. For Redis (cluster mode disabled) replication groups, this is
     * the number of replica nodes in the replication group. For Redis (cluster
     * mode enabled) replication groups, this is the number of replica nodes in
     * each of the replication group's node groups.
     * </p>
     * <p>
     * The minimum number of replicas in a shard or replication group is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode disabled)
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is enabled: 1
     * </p>
     * </li>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is not enabled: 0
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): 0 (though you will not be able to failover
     * to a replica if your primary node fails)
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The number of read replica nodes you want at the completion of
     *         this operation. For Redis (cluster mode disabled) replication
     *         groups, this is the number of replica nodes in the replication
     *         group. For Redis (cluster mode enabled) replication groups, this
     *         is the number of replica nodes in each of the replication group's
     *         node groups.
     *         </p>
     *         <p>
     *         The minimum number of replicas in a shard or replication group
     *         is:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Redis (cluster mode disabled)
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If Multi-AZ with Automatic Failover is enabled: 1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If Multi-AZ with Automatic Failover is not enabled: 0
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Redis (cluster mode enabled): 0 (though you will not be able to
     *         failover to a replica if your primary node fails)
     *         </p>
     *         </li>
     *         </ul>
     */
    public Integer getNewReplicaCount() {
        return newReplicaCount;
    }

    /**
     * <p>
     * The number of read replica nodes you want at the completion of this
     * operation. For Redis (cluster mode disabled) replication groups, this is
     * the number of replica nodes in the replication group. For Redis (cluster
     * mode enabled) replication groups, this is the number of replica nodes in
     * each of the replication group's node groups.
     * </p>
     * <p>
     * The minimum number of replicas in a shard or replication group is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode disabled)
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is enabled: 1
     * </p>
     * </li>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is not enabled: 0
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): 0 (though you will not be able to failover
     * to a replica if your primary node fails)
     * </p>
     * </li>
     * </ul>
     *
     * @param newReplicaCount <p>
     *            The number of read replica nodes you want at the completion of
     *            this operation. For Redis (cluster mode disabled) replication
     *            groups, this is the number of replica nodes in the replication
     *            group. For Redis (cluster mode enabled) replication groups,
     *            this is the number of replica nodes in each of the replication
     *            group's node groups.
     *            </p>
     *            <p>
     *            The minimum number of replicas in a shard or replication group
     *            is:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Redis (cluster mode disabled)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If Multi-AZ with Automatic Failover is enabled: 1
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If Multi-AZ with Automatic Failover is not enabled: 0
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode enabled): 0 (though you will not be able
     *            to failover to a replica if your primary node fails)
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setNewReplicaCount(Integer newReplicaCount) {
        this.newReplicaCount = newReplicaCount;
    }

    /**
     * <p>
     * The number of read replica nodes you want at the completion of this
     * operation. For Redis (cluster mode disabled) replication groups, this is
     * the number of replica nodes in the replication group. For Redis (cluster
     * mode enabled) replication groups, this is the number of replica nodes in
     * each of the replication group's node groups.
     * </p>
     * <p>
     * The minimum number of replicas in a shard or replication group is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Redis (cluster mode disabled)
     * </p>
     * <ul>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is enabled: 1
     * </p>
     * </li>
     * <li>
     * <p>
     * If Multi-AZ with Automatic Failover is not enabled: 0
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Redis (cluster mode enabled): 0 (though you will not be able to failover
     * to a replica if your primary node fails)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newReplicaCount <p>
     *            The number of read replica nodes you want at the completion of
     *            this operation. For Redis (cluster mode disabled) replication
     *            groups, this is the number of replica nodes in the replication
     *            group. For Redis (cluster mode enabled) replication groups,
     *            this is the number of replica nodes in each of the replication
     *            group's node groups.
     *            </p>
     *            <p>
     *            The minimum number of replicas in a shard or replication group
     *            is:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Redis (cluster mode disabled)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If Multi-AZ with Automatic Failover is enabled: 1
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If Multi-AZ with Automatic Failover is not enabled: 0
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Redis (cluster mode enabled): 0 (though you will not be able
     *            to failover to a replica if your primary node fails)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecreaseReplicaCountRequest withNewReplicaCount(Integer newReplicaCount) {
        this.newReplicaCount = newReplicaCount;
        return this;
    }

    /**
     * <p>
     * A list of <code>ConfigureShard</code> objects that can be used to
     * configure each shard in a Redis (cluster mode enabled) replication group.
     * The <code>ConfigureShard</code> has three members:
     * <code>NewReplicaCount</code>, <code>NodeGroupId</code>, and
     * <code>PreferredAvailabilityZones</code>.
     * </p>
     *
     * @return <p>
     *         A list of <code>ConfigureShard</code> objects that can be used to
     *         configure each shard in a Redis (cluster mode enabled)
     *         replication group. The <code>ConfigureShard</code> has three
     *         members: <code>NewReplicaCount</code>, <code>NodeGroupId</code>,
     *         and <code>PreferredAvailabilityZones</code>.
     *         </p>
     */
    public java.util.List<ConfigureShard> getReplicaConfiguration() {
        return replicaConfiguration;
    }

    /**
     * <p>
     * A list of <code>ConfigureShard</code> objects that can be used to
     * configure each shard in a Redis (cluster mode enabled) replication group.
     * The <code>ConfigureShard</code> has three members:
     * <code>NewReplicaCount</code>, <code>NodeGroupId</code>, and
     * <code>PreferredAvailabilityZones</code>.
     * </p>
     *
     * @param replicaConfiguration <p>
     *            A list of <code>ConfigureShard</code> objects that can be used
     *            to configure each shard in a Redis (cluster mode enabled)
     *            replication group. The <code>ConfigureShard</code> has three
     *            members: <code>NewReplicaCount</code>,
     *            <code>NodeGroupId</code>, and
     *            <code>PreferredAvailabilityZones</code>.
     *            </p>
     */
    public void setReplicaConfiguration(java.util.Collection<ConfigureShard> replicaConfiguration) {
        if (replicaConfiguration == null) {
            this.replicaConfiguration = null;
            return;
        }

        this.replicaConfiguration = new java.util.ArrayList<ConfigureShard>(replicaConfiguration);
    }

    /**
     * <p>
     * A list of <code>ConfigureShard</code> objects that can be used to
     * configure each shard in a Redis (cluster mode enabled) replication group.
     * The <code>ConfigureShard</code> has three members:
     * <code>NewReplicaCount</code>, <code>NodeGroupId</code>, and
     * <code>PreferredAvailabilityZones</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaConfiguration <p>
     *            A list of <code>ConfigureShard</code> objects that can be used
     *            to configure each shard in a Redis (cluster mode enabled)
     *            replication group. The <code>ConfigureShard</code> has three
     *            members: <code>NewReplicaCount</code>,
     *            <code>NodeGroupId</code>, and
     *            <code>PreferredAvailabilityZones</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecreaseReplicaCountRequest withReplicaConfiguration(
            ConfigureShard... replicaConfiguration) {
        if (getReplicaConfiguration() == null) {
            this.replicaConfiguration = new java.util.ArrayList<ConfigureShard>(
                    replicaConfiguration.length);
        }
        for (ConfigureShard value : replicaConfiguration) {
            this.replicaConfiguration.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ConfigureShard</code> objects that can be used to
     * configure each shard in a Redis (cluster mode enabled) replication group.
     * The <code>ConfigureShard</code> has three members:
     * <code>NewReplicaCount</code>, <code>NodeGroupId</code>, and
     * <code>PreferredAvailabilityZones</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaConfiguration <p>
     *            A list of <code>ConfigureShard</code> objects that can be used
     *            to configure each shard in a Redis (cluster mode enabled)
     *            replication group. The <code>ConfigureShard</code> has three
     *            members: <code>NewReplicaCount</code>,
     *            <code>NodeGroupId</code>, and
     *            <code>PreferredAvailabilityZones</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecreaseReplicaCountRequest withReplicaConfiguration(
            java.util.Collection<ConfigureShard> replicaConfiguration) {
        setReplicaConfiguration(replicaConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of the node ids to remove from the replication group or node group
     * (shard).
     * </p>
     *
     * @return <p>
     *         A list of the node ids to remove from the replication group or
     *         node group (shard).
     *         </p>
     */
    public java.util.List<String> getReplicasToRemove() {
        return replicasToRemove;
    }

    /**
     * <p>
     * A list of the node ids to remove from the replication group or node group
     * (shard).
     * </p>
     *
     * @param replicasToRemove <p>
     *            A list of the node ids to remove from the replication group or
     *            node group (shard).
     *            </p>
     */
    public void setReplicasToRemove(java.util.Collection<String> replicasToRemove) {
        if (replicasToRemove == null) {
            this.replicasToRemove = null;
            return;
        }

        this.replicasToRemove = new java.util.ArrayList<String>(replicasToRemove);
    }

    /**
     * <p>
     * A list of the node ids to remove from the replication group or node group
     * (shard).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicasToRemove <p>
     *            A list of the node ids to remove from the replication group or
     *            node group (shard).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecreaseReplicaCountRequest withReplicasToRemove(String... replicasToRemove) {
        if (getReplicasToRemove() == null) {
            this.replicasToRemove = new java.util.ArrayList<String>(replicasToRemove.length);
        }
        for (String value : replicasToRemove) {
            this.replicasToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the node ids to remove from the replication group or node group
     * (shard).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicasToRemove <p>
     *            A list of the node ids to remove from the replication group or
     *            node group (shard).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecreaseReplicaCountRequest withReplicasToRemove(
            java.util.Collection<String> replicasToRemove) {
        setReplicasToRemove(replicasToRemove);
        return this;
    }

    /**
     * <p>
     * If <code>True</code>, the number of replica nodes is decreased
     * immediately. <code>ApplyImmediately=False</code> is not currently
     * supported.
     * </p>
     *
     * @return <p>
     *         If <code>True</code>, the number of replica nodes is decreased
     *         immediately. <code>ApplyImmediately=False</code> is not currently
     *         supported.
     *         </p>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * If <code>True</code>, the number of replica nodes is decreased
     * immediately. <code>ApplyImmediately=False</code> is not currently
     * supported.
     * </p>
     *
     * @return <p>
     *         If <code>True</code>, the number of replica nodes is decreased
     *         immediately. <code>ApplyImmediately=False</code> is not currently
     *         supported.
     *         </p>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * If <code>True</code>, the number of replica nodes is decreased
     * immediately. <code>ApplyImmediately=False</code> is not currently
     * supported.
     * </p>
     *
     * @param applyImmediately <p>
     *            If <code>True</code>, the number of replica nodes is decreased
     *            immediately. <code>ApplyImmediately=False</code> is not
     *            currently supported.
     *            </p>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * If <code>True</code>, the number of replica nodes is decreased
     * immediately. <code>ApplyImmediately=False</code> is not currently
     * supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyImmediately <p>
     *            If <code>True</code>, the number of replica nodes is decreased
     *            immediately. <code>ApplyImmediately=False</code> is not
     *            currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecreaseReplicaCountRequest withApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getNewReplicaCount() != null)
            sb.append("NewReplicaCount: " + getNewReplicaCount() + ",");
        if (getReplicaConfiguration() != null)
            sb.append("ReplicaConfiguration: " + getReplicaConfiguration() + ",");
        if (getReplicasToRemove() != null)
            sb.append("ReplicasToRemove: " + getReplicasToRemove() + ",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: " + getApplyImmediately());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getNewReplicaCount() == null) ? 0 : getNewReplicaCount().hashCode());
        hashCode = prime * hashCode
                + ((getReplicaConfiguration() == null) ? 0 : getReplicaConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getReplicasToRemove() == null) ? 0 : getReplicasToRemove().hashCode());
        hashCode = prime * hashCode
                + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecreaseReplicaCountRequest == false)
            return false;
        DecreaseReplicaCountRequest other = (DecreaseReplicaCountRequest) obj;

        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getNewReplicaCount() == null ^ this.getNewReplicaCount() == null)
            return false;
        if (other.getNewReplicaCount() != null
                && other.getNewReplicaCount().equals(this.getNewReplicaCount()) == false)
            return false;
        if (other.getReplicaConfiguration() == null ^ this.getReplicaConfiguration() == null)
            return false;
        if (other.getReplicaConfiguration() != null
                && other.getReplicaConfiguration().equals(this.getReplicaConfiguration()) == false)
            return false;
        if (other.getReplicasToRemove() == null ^ this.getReplicasToRemove() == null)
            return false;
        if (other.getReplicasToRemove() != null
                && other.getReplicasToRemove().equals(this.getReplicasToRemove()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null
                && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        return true;
    }
}