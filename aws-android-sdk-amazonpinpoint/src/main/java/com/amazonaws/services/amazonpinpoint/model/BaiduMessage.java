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
 * Specifies the settings for a one-time message that's sent directly to an
 * endpoint through the Baidu (Baidu Cloud Push) channel.
 * </p>
 */
public class BaiduMessage implements Serializable {
    /**
     * <p>
     * The action to occur if the recipient taps the push notification. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent
     * to the background. This is the default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in
     * the app. This action uses the deep-linking features of the Android
     * platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and
     * loads the web page at a URL that you specify.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     */
    private String action;

    /**
     * <p>
     * The body of the notification message.
     * </p>
     */
    private String body;

    /**
     * <p>
     * The JSON data payload to use for the push notification, if the
     * notification is a silent push notification. This payload is added to the
     * data.pinpoint.jsonBody object of the notification.
     * </p>
     */
    private java.util.Map<String, String> data;

    /**
     * <p>
     * The icon image name of the asset saved in your app.
     * </p>
     */
    private String iconReference;

    /**
     * <p>
     * The URL of the large icon image to display in the content view of the
     * push notification.
     * </p>
     */
    private String imageIconUrl;

    /**
     * <p>
     * The URL of an image to display in the push notification.
     * </p>
     */
    private String imageUrl;

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. If specified, this value overrides all other content for the
     * message.
     * </p>
     */
    private String rawContent;

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which
     * is a push notification that doesn't display on a recipient's device.
     * Silent push notifications can be used for cases such as updating an app's
     * configuration or supporting phone home functionality.
     * </p>
     */
    private Boolean silentPush;

    /**
     * <p>
     * The URL of the small icon image to display in the status bar and the
     * content view of the push notification.
     * </p>
     */
    private String smallImageIconUrl;

    /**
     * <p>
     * The sound to play when the recipient receives the push notification. You
     * can use the default stream or specify the file name of a sound resource
     * that's bundled in your app. On an Android platform, the sound file must
     * reside in /res/raw/.
     * </p>
     */
    private String sound;

    /**
     * <p>
     * The default message variables to use in the notification message. You can
     * override the default variables with individual address variables.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> substitutions;

    /**
     * <p>
     * The amount of time, in seconds, that the Baidu Cloud Push service should
     * store the message if the recipient's device is offline. The default value
     * and maximum supported time is 604,800 seconds (7 days).
     * </p>
     */
    private Integer timeToLive;

