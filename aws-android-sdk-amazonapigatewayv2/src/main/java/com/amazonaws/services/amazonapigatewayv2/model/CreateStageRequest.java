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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a Stage for an API.
 * </p>
 */
public class CreateStageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Settings for logging access in this stage.
     * </p>
     */
    private AccessLogSettings accessLogSettings;

    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;

    /**
     * <p>
     * Specifies whether updates to an API automatically trigger a new
     * deployment. The default value is false.
     * </p>
     */
    private Boolean autoDeploy;

    /**
     * <p>
     * The identifier of a client certificate for a Stage. Supported only for
     * WebSocket APIs.
     * </p>
     */
    private String clientCertificateId;

    /**
     * <p>
     * The default route settings for the stage.
     * </p>
     */
    private RouteSettings defaultRouteSettings;

    /**
     * <p>
     * The deployment identifier of the API stage.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * The description for the API stage.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Route settings for the stage, by routeKey.
     * </p>
     */
    private java.util.Map<String, RouteSettings> routeSettings;

    /**
     * <p>
     * The name of the stage.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * A map that defines the stage variables for a Stage. Variable names can
     * have alphanumeric and underscore characters, and the values must match
     * [A-Za-z0-9-._~:/?#&amp;=,]+.
     * </p>
     */
    private java.util.Map<String, String> stageVariables;

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Settings for logging access in this stage.
     * </p>
     *
     * @return <p>
     *         Settings for logging access in this stage.
     *         </p>
     */
    public AccessLogSettings getAccessLogSettings() {
        return accessLogSettings;
    }

    /**
     * <p>
     * Settings for logging access in this stage.
     * </p>
     *
     * @param accessLogSettings <p>
     *            Settings for logging access in this stage.
     *            </p>
     */
    public void setAccessLogSettings(AccessLogSettings accessLogSettings) {
        this.accessLogSettings = accessLogSettings;
    }

    /**
     * <p>
     * Settings for logging access in this stage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessLogSettings <p>
     *            Settings for logging access in this stage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withAccessLogSettings(AccessLogSettings accessLogSettings) {
        this.accessLogSettings = accessLogSettings;
        return this;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     *
     * @return <p>
     *         The API identifier.
     *         </p>
     */
    public String getApiId() {
        return apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     *
     * @param apiId <p>
     *            The API identifier.
     *            </p>
     */
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiId <p>
     *            The API identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * <p>
     * Specifies whether updates to an API automatically trigger a new
     * deployment. The default value is false.
     * </p>
     *
     * @return <p>
     *         Specifies whether updates to an API automatically trigger a new
     *         deployment. The default value is false.
     *         </p>
     */
    public Boolean isAutoDeploy() {
        return autoDeploy;
    }

    /**
     * <p>
     * Specifies whether updates to an API automatically trigger a new
     * deployment. The default value is false.
     * </p>
     *
     * @return <p>
     *         Specifies whether updates to an API automatically trigger a new
     *         deployment. The default value is false.
     *         </p>
     */
    public Boolean getAutoDeploy() {
        return autoDeploy;
    }

    /**
     * <p>
     * Specifies whether updates to an API automatically trigger a new
     * deployment. The default value is false.
     * </p>
     *
     * @param autoDeploy <p>
     *            Specifies whether updates to an API automatically trigger a
     *            new deployment. The default value is false.
     *            </p>
     */
    public void setAutoDeploy(Boolean autoDeploy) {
        this.autoDeploy = autoDeploy;
    }

    /**
     * <p>
     * Specifies whether updates to an API automatically trigger a new
     * deployment. The default value is false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoDeploy <p>
     *            Specifies whether updates to an API automatically trigger a
     *            new deployment. The default value is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withAutoDeploy(Boolean autoDeploy) {
        this.autoDeploy = autoDeploy;
        return this;
    }

    /**
     * <p>
     * The identifier of a client certificate for a Stage. Supported only for
     * WebSocket APIs.
     * </p>
     *
     * @return <p>
     *         The identifier of a client certificate for a Stage. Supported
     *         only for WebSocket APIs.
     *         </p>
     */
    public String getClientCertificateId() {
        return clientCertificateId;
    }

    /**
     * <p>
     * The identifier of a client certificate for a Stage. Supported only for
     * WebSocket APIs.
     * </p>
     *
     * @param clientCertificateId <p>
     *            The identifier of a client certificate for a Stage. Supported
     *            only for WebSocket APIs.
     *            </p>
     */
    public void setClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    /**
     * <p>
     * The identifier of a client certificate for a Stage. Supported only for
     * WebSocket APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientCertificateId <p>
     *            The identifier of a client certificate for a Stage. Supported
     *            only for WebSocket APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
        return this;
    }

    /**
     * <p>
     * The default route settings for the stage.
     * </p>
     *
     * @return <p>
     *         The default route settings for the stage.
     *         </p>
     */
    public RouteSettings getDefaultRouteSettings() {
        return defaultRouteSettings;
    }

    /**
     * <p>
     * The default route settings for the stage.
     * </p>
     *
     * @param defaultRouteSettings <p>
     *            The default route settings for the stage.
     *            </p>
     */
    public void setDefaultRouteSettings(RouteSettings defaultRouteSettings) {
        this.defaultRouteSettings = defaultRouteSettings;
    }

    /**
     * <p>
     * The default route settings for the stage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultRouteSettings <p>
     *            The default route settings for the stage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withDefaultRouteSettings(RouteSettings defaultRouteSettings) {
        this.defaultRouteSettings = defaultRouteSettings;
        return this;
    }

    /**
     * <p>
     * The deployment identifier of the API stage.
     * </p>
     *
     * @return <p>
     *         The deployment identifier of the API stage.
     *         </p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * The deployment identifier of the API stage.
     * </p>
     *
     * @param deploymentId <p>
     *            The deployment identifier of the API stage.
     *            </p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The deployment identifier of the API stage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            The deployment identifier of the API stage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * The description for the API stage.
     * </p>
     *
     * @return <p>
     *         The description for the API stage.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for the API stage.
     * </p>
     *
     * @param description <p>
     *            The description for the API stage.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the API stage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description for the API stage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Route settings for the stage, by routeKey.
     * </p>
     *
     * @return <p>
     *         Route settings for the stage, by routeKey.
     *         </p>
     */
    public java.util.Map<String, RouteSettings> getRouteSettings() {
        return routeSettings;
    }

    /**
     * <p>
     * Route settings for the stage, by routeKey.
     * </p>
     *
     * @param routeSettings <p>
     *            Route settings for the stage, by routeKey.
     *            </p>
     */
    public void setRouteSettings(java.util.Map<String, RouteSettings> routeSettings) {
        this.routeSettings = routeSettings;
    }

    /**
     * <p>
     * Route settings for the stage, by routeKey.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeSettings <p>
     *            Route settings for the stage, by routeKey.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withRouteSettings(java.util.Map<String, RouteSettings> routeSettings) {
        this.routeSettings = routeSettings;
        return this;
    }

    /**
     * <p>
     * Route settings for the stage, by routeKey.
     * </p>
     * <p>
     * The method adds a new key-value pair into RouteSettings parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into RouteSettings.
     * @param value The corresponding value of the entry to be added into
     *            RouteSettings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest addRouteSettingsEntry(String key, RouteSettings value) {
        if (null == this.routeSettings) {
            this.routeSettings = new java.util.HashMap<String, RouteSettings>();
        }
        if (this.routeSettings.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.routeSettings.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RouteSettings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateStageRequest clearRouteSettingsEntries() {
        this.routeSettings = null;
        return this;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     *
     * @return <p>
     *         The name of the stage.
     *         </p>
     */
    public String getStageName() {
        return stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     *
     * @param stageName <p>
     *            The name of the stage.
     *            </p>
     */
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stageName <p>
     *            The name of the stage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * <p>
     * A map that defines the stage variables for a Stage. Variable names can
     * have alphanumeric and underscore characters, and the values must match
     * [A-Za-z0-9-._~:/?#&amp;=,]+.
     * </p>
     *
     * @return <p>
     *         A map that defines the stage variables for a Stage. Variable
     *         names can have alphanumeric and underscore characters, and the
     *         values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
     *         </p>
     */
    public java.util.Map<String, String> getStageVariables() {
        return stageVariables;
    }

    /**
     * <p>
     * A map that defines the stage variables for a Stage. Variable names can
     * have alphanumeric and underscore characters, and the values must match
     * [A-Za-z0-9-._~:/?#&amp;=,]+.
     * </p>
     *
     * @param stageVariables <p>
     *            A map that defines the stage variables for a Stage. Variable
     *            names can have alphanumeric and underscore characters, and the
     *            values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
     *            </p>
     */
    public void setStageVariables(java.util.Map<String, String> stageVariables) {
        this.stageVariables = stageVariables;
    }

    /**
     * <p>
     * A map that defines the stage variables for a Stage. Variable names can
     * have alphanumeric and underscore characters, and the values must match
     * [A-Za-z0-9-._~:/?#&amp;=,]+.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stageVariables <p>
     *            A map that defines the stage variables for a Stage. Variable
     *            names can have alphanumeric and underscore characters, and the
     *            values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withStageVariables(java.util.Map<String, String> stageVariables) {
        this.stageVariables = stageVariables;
        return this;
    }

    /**
     * <p>
     * A map that defines the stage variables for a Stage. Variable names can
     * have alphanumeric and underscore characters, and the values must match
     * [A-Za-z0-9-._~:/?#&amp;=,]+.
     * </p>
     * <p>
     * The method adds a new key-value pair into StageVariables parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into StageVariables.
     * @param value The corresponding value of the entry to be added into
     *            StageVariables.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest addStageVariablesEntry(String key, String value) {
        if (null == this.stageVariables) {
            this.stageVariables = new java.util.HashMap<String, String>();
        }
        if (this.stageVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.stageVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StageVariables.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateStageRequest clearStageVariablesEntries() {
        this.stageVariables = null;
        return this;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     *
     * @return <p>
     *         The collection of tags. Each tag element is associated with a
     *         given resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     *
     * @param tags <p>
     *            The collection of tags. Each tag element is associated with a
     *            given resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The collection of tags. Each tag element is associated with a
     *            given resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateStageRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAccessLogSettings() != null)
            sb.append("AccessLogSettings: " + getAccessLogSettings() + ",");
        if (getApiId() != null)
            sb.append("ApiId: " + getApiId() + ",");
        if (getAutoDeploy() != null)
            sb.append("AutoDeploy: " + getAutoDeploy() + ",");
        if (getClientCertificateId() != null)
            sb.append("ClientCertificateId: " + getClientCertificateId() + ",");
        if (getDefaultRouteSettings() != null)
            sb.append("DefaultRouteSettings: " + getDefaultRouteSettings() + ",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: " + getDeploymentId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getRouteSettings() != null)
            sb.append("RouteSettings: " + getRouteSettings() + ",");
        if (getStageName() != null)
            sb.append("StageName: " + getStageName() + ",");
        if (getStageVariables() != null)
            sb.append("StageVariables: " + getStageVariables() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessLogSettings() == null) ? 0 : getAccessLogSettings().hashCode());
        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getAutoDeploy() == null) ? 0 : getAutoDeploy().hashCode());
        hashCode = prime * hashCode
                + ((getClientCertificateId() == null) ? 0 : getClientCertificateId().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultRouteSettings() == null) ? 0 : getDefaultRouteSettings().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getRouteSettings() == null) ? 0 : getRouteSettings().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode
                + ((getStageVariables() == null) ? 0 : getStageVariables().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStageRequest == false)
            return false;
        CreateStageRequest other = (CreateStageRequest) obj;

        if (other.getAccessLogSettings() == null ^ this.getAccessLogSettings() == null)
            return false;
        if (other.getAccessLogSettings() != null
                && other.getAccessLogSettings().equals(this.getAccessLogSettings()) == false)
            return false;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getAutoDeploy() == null ^ this.getAutoDeploy() == null)
            return false;
        if (other.getAutoDeploy() != null
                && other.getAutoDeploy().equals(this.getAutoDeploy()) == false)
            return false;
        if (other.getClientCertificateId() == null ^ this.getClientCertificateId() == null)
            return false;
        if (other.getClientCertificateId() != null
                && other.getClientCertificateId().equals(this.getClientCertificateId()) == false)
            return false;
        if (other.getDefaultRouteSettings() == null ^ this.getDefaultRouteSettings() == null)
            return false;
        if (other.getDefaultRouteSettings() != null
                && other.getDefaultRouteSettings().equals(this.getDefaultRouteSettings()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRouteSettings() == null ^ this.getRouteSettings() == null)
            return false;
        if (other.getRouteSettings() != null
                && other.getRouteSettings().equals(this.getRouteSettings()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null
                && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getStageVariables() == null ^ this.getStageVariables() == null)
            return false;
        if (other.getStageVariables() != null
                && other.getStageVariables().equals(this.getStageVariables()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
