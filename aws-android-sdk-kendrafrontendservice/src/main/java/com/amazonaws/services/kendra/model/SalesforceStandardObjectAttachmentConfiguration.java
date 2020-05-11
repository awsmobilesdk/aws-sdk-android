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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Provides configuration information for processing attachments to Salesforce
 * standard objects.
 * </p>
 */
public class SalesforceStandardObjectAttachmentConfiguration implements Serializable {
    /**
     * <p>
     * The name of the field used for the document title.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     */
    private String documentTitleFieldName;

    /**
     * <p>
     * One or more objects that map fields in attachments to Amazon Kendra index
     * fields.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;

    /**
     * <p>
     * The name of the field used for the document title.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @return <p>
     *         The name of the field used for the document title.
     *         </p>
     */
    public String getDocumentTitleFieldName() {
        return documentTitleFieldName;
    }

    /**
     * <p>
     * The name of the field used for the document title.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param documentTitleFieldName <p>
     *            The name of the field used for the document title.
     *            </p>
     */
    public void setDocumentTitleFieldName(String documentTitleFieldName) {
        this.documentTitleFieldName = documentTitleFieldName;
    }

    /**
     * <p>
     * The name of the field used for the document title.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param documentTitleFieldName <p>
     *            The name of the field used for the document title.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceStandardObjectAttachmentConfiguration withDocumentTitleFieldName(
            String documentTitleFieldName) {
        this.documentTitleFieldName = documentTitleFieldName;
        return this;
    }

    /**
     * <p>
     * One or more objects that map fields in attachments to Amazon Kendra index
     * fields.
     * </p>
     *
     * @return <p>
     *         One or more objects that map fields in attachments to Amazon
     *         Kendra index fields.
     *         </p>
     */
    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * One or more objects that map fields in attachments to Amazon Kendra index
     * fields.
     * </p>
     *
     * @param fieldMappings <p>
     *            One or more objects that map fields in attachments to Amazon
     *            Kendra index fields.
     *            </p>
     */
    public void setFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        if (fieldMappings == null) {
            this.fieldMappings = null;
            return;
        }

        this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings);
    }

    /**
     * <p>
     * One or more objects that map fields in attachments to Amazon Kendra index
     * fields.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldMappings <p>
     *            One or more objects that map fields in attachments to Amazon
     *            Kendra index fields.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceStandardObjectAttachmentConfiguration withFieldMappings(
            DataSourceToIndexFieldMapping... fieldMappings) {
        if (getFieldMappings() == null) {
            this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                    fieldMappings.length);
        }
        for (DataSourceToIndexFieldMapping value : fieldMappings) {
            this.fieldMappings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more objects that map fields in attachments to Amazon Kendra index
     * fields.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldMappings <p>
     *            One or more objects that map fields in attachments to Amazon
     *            Kendra index fields.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SalesforceStandardObjectAttachmentConfiguration withFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
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
        if (getDocumentTitleFieldName() != null)
            sb.append("DocumentTitleFieldName: " + getDocumentTitleFieldName() + ",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: " + getFieldMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDocumentTitleFieldName() == null) ? 0 : getDocumentTitleFieldName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceStandardObjectAttachmentConfiguration == false)
            return false;
        SalesforceStandardObjectAttachmentConfiguration other = (SalesforceStandardObjectAttachmentConfiguration) obj;

        if (other.getDocumentTitleFieldName() == null ^ this.getDocumentTitleFieldName() == null)
            return false;
        if (other.getDocumentTitleFieldName() != null
                && other.getDocumentTitleFieldName().equals(this.getDocumentTitleFieldName()) == false)
            return false;
        if (other.getFieldMappings() == null ^ this.getFieldMappings() == null)
            return false;
        if (other.getFieldMappings() != null
                && other.getFieldMappings().equals(this.getFieldMappings()) == false)
            return false;
        return true;
    }
}
