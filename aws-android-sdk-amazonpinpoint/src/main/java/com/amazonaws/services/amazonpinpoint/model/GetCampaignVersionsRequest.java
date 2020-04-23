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

package com.amazonaws.services.amazonpinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves information about the status, configuration, and other settings for
 * all versions of a campaign.
 * </p>
 */
public class GetCampaignVersionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The unique identifier for the campaign.
     * </p>
     */
    private String campaignId;

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     */
    private String pageSize;

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a
     * paginated response.
     * </p>
     */
    private String token;

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application. This identifier is
     *         displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *         console.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCampaignVersionsRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the campaign.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the campaign.
     *         </p>
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * <p>
     * The unique identifier for the campaign.
     * </p>
     *
     * @param campaignId <p>
     *            The unique identifier for the campaign.
     *            </p>
     */
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * <p>
     * The unique identifier for the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaignId <p>
     *            The unique identifier for the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCampaignVersionsRequest withCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     *
     * @return <p>
     *         The maximum number of items to include in each page of a
     *         paginated response. This parameter is not supported for
     *         application, campaign, and journey metrics.
     *         </p>
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     *
     * @param pageSize <p>
     *            The maximum number of items to include in each page of a
     *            paginated response. This parameter is not supported for
     *            application, campaign, and journey metrics.
     *            </p>
     */
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageSize <p>
     *            The maximum number of items to include in each page of a
     *            paginated response. This parameter is not supported for
     *            application, campaign, and journey metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCampaignVersionsRequest withPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a
     * paginated response.
     * </p>
     *
     * @return <p>
     *         The NextToken string that specifies which page of results to
     *         return in a paginated response.
     *         </p>
     */
    public String getToken() {
        return token;
    }

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a
     * paginated response.
     * </p>
     *
     * @param token <p>
     *            The NextToken string that specifies which page of results to
     *            return in a paginated response.
     *            </p>
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a
     * paginated response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param token <p>
     *            The NextToken string that specifies which page of results to
     *            return in a paginated response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCampaignVersionsRequest withToken(String token) {
        this.token = token;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getCampaignId() != null)
            sb.append("CampaignId: " + getCampaignId() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize() + ",");
        if (getToken() != null)
            sb.append("Token: " + getToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCampaignId() == null) ? 0 : getCampaignId().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCampaignVersionsRequest == false)
            return false;
        GetCampaignVersionsRequest other = (GetCampaignVersionsRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCampaignId() == null ^ this.getCampaignId() == null)
            return false;
        if (other.getCampaignId() != null
                && other.getCampaignId().equals(this.getCampaignId()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }
}