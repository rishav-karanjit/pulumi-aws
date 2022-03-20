// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3
{
    /// <summary>
    /// ## Import
    /// 
    /// S3 bucket can be imported using the `bucket`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:s3/bucketV2:BucketV2 bucket bucket-name
    /// ```
    /// </summary>
    [AwsResourceType("aws:s3/bucketV2:BucketV2")]
    public partial class BucketV2 : Pulumi.CustomResource
    {
        /// <summary>
        /// (Optional) The accelerate configuration status of the bucket. Not available in `cn-north-1` or `us-gov-west-1`.
        /// </summary>
        [Output("accelerationStatus")]
        public Output<string> AccelerationStatus { get; private set; } = null!;

        /// <summary>
        /// The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) applied to the bucket.
        /// </summary>
        [Output("acl")]
        public Output<string> Acl { get; private set; } = null!;

        /// <summary>
        /// The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The name of the bucket. If omitted, this provider will assign a random, unique name. Must be lowercase and less than or equal to 63 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
        /// </summary>
        [Output("bucketDomainName")]
        public Output<string> BucketDomainName { get; private set; } = null!;

        /// <summary>
        /// Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be lowercase and less than or equal to 37 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
        /// </summary>
        [Output("bucketPrefix")]
        public Output<string?> BucketPrefix { get; private set; } = null!;

        /// <summary>
        /// The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
        /// </summary>
        [Output("bucketRegionalDomainName")]
        public Output<string> BucketRegionalDomainName { get; private set; } = null!;

        /// <summary>
        /// Set of origins and methods ([cross-origin](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) access allowed).
        /// </summary>
        [Output("corsRules")]
        public Output<ImmutableArray<Outputs.BucketV2CorsRule>> CorsRules { get; private set; } = null!;

        /// <summary>
        /// A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
        /// </summary>
        [Output("forceDestroy")]
        public Output<bool?> ForceDestroy { get; private set; } = null!;

        /// <summary>
        /// The set of [ACL policy grants](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl).
        /// </summary>
        [Output("grants")]
        public Output<ImmutableArray<Outputs.BucketV2Grant>> Grants { get; private set; } = null!;

        /// <summary>
        /// The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
        /// </summary>
        [Output("hostedZoneId")]
        public Output<string> HostedZoneId { get; private set; } = null!;

        /// <summary>
        /// A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html).
        /// </summary>
        [Output("lifecycleRules")]
        public Output<ImmutableArray<Outputs.BucketV2LifecycleRule>> LifecycleRules { get; private set; } = null!;

        /// <summary>
        /// The [logging parameters](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) for the bucket.
        /// </summary>
        [Output("loggings")]
        public Output<ImmutableArray<Outputs.BucketV2Logging>> Loggings { get; private set; } = null!;

        /// <summary>
        /// A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html). See Object Lock Configuration below.
        /// </summary>
        [Output("objectLockConfiguration")]
        public Output<Outputs.BucketV2ObjectLockConfiguration> ObjectLockConfiguration { get; private set; } = null!;

        /// <summary>
        /// Indicates whether this bucket has an Object Lock configuration enabled.
        /// </summary>
        [Output("objectLockEnabled")]
        public Output<bool> ObjectLockEnabled { get; private set; } = null!;

        /// <summary>
        /// The [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document.
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;

        /// <summary>
        /// The AWS region this bucket resides in.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html).
        /// </summary>
        [Output("replicationConfigurations")]
        public Output<ImmutableArray<Outputs.BucketV2ReplicationConfiguration>> ReplicationConfigurations { get; private set; } = null!;

        /// <summary>
        /// Either `BucketOwner` or `Requester` that pays for the download and request fees.
        /// </summary>
        [Output("requestPayer")]
        public Output<string> RequestPayer { get; private set; } = null!;

        /// <summary>
        /// The [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html).
        /// </summary>
        [Output("serverSideEncryptionConfigurations")]
        public Output<ImmutableArray<Outputs.BucketV2ServerSideEncryptionConfiguration>> ServerSideEncryptionConfigurations { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the bucket. If configured with a provider [`default_tags` configuration blockpresent, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) state of the bucket.
        /// </summary>
        [Output("versionings")]
        public Output<ImmutableArray<Outputs.BucketV2Versioning>> Versionings { get; private set; } = null!;

        /// <summary>
        /// The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
        /// </summary>
        [Output("websiteDomain")]
        public Output<string> WebsiteDomain { get; private set; } = null!;

        /// <summary>
        /// The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
        /// </summary>
        [Output("websiteEndpoint")]
        public Output<string> WebsiteEndpoint { get; private set; } = null!;

        /// <summary>
        /// The website configuration, if configured.
        /// </summary>
        [Output("websites")]
        public Output<ImmutableArray<Outputs.BucketV2Website>> Websites { get; private set; } = null!;


        /// <summary>
        /// Create a BucketV2 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BucketV2(string name, BucketV2Args? args = null, CustomResourceOptions? options = null)
            : base("aws:s3/bucketV2:BucketV2", name, args ?? new BucketV2Args(), MakeResourceOptions(options, ""))
        {
        }

        private BucketV2(string name, Input<string> id, BucketV2State? state = null, CustomResourceOptions? options = null)
            : base("aws:s3/bucketV2:BucketV2", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new Pulumi.Alias { Type = "aws:s3/bucket:Bucket"},
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing BucketV2 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BucketV2 Get(string name, Input<string> id, BucketV2State? state = null, CustomResourceOptions? options = null)
        {
            return new BucketV2(name, id, state, options);
        }
    }

    public sealed class BucketV2Args : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The name of the bucket. If omitted, this provider will assign a random, unique name. Must be lowercase and less than or equal to 63 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be lowercase and less than or equal to 37 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
        /// </summary>
        [Input("bucketPrefix")]
        public Input<string>? BucketPrefix { get; set; }

        /// <summary>
        /// A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
        /// </summary>
        [Input("hostedZoneId")]
        public Input<string>? HostedZoneId { get; set; }

        /// <summary>
        /// A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html). See Object Lock Configuration below.
        /// </summary>
        [Input("objectLockConfiguration")]
        public Input<Inputs.BucketV2ObjectLockConfigurationArgs>? ObjectLockConfiguration { get; set; }

        /// <summary>
        /// Indicates whether this bucket has an Object Lock configuration enabled.
        /// </summary>
        [Input("objectLockEnabled")]
        public Input<bool>? ObjectLockEnabled { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the bucket. If configured with a provider [`default_tags` configuration blockpresent, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public BucketV2Args()
        {
        }
    }

    public sealed class BucketV2State : Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional) The accelerate configuration status of the bucket. Not available in `cn-north-1` or `us-gov-west-1`.
        /// </summary>
        [Input("accelerationStatus")]
        public Input<string>? AccelerationStatus { get; set; }

        /// <summary>
        /// The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) applied to the bucket.
        /// </summary>
        [Input("acl")]
        public Input<string>? Acl { get; set; }

        /// <summary>
        /// The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The name of the bucket. If omitted, this provider will assign a random, unique name. Must be lowercase and less than or equal to 63 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
        /// </summary>
        [Input("bucketDomainName")]
        public Input<string>? BucketDomainName { get; set; }

        /// <summary>
        /// Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be lowercase and less than or equal to 37 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
        /// </summary>
        [Input("bucketPrefix")]
        public Input<string>? BucketPrefix { get; set; }

        /// <summary>
        /// The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
        /// </summary>
        [Input("bucketRegionalDomainName")]
        public Input<string>? BucketRegionalDomainName { get; set; }

        [Input("corsRules")]
        private InputList<Inputs.BucketV2CorsRuleGetArgs>? _corsRules;

        /// <summary>
        /// Set of origins and methods ([cross-origin](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) access allowed).
        /// </summary>
        [Obsolete(@"Use the aws_s3_bucket_cors_configuration resource instead")]
        public InputList<Inputs.BucketV2CorsRuleGetArgs> CorsRules
        {
            get => _corsRules ?? (_corsRules = new InputList<Inputs.BucketV2CorsRuleGetArgs>());
            set => _corsRules = value;
        }

        /// <summary>
        /// A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        [Input("grants")]
        private InputList<Inputs.BucketV2GrantGetArgs>? _grants;

        /// <summary>
        /// The set of [ACL policy grants](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl).
        /// </summary>
        [Obsolete(@"Use the aws_s3_bucket_acl resource instead")]
        public InputList<Inputs.BucketV2GrantGetArgs> Grants
        {
            get => _grants ?? (_grants = new InputList<Inputs.BucketV2GrantGetArgs>());
            set => _grants = value;
        }

        /// <summary>
        /// The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
        /// </summary>
        [Input("hostedZoneId")]
        public Input<string>? HostedZoneId { get; set; }

        [Input("lifecycleRules")]
        private InputList<Inputs.BucketV2LifecycleRuleGetArgs>? _lifecycleRules;

        /// <summary>
        /// A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html).
        /// </summary>
        [Obsolete(@"Use the aws_s3_bucket_lifecycle_configuration resource instead")]
        public InputList<Inputs.BucketV2LifecycleRuleGetArgs> LifecycleRules
        {
            get => _lifecycleRules ?? (_lifecycleRules = new InputList<Inputs.BucketV2LifecycleRuleGetArgs>());
            set => _lifecycleRules = value;
        }

        [Input("loggings")]
        private InputList<Inputs.BucketV2LoggingGetArgs>? _loggings;

        /// <summary>
        /// The [logging parameters](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) for the bucket.
        /// </summary>
        [Obsolete(@"Use the aws_s3_bucket_logging resource instead")]
        public InputList<Inputs.BucketV2LoggingGetArgs> Loggings
        {
            get => _loggings ?? (_loggings = new InputList<Inputs.BucketV2LoggingGetArgs>());
            set => _loggings = value;
        }

        /// <summary>
        /// A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html). See Object Lock Configuration below.
        /// </summary>
        [Input("objectLockConfiguration")]
        public Input<Inputs.BucketV2ObjectLockConfigurationGetArgs>? ObjectLockConfiguration { get; set; }

        /// <summary>
        /// Indicates whether this bucket has an Object Lock configuration enabled.
        /// </summary>
        [Input("objectLockEnabled")]
        public Input<bool>? ObjectLockEnabled { get; set; }

        /// <summary>
        /// The [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// The AWS region this bucket resides in.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("replicationConfigurations")]
        private InputList<Inputs.BucketV2ReplicationConfigurationGetArgs>? _replicationConfigurations;

        /// <summary>
        /// The [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html).
        /// </summary>
        [Obsolete(@"Use the aws_s3_bucket_replication_configuration resource instead")]
        public InputList<Inputs.BucketV2ReplicationConfigurationGetArgs> ReplicationConfigurations
        {
            get => _replicationConfigurations ?? (_replicationConfigurations = new InputList<Inputs.BucketV2ReplicationConfigurationGetArgs>());
            set => _replicationConfigurations = value;
        }

        /// <summary>
        /// Either `BucketOwner` or `Requester` that pays for the download and request fees.
        /// </summary>
        [Input("requestPayer")]
        public Input<string>? RequestPayer { get; set; }

        [Input("serverSideEncryptionConfigurations")]
        private InputList<Inputs.BucketV2ServerSideEncryptionConfigurationGetArgs>? _serverSideEncryptionConfigurations;

        /// <summary>
        /// The [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html).
        /// </summary>
        [Obsolete(@"Use the aws_s3_bucket_server_side_encryption_configuration resource instead")]
        public InputList<Inputs.BucketV2ServerSideEncryptionConfigurationGetArgs> ServerSideEncryptionConfigurations
        {
            get => _serverSideEncryptionConfigurations ?? (_serverSideEncryptionConfigurations = new InputList<Inputs.BucketV2ServerSideEncryptionConfigurationGetArgs>());
            set => _serverSideEncryptionConfigurations = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the bucket. If configured with a provider [`default_tags` configuration blockpresent, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        [Input("versionings")]
        private InputList<Inputs.BucketV2VersioningGetArgs>? _versionings;

        /// <summary>
        /// The [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) state of the bucket.
        /// </summary>
        [Obsolete(@"Use the aws_s3_bucket_versioning resource instead")]
        public InputList<Inputs.BucketV2VersioningGetArgs> Versionings
        {
            get => _versionings ?? (_versionings = new InputList<Inputs.BucketV2VersioningGetArgs>());
            set => _versionings = value;
        }

        /// <summary>
        /// The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
        /// </summary>
        [Input("websiteDomain")]
        public Input<string>? WebsiteDomain { get; set; }

        /// <summary>
        /// The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
        /// </summary>
        [Input("websiteEndpoint")]
        public Input<string>? WebsiteEndpoint { get; set; }

        [Input("websites")]
        private InputList<Inputs.BucketV2WebsiteGetArgs>? _websites;

        /// <summary>
        /// The website configuration, if configured.
        /// </summary>
        [Obsolete(@"Use the aws_s3_bucket_website_configuration resource")]
        public InputList<Inputs.BucketV2WebsiteGetArgs> Websites
        {
            get => _websites ?? (_websites = new InputList<Inputs.BucketV2WebsiteGetArgs>());
            set => _websites = value;
        }

        public BucketV2State()
        {
        }
    }
}