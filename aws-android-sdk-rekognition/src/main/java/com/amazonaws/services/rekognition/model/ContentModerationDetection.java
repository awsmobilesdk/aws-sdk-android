/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an inappropriate, unwanted, or offensive content label
 * detection in a stored video.
 * </p>
 */
public class ContentModerationDetection implements Serializable {
    /**
     * <p>
     * Time, in milliseconds from the beginning of the video, that the content
     * moderation label was detected. Note that <code>Timestamp</code> is not
     * guaranteed to be accurate to the individual frame where the moderated
     * content first appears.
     * </p>
     */
    private Long timestamp;

    /**
     * <p>
     * The content moderation label detected by in the stored video.
     * </p>
     */
    private ModerationLabel moderationLabel;

    /**
     * <p>
     * The time in milliseconds defining the start of the timeline segment
     * containing a continuously detected moderation label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long startTimestampMillis;

    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment
     * containing a continuously detected moderation label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long endTimestampMillis;

    /**
     * <p>
     * The time duration of a segment in milliseconds, I.e. time elapsed from
     * StartTimestampMillis to EndTimestampMillis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long durationMillis;

    /**
     * <p>
     * A list of predicted results for the type of content an image contains.
     * For example, the image content might be from animation, sports, or a
     * video game.
     * </p>
     */
    private java.util.List<ContentType> contentTypes;

    /**
     * <p>
     * Time, in milliseconds from the beginning of the video, that the content
     * moderation label was detected. Note that <code>Timestamp</code> is not
     * guaranteed to be accurate to the individual frame where the moderated
     * content first appears.
     * </p>
     *
     * @return <p>
     *         Time, in milliseconds from the beginning of the video, that the
     *         content moderation label was detected. Note that
     *         <code>Timestamp</code> is not guaranteed to be accurate to the
     *         individual frame where the moderated content first appears.
     *         </p>
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the beginning of the video, that the content
     * moderation label was detected. Note that <code>Timestamp</code> is not
     * guaranteed to be accurate to the individual frame where the moderated
     * content first appears.
     * </p>
     *
     * @param timestamp <p>
     *            Time, in milliseconds from the beginning of the video, that
     *            the content moderation label was detected. Note that
     *            <code>Timestamp</code> is not guaranteed to be accurate to the
     *            individual frame where the moderated content first appears.
     *            </p>
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the beginning of the video, that the content
     * moderation label was detected. Note that <code>Timestamp</code> is not
     * guaranteed to be accurate to the individual frame where the moderated
     * content first appears.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            Time, in milliseconds from the beginning of the video, that
     *            the content moderation label was detected. Note that
     *            <code>Timestamp</code> is not guaranteed to be accurate to the
     *            individual frame where the moderated content first appears.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContentModerationDetection withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * The content moderation label detected by in the stored video.
     * </p>
     *
     * @return <p>
     *         The content moderation label detected by in the stored video.
     *         </p>
     */
    public ModerationLabel getModerationLabel() {
        return moderationLabel;
    }

    /**
     * <p>
     * The content moderation label detected by in the stored video.
     * </p>
     *
     * @param moderationLabel <p>
     *            The content moderation label detected by in the stored video.
     *            </p>
     */
    public void setModerationLabel(ModerationLabel moderationLabel) {
        this.moderationLabel = moderationLabel;
    }

