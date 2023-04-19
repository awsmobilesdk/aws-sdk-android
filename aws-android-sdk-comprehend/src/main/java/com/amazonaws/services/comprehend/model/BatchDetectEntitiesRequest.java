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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Inspects the text of a batch of documents for named entities and returns
 * information about them. For more information about named entities, see <a
 * href="https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html">
 * Entities</a> in the Comprehend Developer Guide.
 * </p>
 */
public class BatchDetectEntitiesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list containing the UTF-8 encoded text of the input documents. The list
     * can contain a maximum of 25 documents. The maximum size of each document
     * is 5 KB.
     * </p>
     */
    private java.util.List<String> textList;

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. All documents must be in the
     * same language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     */
    private String languageCode;

    /**
     * <p>
     * A list containing the UTF-8 encoded text of the input documents. The list
     * can contain a maximum of 25 documents. The maximum size of each document
     * is 5 KB.
     * </p>
     *
     * @return <p>
     *         A list containing the UTF-8 encoded text of the input documents.
     *         The list can contain a maximum of 25 documents. The maximum size
     *         of each document is 5 KB.
     *         </p>
     */
    public java.util.List<String> getTextList() {
        return textList;
    }

    /**
     * <p>
     * A list containing the UTF-8 encoded text of the input documents. The list
     * can contain a maximum of 25 documents. The maximum size of each document
     * is 5 KB.
     * </p>
     *
     * @param textList <p>
     *            A list containing the UTF-8 encoded text of the input
     *            documents. The list can contain a maximum of 25 documents. The
     *            maximum size of each document is 5 KB.
     *            </p>
     */
    public void setTextList(java.util.Collection<String> textList) {
        if (textList == null) {
            this.textList = null;
            return;
        }

        this.textList = new java.util.ArrayList<String>(textList);
    }

    /**
     * <p>
     * A list containing the UTF-8 encoded text of the input documents. The list
     * can contain a maximum of 25 documents. The maximum size of each document
     * is 5 KB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textList <p>
     *            A list containing the UTF-8 encoded text of the input
     *            documents. The list can contain a maximum of 25 documents. The
     *            maximum size of each document is 5 KB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectEntitiesRequest withTextList(String... textList) {
        if (getTextList() == null) {
            this.textList = new java.util.ArrayList<String>(textList.length);
        }
        for (String value : textList) {
            this.textList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the UTF-8 encoded text of the input documents. The list
     * can contain a maximum of 25 documents. The maximum size of each document
     * is 5 KB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textList <p>
     *            A list containing the UTF-8 encoded text of the input
     *            documents. The list can contain a maximum of 25 documents. The
     *            maximum size of each document is 5 KB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectEntitiesRequest withTextList(java.util.Collection<String> textList) {
        setTextList(textList);
        return this;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. All documents must be in the
     * same language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @return <p>
     *         The language of the input documents. You can specify any of the
     *         primary languages supported by Amazon Comprehend. All documents
     *         must be in the same language.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. All documents must be in the
     * same language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents. You can specify any of
     *            the primary languages supported by Amazon Comprehend. All
     *            documents must be in the same language.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. All documents must be in the
     * same language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents. You can specify any of
     *            the primary languages supported by Amazon Comprehend. All
     *            documents must be in the same language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public BatchDetectEntitiesRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. All documents must be in the
     * same language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents. You can specify any of
     *            the primary languages supported by Amazon Comprehend. All
     *            documents must be in the same language.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. All documents must be in the
     * same language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents. You can specify any of
     *            the primary languages supported by Amazon Comprehend. All
     *            documents must be in the same language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public BatchDetectEntitiesRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
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
        if (getTextList() != null)
            sb.append("TextList: " + getTextList() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextList() == null) ? 0 : getTextList().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetectEntitiesRequest == false)
            return false;
        BatchDetectEntitiesRequest other = (BatchDetectEntitiesRequest) obj;

        if (other.getTextList() == null ^ this.getTextList() == null)
            return false;
        if (other.getTextList() != null && other.getTextList().equals(this.getTextList()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        return true;
    }
}
