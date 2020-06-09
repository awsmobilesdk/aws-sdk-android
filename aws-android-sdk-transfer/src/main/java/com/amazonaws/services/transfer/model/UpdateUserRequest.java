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

package com.amazonaws.services.transfer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Assigns new properties to a user. Parameters you pass modify any or all of
 * the following: the home directory, role, and policy for the
 * <code>UserName</code> and <code>ServerId</code> you specify.
 * </p>
 * <p>
 * The response returns the <code>ServerId</code> and the <code>UserName</code>
 * for the updated user.
 * </p>
 */
public class UpdateUserRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the landing directory (folder) for a user when they log in to
     * the file transfer protocol-enabled server using their file transfer
     * protocol client.
     * </p>
     * <p>
     * An example is <code>your-Amazon-S3-bucket-name&gt;/home/username</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^$|/.*<br/>
     */
    private String homeDirectory;

    /**
     * <p>
     * The type of landing directory (folder) you want your users' home
     * directory to be when they log into the file transfer protocol-enabled
     * server. If you set it to <code>PATH</code>, the user will see the
     * absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide
     * mappings in the <code>HomeDirectoryMappings</code> for how you want to
     * make Amazon S3 paths visible to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     */
    private String homeDirectoryType;

    /**
     * <p>
     * Logical directory mappings that specify what Amazon S3 paths and keys
     * should be visible to your user and how you want to make them visible. You
     * will need to specify the "<code>Entry</code>" and "<code>Target</code>"
     * pair, where <code>Entry</code> shows how the path is made visible and
     * <code>Target</code> is the actual Amazon S3 path. If you only specify a
     * target, it will be displayed as is. You will need to also make sure that
     * your IAM role provides access to paths in <code>Target</code>. The
     * following is an example.
     * </p>
     * <p>
     * <code>'[ "/bucket2/documentation", { "Entry": "your-personal-report.pdf", "Target": "/bucket3/customized-reports/${transfer:UserName}.pdf" } ]'</code>
     * </p>
     * <p>
     * In most cases, you can use this value instead of the scope-down policy to
     * lock your user down to the designated home directory ("chroot"). To do
     * this, you can set <code>Entry</code> to '/' and set <code>Target</code>
     * to the HomeDirectory parameter value.
     * </p>
     * <note>
     * <p>
     * If the target of a logical directory entry does not exist in Amazon S3,
     * the entry will be ignored. As a workaround, you can use the Amazon S3 api
     * to create 0 byte objects as place holders for your directory. If using
     * the CLI, use the <code>s3api</code> call instead of <code>s3</code> so
     * you can use the put-object operation. For example, you use the following:
     * <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>
     * . Make sure that the end of the key name ends in a / for it to be
     * considered a folder.
     * </p>
     * </note>
     */
    private java.util.List<HomeDirectoryMapEntry> homeDirectoryMappings;

    /**
     * <p>
     * Allows you to supply a scope-down policy for your user so you can use the
     * same IAM role across multiple users. The policy scopes down user access
     * to portions of your Amazon S3 bucket. Variables you can use inside this
     * policy include <code>${Transfer:UserName}</code>,
     * <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     * <note>
     * <p>
     * For scope-down policies, AWS Transfer Family stores the policy as a JSON
     * blob, instead of the Amazon Resource Name (ARN) of the policy. You save
     * the policy as a JSON blob and pass it in the <code>Policy</code>
     * argument.
     * </p>
     * <p>
     * For an example of a scope-down policy, see <a href=
     * "https://docs.aws.amazon.com/transfer/latest/userguide/users.html#users-policies-scope-down"
     * >Creating a scope-down policy</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html"
     * >AssumeRole</a> in the <i>AWS Security Token Service API Reference</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     */
    private String policy;

    /**
     * <p>
     * The IAM role that controls your users' access to your Amazon S3 bucket.
     * The policies attached to this role will determine the level of access you
     * want to provide your users when transferring files into and out of your
     * Amazon S3 bucket or buckets. The IAM role should also contain a trust
     * relationship that allows the file transfer protocol-enabled server to
     * access your resources when servicing your users' transfer requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     */
    private String role;

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server instance that the user account is assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     */
    private String serverId;

    /**
     * <p>
     * A unique string that identifies a user and is associated with a file
     * transfer protocol-enabled server as specified by the
     * <code>ServerId</code>. This is the string that will be used by your user
     * when they log in to your server. This user name is a minimum of 3 and a
     * maximum of 32 characters long. The following are valid characters: a-z,
     * A-Z, 0-9, underscore, and hyphen. The user name can't start with a
     * hyphen.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     */
    private String userName;

    /**
     * <p>
     * Specifies the landing directory (folder) for a user when they log in to
     * the file transfer protocol-enabled server using their file transfer
     * protocol client.
     * </p>
     * <p>
     * An example is <code>your-Amazon-S3-bucket-name&gt;/home/username</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^$|/.*<br/>
     *
     * @return <p>
     *         Specifies the landing directory (folder) for a user when they log
     *         in to the file transfer protocol-enabled server using their file
     *         transfer protocol client.
     *         </p>
     *         <p>
     *         An example is
     *         <code>your-Amazon-S3-bucket-name&gt;/home/username</code>.
     *         </p>
     */
    public String getHomeDirectory() {
        return homeDirectory;
    }

    /**
     * <p>
     * Specifies the landing directory (folder) for a user when they log in to
     * the file transfer protocol-enabled server using their file transfer
     * protocol client.
     * </p>
     * <p>
     * An example is <code>your-Amazon-S3-bucket-name&gt;/home/username</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^$|/.*<br/>
     *
     * @param homeDirectory <p>
     *            Specifies the landing directory (folder) for a user when they
     *            log in to the file transfer protocol-enabled server using
     *            their file transfer protocol client.
     *            </p>
     *            <p>
     *            An example is
     *            <code>your-Amazon-S3-bucket-name&gt;/home/username</code>.
     *            </p>
     */
    public void setHomeDirectory(String homeDirectory) {
        this.homeDirectory = homeDirectory;
    }

    /**
     * <p>
     * Specifies the landing directory (folder) for a user when they log in to
     * the file transfer protocol-enabled server using their file transfer
     * protocol client.
     * </p>
     * <p>
     * An example is <code>your-Amazon-S3-bucket-name&gt;/home/username</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^$|/.*<br/>
     *
     * @param homeDirectory <p>
     *            Specifies the landing directory (folder) for a user when they
     *            log in to the file transfer protocol-enabled server using
     *            their file transfer protocol client.
     *            </p>
     *            <p>
     *            An example is
     *            <code>your-Amazon-S3-bucket-name&gt;/home/username</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withHomeDirectory(String homeDirectory) {
        this.homeDirectory = homeDirectory;
        return this;
    }

    /**
     * <p>
     * The type of landing directory (folder) you want your users' home
     * directory to be when they log into the file transfer protocol-enabled
     * server. If you set it to <code>PATH</code>, the user will see the
     * absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide
     * mappings in the <code>HomeDirectoryMappings</code> for how you want to
     * make Amazon S3 paths visible to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     *
     * @return <p>
     *         The type of landing directory (folder) you want your users' home
     *         directory to be when they log into the file transfer
     *         protocol-enabled server. If you set it to <code>PATH</code>, the
     *         user will see the absolute Amazon S3 bucket paths as is in their
     *         file transfer protocol clients. If you set it
     *         <code>LOGICAL</code>, you will need to provide mappings in the
     *         <code>HomeDirectoryMappings</code> for how you want to make
     *         Amazon S3 paths visible to your users.
     *         </p>
     * @see HomeDirectoryType
     */
    public String getHomeDirectoryType() {
        return homeDirectoryType;
    }

    /**
     * <p>
     * The type of landing directory (folder) you want your users' home
     * directory to be when they log into the file transfer protocol-enabled
     * server. If you set it to <code>PATH</code>, the user will see the
     * absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide
     * mappings in the <code>HomeDirectoryMappings</code> for how you want to
     * make Amazon S3 paths visible to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     *
     * @param homeDirectoryType <p>
     *            The type of landing directory (folder) you want your users'
     *            home directory to be when they log into the file transfer
     *            protocol-enabled server. If you set it to <code>PATH</code>,
     *            the user will see the absolute Amazon S3 bucket paths as is in
     *            their file transfer protocol clients. If you set it
     *            <code>LOGICAL</code>, you will need to provide mappings in the
     *            <code>HomeDirectoryMappings</code> for how you want to make
     *            Amazon S3 paths visible to your users.
     *            </p>
     * @see HomeDirectoryType
     */
    public void setHomeDirectoryType(String homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType;
    }

    /**
     * <p>
     * The type of landing directory (folder) you want your users' home
     * directory to be when they log into the file transfer protocol-enabled
     * server. If you set it to <code>PATH</code>, the user will see the
     * absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide
     * mappings in the <code>HomeDirectoryMappings</code> for how you want to
     * make Amazon S3 paths visible to your users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     *
     * @param homeDirectoryType <p>
     *            The type of landing directory (folder) you want your users'
     *            home directory to be when they log into the file transfer
     *            protocol-enabled server. If you set it to <code>PATH</code>,
     *            the user will see the absolute Amazon S3 bucket paths as is in
     *            their file transfer protocol clients. If you set it
     *            <code>LOGICAL</code>, you will need to provide mappings in the
     *            <code>HomeDirectoryMappings</code> for how you want to make
     *            Amazon S3 paths visible to your users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HomeDirectoryType
     */
    public UpdateUserRequest withHomeDirectoryType(String homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType;
        return this;
    }

    /**
     * <p>
     * The type of landing directory (folder) you want your users' home
     * directory to be when they log into the file transfer protocol-enabled
     * server. If you set it to <code>PATH</code>, the user will see the
     * absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide
     * mappings in the <code>HomeDirectoryMappings</code> for how you want to
     * make Amazon S3 paths visible to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     *
     * @param homeDirectoryType <p>
     *            The type of landing directory (folder) you want your users'
     *            home directory to be when they log into the file transfer
     *            protocol-enabled server. If you set it to <code>PATH</code>,
     *            the user will see the absolute Amazon S3 bucket paths as is in
     *            their file transfer protocol clients. If you set it
     *            <code>LOGICAL</code>, you will need to provide mappings in the
     *            <code>HomeDirectoryMappings</code> for how you want to make
     *            Amazon S3 paths visible to your users.
     *            </p>
     * @see HomeDirectoryType
     */
    public void setHomeDirectoryType(HomeDirectoryType homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType.toString();
    }

    /**
     * <p>
     * The type of landing directory (folder) you want your users' home
     * directory to be when they log into the file transfer protocol-enabled
     * server. If you set it to <code>PATH</code>, the user will see the
     * absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide
     * mappings in the <code>HomeDirectoryMappings</code> for how you want to
     * make Amazon S3 paths visible to your users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     *
     * @param homeDirectoryType <p>
     *            The type of landing directory (folder) you want your users'
     *            home directory to be when they log into the file transfer
     *            protocol-enabled server. If you set it to <code>PATH</code>,
     *            the user will see the absolute Amazon S3 bucket paths as is in
     *            their file transfer protocol clients. If you set it
     *            <code>LOGICAL</code>, you will need to provide mappings in the
     *            <code>HomeDirectoryMappings</code> for how you want to make
     *            Amazon S3 paths visible to your users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HomeDirectoryType
     */
    public UpdateUserRequest withHomeDirectoryType(HomeDirectoryType homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType.toString();
        return this;
    }

    /**
     * <p>
     * Logical directory mappings that specify what Amazon S3 paths and keys
     * should be visible to your user and how you want to make them visible. You
     * will need to specify the "<code>Entry</code>" and "<code>Target</code>"
     * pair, where <code>Entry</code> shows how the path is made visible and
     * <code>Target</code> is the actual Amazon S3 path. If you only specify a
     * target, it will be displayed as is. You will need to also make sure that
     * your IAM role provides access to paths in <code>Target</code>. The
     * following is an example.
     * </p>
     * <p>
     * <code>'[ "/bucket2/documentation", { "Entry": "your-personal-report.pdf", "Target": "/bucket3/customized-reports/${transfer:UserName}.pdf" } ]'</code>
     * </p>
     * <p>
     * In most cases, you can use this value instead of the scope-down policy to
     * lock your user down to the designated home directory ("chroot"). To do
     * this, you can set <code>Entry</code> to '/' and set <code>Target</code>
     * to the HomeDirectory parameter value.
     * </p>
     * <note>
     * <p>
     * If the target of a logical directory entry does not exist in Amazon S3,
     * the entry will be ignored. As a workaround, you can use the Amazon S3 api
     * to create 0 byte objects as place holders for your directory. If using
     * the CLI, use the <code>s3api</code> call instead of <code>s3</code> so
     * you can use the put-object operation. For example, you use the following:
     * <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>
     * . Make sure that the end of the key name ends in a / for it to be
     * considered a folder.
     * </p>
     * </note>
     *
     * @return <p>
     *         Logical directory mappings that specify what Amazon S3 paths and
     *         keys should be visible to your user and how you want to make them
     *         visible. You will need to specify the "<code>Entry</code>" and "
     *         <code>Target</code>" pair, where <code>Entry</code> shows how the
     *         path is made visible and <code>Target</code> is the actual Amazon
     *         S3 path. If you only specify a target, it will be displayed as
     *         is. You will need to also make sure that your IAM role provides
     *         access to paths in <code>Target</code>. The following is an
     *         example.
     *         </p>
     *         <p>
     *         <code>'[ "/bucket2/documentation", { "Entry": "your-personal-report.pdf", "Target": "/bucket3/customized-reports/${transfer:UserName}.pdf" } ]'</code>
     *         </p>
     *         <p>
     *         In most cases, you can use this value instead of the scope-down
     *         policy to lock your user down to the designated home directory
     *         ("chroot"). To do this, you can set <code>Entry</code> to '/' and
     *         set <code>Target</code> to the HomeDirectory parameter value.
     *         </p>
     *         <note>
     *         <p>
     *         If the target of a logical directory entry does not exist in
     *         Amazon S3, the entry will be ignored. As a workaround, you can
     *         use the Amazon S3 api to create 0 byte objects as place holders
     *         for your directory. If using the CLI, use the <code>s3api</code>
     *         call instead of <code>s3</code> so you can use the put-object
     *         operation. For example, you use the following:
     *         <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>
     *         . Make sure that the end of the key name ends in a / for it to be
     *         considered a folder.
     *         </p>
     *         </note>
     */
    public java.util.List<HomeDirectoryMapEntry> getHomeDirectoryMappings() {
        return homeDirectoryMappings;
    }

    /**
     * <p>
     * Logical directory mappings that specify what Amazon S3 paths and keys
     * should be visible to your user and how you want to make them visible. You
     * will need to specify the "<code>Entry</code>" and "<code>Target</code>"
     * pair, where <code>Entry</code> shows how the path is made visible and
     * <code>Target</code> is the actual Amazon S3 path. If you only specify a
     * target, it will be displayed as is. You will need to also make sure that
     * your IAM role provides access to paths in <code>Target</code>. The
     * following is an example.
     * </p>
     * <p>
     * <code>'[ "/bucket2/documentation", { "Entry": "your-personal-report.pdf", "Target": "/bucket3/customized-reports/${transfer:UserName}.pdf" } ]'</code>
     * </p>
     * <p>
     * In most cases, you can use this value instead of the scope-down policy to
     * lock your user down to the designated home directory ("chroot"). To do
     * this, you can set <code>Entry</code> to '/' and set <code>Target</code>
     * to the HomeDirectory parameter value.
     * </p>
     * <note>
     * <p>
     * If the target of a logical directory entry does not exist in Amazon S3,
     * the entry will be ignored. As a workaround, you can use the Amazon S3 api
     * to create 0 byte objects as place holders for your directory. If using
     * the CLI, use the <code>s3api</code> call instead of <code>s3</code> so
     * you can use the put-object operation. For example, you use the following:
     * <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>
     * . Make sure that the end of the key name ends in a / for it to be
     * considered a folder.
     * </p>
     * </note>
     *
     * @param homeDirectoryMappings <p>
     *            Logical directory mappings that specify what Amazon S3 paths
     *            and keys should be visible to your user and how you want to
     *            make them visible. You will need to specify the "
     *            <code>Entry</code>" and "<code>Target</code>" pair, where
     *            <code>Entry</code> shows how the path is made visible and
     *            <code>Target</code> is the actual Amazon S3 path. If you only
     *            specify a target, it will be displayed as is. You will need to
     *            also make sure that your IAM role provides access to paths in
     *            <code>Target</code>. The following is an example.
     *            </p>
     *            <p>
     *            <code>'[ "/bucket2/documentation", { "Entry": "your-personal-report.pdf", "Target": "/bucket3/customized-reports/${transfer:UserName}.pdf" } ]'</code>
     *            </p>
     *            <p>
     *            In most cases, you can use this value instead of the
     *            scope-down policy to lock your user down to the designated
     *            home directory ("chroot"). To do this, you can set
     *            <code>Entry</code> to '/' and set <code>Target</code> to the
     *            HomeDirectory parameter value.
     *            </p>
     *            <note>
     *            <p>
     *            If the target of a logical directory entry does not exist in
     *            Amazon S3, the entry will be ignored. As a workaround, you can
     *            use the Amazon S3 api to create 0 byte objects as place
     *            holders for your directory. If using the CLI, use the
     *            <code>s3api</code> call instead of <code>s3</code> so you can
     *            use the put-object operation. For example, you use the
     *            following:
     *            <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>
     *            . Make sure that the end of the key name ends in a / for it to
     *            be considered a folder.
     *            </p>
     *            </note>
     */
    public void setHomeDirectoryMappings(
            java.util.Collection<HomeDirectoryMapEntry> homeDirectoryMappings) {
        if (homeDirectoryMappings == null) {
            this.homeDirectoryMappings = null;
            return;
        }

        this.homeDirectoryMappings = new java.util.ArrayList<HomeDirectoryMapEntry>(
                homeDirectoryMappings);
    }

    /**
     * <p>
     * Logical directory mappings that specify what Amazon S3 paths and keys
     * should be visible to your user and how you want to make them visible. You
     * will need to specify the "<code>Entry</code>" and "<code>Target</code>"
     * pair, where <code>Entry</code> shows how the path is made visible and
     * <code>Target</code> is the actual Amazon S3 path. If you only specify a
     * target, it will be displayed as is. You will need to also make sure that
     * your IAM role provides access to paths in <code>Target</code>. The
     * following is an example.
     * </p>
     * <p>
     * <code>'[ "/bucket2/documentation", { "Entry": "your-personal-report.pdf", "Target": "/bucket3/customized-reports/${transfer:UserName}.pdf" } ]'</code>
     * </p>
     * <p>
     * In most cases, you can use this value instead of the scope-down policy to
     * lock your user down to the designated home directory ("chroot"). To do
     * this, you can set <code>Entry</code> to '/' and set <code>Target</code>
     * to the HomeDirectory parameter value.
     * </p>
     * <note>
     * <p>
     * If the target of a logical directory entry does not exist in Amazon S3,
     * the entry will be ignored. As a workaround, you can use the Amazon S3 api
     * to create 0 byte objects as place holders for your directory. If using
     * the CLI, use the <code>s3api</code> call instead of <code>s3</code> so
     * you can use the put-object operation. For example, you use the following:
     * <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>
     * . Make sure that the end of the key name ends in a / for it to be
     * considered a folder.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param homeDirectoryMappings <p>
     *            Logical directory mappings that specify what Amazon S3 paths
     *            and keys should be visible to your user and how you want to
     *            make them visible. You will need to specify the "
     *            <code>Entry</code>" and "<code>Target</code>" pair, where
     *            <code>Entry</code> shows how the path is made visible and
     *            <code>Target</code> is the actual Amazon S3 path. If you only
     *            specify a target, it will be displayed as is. You will need to
     *            also make sure that your IAM role provides access to paths in
     *            <code>Target</code>. The following is an example.
     *            </p>
     *            <p>
     *            <code>'[ "/bucket2/documentation", { "Entry": "your-personal-report.pdf", "Target": "/bucket3/customized-reports/${transfer:UserName}.pdf" } ]'</code>
     *            </p>
     *            <p>
     *            In most cases, you can use this value instead of the
     *            scope-down policy to lock your user down to the designated
     *            home directory ("chroot"). To do this, you can set
     *            <code>Entry</code> to '/' and set <code>Target</code> to the
     *            HomeDirectory parameter value.
     *            </p>
     *            <note>
     *            <p>
     *            If the target of a logical directory entry does not exist in
     *            Amazon S3, the entry will be ignored. As a workaround, you can
     *            use the Amazon S3 api to create 0 byte objects as place
     *            holders for your directory. If using the CLI, use the
     *            <code>s3api</code> call instead of <code>s3</code> so you can
     *            use the put-object operation. For example, you use the
     *            following:
     *            <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>
     *            . Make sure that the end of the key name ends in a / for it to
     *            be considered a folder.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withHomeDirectoryMappings(
            HomeDirectoryMapEntry... homeDirectoryMappings) {
        if (getHomeDirectoryMappings() == null) {
            this.homeDirectoryMappings = new java.util.ArrayList<HomeDirectoryMapEntry>(
                    homeDirectoryMappings.length);
        }
        for (HomeDirectoryMapEntry value : homeDirectoryMappings) {
            this.homeDirectoryMappings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Logical directory mappings that specify what Amazon S3 paths and keys
     * should be visible to your user and how you want to make them visible. You
     * will need to specify the "<code>Entry</code>" and "<code>Target</code>"
     * pair, where <code>Entry</code> shows how the path is made visible and
     * <code>Target</code> is the actual Amazon S3 path. If you only specify a
     * target, it will be displayed as is. You will need to also make sure that
     * your IAM role provides access to paths in <code>Target</code>. The
     * following is an example.
     * </p>
     * <p>
     * <code>'[ "/bucket2/documentation", { "Entry": "your-personal-report.pdf", "Target": "/bucket3/customized-reports/${transfer:UserName}.pdf" } ]'</code>
     * </p>
     * <p>
     * In most cases, you can use this value instead of the scope-down policy to
     * lock your user down to the designated home directory ("chroot"). To do
     * this, you can set <code>Entry</code> to '/' and set <code>Target</code>
     * to the HomeDirectory parameter value.
     * </p>
     * <note>
     * <p>
     * If the target of a logical directory entry does not exist in Amazon S3,
     * the entry will be ignored. As a workaround, you can use the Amazon S3 api
     * to create 0 byte objects as place holders for your directory. If using
     * the CLI, use the <code>s3api</code> call instead of <code>s3</code> so
     * you can use the put-object operation. For example, you use the following:
     * <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>
     * . Make sure that the end of the key name ends in a / for it to be
     * considered a folder.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param homeDirectoryMappings <p>
     *            Logical directory mappings that specify what Amazon S3 paths
     *            and keys should be visible to your user and how you want to
     *            make them visible. You will need to specify the "
     *            <code>Entry</code>" and "<code>Target</code>" pair, where
     *            <code>Entry</code> shows how the path is made visible and
     *            <code>Target</code> is the actual Amazon S3 path. If you only
     *            specify a target, it will be displayed as is. You will need to
     *            also make sure that your IAM role provides access to paths in
     *            <code>Target</code>. The following is an example.
     *            </p>
     *            <p>
     *            <code>'[ "/bucket2/documentation", { "Entry": "your-personal-report.pdf", "Target": "/bucket3/customized-reports/${transfer:UserName}.pdf" } ]'</code>
     *            </p>
     *            <p>
     *            In most cases, you can use this value instead of the
     *            scope-down policy to lock your user down to the designated
     *            home directory ("chroot"). To do this, you can set
     *            <code>Entry</code> to '/' and set <code>Target</code> to the
     *            HomeDirectory parameter value.
     *            </p>
     *            <note>
     *            <p>
     *            If the target of a logical directory entry does not exist in
     *            Amazon S3, the entry will be ignored. As a workaround, you can
     *            use the Amazon S3 api to create 0 byte objects as place
     *            holders for your directory. If using the CLI, use the
     *            <code>s3api</code> call instead of <code>s3</code> so you can
     *            use the put-object operation. For example, you use the
     *            following:
     *            <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>
     *            . Make sure that the end of the key name ends in a / for it to
     *            be considered a folder.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withHomeDirectoryMappings(
            java.util.Collection<HomeDirectoryMapEntry> homeDirectoryMappings) {
        setHomeDirectoryMappings(homeDirectoryMappings);
        return this;
    }

    /**
     * <p>
     * Allows you to supply a scope-down policy for your user so you can use the
     * same IAM role across multiple users. The policy scopes down user access
     * to portions of your Amazon S3 bucket. Variables you can use inside this
     * policy include <code>${Transfer:UserName}</code>,
     * <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     * <note>
     * <p>
     * For scope-down policies, AWS Transfer Family stores the policy as a JSON
     * blob, instead of the Amazon Resource Name (ARN) of the policy. You save
     * the policy as a JSON blob and pass it in the <code>Policy</code>
     * argument.
     * </p>
     * <p>
     * For an example of a scope-down policy, see <a href=
     * "https://docs.aws.amazon.com/transfer/latest/userguide/users.html#users-policies-scope-down"
     * >Creating a scope-down policy</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html"
     * >AssumeRole</a> in the <i>AWS Security Token Service API Reference</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @return <p>
     *         Allows you to supply a scope-down policy for your user so you can
     *         use the same IAM role across multiple users. The policy scopes
     *         down user access to portions of your Amazon S3 bucket. Variables
     *         you can use inside this policy include
     *         <code>${Transfer:UserName}</code>,
     *         <code>${Transfer:HomeDirectory}</code>, and
     *         <code>${Transfer:HomeBucket}</code>.
     *         </p>
     *         <note>
     *         <p>
     *         For scope-down policies, AWS Transfer Family stores the policy as
     *         a JSON blob, instead of the Amazon Resource Name (ARN) of the
     *         policy. You save the policy as a JSON blob and pass it in the
     *         <code>Policy</code> argument.
     *         </p>
     *         <p>
     *         For an example of a scope-down policy, see <a href=
     *         "https://docs.aws.amazon.com/transfer/latest/userguide/users.html#users-policies-scope-down"
     *         >Creating a scope-down policy</a>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html"
     *         >AssumeRole</a> in the <i>AWS Security Token Service API
     *         Reference</i>.
     *         </p>
     *         </note>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * Allows you to supply a scope-down policy for your user so you can use the
     * same IAM role across multiple users. The policy scopes down user access
     * to portions of your Amazon S3 bucket. Variables you can use inside this
     * policy include <code>${Transfer:UserName}</code>,
     * <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     * <note>
     * <p>
     * For scope-down policies, AWS Transfer Family stores the policy as a JSON
     * blob, instead of the Amazon Resource Name (ARN) of the policy. You save
     * the policy as a JSON blob and pass it in the <code>Policy</code>
     * argument.
     * </p>
     * <p>
     * For an example of a scope-down policy, see <a href=
     * "https://docs.aws.amazon.com/transfer/latest/userguide/users.html#users-policies-scope-down"
     * >Creating a scope-down policy</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html"
     * >AssumeRole</a> in the <i>AWS Security Token Service API Reference</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param policy <p>
     *            Allows you to supply a scope-down policy for your user so you
     *            can use the same IAM role across multiple users. The policy
     *            scopes down user access to portions of your Amazon S3 bucket.
     *            Variables you can use inside this policy include
     *            <code>${Transfer:UserName}</code>,
     *            <code>${Transfer:HomeDirectory}</code>, and
     *            <code>${Transfer:HomeBucket}</code>.
     *            </p>
     *            <note>
     *            <p>
     *            For scope-down policies, AWS Transfer Family stores the policy
     *            as a JSON blob, instead of the Amazon Resource Name (ARN) of
     *            the policy. You save the policy as a JSON blob and pass it in
     *            the <code>Policy</code> argument.
     *            </p>
     *            <p>
     *            For an example of a scope-down policy, see <a href=
     *            "https://docs.aws.amazon.com/transfer/latest/userguide/users.html#users-policies-scope-down"
     *            >Creating a scope-down policy</a>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html"
     *            >AssumeRole</a> in the <i>AWS Security Token Service API
     *            Reference</i>.
     *            </p>
     *            </note>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * Allows you to supply a scope-down policy for your user so you can use the
     * same IAM role across multiple users. The policy scopes down user access
     * to portions of your Amazon S3 bucket. Variables you can use inside this
     * policy include <code>${Transfer:UserName}</code>,
     * <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     * <note>
     * <p>
     * For scope-down policies, AWS Transfer Family stores the policy as a JSON
     * blob, instead of the Amazon Resource Name (ARN) of the policy. You save
     * the policy as a JSON blob and pass it in the <code>Policy</code>
     * argument.
     * </p>
     * <p>
     * For an example of a scope-down policy, see <a href=
     * "https://docs.aws.amazon.com/transfer/latest/userguide/users.html#users-policies-scope-down"
     * >Creating a scope-down policy</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html"
     * >AssumeRole</a> in the <i>AWS Security Token Service API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param policy <p>
     *            Allows you to supply a scope-down policy for your user so you
     *            can use the same IAM role across multiple users. The policy
     *            scopes down user access to portions of your Amazon S3 bucket.
     *            Variables you can use inside this policy include
     *            <code>${Transfer:UserName}</code>,
     *            <code>${Transfer:HomeDirectory}</code>, and
     *            <code>${Transfer:HomeBucket}</code>.
     *            </p>
     *            <note>
     *            <p>
     *            For scope-down policies, AWS Transfer Family stores the policy
     *            as a JSON blob, instead of the Amazon Resource Name (ARN) of
     *            the policy. You save the policy as a JSON blob and pass it in
     *            the <code>Policy</code> argument.
     *            </p>
     *            <p>
     *            For an example of a scope-down policy, see <a href=
     *            "https://docs.aws.amazon.com/transfer/latest/userguide/users.html#users-policies-scope-down"
     *            >Creating a scope-down policy</a>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html"
     *            >AssumeRole</a> in the <i>AWS Security Token Service API
     *            Reference</i>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * <p>
     * The IAM role that controls your users' access to your Amazon S3 bucket.
     * The policies attached to this role will determine the level of access you
     * want to provide your users when transferring files into and out of your
     * Amazon S3 bucket or buckets. The IAM role should also contain a trust
     * relationship that allows the file transfer protocol-enabled server to
     * access your resources when servicing your users' transfer requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @return <p>
     *         The IAM role that controls your users' access to your Amazon S3
     *         bucket. The policies attached to this role will determine the
     *         level of access you want to provide your users when transferring
     *         files into and out of your Amazon S3 bucket or buckets. The IAM
     *         role should also contain a trust relationship that allows the
     *         file transfer protocol-enabled server to access your resources
     *         when servicing your users' transfer requests.
     *         </p>
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The IAM role that controls your users' access to your Amazon S3 bucket.
     * The policies attached to this role will determine the level of access you
     * want to provide your users when transferring files into and out of your
     * Amazon S3 bucket or buckets. The IAM role should also contain a trust
     * relationship that allows the file transfer protocol-enabled server to
     * access your resources when servicing your users' transfer requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @param role <p>
     *            The IAM role that controls your users' access to your Amazon
     *            S3 bucket. The policies attached to this role will determine
     *            the level of access you want to provide your users when
     *            transferring files into and out of your Amazon S3 bucket or
     *            buckets. The IAM role should also contain a trust relationship
     *            that allows the file transfer protocol-enabled server to
     *            access your resources when servicing your users' transfer
     *            requests.
     *            </p>
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The IAM role that controls your users' access to your Amazon S3 bucket.
     * The policies attached to this role will determine the level of access you
     * want to provide your users when transferring files into and out of your
     * Amazon S3 bucket or buckets. The IAM role should also contain a trust
     * relationship that allows the file transfer protocol-enabled server to
     * access your resources when servicing your users' transfer requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @param role <p>
     *            The IAM role that controls your users' access to your Amazon
     *            S3 bucket. The policies attached to this role will determine
     *            the level of access you want to provide your users when
     *            transferring files into and out of your Amazon S3 bucket or
     *            buckets. The IAM role should also contain a trust relationship
     *            that allows the file transfer protocol-enabled server to
     *            access your resources when servicing your users' transfer
     *            requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server instance that the user account is assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @return <p>
     *         A system-assigned unique identifier for a file transfer
     *         protocol-enabled server instance that the user account is
     *         assigned to.
     *         </p>
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server instance that the user account is assigned to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @param serverId <p>
     *            A system-assigned unique identifier for a file transfer
     *            protocol-enabled server instance that the user account is
     *            assigned to.
     *            </p>
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a file transfer protocol-enabled
     * server instance that the user account is assigned to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @param serverId <p>
     *            A system-assigned unique identifier for a file transfer
     *            protocol-enabled server instance that the user account is
     *            assigned to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * <p>
     * A unique string that identifies a user and is associated with a file
     * transfer protocol-enabled server as specified by the
     * <code>ServerId</code>. This is the string that will be used by your user
     * when they log in to your server. This user name is a minimum of 3 and a
     * maximum of 32 characters long. The following are valid characters: a-z,
     * A-Z, 0-9, underscore, and hyphen. The user name can't start with a
     * hyphen.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @return <p>
     *         A unique string that identifies a user and is associated with a
     *         file transfer protocol-enabled server as specified by the
     *         <code>ServerId</code>. This is the string that will be used by
     *         your user when they log in to your server. This user name is a
     *         minimum of 3 and a maximum of 32 characters long. The following
     *         are valid characters: a-z, A-Z, 0-9, underscore, and hyphen. The
     *         user name can't start with a hyphen.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * A unique string that identifies a user and is associated with a file
     * transfer protocol-enabled server as specified by the
     * <code>ServerId</code>. This is the string that will be used by your user
     * when they log in to your server. This user name is a minimum of 3 and a
     * maximum of 32 characters long. The following are valid characters: a-z,
     * A-Z, 0-9, underscore, and hyphen. The user name can't start with a
     * hyphen.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @param userName <p>
     *            A unique string that identifies a user and is associated with
     *            a file transfer protocol-enabled server as specified by the
     *            <code>ServerId</code>. This is the string that will be used by
     *            your user when they log in to your server. This user name is a
     *            minimum of 3 and a maximum of 32 characters long. The
     *            following are valid characters: a-z, A-Z, 0-9, underscore, and
     *            hyphen. The user name can't start with a hyphen.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * A unique string that identifies a user and is associated with a file
     * transfer protocol-enabled server as specified by the
     * <code>ServerId</code>. This is the string that will be used by your user
     * when they log in to your server. This user name is a minimum of 3 and a
     * maximum of 32 characters long. The following are valid characters: a-z,
     * A-Z, 0-9, underscore, and hyphen. The user name can't start with a
     * hyphen.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @param userName <p>
     *            A unique string that identifies a user and is associated with
     *            a file transfer protocol-enabled server as specified by the
     *            <code>ServerId</code>. This is the string that will be used by
     *            your user when they log in to your server. This user name is a
     *            minimum of 3 and a maximum of 32 characters long. The
     *            following are valid characters: a-z, A-Z, 0-9, underscore, and
     *            hyphen. The user name can't start with a hyphen.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withUserName(String userName) {
        this.userName = userName;
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
        if (getHomeDirectory() != null)
            sb.append("HomeDirectory: " + getHomeDirectory() + ",");
        if (getHomeDirectoryType() != null)
            sb.append("HomeDirectoryType: " + getHomeDirectoryType() + ",");
        if (getHomeDirectoryMappings() != null)
            sb.append("HomeDirectoryMappings: " + getHomeDirectoryMappings() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getServerId() != null)
            sb.append("ServerId: " + getServerId() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHomeDirectory() == null) ? 0 : getHomeDirectory().hashCode());
        hashCode = prime * hashCode
                + ((getHomeDirectoryType() == null) ? 0 : getHomeDirectoryType().hashCode());
        hashCode = prime
                * hashCode
                + ((getHomeDirectoryMappings() == null) ? 0 : getHomeDirectoryMappings().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserRequest == false)
            return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;

        if (other.getHomeDirectory() == null ^ this.getHomeDirectory() == null)
            return false;
        if (other.getHomeDirectory() != null
                && other.getHomeDirectory().equals(this.getHomeDirectory()) == false)
            return false;
        if (other.getHomeDirectoryType() == null ^ this.getHomeDirectoryType() == null)
            return false;
        if (other.getHomeDirectoryType() != null
                && other.getHomeDirectoryType().equals(this.getHomeDirectoryType()) == false)
            return false;
        if (other.getHomeDirectoryMappings() == null ^ this.getHomeDirectoryMappings() == null)
            return false;
        if (other.getHomeDirectoryMappings() != null
                && other.getHomeDirectoryMappings().equals(this.getHomeDirectoryMappings()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }
}
