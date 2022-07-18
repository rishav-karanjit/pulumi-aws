// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.storagegateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.storagegateway.NfsFileShareArgs;
import com.pulumi.aws.storagegateway.inputs.NfsFileShareState;
import com.pulumi.aws.storagegateway.outputs.NfsFileShareCacheAttributes;
import com.pulumi.aws.storagegateway.outputs.NfsFileShareNfsFileShareDefaults;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an AWS Storage Gateway NFS File Share.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new NfsFileShare(&#34;example&#34;, NfsFileShareArgs.builder()        
 *             .clientLists(&#34;0.0.0.0/0&#34;)
 *             .gatewayArn(aws_storagegateway_gateway.example().arn())
 *             .locationArn(aws_s3_bucket.example().arn())
 *             .roleArn(aws_iam_role.example().arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_storagegateway_nfs_file_share` can be imported by using the NFS File Share Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:storagegateway/nfsFileShare:NfsFileShare example arn:aws:storagegateway:us-east-1:123456789012:share/share-12345678
 * ```
 * 
 */
@ResourceType(type="aws:storagegateway/nfsFileShare:NfsFileShare")
public class NfsFileShare extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the NFS File Share.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the NFS File Share.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The Amazon Resource Name (ARN) of the storage used for audit logs.
     * 
     */
    @Export(name="auditDestinationArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> auditDestinationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the storage used for audit logs.
     * 
     */
    public Output<Optional<String>> auditDestinationArn() {
        return Codegen.optional(this.auditDestinationArn);
    }
    /**
     * The region of the S3 bucket used by the file share. Required when specifying `vpc_endpoint_dns_name`.
     * 
     */
    @Export(name="bucketRegion", type=String.class, parameters={})
    private Output</* @Nullable */ String> bucketRegion;

    /**
     * @return The region of the S3 bucket used by the file share. Required when specifying `vpc_endpoint_dns_name`.
     * 
     */
    public Output<Optional<String>> bucketRegion() {
        return Codegen.optional(this.bucketRegion);
    }
    /**
     * Refresh cache information. see Cache Attributes for more details.
     * 
     */
    @Export(name="cacheAttributes", type=NfsFileShareCacheAttributes.class, parameters={})
    private Output</* @Nullable */ NfsFileShareCacheAttributes> cacheAttributes;

    /**
     * @return Refresh cache information. see Cache Attributes for more details.
     * 
     */
    public Output<Optional<NfsFileShareCacheAttributes>> cacheAttributes() {
        return Codegen.optional(this.cacheAttributes);
    }
    /**
     * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `[&#34;0.0.0.0/0&#34;]` to not limit access. Minimum 1 item. Maximum 100 items.
     * 
     */
    @Export(name="clientLists", type=List.class, parameters={String.class})
    private Output<List<String>> clientLists;

    /**
     * @return The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks. Set to `[&#34;0.0.0.0/0&#34;]` to not limit access. Minimum 1 item. Maximum 100 items.
     * 
     */
    public Output<List<String>> clientLists() {
        return this.clientLists;
    }
    /**
     * The default [storage class](https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateNFSFileShare.html#StorageGateway-CreateNFSFileShare-request-DefaultStorageClass) for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`.
     * 
     */
    @Export(name="defaultStorageClass", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultStorageClass;

    /**
     * @return The default [storage class](https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateNFSFileShare.html#StorageGateway-CreateNFSFileShare-request-DefaultStorageClass) for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`.
     * 
     */
    public Output<Optional<String>> defaultStorageClass() {
        return Codegen.optional(this.defaultStorageClass);
    }
    /**
     * The name of the file share. Must be set if an S3 prefix name is set in `location_arn`.
     * 
     */
    @Export(name="fileShareName", type=String.class, parameters={})
    private Output<String> fileShareName;

    /**
     * @return The name of the file share. Must be set if an S3 prefix name is set in `location_arn`.
     * 
     */
    public Output<String> fileShareName() {
        return this.fileShareName;
    }
    /**
     * ID of the NFS File Share.
     * 
     */
    @Export(name="fileshareId", type=String.class, parameters={})
    private Output<String> fileshareId;

    /**
     * @return ID of the NFS File Share.
     * 
     */
    public Output<String> fileshareId() {
        return this.fileshareId;
    }
    /**
     * Amazon Resource Name (ARN) of the file gateway.
     * 
     */
    @Export(name="gatewayArn", type=String.class, parameters={})
    private Output<String> gatewayArn;

    /**
     * @return Amazon Resource Name (ARN) of the file gateway.
     * 
     */
    public Output<String> gatewayArn() {
        return this.gatewayArn;
    }
    /**
     * Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
     * 
     */
    @Export(name="guessMimeTypeEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> guessMimeTypeEnabled;

    /**
     * @return Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> guessMimeTypeEnabled() {
        return Codegen.optional(this.guessMimeTypeEnabled);
    }
    /**
     * Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
     * 
     */
    @Export(name="kmsEncrypted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> kmsEncrypted;

    /**
     * @return Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> kmsEncrypted() {
        return Codegen.optional(this.kmsEncrypted);
    }
    /**
     * Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is true.
     * 
     */
    @Export(name="kmsKeyArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyArn;

    /**
     * @return Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is true.
     * 
     */
    public Output<Optional<String>> kmsKeyArn() {
        return Codegen.optional(this.kmsKeyArn);
    }
    /**
     * The ARN of the backed storage used for storing file data.
     * 
     */
    @Export(name="locationArn", type=String.class, parameters={})
    private Output<String> locationArn;

    /**
     * @return The ARN of the backed storage used for storing file data.
     * 
     */
    public Output<String> locationArn() {
        return this.locationArn;
    }
    /**
     * Nested argument with file share default values. More information below. see NFS File Share Defaults for more details.
     * 
     */
    @Export(name="nfsFileShareDefaults", type=NfsFileShareNfsFileShareDefaults.class, parameters={})
    private Output</* @Nullable */ NfsFileShareNfsFileShareDefaults> nfsFileShareDefaults;

    /**
     * @return Nested argument with file share default values. More information below. see NFS File Share Defaults for more details.
     * 
     */
    public Output<Optional<NfsFileShareNfsFileShareDefaults>> nfsFileShareDefaults() {
        return Codegen.optional(this.nfsFileShareDefaults);
    }
    /**
     * The notification policy of the file share. For more information see the [AWS Documentation](https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateNFSFileShare.html#StorageGateway-CreateNFSFileShare-request-NotificationPolicy). Default value is `{}`.
     * 
     */
    @Export(name="notificationPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> notificationPolicy;

    /**
     * @return The notification policy of the file share. For more information see the [AWS Documentation](https://docs.aws.amazon.com/storagegateway/latest/APIReference/API_CreateNFSFileShare.html#StorageGateway-CreateNFSFileShare-request-NotificationPolicy). Default value is `{}`.
     * 
     */
    public Output<Optional<String>> notificationPolicy() {
        return Codegen.optional(this.notificationPolicy);
    }
    /**
     * Access Control List permission for S3 objects. Defaults to `private`.
     * 
     */
    @Export(name="objectAcl", type=String.class, parameters={})
    private Output</* @Nullable */ String> objectAcl;

    /**
     * @return Access Control List permission for S3 objects. Defaults to `private`.
     * 
     */
    public Output<Optional<String>> objectAcl() {
        return Codegen.optional(this.objectAcl);
    }
    /**
     * File share path used by the NFS client to identify the mount point.
     * 
     */
    @Export(name="path", type=String.class, parameters={})
    private Output<String> path;

    /**
     * @return File share path used by the NFS client to identify the mount point.
     * 
     */
    public Output<String> path() {
        return this.path;
    }
    /**
     * Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
     * 
     */
    @Export(name="readOnly", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> readOnly;

    /**
     * @return Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> readOnly() {
        return Codegen.optional(this.readOnly);
    }
    /**
     * Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
     * 
     */
    @Export(name="requesterPays", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> requesterPays;

    /**
     * @return Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> requesterPays() {
        return Codegen.optional(this.requesterPays);
    }
    /**
     * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * Maps a user to anonymous user. Defaults to `RootSquash`. Valid values: `RootSquash` (only root is mapped to anonymous user), `NoSquash` (no one is mapped to anonymous user), `AllSquash` (everyone is mapped to anonymous user)
     * 
     */
    @Export(name="squash", type=String.class, parameters={})
    private Output</* @Nullable */ String> squash;

    /**
     * @return Maps a user to anonymous user. Defaults to `RootSquash`. Valid values: `RootSquash` (only root is mapped to anonymous user), `NoSquash` (no one is mapped to anonymous user), `AllSquash` (everyone is mapped to anonymous user)
     * 
     */
    public Output<Optional<String>> squash() {
        return Codegen.optional(this.squash);
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The DNS name of the VPC endpoint for S3 PrivateLink.
     * 
     */
    @Export(name="vpcEndpointDnsName", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcEndpointDnsName;

    /**
     * @return The DNS name of the VPC endpoint for S3 PrivateLink.
     * 
     */
    public Output<Optional<String>> vpcEndpointDnsName() {
        return Codegen.optional(this.vpcEndpointDnsName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NfsFileShare(String name) {
        this(name, NfsFileShareArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NfsFileShare(String name, NfsFileShareArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NfsFileShare(String name, NfsFileShareArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:storagegateway/nfsFileShare:NfsFileShare", name, args == null ? NfsFileShareArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NfsFileShare(String name, Output<String> id, @Nullable NfsFileShareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:storagegateway/nfsFileShare:NfsFileShare", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NfsFileShare get(String name, Output<String> id, @Nullable NfsFileShareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NfsFileShare(name, id, state, options);
    }
}