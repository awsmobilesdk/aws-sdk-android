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
 * Specifies the content and settings for a message template that can be used in
 * messages that are sent through the email channel.
 * </p>
 */
public class EmailTemplateRequest implements Serializable {
    /**
     * <p>
     * A JSON object that specifies the default values to use for message
     * variables in the message template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable. When you
     * create a message that's based on the template, you can override these
     * defaults with message-specific and address-specific variables and values.
     * </p>
     */
    private String defaultSubstitutions;

    /**
     * <p>
     * The message body, in HTML format, to use in email messages that are based
     * on the message template. We recommend using HTML format for email clients
     * that render HTML content. You can include links, formatted text, and more
     * in an HTML message.
     * </p>
     */
    private String htmlPart;

    /**
     * <p>
     * The unique identifier for the recommender model to use for the message
     * template. Amazon Pinpoint uses this value to determine how to retrieve
     * and process data from a recommender model when it sends messages that use
     * the template, if the template contains message variables for
     * recommendation data.
     * </p>
     */
    private String recommenderId;

    /**
     * <p>
     * The subject line, or title, to use in email messages that are based on
     * the message template.
     * </p>
     */
    private String subject;

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the message template. Each tag consists of a required tag
     * key and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A custom description of the message template.
     * </p>
     */
    private String templateDescription;

    /**
     * <p>
     * The message body, in plain text format, to use in email messages that are
     * based on the message template. We recommend using plain text format for
     * email clients that don't render HTML content and clients that are
     * connected to high-latency networks, such as mobile devices.
     * </p>
     */
    private String textPart;

    /**
     * <p>
     * A JSON object that specifies the default values to use for message
     * variables in the message template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable. When you
     * create a message that's based on the template, you can override these
     * defaults with message-specific and address-specific variables and values.
     * </p>
     *
     * @return <p>
     *         A JSON object that specifies the default values to use for
     *         message variables in the message template. This object is a set
     *         of key-value pairs. Each key defines a message variable in the
     *         template. The corresponding value defines the default value for
     *         that variable. When you create a message that's based on the
     *         template, you can override these defaults with message-specific
     *         and address-specific variables and values.
     *         </p>
     */
    public String getDefaultSubstitutions() {
        return defaultSubstitutions;
    }

    /**
     * <p>
     * A JSON object that specifies the default values to use for message
     * variables in the message template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable. When you
     * create a message that's based on the template, you can override these
     * defaults with message-specific and address-specific variables and values.
     * </p>
     *
     * @param defaultSubstitutions <p>
     *            A JSON object that specifies the default values to use for
     *            message variables in the message template. This object is a
     *            set of key-value pairs. Each key defines a message variable in
     *            the template. The corresponding value defines the default
     *            value for that variable. When you create a message that's
     *            based on the template, you can override these defaults with
     *            message-specific and address-specific variables and values.
     *            </p>
     */
    public void setDefaultSubstitutions(String defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
    }

    /**
     * <p>
     * A JSON object that specifies the default values to use for message
     * variables in the message template. This object is a set of key-value
     * pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable. When you
     * create a message that's based on the template, you can override these
     * defaults with message-specific and address-specific variables and values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultSubstitutions <p>
     *            A JSON object that specifies the default values to use for
     *            message variables in the message template. This object is a
     *            set of key-value pairs. Each key defines a message variable in
     *            the template. The corresponding value defines the default
     *            value for that variable. When you create a message that's
     *            based on the template, you can override these defaults with
     *            message-specific and address-specific variables and values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailTemplateRequest withDefaultSubstitutions(String defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
        return this;
    }

    /**
     * <p>
     * The message body, in HTML format, to use in email messages that are based
     * on the message template. We recommend using HTML format for email clients
     * that render HTML content. You can include links, formatted text, and more
     * in an HTML message.
     * </p>
     *
     * @return <p>
     *         The message body, in HTML format, to use in email messages that
     *         are based on the message template. We recommend using HTML format
     *         for email clients that render HTML content. You can include
     *         links, formatted text, and more in an HTML message.
     *         </p>
     */
    public String getHtmlPart() {
        return htmlPart;
    }

