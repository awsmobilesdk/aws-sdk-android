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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO
 * LaunchTemplateCapacityReservationSpecificationResponse
 */
class LaunchTemplateCapacityReservationSpecificationResponseJsonMarshaller {

    public void marshall(
            LaunchTemplateCapacityReservationSpecificationResponse launchTemplateCapacityReservationSpecificationResponse,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateCapacityReservationSpecificationResponse
                .getCapacityReservationPreference() != null) {
            String capacityReservationPreference = launchTemplateCapacityReservationSpecificationResponse
                    .getCapacityReservationPreference();
            jsonWriter.name("CapacityReservationPreference");
            jsonWriter.value(capacityReservationPreference);
        }
        if (launchTemplateCapacityReservationSpecificationResponse.getCapacityReservationTarget() != null) {
            CapacityReservationTargetResponse capacityReservationTarget = launchTemplateCapacityReservationSpecificationResponse
                    .getCapacityReservationTarget();
            jsonWriter.name("CapacityReservationTarget");
            CapacityReservationTargetResponseJsonMarshaller.getInstance().marshall(
                    capacityReservationTarget, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateCapacityReservationSpecificationResponseJsonMarshaller instance;

    public static LaunchTemplateCapacityReservationSpecificationResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateCapacityReservationSpecificationResponseJsonMarshaller();
        return instance;
    }
}