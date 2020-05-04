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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO FleetLaunchTemplateOverrides
 */
class FleetLaunchTemplateOverridesJsonUnmarshaller implements
        Unmarshaller<FleetLaunchTemplateOverrides, JsonUnmarshallerContext> {

    public FleetLaunchTemplateOverrides unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FleetLaunchTemplateOverrides fleetLaunchTemplateOverrides = new FleetLaunchTemplateOverrides();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InstanceType")) {
                fleetLaunchTemplateOverrides.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxPrice")) {
                fleetLaunchTemplateOverrides.setMaxPrice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                fleetLaunchTemplateOverrides.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZone")) {
                fleetLaunchTemplateOverrides.setAvailabilityZone(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("WeightedCapacity")) {
                fleetLaunchTemplateOverrides.setWeightedCapacity(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Priority")) {
                fleetLaunchTemplateOverrides.setPriority(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Placement")) {
                fleetLaunchTemplateOverrides.setPlacement(PlacementResponseJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return fleetLaunchTemplateOverrides;
    }

    private static FleetLaunchTemplateOverridesJsonUnmarshaller instance;

    public static FleetLaunchTemplateOverridesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FleetLaunchTemplateOverridesJsonUnmarshaller();
        return instance;
    }
}