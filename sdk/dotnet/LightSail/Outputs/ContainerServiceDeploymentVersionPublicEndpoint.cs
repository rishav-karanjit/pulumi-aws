// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.LightSail.Outputs
{

    [OutputType]
    public sealed class ContainerServiceDeploymentVersionPublicEndpoint
    {
        /// <summary>
        /// The name of the container for the endpoint.
        /// </summary>
        public readonly string ContainerName;
        /// <summary>
        /// The port of the container to which traffic is forwarded to.
        /// </summary>
        public readonly int ContainerPort;
        /// <summary>
        /// A configuration block that describes the health check configuration of the container. Detailed below.
        /// </summary>
        public readonly Outputs.ContainerServiceDeploymentVersionPublicEndpointHealthCheck HealthCheck;

        [OutputConstructor]
        private ContainerServiceDeploymentVersionPublicEndpoint(
            string containerName,

            int containerPort,

            Outputs.ContainerServiceDeploymentVersionPublicEndpointHealthCheck healthCheck)
        {
            ContainerName = containerName;
            ContainerPort = containerPort;
            HealthCheck = healthCheck;
        }
    }
}