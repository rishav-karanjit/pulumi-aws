// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppSync.Inputs
{

    public sealed class DataSourceHttpConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authorization configuration in case the HTTP endpoint requires authorization. See Authorization Config.
        /// </summary>
        [Input("authorizationConfig")]
        public Input<Inputs.DataSourceHttpConfigAuthorizationConfigGetArgs>? AuthorizationConfig { get; set; }

        /// <summary>
        /// HTTP URL.
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        public DataSourceHttpConfigGetArgs()
        {
        }
        public static new DataSourceHttpConfigGetArgs Empty => new DataSourceHttpConfigGetArgs();
    }
}
