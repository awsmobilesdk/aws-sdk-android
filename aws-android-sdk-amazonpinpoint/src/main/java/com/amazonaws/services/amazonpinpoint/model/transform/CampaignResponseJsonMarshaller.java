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

package com.amazonaws.services.amazonpinpoint.model.transform;

import com.amazonaws.services.amazonpinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CampaignResponse
 */
class CampaignResponseJsonMarshaller {

    public void marshall(CampaignResponse campaignResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (campaignResponse.getAdditionalTreatments() != null) {
            java.util.List<TreatmentResource> additionalTreatments = campaignResponse
                    .getAdditionalTreatments();
            jsonWriter.name("AdditionalTreatments");
            jsonWriter.beginArray();
            for (TreatmentResource additionalTreatmentsItem : additionalTreatments) {
                if (additionalTreatmentsItem != null) {
                    TreatmentResourceJsonMarshaller.getInstance().marshall(
                            additionalTreatmentsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (campaignResponse.getApplicationId() != null) {
            String applicationId = campaignResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (campaignResponse.getArn() != null) {
            String arn = campaignResponse.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (campaignResponse.getCreationDate() != null) {
            String creationDate = campaignResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (campaignResponse.getCustomDeliveryConfiguration() != null) {
            CustomDeliveryConfiguration customDeliveryConfiguration = campaignResponse
                    .getCustomDeliveryConfiguration();
            jsonWriter.name("CustomDeliveryConfiguration");
            CustomDeliveryConfigurationJsonMarshaller.getInstance().marshall(
                    customDeliveryConfiguration, jsonWriter);
        }
        if (campaignResponse.getDefaultState() != null) {
            CampaignState defaultState = campaignResponse.getDefaultState();
            jsonWriter.name("DefaultState");
            CampaignStateJsonMarshaller.getInstance().marshall(defaultState, jsonWriter);
        }
        if (campaignResponse.getDescription() != null) {
            String description = campaignResponse.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (campaignResponse.getHoldoutPercent() != null) {
            Integer holdoutPercent = campaignResponse.getHoldoutPercent();
            jsonWriter.name("HoldoutPercent");
            jsonWriter.value(holdoutPercent);
        }
        if (campaignResponse.getHook() != null) {
            CampaignHook hook = campaignResponse.getHook();
            jsonWriter.name("Hook");
            CampaignHookJsonMarshaller.getInstance().marshall(hook, jsonWriter);
        }
        if (campaignResponse.getId() != null) {
            String id = campaignResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (campaignResponse.getIsPaused() != null) {
            Boolean isPaused = campaignResponse.getIsPaused();
            jsonWriter.name("IsPaused");
            jsonWriter.value(isPaused);
        }
        if (campaignResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = campaignResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (campaignResponse.getLimits() != null) {
            CampaignLimits limits = campaignResponse.getLimits();
            jsonWriter.name("Limits");
            CampaignLimitsJsonMarshaller.getInstance().marshall(limits, jsonWriter);
        }
        if (campaignResponse.getMessageConfiguration() != null) {
            MessageConfiguration messageConfiguration = campaignResponse.getMessageConfiguration();
            jsonWriter.name("MessageConfiguration");
            MessageConfigurationJsonMarshaller.getInstance().marshall(messageConfiguration,
                    jsonWriter);
        }
        if (campaignResponse.getName() != null) {
            String name = campaignResponse.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (campaignResponse.getSchedule() != null) {
            Schedule schedule = campaignResponse.getSchedule();
            jsonWriter.name("Schedule");
            ScheduleJsonMarshaller.getInstance().marshall(schedule, jsonWriter);
        }
        if (campaignResponse.getSegmentId() != null) {
            String segmentId = campaignResponse.getSegmentId();
            jsonWriter.name("SegmentId");
            jsonWriter.value(segmentId);
        }
        if (campaignResponse.getSegmentVersion() != null) {
            Integer segmentVersion = campaignResponse.getSegmentVersion();
            jsonWriter.name("SegmentVersion");
            jsonWriter.value(segmentVersion);
        }
        if (campaignResponse.getState() != null) {
            CampaignState state = campaignResponse.getState();
            jsonWriter.name("State");
            CampaignStateJsonMarshaller.getInstance().marshall(state, jsonWriter);
        }
        if (campaignResponse.getTags() != null) {
            java.util.Map<String, String> tags = campaignResponse.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (campaignResponse.getTemplateConfiguration() != null) {
            TemplateConfiguration templateConfiguration = campaignResponse
                    .getTemplateConfiguration();
            jsonWriter.name("TemplateConfiguration");
            TemplateConfigurationJsonMarshaller.getInstance().marshall(templateConfiguration,
                    jsonWriter);
        }
        if (campaignResponse.getTreatmentDescription() != null) {
            String treatmentDescription = campaignResponse.getTreatmentDescription();
            jsonWriter.name("TreatmentDescription");
            jsonWriter.value(treatmentDescription);
        }
        if (campaignResponse.getTreatmentName() != null) {
            String treatmentName = campaignResponse.getTreatmentName();
            jsonWriter.name("TreatmentName");
            jsonWriter.value(treatmentName);
        }
        if (campaignResponse.getVersion() != null) {
            Integer version = campaignResponse.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static CampaignResponseJsonMarshaller instance;

    public static CampaignResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CampaignResponseJsonMarshaller();
        return instance;
    }
}