// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ecr.Outputs
{

    [OutputType]
    public sealed class GetRepositoryImageScanningConfigurationResult
    {
        /// <summary>
        /// Whether images are scanned after being pushed to the repository.
        /// </summary>
        public readonly bool ScanOnPush;

        [OutputConstructor]
        private GetRepositoryImageScanningConfigurationResult(bool scanOnPush)
        {
            ScanOnPush = scanOnPush;
        }
    }
}
