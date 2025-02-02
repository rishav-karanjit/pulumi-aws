// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Quicksight.Inputs
{

    public sealed class DataSetOutputColumnArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Field folder description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Display name for the dataset.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Data type of the column.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DataSetOutputColumnArgs()
        {
        }
        public static new DataSetOutputColumnArgs Empty => new DataSetOutputColumnArgs();
    }
}
