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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

public class GetIPSetResult implements Serializable {
    /**
     * <p>
     * The user-friendly name for the IPSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String name;

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT,
     * FIRE_EYE
     */
    private String format;

    /**
     * <p>
     * The URI of the file that contains the IPSet. For example: .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String location;

    /**
     * <p>
     * The status of IPSet file that was uploaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR,
     * DELETE_PENDING, DELETED
     */
    private String status;

    /**
     * <p>
     * The tags of the IPSet resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The user-friendly name for the IPSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The user-friendly name for the IPSet.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The user-friendly name for the IPSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param name <p>
     *            The user-friendly name for the IPSet.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The user-friendly name for the IPSet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param name <p>
     *            The user-friendly name for the IPSet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIPSetResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT,
     * FIRE_EYE
     *
     * @return <p>
     *         The format of the file that contains the IPSet.
     *         </p>
     * @see IpSetFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT,
     * FIRE_EYE
     *
     * @param format <p>
     *            The format of the file that contains the IPSet.
     *            </p>
     * @see IpSetFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT,
     * FIRE_EYE
     *
     * @param format <p>
     *            The format of the file that contains the IPSet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IpSetFormat
     */
    public GetIPSetResult withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT,
     * FIRE_EYE
     *
     * @param format <p>
     *            The format of the file that contains the IPSet.
     *            </p>
     * @see IpSetFormat
     */
    public void setFormat(IpSetFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT,
     * FIRE_EYE
     *
     * @param format <p>
     *            The format of the file that contains the IPSet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IpSetFormat
     */
    public GetIPSetResult withFormat(IpSetFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The URI of the file that contains the IPSet. For example: .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The URI of the file that contains the IPSet. For example: .
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The URI of the file that contains the IPSet. For example: .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param location <p>
     *            The URI of the file that contains the IPSet. For example: .
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The URI of the file that contains the IPSet. For example: .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param location <p>
     *            The URI of the file that contains the IPSet. For example: .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIPSetResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The status of IPSet file that was uploaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR,
     * DELETE_PENDING, DELETED
     *
     * @return <p>
     *         The status of IPSet file that was uploaded.
     *         </p>
     * @see IpSetStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of IPSet file that was uploaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR,
     * DELETE_PENDING, DELETED
     *
     * @param status <p>
     *            The status of IPSet file that was uploaded.
     *            </p>
     * @see IpSetStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of IPSet file that was uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR,
     * DELETE_PENDING, DELETED
     *
     * @param status <p>
     *            The status of IPSet file that was uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IpSetStatus
     */
    public GetIPSetResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of IPSet file that was uploaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR,
     * DELETE_PENDING, DELETED
     *
     * @param status <p>
     *            The status of IPSet file that was uploaded.
     *            </p>
     * @see IpSetStatus
     */
    public void setStatus(IpSetStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of IPSet file that was uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR,
     * DELETE_PENDING, DELETED
     *
     * @param status <p>
     *            The status of IPSet file that was uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IpSetStatus
     */
    public GetIPSetResult withStatus(IpSetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The tags of the IPSet resource.
     * </p>
     *
     * @return <p>
     *         The tags of the IPSet resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the IPSet resource.
     * </p>
     *
     * @param tags <p>
     *            The tags of the IPSet resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the IPSet resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags of the IPSet resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIPSetResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags of the IPSet resource.
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
    public GetIPSetResult addTagsEntry(String key, String value) {
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
    public GetIPSetResult clearTagsEntries() {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIPSetResult == false)
            return false;
        GetIPSetResult other = (GetIPSetResult) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
