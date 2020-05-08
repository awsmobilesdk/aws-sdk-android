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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Member
 */
class MemberJsonMarshaller {

    public void marshall(Member member, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (member.getAccountId() != null) {
            String accountId = member.getAccountId();
            jsonWriter.name("AccountId");
            jsonWriter.value(accountId);
        }
        if (member.getDetectorId() != null) {
            String detectorId = member.getDetectorId();
            jsonWriter.name("DetectorId");
            jsonWriter.value(detectorId);
        }
        if (member.getMasterId() != null) {
            String masterId = member.getMasterId();
            jsonWriter.name("MasterId");
            jsonWriter.value(masterId);
        }
        if (member.getEmail() != null) {
            String email = member.getEmail();
            jsonWriter.name("Email");
            jsonWriter.value(email);
        }
        if (member.getRelationshipStatus() != null) {
            String relationshipStatus = member.getRelationshipStatus();
            jsonWriter.name("RelationshipStatus");
            jsonWriter.value(relationshipStatus);
        }
        if (member.getInvitedAt() != null) {
            String invitedAt = member.getInvitedAt();
            jsonWriter.name("InvitedAt");
            jsonWriter.value(invitedAt);
        }
        if (member.getUpdatedAt() != null) {
            String updatedAt = member.getUpdatedAt();
            jsonWriter.name("UpdatedAt");
            jsonWriter.value(updatedAt);
        }
        jsonWriter.endObject();
    }

    private static MemberJsonMarshaller instance;

    public static MemberJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MemberJsonMarshaller();
        return instance;
    }
}
