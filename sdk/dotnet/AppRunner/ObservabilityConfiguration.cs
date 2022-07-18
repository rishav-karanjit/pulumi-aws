// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppRunner
{
    /// <summary>
    /// Manages an App Runner Observability Configuration.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Aws.AppRunner.ObservabilityConfiguration("example", new Aws.AppRunner.ObservabilityConfigurationArgs
    ///         {
    ///             ObservabilityConfigurationName = "example",
    ///             Tags = 
    ///             {
    ///                 { "Name", "example-apprunner-observability-configuration" },
    ///             },
    ///             TraceConfiguration = new Aws.AppRunner.Inputs.ObservabilityConfigurationTraceConfigurationArgs
    ///             {
    ///                 Vendor = "AWSXRAY",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// App Runner Observability Configuration can be imported by using the `arn`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:apprunner/observabilityConfiguration:ObservabilityConfiguration example "arn:aws:apprunner:us-east-1:1234567890:observabilityconfiguration/example/1/d75bc7ea55b71e724fe5c23452fe22a1
    /// ```
    /// </summary>
    [AwsResourceType("aws:apprunner/observabilityConfiguration:ObservabilityConfiguration")]
    public partial class ObservabilityConfiguration : Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of this observability configuration.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Whether the observability configuration has the highest `observability_configuration_revision` among all configurations that share the same `observability_configuration_name`.
        /// </summary>
        [Output("latest")]
        public Output<bool> Latest { get; private set; } = null!;

        /// <summary>
        /// Name of the observability configuration.
        /// </summary>
        [Output("observabilityConfigurationName")]
        public Output<string> ObservabilityConfigurationName { get; private set; } = null!;

        /// <summary>
        /// The revision of this observability configuration.
        /// </summary>
        [Output("observabilityConfigurationRevision")]
        public Output<int> ObservabilityConfigurationRevision { get; private set; } = null!;

        /// <summary>
        /// The current state of the observability configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The configuration of the tracing feature within this observability configuration. If you don't specify it, App Runner doesn't enable tracing. See Trace Configuration below for more details.
        /// </summary>
        [Output("traceConfiguration")]
        public Output<Outputs.ObservabilityConfigurationTraceConfiguration?> TraceConfiguration { get; private set; } = null!;


        /// <summary>
        /// Create a ObservabilityConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ObservabilityConfiguration(string name, ObservabilityConfigurationArgs args, CustomResourceOptions? options = null)
            : base("aws:apprunner/observabilityConfiguration:ObservabilityConfiguration", name, args ?? new ObservabilityConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ObservabilityConfiguration(string name, Input<string> id, ObservabilityConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("aws:apprunner/observabilityConfiguration:ObservabilityConfiguration", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ObservabilityConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ObservabilityConfiguration Get(string name, Input<string> id, ObservabilityConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new ObservabilityConfiguration(name, id, state, options);
        }
    }

    public sealed class ObservabilityConfigurationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the observability configuration.
        /// </summary>
        [Input("observabilityConfigurationName", required: true)]
        public Input<string> ObservabilityConfigurationName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The configuration of the tracing feature within this observability configuration. If you don't specify it, App Runner doesn't enable tracing. See Trace Configuration below for more details.
        /// </summary>
        [Input("traceConfiguration")]
        public Input<Inputs.ObservabilityConfigurationTraceConfigurationArgs>? TraceConfiguration { get; set; }

        public ObservabilityConfigurationArgs()
        {
        }
    }

    public sealed class ObservabilityConfigurationState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of this observability configuration.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Whether the observability configuration has the highest `observability_configuration_revision` among all configurations that share the same `observability_configuration_name`.
        /// </summary>
        [Input("latest")]
        public Input<bool>? Latest { get; set; }

        /// <summary>
        /// Name of the observability configuration.
        /// </summary>
        [Input("observabilityConfigurationName")]
        public Input<string>? ObservabilityConfigurationName { get; set; }

        /// <summary>
        /// The revision of this observability configuration.
        /// </summary>
        [Input("observabilityConfigurationRevision")]
        public Input<int>? ObservabilityConfigurationRevision { get; set; }

        /// <summary>
        /// The current state of the observability configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The configuration of the tracing feature within this observability configuration. If you don't specify it, App Runner doesn't enable tracing. See Trace Configuration below for more details.
        /// </summary>
        [Input("traceConfiguration")]
        public Input<Inputs.ObservabilityConfigurationTraceConfigurationGetArgs>? TraceConfiguration { get; set; }

        public ObservabilityConfigurationState()
        {
        }
    }
}