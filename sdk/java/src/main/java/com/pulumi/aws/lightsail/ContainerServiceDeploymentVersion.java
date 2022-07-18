// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lightsail;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lightsail.ContainerServiceDeploymentVersionArgs;
import com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionState;
import com.pulumi.aws.lightsail.outputs.ContainerServiceDeploymentVersionContainer;
import com.pulumi.aws.lightsail.outputs.ContainerServiceDeploymentVersionPublicEndpoint;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ContainerServiceDeploymentVersion(&#34;example&#34;, ContainerServiceDeploymentVersionArgs.builder()        
 *             .containers(ContainerServiceDeploymentVersionContainerArgs.builder()
 *                 .containerName(&#34;hello-world&#34;)
 *                 .image(&#34;amazon/amazon-lightsail:hello-world&#34;)
 *                 .commands()
 *                 .environment(Map.of(&#34;MY_ENVIRONMENT_VARIABLE&#34;, &#34;my_value&#34;))
 *                 .ports(Map.of(&#34;80&#34;, &#34;HTTP&#34;))
 *                 .build())
 *             .publicEndpoint(ContainerServiceDeploymentVersionPublicEndpointArgs.builder()
 *                 .containerName(&#34;hello-world&#34;)
 *                 .containerPort(80)
 *                 .healthCheck(ContainerServiceDeploymentVersionPublicEndpointHealthCheckArgs.builder()
 *                     .healthyThreshold(2)
 *                     .unhealthyThreshold(2)
 *                     .timeoutSeconds(2)
 *                     .intervalSeconds(5)
 *                     .path(&#34;/&#34;)
 *                     .successCodes(&#34;200-499&#34;)
 *                     .build())
 *                 .build())
 *             .serviceName(aws_lightsail_container_service.example().name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Lightsail Container Service Deployment Version can be imported using the `service_name` and `version` separated by a slash (`/`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:lightsail/containerServiceDeploymentVersion:ContainerServiceDeploymentVersion example container-service-1/1
 * ```
 * 
 */
@ResourceType(type="aws:lightsail/containerServiceDeploymentVersion:ContainerServiceDeploymentVersion")
public class ContainerServiceDeploymentVersion extends com.pulumi.resources.CustomResource {
    /**
     * A set of configuration blocks that describe the settings of the containers that will be launched on the container service. Maximum of 53. Detailed below.
     * 
     */
    @Export(name="containers", type=List.class, parameters={ContainerServiceDeploymentVersionContainer.class})
    private Output<List<ContainerServiceDeploymentVersionContainer>> containers;

    /**
     * @return A set of configuration blocks that describe the settings of the containers that will be launched on the container service. Maximum of 53. Detailed below.
     * 
     */
    public Output<List<ContainerServiceDeploymentVersionContainer>> containers() {
        return this.containers;
    }
    /**
     * The timestamp when the deployment was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The timestamp when the deployment was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * A configuration block that describes the settings of the public endpoint for the container service. Detailed below.
     * 
     */
    @Export(name="publicEndpoint", type=ContainerServiceDeploymentVersionPublicEndpoint.class, parameters={})
    private Output</* @Nullable */ ContainerServiceDeploymentVersionPublicEndpoint> publicEndpoint;

    /**
     * @return A configuration block that describes the settings of the public endpoint for the container service. Detailed below.
     * 
     */
    public Output<Optional<ContainerServiceDeploymentVersionPublicEndpoint>> publicEndpoint() {
        return Codegen.optional(this.publicEndpoint);
    }
    /**
     * The name for the container service.
     * 
     */
    @Export(name="serviceName", type=String.class, parameters={})
    private Output<String> serviceName;

    /**
     * @return The name for the container service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * The current state of the container service.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the container service.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The version number of the deployment.
     * 
     */
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return The version number of the deployment.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContainerServiceDeploymentVersion(String name) {
        this(name, ContainerServiceDeploymentVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContainerServiceDeploymentVersion(String name, ContainerServiceDeploymentVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContainerServiceDeploymentVersion(String name, ContainerServiceDeploymentVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/containerServiceDeploymentVersion:ContainerServiceDeploymentVersion", name, args == null ? ContainerServiceDeploymentVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContainerServiceDeploymentVersion(String name, Output<String> id, @Nullable ContainerServiceDeploymentVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/containerServiceDeploymentVersion:ContainerServiceDeploymentVersion", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ContainerServiceDeploymentVersion get(String name, Output<String> id, @Nullable ContainerServiceDeploymentVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContainerServiceDeploymentVersion(name, id, state, options);
    }
}