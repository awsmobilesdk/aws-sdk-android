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
 * Gets an asset property's current value. For more information, see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/query-industrial-data.html#current-values"
 * >Querying Current Property Values</a> in the <i>AWS IoT SiteWise User
 * Guide</i>.
 * </p>
 * <p>
 * To identify an asset property, you must specify one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The <code>assetId</code> and <code>propertyId</code> of an asset property.
 * </p>
 * </li>
 * <li>
 * <p>
 * A <code>propertyAlias</code>, which is a data stream alias (for example,
 * <code>/company/windfarm/3/turbine/7/temperature</code>). To define an asset
 * property's alias, see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
 * >UpdateAssetProperty</a>.
 * </p>
 * </li>
 * </ul>
 */
public class GetAssetPropertyValueRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String assetId;

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String propertyId;

    /**
     * <p>
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String propertyAlias;

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset.
     *         </p>
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param assetId <p>
     *            The ID of the asset.
     *            </p>
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset.
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
     * @param assetId <p>
     *            The ID of the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyValueRequest withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset property.
     *         </p>
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param propertyId <p>
     *            The ID of the asset property.
     *            </p>
     */
    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <p>
     * The ID of the asset property.
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
     * @param propertyId <p>
     *            The ID of the asset property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyValueRequest withPropertyId(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    /**
     * <p>
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The property alias that identifies the property, such as an
     *         OPC-UA server data stream path (for example,
     *         <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     *         >Mapping Industrial Data Streams to Asset Properties</a> in the
     *         <i>AWS IoT SiteWise User Guide</i>.
     *         </p>
     */
    public String getPropertyAlias() {
        return propertyAlias;
    }

    /**
     * <p>
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param propertyAlias <p>
     *            The property alias that identifies the property, such as an
     *            OPC-UA server data stream path (for example,
     *            <code>/company/windfarm/3/turbine/7/temperature</code>). For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     *            >Mapping Industrial Data Streams to Asset Properties</a> in
     *            the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     */
    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    /**
     * <p>
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param propertyAlias <p>
     *            The property alias that identifies the property, such as an
     *            OPC-UA server data stream path (for example,
     *            <code>/company/windfarm/3/turbine/7/temperature</code>). For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     *            >Mapping Industrial Data Streams to Asset Properties</a> in
     *            the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetPropertyValueRequest withPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
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
        if (getAssetId() != null)
            sb.append("assetId: " + getAssetId() + ",");
        if (getPropertyId() != null)
            sb.append("propertyId: " + getPropertyId() + ",");
        if (getPropertyAlias() != null)
            sb.append("propertyAlias: " + getPropertyAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        hashCode = prime * hashCode
                + ((getPropertyAlias() == null) ? 0 : getPropertyAlias().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssetPropertyValueRequest == false)
            return false;
        GetAssetPropertyValueRequest other = (GetAssetPropertyValueRequest) obj;

        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getPropertyId() == null ^ this.getPropertyId() == null)
            return false;
        if (other.getPropertyId() != null
                && other.getPropertyId().equals(this.getPropertyId()) == false)
            return false;
        if (other.getPropertyAlias() == null ^ this.getPropertyAlias() == null)
            return false;
        if (other.getPropertyAlias() != null
                && other.getPropertyAlias().equals(this.getPropertyAlias()) == false)
            return false;
        return true;
    }
}