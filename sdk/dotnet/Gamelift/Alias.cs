// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.GameLift
{
    /// <summary>
    /// Provides a Gamelift Alias resource.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-aws/blob/master/website/docs/r/gamelift_alias.html.markdown.
    /// </summary>
    public partial class Alias : Pulumi.CustomResource
    {
        /// <summary>
        /// Alias ARN.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Description of the alias.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of the alias.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the fleet and/or routing type to use for the alias.
        /// </summary>
        [Output("routingStrategy")]
        public Output<Outputs.AliasRoutingStrategy> RoutingStrategy { get; private set; } = null!;


        /// <summary>
        /// Create a Alias resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Alias(string name, AliasArgs args, CustomResourceOptions? options = null)
            : base("aws:gamelift/alias:Alias", name, args, MakeResourceOptions(options, ""))
        {
        }

        private Alias(string name, Input<string> id, AliasState? state = null, CustomResourceOptions? options = null)
            : base("aws:gamelift/alias:Alias", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Alias resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Alias Get(string name, Input<string> id, AliasState? state = null, CustomResourceOptions? options = null)
        {
            return new Alias(name, id, state, options);
        }
    }

    public sealed class AliasArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the alias.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the alias.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the fleet and/or routing type to use for the alias.
        /// </summary>
        [Input("routingStrategy", required: true)]
        public Input<Inputs.AliasRoutingStrategyArgs> RoutingStrategy { get; set; } = null!;

        public AliasArgs()
        {
        }
    }

    public sealed class AliasState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alias ARN.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Description of the alias.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the alias.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the fleet and/or routing type to use for the alias.
        /// </summary>
        [Input("routingStrategy")]
        public Input<Inputs.AliasRoutingStrategyGetArgs>? RoutingStrategy { get; set; }

        public AliasState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class AliasRoutingStrategyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the Gamelift Fleet to point the alias to.
        /// </summary>
        [Input("fleetId")]
        public Input<string>? FleetId { get; set; }

        /// <summary>
        /// Message text to be used with the `TERMINAL` routing strategy.
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        /// <summary>
        /// Type of routing strategy. e.g. `SIMPLE` or `TERMINAL`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public AliasRoutingStrategyArgs()
        {
        }
    }

    public sealed class AliasRoutingStrategyGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the Gamelift Fleet to point the alias to.
        /// </summary>
        [Input("fleetId")]
        public Input<string>? FleetId { get; set; }

        /// <summary>
        /// Message text to be used with the `TERMINAL` routing strategy.
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        /// <summary>
        /// Type of routing strategy. e.g. `SIMPLE` or `TERMINAL`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public AliasRoutingStrategyGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class AliasRoutingStrategy
    {
        /// <summary>
        /// ID of the Gamelift Fleet to point the alias to.
        /// </summary>
        public readonly string? FleetId;
        /// <summary>
        /// Message text to be used with the `TERMINAL` routing strategy.
        /// </summary>
        public readonly string? Message;
        /// <summary>
        /// Type of routing strategy. e.g. `SIMPLE` or `TERMINAL`
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private AliasRoutingStrategy(
            string? fleetId,
            string? message,
            string type)
        {
            FleetId = fleetId;
            Message = message;
            Type = type;
        }
    }
    }
}