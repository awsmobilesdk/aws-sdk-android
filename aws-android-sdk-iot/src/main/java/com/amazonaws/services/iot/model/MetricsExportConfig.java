/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Set configurations for metrics export.
 * </p>
 */
public class MetricsExportConfig implements Serializable {
    /**
     * <p>
     * The MQTT topic that Device Defender Detect should publish messages to for
     * metrics export.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String mqttTopic;

    /**
     * <p>
     * This role ARN has permission to publish MQTT messages, after which Device
     * Defender Detect can assume the role and publish messages on your behalf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The MQTT topic that Device Defender Detect should publish messages to for
     * metrics export.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         The MQTT topic that Device Defender Detect should publish
     *         messages to for metrics export.
     *         </p>
     */
    public String getMqttTopic() {
        return mqttTopic;
    }

    /**
     * <p>
     * The MQTT topic that Device Defender Detect should publish messages to for
     * metrics export.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param mqttTopic <p>
     *            The MQTT topic that Device Defender Detect should publish
     *            messages to for metrics export.
     *            </p>
     */
    public void setMqttTopic(String mqttTopic) {
        this.mqttTopic = mqttTopic;
    }

    /**
     * <p>
     * The MQTT topic that Device Defender Detect should publish messages to for
     * metrics export.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param mqttTopic <p>
     *            The MQTT topic that Device Defender Detect should publish
     *            messages to for metrics export.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricsExportConfig withMqttTopic(String mqttTopic) {
        this.mqttTopic = mqttTopic;
        return this;
    }

    /**
     * <p>
     * This role ARN has permission to publish MQTT messages, after which Device
     * Defender Detect can assume the role and publish messages on your behalf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         This role ARN has permission to publish MQTT messages, after
     *         which Device Defender Detect can assume the role and publish
     *         messages on your behalf.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * This role ARN has permission to publish MQTT messages, after which Device
     * Defender Detect can assume the role and publish messages on your behalf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            This role ARN has permission to publish MQTT messages, after
     *            which Device Defender Detect can assume the role and publish
     *            messages on your behalf.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * This role ARN has permission to publish MQTT messages, after which Device
     * Defender Detect can assume the role and publish messages on your behalf.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            This role ARN has permission to publish MQTT messages, after
     *            which Device Defender Detect can assume the role and publish
     *            messages on your behalf.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricsExportConfig withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getMqttTopic() != null)
            sb.append("mqttTopic: " + getMqttTopic() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMqttTopic() == null) ? 0 : getMqttTopic().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricsExportConfig == false)
            return false;
        MetricsExportConfig other = (MetricsExportConfig) obj;

        if (other.getMqttTopic() == null ^ this.getMqttTopic() == null)
            return false;
        if (other.getMqttTopic() != null
                && other.getMqttTopic().equals(this.getMqttTopic()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