    /**
     * <p>
     * The title to display above the notification message on the recipient's
     * device.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient
     * taps the push notification and the value of the Action property is URL.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The action to occur if the recipient taps the push notification. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent
     * to the background. This is the default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in
     * the app. This action uses the deep-linking features of the Android
     * platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and
     * loads the web page at a URL that you specify.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @return <p>
     *         The action to occur if the recipient taps the push notification.
     *         Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         OPEN_APP - Your app opens or it becomes the foreground app if it
     *         was sent to the background. This is the default action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DEEP_LINK - Your app opens and displays a designated user
     *         interface in the app. This action uses the deep-linking features
     *         of the Android platform.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         URL - The default mobile browser on the recipient's device opens
     *         and loads the web page at a URL that you specify.
     *         </p>
     *         </li>
     *         </ul>
     * @see Action
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The action to occur if the recipient taps the push notification. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent
     * to the background. This is the default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in
     * the app. This action uses the deep-linking features of the Android
     * platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and
     * loads the web page at a URL that you specify.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action <p>
     *            The action to occur if the recipient taps the push
     *            notification. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            OPEN_APP - Your app opens or it becomes the foreground app if
     *            it was sent to the background. This is the default action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DEEP_LINK - Your app opens and displays a designated user
     *            interface in the app. This action uses the deep-linking
     *            features of the Android platform.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            URL - The default mobile browser on the recipient's device
     *            opens and loads the web page at a URL that you specify.
     *            </p>
     *            </li>
     *            </ul>
     * @see Action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to occur if the recipient taps the push notification. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent
     * to the background. This is the default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in
     * the app. This action uses the deep-linking features of the Android
     * platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and
     * loads the web page at a URL that you specify.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action <p>
     *            The action to occur if the recipient taps the push
     *            notification. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            OPEN_APP - Your app opens or it becomes the foreground app if
     *            it was sent to the background. This is the default action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DEEP_LINK - Your app opens and displays a designated user
     *            interface in the app. This action uses the deep-linking
     *            features of the Android platform.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            URL - The default mobile browser on the recipient's device
     *            opens and loads the web page at a URL that you specify.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Action
     */
    public BaiduMessage withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The action to occur if the recipient taps the push notification. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent
     * to the background. This is the default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in
     * the app. This action uses the deep-linking features of the Android
     * platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and
     * loads the web page at a URL that you specify.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action <p>
     *            The action to occur if the recipient taps the push
     *            notification. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            OPEN_APP - Your app opens or it becomes the foreground app if
     *            it was sent to the background. This is the default action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DEEP_LINK - Your app opens and displays a designated user
     *            interface in the app. This action uses the deep-linking
     *            features of the Android platform.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            URL - The default mobile browser on the recipient's device
     *            opens and loads the web page at a URL that you specify.
     *            </p>
     *            </li>
     *            </ul>
     * @see Action
     */
    public void setAction(Action action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The action to occur if the recipient taps the push notification. Valid
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OPEN_APP - Your app opens or it becomes the foreground app if it was sent
     * to the background. This is the default action.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEEP_LINK - Your app opens and displays a designated user interface in
     * the app. This action uses the deep-linking features of the Android
     * platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * URL - The default mobile browser on the recipient's device opens and
     * loads the web page at a URL that you specify.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN_APP, DEEP_LINK, URL
     *
     * @param action <p>
     *            The action to occur if the recipient taps the push
     *            notification. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            OPEN_APP - Your app opens or it becomes the foreground app if
     *            it was sent to the background. This is the default action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DEEP_LINK - Your app opens and displays a designated user
     *            interface in the app. This action uses the deep-linking
     *            features of the Android platform.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            URL - The default mobile browser on the recipient's device
     *            opens and loads the web page at a URL that you specify.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Action
     */
    public BaiduMessage withAction(Action action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The body of the notification message.
     * </p>
     *
     * @return <p>
     *         The body of the notification message.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The body of the notification message.
     * </p>
     *
     * @param body <p>
     *            The body of the notification message.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the notification message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The body of the notification message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduMessage withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * The JSON data payload to use for the push notification, if the
     * notification is a silent push notification. This payload is added to the
     * data.pinpoint.jsonBody object of the notification.
     * </p>
     *
     * @return <p>
     *         The JSON data payload to use for the push notification, if the
     *         notification is a silent push notification. This payload is added
     *         to the data.pinpoint.jsonBody object of the notification.
     *         </p>
     */
    public java.util.Map<String, String> getData() {
        return data;
    }

    /**
     * <p>
     * The JSON data payload to use for the push notification, if the
     * notification is a silent push notification. This payload is added to the
     * data.pinpoint.jsonBody object of the notification.
     * </p>
     *
     * @param data <p>
     *            The JSON data payload to use for the push notification, if the
     *            notification is a silent push notification. This payload is
     *            added to the data.pinpoint.jsonBody object of the
     *            notification.
     *            </p>
     */
    public void setData(java.util.Map<String, String> data) {
        this.data = data;
    }

    /**
     * <p>
     * The JSON data payload to use for the push notification, if the
     * notification is a silent push notification. This payload is added to the
     * data.pinpoint.jsonBody object of the notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param data <p>
     *            The JSON data payload to use for the push notification, if the
     *            notification is a silent push notification. This payload is
     *            added to the data.pinpoint.jsonBody object of the
     *            notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduMessage withData(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }

    /**
     * <p>
     * The JSON data payload to use for the push notification, if the
     * notification is a silent push notification. This payload is added to the
     * data.pinpoint.jsonBody object of the notification.
     * </p>
     * <p>
     * The method adds a new key-value pair into Data parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Data.
     * @param value The corresponding value of the entry to be added into Data.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduMessage addDataEntry(String key, String value) {
        if (null == this.data) {
            this.data = new java.util.HashMap<String, String>();
        }
        if (this.data.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.data.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Data.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public BaiduMessage clearDataEntries() {
        this.data = null;
        return this;
    }

    /**
     * <p>
     * The icon image name of the asset saved in your app.
     * </p>
     *
     * @return <p>
     *         The icon image name of the asset saved in your app.
     *         </p>
     */
    public String getIconReference() {
        return iconReference;
    }

    /**
     * <p>
     * The icon image name of the asset saved in your app.
     * </p>
     *
     * @param iconReference <p>
     *            The icon image name of the asset saved in your app.
     *            </p>
     */
    public void setIconReference(String iconReference) {
        this.iconReference = iconReference;
    }

    /**
     * <p>
     * The icon image name of the asset saved in your app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iconReference <p>
     *            The icon image name of the asset saved in your app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduMessage withIconReference(String iconReference) {
        this.iconReference = iconReference;
        return this;
    }

    /**
     * <p>
     * The URL of the large icon image to display in the content view of the
     * push notification.
     * </p>
     *
     * @return <p>
     *         The URL of the large icon image to display in the content view of
     *         the push notification.
     *         </p>
     */
    public String getImageIconUrl() {
        return imageIconUrl;
    }

    /**
     * <p>
     * The URL of the large icon image to display in the content view of the
     * push notification.
     * </p>
     *
     * @param imageIconUrl <p>
     *            The URL of the large icon image to display in the content view
     *            of the push notification.
     *            </p>
     */
    public void setImageIconUrl(String imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
    }

    /**
     * <p>
     * The URL of the large icon image to display in the content view of the
     * push notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageIconUrl <p>
     *            The URL of the large icon image to display in the content view
     *            of the push notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduMessage withImageIconUrl(String imageIconUrl) {
        this.imageIconUrl = imageIconUrl;
        return this;
    }

    /**
     * <p>
     * The URL of an image to display in the push notification.
     * </p>
     *
     * @return <p>
     *         The URL of an image to display in the push notification.
     *         </p>
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * <p>
     * The URL of an image to display in the push notification.
     * </p>
     *
     * @param imageUrl <p>
     *            The URL of an image to display in the push notification.
     *            </p>
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * <p>
     * The URL of an image to display in the push notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageUrl <p>
     *            The URL of an image to display in the push notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduMessage withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. If specified, this value overrides all other content for the
     * message.
     * </p>
     *
     * @return <p>
     *         The raw, JSON-formatted string to use as the payload for the
     *         notification message. If specified, this value overrides all
     *         other content for the message.
     *         </p>
     */
    public String getRawContent() {
        return rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. If specified, this value overrides all other content for the
     * message.
     * </p>
     *
     * @param rawContent <p>
     *            The raw, JSON-formatted string to use as the payload for the
     *            notification message. If specified, this value overrides all
     *            other content for the message.
     *            </p>
     */
    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. If specified, this value overrides all other content for the
     * message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rawContent <p>
     *            The raw, JSON-formatted string to use as the payload for the
     *            notification message. If specified, this value overrides all
     *            other content for the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduMessage withRawContent(String rawContent) {
        this.rawContent = rawContent;
        return this;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which
     * is a push notification that doesn't display on a recipient's device.
     * Silent push notifications can be used for cases such as updating an app's
     * configuration or supporting phone home functionality.
     * </p>
     *
     * @return <p>
     *         Specifies whether the notification is a silent push notification,
     *         which is a push notification that doesn't display on a
     *         recipient's device. Silent push notifications can be used for
     *         cases such as updating an app's configuration or supporting phone
     *         home functionality.
     *         </p>
     */
    public Boolean isSilentPush() {
        return silentPush;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which
     * is a push notification that doesn't display on a recipient's device.
     * Silent push notifications can be used for cases such as updating an app's
     * configuration or supporting phone home functionality.
     * </p>
     *
     * @return <p>
     *         Specifies whether the notification is a silent push notification,
     *         which is a push notification that doesn't display on a
     *         recipient's device. Silent push notifications can be used for
     *         cases such as updating an app's configuration or supporting phone
     *         home functionality.
     *         </p>
     */
    public Boolean getSilentPush() {
        return silentPush;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which
     * is a push notification that doesn't display on a recipient's device.
     * Silent push notifications can be used for cases such as updating an app's
     * configuration or supporting phone home functionality.
     * </p>
     *
     * @param silentPush <p>
     *            Specifies whether the notification is a silent push
     *            notification, which is a push notification that doesn't
     *            display on a recipient's device. Silent push notifications can
     *            be used for cases such as updating an app's configuration or
     *            supporting phone home functionality.
     *            </p>
     */
    public void setSilentPush(Boolean silentPush) {
        this.silentPush = silentPush;
    }

    /**
     * <p>
     * Specifies whether the notification is a silent push notification, which
     * is a push notification that doesn't display on a recipient's device.
     * Silent push notifications can be used for cases such as updating an app's
     * configuration or supporting phone home functionality.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param silentPush <p>
     *            Specifies whether the notification is a silent push
     *            notification, which is a push notification that doesn't
     *            display on a recipient's device. Silent push notifications can
     *            be used for cases such as updating an app's configuration or
     *            supporting phone home functionality.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduMessage withSilentPush(Boolean silentPush) {
        this.silentPush = silentPush;
        return this;
    }

    /**
     * <p>
     * The URL of the small icon image to display in the status bar and the
     * content view of the push notification.
     * </p>
     *
     * @return <p>
     *         The URL of the small icon image to display in the status bar and
     *         the content view of the push notification.
     *         </p>
     */
    public String getSmallImageIconUrl() {
        return smallImageIconUrl;
    }

    /**
     * <p>
     * The URL of the small icon image to display in the status bar and the
     * content view of the push notification.
     * </p>
     *
     * @param smallImageIconUrl <p>
     *            The URL of the small icon image to display in the status bar
     *            and the content view of the push notification.
     *            </p>
     */
    public void setSmallImageIconUrl(String smallImageIconUrl) {
        this.smallImageIconUrl = smallImageIconUrl;
    }

    /**
     * <p>
     * The URL of the small icon image to display in the status bar and the
     * content view of the push notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param smallImageIconUrl <p>
     *            The URL of the small icon image to display in the status bar
     *            and the content view of the push notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduMessage withSmallImageIconUrl(String smallImageIconUrl) {
        this.smallImageIconUrl = smallImageIconUrl;
        return this;
    }

    /**
     * <p>
     * The sound to play when the recipient receives the push notification. You
     * can use the default stream or specify the file name of a sound resource
     * that's bundled in your app. On an Android platform, the sound file must
     * reside in /res/raw/.
     * </p>
     *
     * @return <p>
     *         The sound to play when the recipient receives the push
     *         notification. You can use the default stream or specify the file
     *         name of a sound resource that's bundled in your app. On an
     *         Android platform, the sound file must reside in /res/raw/.
     *         </p>
     */
    public String getSound() {
        return sound;
    }

    /**
     * <p>
     * The sound to play when the recipient receives the push notification. You
     * can use the default stream or specify the file name of a sound resource
     * that's bundled in your app. On an Android platform, the sound file must
     * reside in /res/raw/.
     * </p>
     *
     * @param sound <p>
     *            The sound to play when the recipient receives the push
     *            notification. You can use the default stream or specify the
     *            file name of a sound resource that's bundled in your app. On
     *            an Android platform, the sound file must reside in /res/raw/.
     *            </p>
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * <p>
     * The sound to play when the recipient receives the push notification. You
     * can use the default stream or specify the file name of a sound resource
     * that's bundled in your app. On an Android platform, the sound file must
     * reside in /res/raw/.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sound <p>
     *            The sound to play when the recipient receives the push
     *            notification. You can use the default stream or specify the
     *            file name of a sound resource that's bundled in your app. On
     *            an Android platform, the sound file must reside in /res/raw/.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduMessage withSound(String sound) {
        this.sound = sound;
        return this;
    }

    /**
     * <p>
     * The default message variables to use in the notification message. You can
     * override the default variables with individual address variables.
     * </p>
     *
     * @return <p>
     *         The default message variables to use in the notification message.
     *         You can override the default variables with individual address
     *         variables.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the notification message. You can
     * override the default variables with individual address variables.
     * </p>
     *
     * @param substitutions <p>
     *            The default message variables to use in the notification
     *            message. You can override the default variables with
     *            individual address variables.
     *            </p>
     */
    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the notification message. You can
     * override the default variables with individual address variables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param substitutions <p>
     *            The default message variables to use in the notification
     *            message. You can override the default variables with
     *            individual address variables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduMessage withSubstitutions(
            java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
        return this;
    }

    /**
     * <p>
     * The default message variables to use in the notification message. You can
     * override the default variables with individual address variables.
     * </p>
     * <p>
     * The method adds a new key-value pair into Substitutions parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Substitutions.
     * @param value The corresponding value of the entry to be added into
     *            Substitutions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
        if (null == this.substitutions) {
            this.substitutions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.substitutions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.substitutions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Substitutions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public BaiduMessage clearSubstitutionsEntries() {
        this.substitutions = null;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that the Baidu Cloud Push service should
     * store the message if the recipient's device is offline. The default value
     * and maximum supported time is 604,800 seconds (7 days).
     * </p>
     *
     * @return <p>
     *         The amount of time, in seconds, that the Baidu Cloud Push service
     *         should store the message if the recipient's device is offline.
     *         The default value and maximum supported time is 604,800 seconds
     *         (7 days).
     *         </p>
     */
    public Integer getTimeToLive() {
        return timeToLive;
    }

    /**
     * <p>
     * The amount of time, in seconds, that the Baidu Cloud Push service should
     * store the message if the recipient's device is offline. The default value
     * and maximum supported time is 604,800 seconds (7 days).
     * </p>
     *
     * @param timeToLive <p>
     *            The amount of time, in seconds, that the Baidu Cloud Push
     *            service should store the message if the recipient's device is
     *            offline. The default value and maximum supported time is
     *            604,800 seconds (7 days).
     *            </p>
     */
    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * <p>
     * The amount of time, in seconds, that the Baidu Cloud Push service should
     * store the message if the recipient's device is offline. The default value
     * and maximum supported time is 604,800 seconds (7 days).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeToLive <p>
     *            The amount of time, in seconds, that the Baidu Cloud Push
     *            service should store the message if the recipient's device is
     *            offline. The default value and maximum supported time is
     *            604,800 seconds (7 days).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduMessage withTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * <p>
     * The title to display above the notification message on the recipient's
     * device.
     * </p>
     *
     * @return <p>
     *         The title to display above the notification message on the
     *         recipient's device.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title to display above the notification message on the recipient's
     * device.
     * </p>
     *
     * @param title <p>
     *            The title to display above the notification message on the
     *            recipient's device.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title to display above the notification message on the recipient's
     * device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param title <p>
     *            The title to display above the notification message on the
     *            recipient's device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduMessage withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient
     * taps the push notification and the value of the Action property is URL.
     * </p>
     *
     * @return <p>
     *         The URL to open in the recipient's default mobile browser, if a
     *         recipient taps the push notification and the value of the Action
     *         property is URL.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient
     * taps the push notification and the value of the Action property is URL.
     * </p>
     *
     * @param url <p>
     *            The URL to open in the recipient's default mobile browser, if
     *            a recipient taps the push notification and the value of the
     *            Action property is URL.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL to open in the recipient's default mobile browser, if a recipient
     * taps the push notification and the value of the Action property is URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url <p>
     *            The URL to open in the recipient's default mobile browser, if
     *            a recipient taps the push notification and the value of the
     *            Action property is URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaiduMessage withUrl(String url) {
        this.url = url;
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getData() != null)
            sb.append("Data: " + getData() + ",");
        if (getIconReference() != null)
            sb.append("IconReference: " + getIconReference() + ",");
        if (getImageIconUrl() != null)
            sb.append("ImageIconUrl: " + getImageIconUrl() + ",");
        if (getImageUrl() != null)
            sb.append("ImageUrl: " + getImageUrl() + ",");
        if (getRawContent() != null)
            sb.append("RawContent: " + getRawContent() + ",");
        if (getSilentPush() != null)
            sb.append("SilentPush: " + getSilentPush() + ",");
        if (getSmallImageIconUrl() != null)
            sb.append("SmallImageIconUrl: " + getSmallImageIconUrl() + ",");
        if (getSound() != null)
            sb.append("Sound: " + getSound() + ",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: " + getSubstitutions() + ",");
        if (getTimeToLive() != null)
            sb.append("TimeToLive: " + getTimeToLive() + ",");
        if (getTitle() != null)
            sb.append("Title: " + getTitle() + ",");
        if (getUrl() != null)
            sb.append("Url: " + getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode
                + ((getIconReference() == null) ? 0 : getIconReference().hashCode());
        hashCode = prime * hashCode
                + ((getImageIconUrl() == null) ? 0 : getImageIconUrl().hashCode());
        hashCode = prime * hashCode + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        hashCode = prime * hashCode + ((getRawContent() == null) ? 0 : getRawContent().hashCode());
        hashCode = prime * hashCode + ((getSilentPush() == null) ? 0 : getSilentPush().hashCode());
        hashCode = prime * hashCode
                + ((getSmallImageIconUrl() == null) ? 0 : getSmallImageIconUrl().hashCode());
        hashCode = prime * hashCode + ((getSound() == null) ? 0 : getSound().hashCode());
        hashCode = prime * hashCode
                + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        hashCode = prime * hashCode + ((getTimeToLive() == null) ? 0 : getTimeToLive().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BaiduMessage == false)
            return false;
        BaiduMessage other = (BaiduMessage) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getIconReference() == null ^ this.getIconReference() == null)
            return false;
        if (other.getIconReference() != null
                && other.getIconReference().equals(this.getIconReference()) == false)
            return false;
        if (other.getImageIconUrl() == null ^ this.getImageIconUrl() == null)
            return false;
        if (other.getImageIconUrl() != null
                && other.getImageIconUrl().equals(this.getImageIconUrl()) == false)
            return false;
        if (other.getImageUrl() == null ^ this.getImageUrl() == null)
            return false;
        if (other.getImageUrl() != null && other.getImageUrl().equals(this.getImageUrl()) == false)
            return false;
        if (other.getRawContent() == null ^ this.getRawContent() == null)
            return false;
        if (other.getRawContent() != null
                && other.getRawContent().equals(this.getRawContent()) == false)
            return false;
        if (other.getSilentPush() == null ^ this.getSilentPush() == null)
            return false;
        if (other.getSilentPush() != null
                && other.getSilentPush().equals(this.getSilentPush()) == false)
            return false;
        if (other.getSmallImageIconUrl() == null ^ this.getSmallImageIconUrl() == null)
            return false;
        if (other.getSmallImageIconUrl() != null
                && other.getSmallImageIconUrl().equals(this.getSmallImageIconUrl()) == false)
            return false;
        if (other.getSound() == null ^ this.getSound() == null)
            return false;
        if (other.getSound() != null && other.getSound().equals(this.getSound()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null
                && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        if (other.getTimeToLive() == null ^ this.getTimeToLive() == null)
            return false;
        if (other.getTimeToLive() != null
                && other.getTimeToLive().equals(this.getTimeToLive()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }
}