    /**
     * <p>
     * The message body, in HTML format, to use in email messages that are based
     * on the message template. We recommend using HTML format for email clients
     * that render HTML content. You can include links, formatted text, and more
     * in an HTML message.
     * </p>
     *
     * @param htmlPart <p>
     *            The message body, in HTML format, to use in email messages
     *            that are based on the message template. We recommend using
     *            HTML format for email clients that render HTML content. You
     *            can include links, formatted text, and more in an HTML
     *            message.
     *            </p>
     */
    public void setHtmlPart(String htmlPart) {
        this.htmlPart = htmlPart;
    }

    /**
     * <p>
     * The message body, in HTML format, to use in email messages that are based
     * on the message template. We recommend using HTML format for email clients
     * that render HTML content. You can include links, formatted text, and more
     * in an HTML message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param htmlPart <p>
     *            The message body, in HTML format, to use in email messages
     *            that are based on the message template. We recommend using
     *            HTML format for email clients that render HTML content. You
     *            can include links, formatted text, and more in an HTML
     *            message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailTemplateRequest withHtmlPart(String htmlPart) {
        this.htmlPart = htmlPart;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the recommender model to use for the message
     * template. Amazon Pinpoint uses this value to determine how to retrieve
     * and process data from a recommender model when it sends messages that use
     * the template, if the template contains message variables for
     * recommendation data.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the recommender model to use for the
     *         message template. Amazon Pinpoint uses this value to determine
     *         how to retrieve and process data from a recommender model when it
     *         sends messages that use the template, if the template contains
     *         message variables for recommendation data.
     *         </p>
     */
    public String getRecommenderId() {
        return recommenderId;
    }

    /**
     * <p>
     * The unique identifier for the recommender model to use for the message
     * template. Amazon Pinpoint uses this value to determine how to retrieve
     * and process data from a recommender model when it sends messages that use
     * the template, if the template contains message variables for
     * recommendation data.
     * </p>
     *
     * @param recommenderId <p>
     *            The unique identifier for the recommender model to use for the
     *            message template. Amazon Pinpoint uses this value to determine
     *            how to retrieve and process data from a recommender model when
     *            it sends messages that use the template, if the template
     *            contains message variables for recommendation data.
     *            </p>
     */
    public void setRecommenderId(String recommenderId) {
        this.recommenderId = recommenderId;
    }

    /**
     * <p>
     * The unique identifier for the recommender model to use for the message
     * template. Amazon Pinpoint uses this value to determine how to retrieve
     * and process data from a recommender model when it sends messages that use
     * the template, if the template contains message variables for
     * recommendation data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommenderId <p>
     *            The unique identifier for the recommender model to use for the
     *            message template. Amazon Pinpoint uses this value to determine
     *            how to retrieve and process data from a recommender model when
     *            it sends messages that use the template, if the template
     *            contains message variables for recommendation data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailTemplateRequest withRecommenderId(String recommenderId) {
        this.recommenderId = recommenderId;
        return this;
    }

    /**
     * <p>
     * The subject line, or title, to use in email messages that are based on
     * the message template.
     * </p>
     *
     * @return <p>
     *         The subject line, or title, to use in email messages that are
     *         based on the message template.
     *         </p>
     */
    public String getSubject() {
        return subject;
    }

    /**
     * <p>
     * The subject line, or title, to use in email messages that are based on
     * the message template.
     * </p>
     *
     * @param subject <p>
     *            The subject line, or title, to use in email messages that are
     *            based on the message template.
     *            </p>
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject line, or title, to use in email messages that are based on
     * the message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subject <p>
     *            The subject line, or title, to use in email messages that are
     *            based on the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailTemplateRequest withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the message template. Each tag consists of a required tag
     * key and an associated tag value.
     * </p>
     *
     * @return <p>
     *         A string-to-string map of key-value pairs that defines the tags
     *         to associate with the message template. Each tag consists of a
     *         required tag key and an associated tag value.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the message template. Each tag consists of a required tag
     * key and an associated tag value.
     * </p>
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that defines the
     *            tags to associate with the message template. Each tag consists
     *            of a required tag key and an associated tag value.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the message template. Each tag consists of a required tag
     * key and an associated tag value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that defines the
     *            tags to associate with the message template. Each tag consists
     *            of a required tag key and an associated tag value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailTemplateRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the message template. Each tag consists of a required tag
     * key and an associated tag value.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailTemplateRequest addtagsEntry(String key, String value) {
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
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public EmailTemplateRequest cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A custom description of the message template.
     * </p>
     *
     * @return <p>
     *         A custom description of the message template.
     *         </p>
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    /**
     * <p>
     * A custom description of the message template.
     * </p>
     *
     * @param templateDescription <p>
     *            A custom description of the message template.
     *            </p>
     */
    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    /**
     * <p>
     * A custom description of the message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateDescription <p>
     *            A custom description of the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailTemplateRequest withTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    /**
     * <p>
     * The message body, in plain text format, to use in email messages that are
     * based on the message template. We recommend using plain text format for
     * email clients that don't render HTML content and clients that are
     * connected to high-latency networks, such as mobile devices.
     * </p>
     *
     * @return <p>
     *         The message body, in plain text format, to use in email messages
     *         that are based on the message template. We recommend using plain
     *         text format for email clients that don't render HTML content and
     *         clients that are connected to high-latency networks, such as
     *         mobile devices.
     *         </p>
     */
    public String getTextPart() {
        return textPart;
    }

