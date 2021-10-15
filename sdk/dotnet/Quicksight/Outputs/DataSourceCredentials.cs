// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Quicksight.Outputs
{

    [OutputType]
    public sealed class DataSourceCredentials
    {
        /// <summary>
        /// - The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use.
        /// When the value is not null, the `credential_pair` from the data source in the ARN is used.
        /// </summary>
        public readonly string? CopySourceArn;
        /// <summary>
        /// - Credential pair. See Credential Pair below for more details.
        /// </summary>
        public readonly Outputs.DataSourceCredentialsCredentialPair? CredentialPair;

        [OutputConstructor]
        private DataSourceCredentials(
            string? copySourceArn,

            Outputs.DataSourceCredentialsCredentialPair? credentialPair)
        {
            CopySourceArn = copySourceArn;
            CredentialPair = credentialPair;
        }
    }
}