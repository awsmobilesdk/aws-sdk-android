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
 * StAX request marshaller for ModifyCacheParameterGroupRequest
 */
public class ModifyCacheParameterGroupRequestMarshaller implements
        Marshaller<Request<ModifyCacheParameterGroupRequest>, ModifyCacheParameterGroupRequest> {

    public Request<ModifyCacheParameterGroupRequest> marshall(
            ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest) {
        if (modifyCacheParameterGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyCacheParameterGroupRequest)");
        }

        Request<ModifyCacheParameterGroupRequest> request = new DefaultRequest<ModifyCacheParameterGroupRequest>(
                modifyCacheParameterGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyCacheParameterGroup");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (modifyCacheParameterGroupRequest.getCacheParameterGroupName() != null) {
            prefix = "CacheParameterGroupName";
            String cacheParameterGroupName = modifyCacheParameterGroupRequest
                    .getCacheParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupName));
        }
        if (modifyCacheParameterGroupRequest.getParameterNameValues() != null) {
            prefix = "ParameterNameValues";
            java.util.List<ParameterNameValue> parameterNameValues = modifyCacheParameterGroupRequest
                    .getParameterNameValues();
            int parameterNameValuesIndex = 1;
            String parameterNameValuesPrefix = prefix;
            for (ParameterNameValue parameterNameValuesItem : parameterNameValues) {
                prefix = parameterNameValuesPrefix + "." + parameterNameValuesIndex;
                if (parameterNameValuesItem != null) {
                    ParameterNameValueStaxMarshaller.getInstance().marshall(
                            parameterNameValuesItem, request, prefix + ".");
                }
                parameterNameValuesIndex++;
            }
            prefix = parameterNameValuesPrefix;
        }

        return request;
    }
}