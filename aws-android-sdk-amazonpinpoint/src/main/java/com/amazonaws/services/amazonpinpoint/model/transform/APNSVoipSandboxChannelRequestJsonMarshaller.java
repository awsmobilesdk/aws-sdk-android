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
 * JSON marshaller for POJO APNSVoipSandboxChannelRequest
 */
class APNSVoipSandboxChannelRequestJsonMarshaller {

    public void marshall(APNSVoipSandboxChannelRequest aPNSVoipSandboxChannelRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (aPNSVoipSandboxChannelRequest.getBundleId() != null) {
            String bundleId = aPNSVoipSandboxChannelRequest.getBundleId();
            jsonWriter.name("BundleId");
            jsonWriter.value(bundleId);
        }
        if (aPNSVoipSandboxChannelRequest.getCertificate() != null) {
            String certificate = aPNSVoipSandboxChannelRequest.getCertificate();
            jsonWriter.name("Certificate");
            jsonWriter.value(certificate);
        }
        if (aPNSVoipSandboxChannelRequest.getDefaultAuthenticationMethod() != null) {
            String defaultAuthenticationMethod = aPNSVoipSandboxChannelRequest
                    .getDefaultAuthenticationMethod();
            jsonWriter.name("DefaultAuthenticationMethod");
            jsonWriter.value(defaultAuthenticationMethod);
        }
        if (aPNSVoipSandboxChannelRequest.getEnabled() != null) {
            Boolean enabled = aPNSVoipSandboxChannelRequest.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (aPNSVoipSandboxChannelRequest.getPrivateKey() != null) {
            String privateKey = aPNSVoipSandboxChannelRequest.getPrivateKey();
            jsonWriter.name("PrivateKey");
            jsonWriter.value(privateKey);
        }
        if (aPNSVoipSandboxChannelRequest.getTeamId() != null) {
            String teamId = aPNSVoipSandboxChannelRequest.getTeamId();
            jsonWriter.name("TeamId");
            jsonWriter.value(teamId);
        }
        if (aPNSVoipSandboxChannelRequest.getTokenKey() != null) {
            String tokenKey = aPNSVoipSandboxChannelRequest.getTokenKey();
            jsonWriter.name("TokenKey");
            jsonWriter.value(tokenKey);
        }
        if (aPNSVoipSandboxChannelRequest.getTokenKeyId() != null) {
            String tokenKeyId = aPNSVoipSandboxChannelRequest.getTokenKeyId();
            jsonWriter.name("TokenKeyId");
            jsonWriter.value(tokenKeyId);
        }
        jsonWriter.endObject();
    }

    private static APNSVoipSandboxChannelRequestJsonMarshaller instance;

    public static APNSVoipSandboxChannelRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new APNSVoipSandboxChannelRequestJsonMarshaller();
        return instance;
    }
}
