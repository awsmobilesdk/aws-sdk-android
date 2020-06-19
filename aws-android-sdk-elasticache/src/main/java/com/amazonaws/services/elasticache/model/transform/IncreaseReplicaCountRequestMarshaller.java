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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for IncreaseReplicaCountRequest
 */
public class IncreaseReplicaCountRequestMarshaller implements
        Marshaller<Request<IncreaseReplicaCountRequest>, IncreaseReplicaCountRequest> {

    public Request<IncreaseReplicaCountRequest> marshall(
            IncreaseReplicaCountRequest increaseReplicaCountRequest) {
        if (increaseReplicaCountRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(IncreaseReplicaCountRequest)");
        }

        Request<IncreaseReplicaCountRequest> request = new DefaultRequest<IncreaseReplicaCountRequest>(
                increaseReplicaCountRequest, "AmazonElastiCache");
        request.addParameter("Action", "IncreaseReplicaCount");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (increaseReplicaCountRequest.getReplicationGroupId() != null) {
            prefix = "ReplicationGroupId";
            String replicationGroupId = increaseReplicaCountRequest.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (increaseReplicaCountRequest.getNewReplicaCount() != null) {
            prefix = "NewReplicaCount";
            Integer newReplicaCount = increaseReplicaCountRequest.getNewReplicaCount();
            request.addParameter(prefix, StringUtils.fromInteger(newReplicaCount));
        }
        if (increaseReplicaCountRequest.getReplicaConfiguration() != null) {
            prefix = "ReplicaConfiguration";
            java.util.List<ConfigureShard> replicaConfiguration = increaseReplicaCountRequest
                    .getReplicaConfiguration();
            int replicaConfigurationIndex = 1;
            String replicaConfigurationPrefix = prefix;
            for (ConfigureShard replicaConfigurationItem : replicaConfiguration) {
                prefix = replicaConfigurationPrefix + "." + replicaConfigurationIndex;
                if (replicaConfigurationItem != null) {
                    ConfigureShardStaxMarshaller.getInstance().marshall(replicaConfigurationItem,
                            request, prefix + ".");
                }
                replicaConfigurationIndex++;
            }
            prefix = replicaConfigurationPrefix;
        }
        if (increaseReplicaCountRequest.getApplyImmediately() != null) {
            prefix = "ApplyImmediately";
            Boolean applyImmediately = increaseReplicaCountRequest.getApplyImmediately();
            request.addParameter(prefix, StringUtils.fromBoolean(applyImmediately));
        }

        return request;
    }
}