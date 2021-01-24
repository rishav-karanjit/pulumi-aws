// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Outputs
{

    [OutputType]
    public sealed class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust
    {
        /// <summary>
        /// The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
        /// </summary>
        public readonly Outputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm? Acm;
        /// <summary>
        /// The TLS validation context trust for a local file.
        /// </summary>
        public readonly Outputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile? File;

        [OutputConstructor]
        private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust(
            Outputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcm? acm,

            Outputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFile? file)
        {
            Acm = acm;
            File = file;
        }
    }
}