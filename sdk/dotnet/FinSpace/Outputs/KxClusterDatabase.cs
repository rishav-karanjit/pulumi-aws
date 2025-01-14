// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.FinSpace.Outputs
{

    [OutputType]
    public sealed class KxClusterDatabase
    {
        /// <summary>
        /// Configuration details for the disk cache to increase performance reading from a KX database mounted to the cluster. See cache_configurations.
        /// </summary>
        public readonly ImmutableArray<Outputs.KxClusterDatabaseCacheConfiguration> CacheConfigurations;
        /// <summary>
        /// A unique identifier of the changeset that is associated with the cluster.
        /// </summary>
        public readonly string? ChangesetId;
        /// <summary>
        /// Name of the KX database.
        /// </summary>
        public readonly string DatabaseName;

        [OutputConstructor]
        private KxClusterDatabase(
            ImmutableArray<Outputs.KxClusterDatabaseCacheConfiguration> cacheConfigurations,

            string? changesetId,

            string databaseName)
        {
            CacheConfigurations = cacheConfigurations;
            ChangesetId = changesetId;
            DatabaseName = databaseName;
        }
    }
}
