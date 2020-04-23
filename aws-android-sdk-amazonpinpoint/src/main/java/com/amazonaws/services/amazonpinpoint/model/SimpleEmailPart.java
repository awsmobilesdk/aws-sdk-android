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

/**
 * <p>
 * Specifies the subject or body of an email message, represented as textual
 * email data and the applicable character set.
 * </p>
 */
public class SimpleEmailPart implements Serializable {
    /**
     * <p>
     * The applicable character set for the message content.
     * </p>
     */
    private String charset;

    /**
     * <p>
     * The textual data of the message content.
     * </p>
     */
    private String data;

    /**
     * <p>
     * The applicable character set for the message content.
     * </p>
     *
     * @return <p>
     *         The applicable character set for the message content.
     *         </p>
     */
    public String getCharset() {
        return charset;
    }

    /**
     * <p>
     * The applicable character set for the message content.
     * </p>
     *
     * @param charset <p>
     *            The applicable character set for the message content.
     *            </p>
     */
    public void setCharset(String charset) {
        this.charset = charset;
    }

    /**
     * <p>
     * The applicable character set for the message content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param charset <p>
     *            The applicable character set for the message content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimpleEmailPart withCharset(String charset) {
        this.charset = charset;
        return this;
    }

    /**
     * <p>
     * The textual data of the message content.
     * </p>
     *
     * @return <p>
     *         The textual data of the message content.
     *         </p>
     */
    public String getData() {
        return data;
    }

    /**
     * <p>
     * The textual data of the message content.
     * </p>
     *
     * @param data <p>
     *            The textual data of the message content.
     *            </p>
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * The textual data of the message content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param data <p>
     *            The textual data of the message content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimpleEmailPart withData(String data) {
        this.data = data;
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
        if (getCharset() != null)
            sb.append("Charset: " + getCharset() + ",");
        if (getData() != null)
            sb.append("Data: " + getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCharset() == null) ? 0 : getCharset().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimpleEmailPart == false)
            return false;
        SimpleEmailPart other = (SimpleEmailPart) obj;

        if (other.getCharset() == null ^ this.getCharset() == null)
            return false;
        if (other.getCharset() != null && other.getCharset().equals(this.getCharset()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }
}
