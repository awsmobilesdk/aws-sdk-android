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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ServiceRegistry
 */
class ServiceRegistryJsonMarshaller {

    public void marshall(ServiceRegistry serviceRegistry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (serviceRegistry.getRegistryArn() != null) {
            String registryArn = serviceRegistry.getRegistryArn();
            jsonWriter.name("registryArn");
            jsonWriter.value(registryArn);
        }
        if (serviceRegistry.getPort() != null) {
            Integer port = serviceRegistry.getPort();
            jsonWriter.name("port");
            jsonWriter.value(port);
        }
        if (serviceRegistry.getContainerName() != null) {
            String containerName = serviceRegistry.getContainerName();
            jsonWriter.name("containerName");
            jsonWriter.value(containerName);
        }
        if (serviceRegistry.getContainerPort() != null) {
            Integer containerPort = serviceRegistry.getContainerPort();
            jsonWriter.name("containerPort");
            jsonWriter.value(containerPort);
        }
        jsonWriter.endObject();
    }

    private static ServiceRegistryJsonMarshaller instance;

    public static ServiceRegistryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceRegistryJsonMarshaller();
        return instance;
    }
}