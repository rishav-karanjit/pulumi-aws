// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.KinesisAnalyticsV2.Outputs
{

    [OutputType]
    public sealed class ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent
    {
        /// <summary>
        /// Information about the Amazon S3 bucket containing the application code.
        /// </summary>
        public readonly Outputs.ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation? S3ContentLocation;
        /// <summary>
        /// The text-format code for the application.
        /// </summary>
        public readonly string? TextContent;

        [OutputConstructor]
        private ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContent(
            Outputs.ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation? s3ContentLocation,

            string? textContent)
        {
            S3ContentLocation = s3ContentLocation;
            TextContent = textContent;
        }
    }
}