    /**
     * <p>
     * The message body, in plain text format, to use in email messages that are
     * based on the message template. We recommend using plain text format for
     * email clients that don't render HTML content and clients that are
     * connected to high-latency networks, such as mobile devices.
     * </p>
     *
     * @param textPart <p>
     *            The message body, in plain text format, to use in email
     *            messages that are based on the message template. We recommend
     *            using plain text format for email clients that don't render
     *            HTML content and clients that are connected to high-latency
     *            networks, such as mobile devices.
     *            </p>
     */
    public void setTextPart(String textPart) {
        this.textPart = textPart;
    }

    /**
     * <p>
     * The message body, in plain text format, to use in email messages that are
     * based on the message template. We recommend using plain text format for
     * email clients that don't render HTML content and clients that are
     * connected to high-latency networks, such as mobile devices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textPart <p>
     *            The message body, in plain text format, to use in email
     *            messages that are based on the message template. We recommend
     *            using plain text format for email clients that don't render
     *            HTML content and clients that are connected to high-latency
     *            networks, such as mobile devices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailTemplateRequest withTextPart(String textPart) {
        this.textPart = textPart;
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
        if (getDefaultSubstitutions() != null)
            sb.append("DefaultSubstitutions: " + getDefaultSubstitutions() + ",");
        if (getHtmlPart() != null)
            sb.append("HtmlPart: " + getHtmlPart() + ",");
        if (getRecommenderId() != null)
            sb.append("RecommenderId: " + getRecommenderId() + ",");
        if (getSubject() != null)
            sb.append("Subject: " + getSubject() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getTemplateDescription() != null)
            sb.append("TemplateDescription: " + getTemplateDescription() + ",");
        if (getTextPart() != null)
            sb.append("TextPart: " + getTextPart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDefaultSubstitutions() == null) ? 0 : getDefaultSubstitutions().hashCode());
        hashCode = prime * hashCode + ((getHtmlPart() == null) ? 0 : getHtmlPart().hashCode());
        hashCode = prime * hashCode
                + ((getRecommenderId() == null) ? 0 : getRecommenderId().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateDescription() == null) ? 0 : getTemplateDescription().hashCode());
        hashCode = prime * hashCode + ((getTextPart() == null) ? 0 : getTextPart().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailTemplateRequest == false)
            return false;
        EmailTemplateRequest other = (EmailTemplateRequest) obj;

        if (other.getDefaultSubstitutions() == null ^ this.getDefaultSubstitutions() == null)
            return false;
        if (other.getDefaultSubstitutions() != null
                && other.getDefaultSubstitutions().equals(this.getDefaultSubstitutions()) == false)
            return false;
        if (other.getHtmlPart() == null ^ this.getHtmlPart() == null)
            return false;
        if (other.getHtmlPart() != null && other.getHtmlPart().equals(this.getHtmlPart()) == false)
            return false;
        if (other.getRecommenderId() == null ^ this.getRecommenderId() == null)
            return false;
        if (other.getRecommenderId() != null
                && other.getRecommenderId().equals(this.getRecommenderId()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateDescription() == null ^ this.getTemplateDescription() == null)
            return false;
        if (other.getTemplateDescription() != null
                && other.getTemplateDescription().equals(this.getTemplateDescription()) == false)
            return false;
        if (other.getTextPart() == null ^ this.getTextPart() == null)
            return false;
        if (other.getTextPart() != null && other.getTextPart().equals(this.getTextPart()) == false)
            return false;
        return true;
    }
}