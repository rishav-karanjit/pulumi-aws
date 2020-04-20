// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Outputs
{

    [OutputType]
    public sealed class FleetLaunchTemplateConfigLaunchTemplateSpecification
    {
        /// <summary>
        /// ID of the launch template.
        /// </summary>
        public readonly string? LaunchTemplateId;
        /// <summary>
        /// Name of the launch template.
        /// </summary>
        public readonly string? LaunchTemplateName;
        /// <summary>
        /// Version number of the launch template.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private FleetLaunchTemplateConfigLaunchTemplateSpecification(
            string? launchTemplateId,

            string? launchTemplateName,

            string version)
        {
            LaunchTemplateId = launchTemplateId;
            LaunchTemplateName = launchTemplateName;
            Version = version;
        }
    }
}