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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves a paginated list of asset summaries.
 * </p>
 * <p>
 * You can use this operation to do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * List assets based on a specific asset model.
 * </p>
 * </li>
 * <li>
 * <p>
 * List top-level assets.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can't use this operation to list all assets. To retrieve summaries for
 * all of your assets, use <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_ListAssetModels.html"
 * >ListAssetModels</a> to get all of your asset model IDs. Then, use ListAssets
 * to get all assets for each asset model.
 * </p>
 */
public class ListAssetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the asset model by which to filter the list of assets. This
     * parameter is required if you choose <code>ALL</code> for
     * <code>filter</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String assetModelId;

    /**
     * <p>
     * The filter for the requested list of assets. Choose one of the following
     * options. Defaults to <code>ALL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all assets for a given asset model
     * ID. The <code>assetModelId</code> parameter is required if you filter by
     * <code>ALL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LEVEL</code> – The list includes only top-level assets in the
     * asset hierarchy tree.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, TOP_LEVEL
     */
    private String filter;

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     *
     * @return <p>
     *         The token to be used for the next set of paginated results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     *
     * @param nextToken <p>
     *            The token to be used for the next set of paginated results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     *
     * @param nextToken <p>
     *            The token to be used for the next set of paginated results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAssetsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return <p>
     *         The maximum number of results to be returned per paginated
     *         request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to be returned per paginated
     *            request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to be returned per paginated
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAssetsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The ID of the asset model by which to filter the list of assets. This
     * parameter is required if you choose <code>ALL</code> for
     * <code>filter</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset model by which to filter the list of assets.
     *         This parameter is required if you choose <code>ALL</code> for
     *         <code>filter</code>.
     *         </p>
     */
    public String getAssetModelId() {
        return assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model by which to filter the list of assets. This
     * parameter is required if you choose <code>ALL</code> for
     * <code>filter</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param assetModelId <p>
     *            The ID of the asset model by which to filter the list of
     *            assets. This parameter is required if you choose
     *            <code>ALL</code> for <code>filter</code>.
     *            </p>
     */
    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model by which to filter the list of assets. This
     * parameter is required if you choose <code>ALL</code> for
     * <code>filter</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param assetModelId <p>
     *            The ID of the asset model by which to filter the list of
     *            assets. This parameter is required if you choose
     *            <code>ALL</code> for <code>filter</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAssetsRequest withAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
        return this;
    }

    /**
     * <p>
     * The filter for the requested list of assets. Choose one of the following
     * options. Defaults to <code>ALL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all assets for a given asset model
     * ID. The <code>assetModelId</code> parameter is required if you filter by
     * <code>ALL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LEVEL</code> – The list includes only top-level assets in the
     * asset hierarchy tree.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, TOP_LEVEL
     *
     * @return <p>
     *         The filter for the requested list of assets. Choose one of the
     *         following options. Defaults to <code>ALL</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL</code> – The list includes all assets for a given asset
     *         model ID. The <code>assetModelId</code> parameter is required if
     *         you filter by <code>ALL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TOP_LEVEL</code> – The list includes only top-level assets
     *         in the asset hierarchy tree.
     *         </p>
     *         </li>
     *         </ul>
     * @see ListAssetsFilter
     */
    public String getFilter() {
        return filter;
    }

    /**
     * <p>
     * The filter for the requested list of assets. Choose one of the following
     * options. Defaults to <code>ALL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all assets for a given asset model
     * ID. The <code>assetModelId</code> parameter is required if you filter by
     * <code>ALL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LEVEL</code> – The list includes only top-level assets in the
     * asset hierarchy tree.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, TOP_LEVEL
     *
     * @param filter <p>
     *            The filter for the requested list of assets. Choose one of the
     *            following options. Defaults to <code>ALL</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALL</code> – The list includes all assets for a given
     *            asset model ID. The <code>assetModelId</code> parameter is
     *            required if you filter by <code>ALL</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOP_LEVEL</code> – The list includes only top-level
     *            assets in the asset hierarchy tree.
     *            </p>
     *            </li>
     *            </ul>
     * @see ListAssetsFilter
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filter for the requested list of assets. Choose one of the following
     * options. Defaults to <code>ALL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all assets for a given asset model
     * ID. The <code>assetModelId</code> parameter is required if you filter by
     * <code>ALL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LEVEL</code> – The list includes only top-level assets in the
     * asset hierarchy tree.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, TOP_LEVEL
     *
     * @param filter <p>
     *            The filter for the requested list of assets. Choose one of the
     *            following options. Defaults to <code>ALL</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALL</code> – The list includes all assets for a given
     *            asset model ID. The <code>assetModelId</code> parameter is
     *            required if you filter by <code>ALL</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOP_LEVEL</code> – The list includes only top-level
     *            assets in the asset hierarchy tree.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ListAssetsFilter
     */
    public ListAssetsRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * The filter for the requested list of assets. Choose one of the following
     * options. Defaults to <code>ALL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all assets for a given asset model
     * ID. The <code>assetModelId</code> parameter is required if you filter by
     * <code>ALL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LEVEL</code> – The list includes only top-level assets in the
     * asset hierarchy tree.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, TOP_LEVEL
     *
     * @param filter <p>
     *            The filter for the requested list of assets. Choose one of the
     *            following options. Defaults to <code>ALL</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALL</code> – The list includes all assets for a given
     *            asset model ID. The <code>assetModelId</code> parameter is
     *            required if you filter by <code>ALL</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOP_LEVEL</code> – The list includes only top-level
     *            assets in the asset hierarchy tree.
     *            </p>
     *            </li>
     *            </ul>
     * @see ListAssetsFilter
     */
    public void setFilter(ListAssetsFilter filter) {
        this.filter = filter.toString();
    }

    /**
     * <p>
     * The filter for the requested list of assets. Choose one of the following
     * options. Defaults to <code>ALL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all assets for a given asset model
     * ID. The <code>assetModelId</code> parameter is required if you filter by
     * <code>ALL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LEVEL</code> – The list includes only top-level assets in the
     * asset hierarchy tree.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, TOP_LEVEL
     *
     * @param filter <p>
     *            The filter for the requested list of assets. Choose one of the
     *            following options. Defaults to <code>ALL</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALL</code> – The list includes all assets for a given
     *            asset model ID. The <code>assetModelId</code> parameter is
     *            required if you filter by <code>ALL</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOP_LEVEL</code> – The list includes only top-level
     *            assets in the asset hierarchy tree.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ListAssetsFilter
     */
    public ListAssetsRequest withFilter(ListAssetsFilter filter) {
        this.filter = filter.toString();
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
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getAssetModelId() != null)
            sb.append("assetModelId: " + getAssetModelId() + ",");
        if (getFilter() != null)
            sb.append("filter: " + getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssetsRequest == false)
            return false;
        ListAssetsRequest other = (ListAssetsRequest) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null
                && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }
}