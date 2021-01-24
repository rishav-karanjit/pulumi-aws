// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kinesis.Outputs
{

    [OutputType]
    public sealed class FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute
    {
        /// <summary>
        /// The name of the HTTP endpoint common attribute.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The value of the HTTP endpoint common attribute.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute(
            string name,

            string value)
        {
            Name = name;
            Value = value;
        }
    }
}