    /**
     * <p>
     * The content moderation label detected by in the stored video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param moderationLabel <p>
     *            The content moderation label detected by in the stored video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContentModerationDetection withModerationLabel(ModerationLabel moderationLabel) {
        this.moderationLabel = moderationLabel;
        return this;
    }

    /**
     * <p>
     * The time in milliseconds defining the start of the timeline segment
     * containing a continuously detected moderation label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The time in milliseconds defining the start of the timeline
     *         segment containing a continuously detected moderation label.
     *         </p>
     */
    public Long getStartTimestampMillis() {
        return startTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the start of the timeline segment
     * containing a continuously detected moderation label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param startTimestampMillis <p>
     *            The time in milliseconds defining the start of the timeline
     *            segment containing a continuously detected moderation label.
     *            </p>
     */
    public void setStartTimestampMillis(Long startTimestampMillis) {
        this.startTimestampMillis = startTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the start of the timeline segment
     * containing a continuously detected moderation label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param startTimestampMillis <p>
     *            The time in milliseconds defining the start of the timeline
     *            segment containing a continuously detected moderation label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContentModerationDetection withStartTimestampMillis(Long startTimestampMillis) {
        this.startTimestampMillis = startTimestampMillis;
        return this;
    }

    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment
     * containing a continuously detected moderation label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The time in milliseconds defining the end of the timeline segment
     *         containing a continuously detected moderation label.
     *         </p>
     */
    public Long getEndTimestampMillis() {
        return endTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment
     * containing a continuously detected moderation label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endTimestampMillis <p>
     *            The time in milliseconds defining the end of the timeline
     *            segment containing a continuously detected moderation label.
     *            </p>
     */
    public void setEndTimestampMillis(Long endTimestampMillis) {
        this.endTimestampMillis = endTimestampMillis;
    }

    /**
     * <p>
     * The time in milliseconds defining the end of the timeline segment
     * containing a continuously detected moderation label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endTimestampMillis <p>
     *            The time in milliseconds defining the end of the timeline
     *            segment containing a continuously detected moderation label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContentModerationDetection withEndTimestampMillis(Long endTimestampMillis) {
        this.endTimestampMillis = endTimestampMillis;
        return this;
    }

    /**
     * <p>
     * The time duration of a segment in milliseconds, I.e. time elapsed from
     * StartTimestampMillis to EndTimestampMillis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The time duration of a segment in milliseconds, I.e. time elapsed
     *         from StartTimestampMillis to EndTimestampMillis.
     *         </p>
     */
    public Long getDurationMillis() {
        return durationMillis;
    }

    /**
     * <p>
     * The time duration of a segment in milliseconds, I.e. time elapsed from
     * StartTimestampMillis to EndTimestampMillis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationMillis <p>
     *            The time duration of a segment in milliseconds, I.e. time
     *            elapsed from StartTimestampMillis to EndTimestampMillis.
     *            </p>
     */
    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }

    /**
     * <p>
     * The time duration of a segment in milliseconds, I.e. time elapsed from
     * StartTimestampMillis to EndTimestampMillis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationMillis <p>
     *            The time duration of a segment in milliseconds, I.e. time
     *            elapsed from StartTimestampMillis to EndTimestampMillis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContentModerationDetection withDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
        return this;
    }

    /**
     * <p>
     * A list of predicted results for the type of content an image contains.
     * For example, the image content might be from animation, sports, or a
     * video game.
     * </p>
     *
     * @return <p>
     *         A list of predicted results for the type of content an image
     *         contains. For example, the image content might be from animation,
     *         sports, or a video game.
     *         </p>
     */
    public java.util.List<ContentType> getContentTypes() {
        return contentTypes;
    }

    /**
     * <p>
     * A list of predicted results for the type of content an image contains.
     * For example, the image content might be from animation, sports, or a
     * video game.
     * </p>
     *
     * @param contentTypes <p>
     *            A list of predicted results for the type of content an image
     *            contains. For example, the image content might be from
     *            animation, sports, or a video game.
     *            </p>
     */
    public void setContentTypes(java.util.Collection<ContentType> contentTypes) {
        if (contentTypes == null) {
            this.contentTypes = null;
            return;
        }

        this.contentTypes = new java.util.ArrayList<ContentType>(contentTypes);
    }

    /**
     * <p>
     * A list of predicted results for the type of content an image contains.
     * For example, the image content might be from animation, sports, or a
     * video game.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentTypes <p>
     *            A list of predicted results for the type of content an image
     *            contains. For example, the image content might be from
     *            animation, sports, or a video game.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContentModerationDetection withContentTypes(ContentType... contentTypes) {
        if (getContentTypes() == null) {
            this.contentTypes = new java.util.ArrayList<ContentType>(contentTypes.length);
        }
        for (ContentType value : contentTypes) {
            this.contentTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of predicted results for the type of content an image contains.
     * For example, the image content might be from animation, sports, or a
     * video game.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentTypes <p>
     *            A list of predicted results for the type of content an image
     *            contains. For example, the image content might be from
     *            animation, sports, or a video game.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContentModerationDetection withContentTypes(
            java.util.Collection<ContentType> contentTypes) {
        setContentTypes(contentTypes);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getModerationLabel() != null)
            sb.append("ModerationLabel: " + getModerationLabel() + ",");
        if (getStartTimestampMillis() != null)
            sb.append("StartTimestampMillis: " + getStartTimestampMillis() + ",");
        if (getEndTimestampMillis() != null)
            sb.append("EndTimestampMillis: " + getEndTimestampMillis() + ",");
        if (getDurationMillis() != null)
            sb.append("DurationMillis: " + getDurationMillis() + ",");
        if (getContentTypes() != null)
            sb.append("ContentTypes: " + getContentTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getModerationLabel() == null) ? 0 : getModerationLabel().hashCode());
        hashCode = prime * hashCode
                + ((getStartTimestampMillis() == null) ? 0 : getStartTimestampMillis().hashCode());
        hashCode = prime * hashCode
                + ((getEndTimestampMillis() == null) ? 0 : getEndTimestampMillis().hashCode());
        hashCode = prime * hashCode
                + ((getDurationMillis() == null) ? 0 : getDurationMillis().hashCode());
        hashCode = prime * hashCode
                + ((getContentTypes() == null) ? 0 : getContentTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentModerationDetection == false)
            return false;
        ContentModerationDetection other = (ContentModerationDetection) obj;

        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getModerationLabel() == null ^ this.getModerationLabel() == null)
            return false;
        if (other.getModerationLabel() != null
                && other.getModerationLabel().equals(this.getModerationLabel()) == false)
            return false;
        if (other.getStartTimestampMillis() == null ^ this.getStartTimestampMillis() == null)
            return false;
        if (other.getStartTimestampMillis() != null
                && other.getStartTimestampMillis().equals(this.getStartTimestampMillis()) == false)
            return false;
        if (other.getEndTimestampMillis() == null ^ this.getEndTimestampMillis() == null)
            return false;
        if (other.getEndTimestampMillis() != null
                && other.getEndTimestampMillis().equals(this.getEndTimestampMillis()) == false)
            return false;
        if (other.getDurationMillis() == null ^ this.getDurationMillis() == null)
            return false;
        if (other.getDurationMillis() != null
                && other.getDurationMillis().equals(this.getDurationMillis()) == false)
            return false;
        if (other.getContentTypes() == null ^ this.getContentTypes() == null)
            return false;
        if (other.getContentTypes() != null
                && other.getContentTypes().equals(this.getContentTypes()) == false)
            return false;
        return true;
    }
}
