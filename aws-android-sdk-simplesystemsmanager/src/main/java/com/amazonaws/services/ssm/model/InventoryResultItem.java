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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * The inventory result item.
 * </p>
 */
public class InventoryResultItem implements Serializable {
    /**
     * <p>
     * The name of the inventory result item type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     */
    private String typeName;

    /**
     * <p>
     * The schema version for the inventory result item/
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     */
    private String schemaVersion;

    /**
     * <p>
     * The time inventory item data was captured.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(20)[0-9][0-9]-(0[1-9]|1[012])-([12][0-9]|3[01]|0[1-9])(T
     * )(2[0-3]|[0-1][0-9])(:[0-5][0-9])(:[0-5][0-9])(Z)$<br/>
     */
    private String captureTime;

    /**
     * <p>
     * MD5 hash of the inventory item type contents. The content hash is used to
     * determine whether to update inventory information. The PutInventory API
     * does not update the inventory item type contents if the MD5 hash has not
     * changed since last update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String contentHash;

    /**
     * <p>
     * Contains all the inventory data of the item type. Results include
     * attribute names and values.
     * </p>
     */
    private java.util.List<java.util.Map<String, String>> content;

    /**
     * <p>
     * The name of the inventory result item type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @return <p>
     *         The name of the inventory result item type.
     *         </p>
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * <p>
     * The name of the inventory result item type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @param typeName <p>
     *            The name of the inventory result item type.
     *            </p>
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the inventory result item type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @param typeName <p>
     *            The name of the inventory result item type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryResultItem withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * <p>
     * The schema version for the inventory result item/
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     *
     * @return <p>
     *         The schema version for the inventory result item/
     *         </p>
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * <p>
     * The schema version for the inventory result item/
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     *
     * @param schemaVersion <p>
     *            The schema version for the inventory result item/
     *            </p>
     */
    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The schema version for the inventory result item/
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     *
     * @param schemaVersion <p>
     *            The schema version for the inventory result item/
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryResultItem withSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }

    /**
     * <p>
     * The time inventory item data was captured.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(20)[0-9][0-9]-(0[1-9]|1[012])-([12][0-9]|3[01]|0[1-9])(T
     * )(2[0-3]|[0-1][0-9])(:[0-5][0-9])(:[0-5][0-9])(Z)$<br/>
     *
     * @return <p>
     *         The time inventory item data was captured.
     *         </p>
     */
    public String getCaptureTime() {
        return captureTime;
    }

    /**
     * <p>
     * The time inventory item data was captured.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(20)[0-9][0-9]-(0[1-9]|1[012])-([12][0-9]|3[01]|0[1-9])(T
     * )(2[0-3]|[0-1][0-9])(:[0-5][0-9])(:[0-5][0-9])(Z)$<br/>
     *
     * @param captureTime <p>
     *            The time inventory item data was captured.
     *            </p>
     */
    public void setCaptureTime(String captureTime) {
        this.captureTime = captureTime;
    }

    /**
     * <p>
     * The time inventory item data was captured.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(20)[0-9][0-9]-(0[1-9]|1[012])-([12][0-9]|3[01]|0[1-9])(T
     * )(2[0-3]|[0-1][0-9])(:[0-5][0-9])(:[0-5][0-9])(Z)$<br/>
     *
     * @param captureTime <p>
     *            The time inventory item data was captured.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryResultItem withCaptureTime(String captureTime) {
        this.captureTime = captureTime;
        return this;
    }

    /**
     * <p>
     * MD5 hash of the inventory item type contents. The content hash is used to
     * determine whether to update inventory information. The PutInventory API
     * does not update the inventory item type contents if the MD5 hash has not
     * changed since last update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         MD5 hash of the inventory item type contents. The content hash is
     *         used to determine whether to update inventory information. The
     *         PutInventory API does not update the inventory item type contents
     *         if the MD5 hash has not changed since last update.
     *         </p>
     */
    public String getContentHash() {
        return contentHash;
    }

    /**
     * <p>
     * MD5 hash of the inventory item type contents. The content hash is used to
     * determine whether to update inventory information. The PutInventory API
     * does not update the inventory item type contents if the MD5 hash has not
     * changed since last update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param contentHash <p>
     *            MD5 hash of the inventory item type contents. The content hash
     *            is used to determine whether to update inventory information.
     *            The PutInventory API does not update the inventory item type
     *            contents if the MD5 hash has not changed since last update.
     *            </p>
     */
    public void setContentHash(String contentHash) {
        this.contentHash = contentHash;
    }

    /**
     * <p>
     * MD5 hash of the inventory item type contents. The content hash is used to
     * determine whether to update inventory information. The PutInventory API
     * does not update the inventory item type contents if the MD5 hash has not
     * changed since last update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param contentHash <p>
     *            MD5 hash of the inventory item type contents. The content hash
     *            is used to determine whether to update inventory information.
     *            The PutInventory API does not update the inventory item type
     *            contents if the MD5 hash has not changed since last update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryResultItem withContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }

    /**
     * <p>
     * Contains all the inventory data of the item type. Results include
     * attribute names and values.
     * </p>
     *
     * @return <p>
     *         Contains all the inventory data of the item type. Results include
     *         attribute names and values.
     *         </p>
     */
    public java.util.List<java.util.Map<String, String>> getContent() {
        return content;
    }

    /**
     * <p>
     * Contains all the inventory data of the item type. Results include
     * attribute names and values.
     * </p>
     *
     * @param content <p>
     *            Contains all the inventory data of the item type. Results
     *            include attribute names and values.
     *            </p>
     */
    public void setContent(java.util.Collection<java.util.Map<String, String>> content) {
        if (content == null) {
            this.content = null;
            return;
        }

        this.content = new java.util.ArrayList<java.util.Map<String, String>>(content);
    }

    /**
     * <p>
     * Contains all the inventory data of the item type. Results include
     * attribute names and values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            Contains all the inventory data of the item type. Results
     *            include attribute names and values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryResultItem withContent(java.util.Map<String, String>... content) {
        if (getContent() == null) {
            this.content = new java.util.ArrayList<java.util.Map<String, String>>(content.length);
        }
        for (java.util.Map<String, String> value : content) {
            this.content.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains all the inventory data of the item type. Results include
     * attribute names and values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            Contains all the inventory data of the item type. Results
     *            include attribute names and values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryResultItem withContent(
            java.util.Collection<java.util.Map<String, String>> content) {
        setContent(content);
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
        if (getTypeName() != null)
            sb.append("TypeName: " + getTypeName() + ",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: " + getSchemaVersion() + ",");
        if (getCaptureTime() != null)
            sb.append("CaptureTime: " + getCaptureTime() + ",");
        if (getContentHash() != null)
            sb.append("ContentHash: " + getContentHash() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode
                + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode
                + ((getCaptureTime() == null) ? 0 : getCaptureTime().hashCode());
        hashCode = prime * hashCode
                + ((getContentHash() == null) ? 0 : getContentHash().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryResultItem == false)
            return false;
        InventoryResultItem other = (InventoryResultItem) obj;

        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null
                && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getCaptureTime() == null ^ this.getCaptureTime() == null)
            return false;
        if (other.getCaptureTime() != null
                && other.getCaptureTime().equals(this.getCaptureTime()) == false)
            return false;
        if (other.getContentHash() == null ^ this.getContentHash() == null)
            return false;
        if (other.getContentHash() != null
                && other.getContentHash().equals(this.getContentHash()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }
}
