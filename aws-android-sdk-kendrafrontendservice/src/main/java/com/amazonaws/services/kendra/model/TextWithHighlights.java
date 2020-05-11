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
 * Provides text and information about where to highlight the text.
 * </p>
 */
public class TextWithHighlights implements Serializable {
    /**
     * <p>
     * The text to display to the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String text;

    /**
     * <p>
     * The beginning and end of the text that should be highlighted.
     * </p>
     */
    private java.util.List<Highlight> highlights;

    /**
     * <p>
     * The text to display to the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The text to display to the user.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The text to display to the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param text <p>
     *            The text to display to the user.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text to display to the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param text <p>
     *            The text to display to the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextWithHighlights withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * The beginning and end of the text that should be highlighted.
     * </p>
     *
     * @return <p>
     *         The beginning and end of the text that should be highlighted.
     *         </p>
     */
    public java.util.List<Highlight> getHighlights() {
        return highlights;
    }

    /**
     * <p>
     * The beginning and end of the text that should be highlighted.
     * </p>
     *
     * @param highlights <p>
     *            The beginning and end of the text that should be highlighted.
     *            </p>
     */
    public void setHighlights(java.util.Collection<Highlight> highlights) {
        if (highlights == null) {
            this.highlights = null;
            return;
        }

        this.highlights = new java.util.ArrayList<Highlight>(highlights);
    }

    /**
     * <p>
     * The beginning and end of the text that should be highlighted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param highlights <p>
     *            The beginning and end of the text that should be highlighted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextWithHighlights withHighlights(Highlight... highlights) {
        if (getHighlights() == null) {
            this.highlights = new java.util.ArrayList<Highlight>(highlights.length);
        }
        for (Highlight value : highlights) {
            this.highlights.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The beginning and end of the text that should be highlighted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param highlights <p>
     *            The beginning and end of the text that should be highlighted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextWithHighlights withHighlights(java.util.Collection<Highlight> highlights) {
        setHighlights(highlights);
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
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getHighlights() != null)
            sb.append("Highlights: " + getHighlights());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getHighlights() == null) ? 0 : getHighlights().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextWithHighlights == false)
            return false;
        TextWithHighlights other = (TextWithHighlights) obj;

        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getHighlights() == null ^ this.getHighlights() == null)
            return false;
        if (other.getHighlights() != null
                && other.getHighlights().equals(this.getHighlights()) == false)
            return false;
        return true;
    }
}
