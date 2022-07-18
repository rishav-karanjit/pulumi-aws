// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.shield;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.shield.ProtectionHealthCheckAssociationArgs;
import com.pulumi.aws.shield.inputs.ProtectionHealthCheckAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an association between a Route53 Health Check and a Shield Advanced protected resource.
 * This association uses the health of your applications to improve responsiveness and accuracy in attack detection and mitigation.
 * 
 * Blog post: [AWS Shield Advanced now supports Health Based Detection](https://aws.amazon.com/about-aws/whats-new/2020/02/aws-shield-advanced-now-supports-health-based-detection/)
 * 
 * ## Example Usage
 * ### Create an association between a protected EIP and a Route53 Health Check
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
 *         final var currentRegion = Output.of(AwsFunctions.getRegion());
 * 
 *         final var currentCallerIdentity = Output.of(AwsFunctions.getCallerIdentity());
 * 
 *         final var currentPartition = Output.of(AwsFunctions.getPartition());
 * 
 *         var exampleEip = new Eip(&#34;exampleEip&#34;, EipArgs.builder()        
 *             .vpc(true)
 *             .tags(Map.of(&#34;Name&#34;, &#34;example&#34;))
 *             .build());
 * 
 *         var exampleProtection = new Protection(&#34;exampleProtection&#34;, ProtectionArgs.builder()        
 *             .resourceArn(exampleEip.id().apply(id -&gt; String.format(&#34;arn:%s:ec2:%s:%s:eip-allocation/%s&#34;, currentPartition.apply(getPartitionResult -&gt; getPartitionResult.partition()),currentRegion.apply(getRegionResult -&gt; getRegionResult.name()),currentCallerIdentity.apply(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId()),id)))
 *             .build());
 * 
 *         var exampleHealthCheck = new HealthCheck(&#34;exampleHealthCheck&#34;, HealthCheckArgs.builder()        
 *             .ipAddress(exampleEip.publicIp())
 *             .port(80)
 *             .type(&#34;HTTP&#34;)
 *             .resourcePath(&#34;/ready&#34;)
 *             .failureThreshold(&#34;3&#34;)
 *             .requestInterval(&#34;30&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;tf-example-health-check&#34;))
 *             .build());
 * 
 *         var exampleProtectionHealthCheckAssociation = new ProtectionHealthCheckAssociation(&#34;exampleProtectionHealthCheckAssociation&#34;, ProtectionHealthCheckAssociationArgs.builder()        
 *             .healthCheckArn(exampleHealthCheck.arn())
 *             .shieldProtectionId(exampleProtection.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Shield protection health check association resources can be imported by specifying the `shield_protection_id` and `health_check_arn` e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:shield/protectionHealthCheckAssociation:ProtectionHealthCheckAssociation example ff9592dc-22f3-4e88-afa1-7b29fde9669a+arn:aws:route53:::healthcheck/3742b175-edb9-46bc-9359-f53e3b794b1b
 * ```
 * 
 */
@ResourceType(type="aws:shield/protectionHealthCheckAssociation:ProtectionHealthCheckAssociation")
public class ProtectionHealthCheckAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The ARN (Amazon Resource Name) of the Route53 Health Check resource which will be associated to the protected resource.
     * 
     */
    @Export(name="healthCheckArn", type=String.class, parameters={})
    private Output<String> healthCheckArn;

    /**
     * @return The ARN (Amazon Resource Name) of the Route53 Health Check resource which will be associated to the protected resource.
     * 
     */
    public Output<String> healthCheckArn() {
        return this.healthCheckArn;
    }
    /**
     * The ID of the protected resource.
     * 
     */
    @Export(name="shieldProtectionId", type=String.class, parameters={})
    private Output<String> shieldProtectionId;

    /**
     * @return The ID of the protected resource.
     * 
     */
    public Output<String> shieldProtectionId() {
        return this.shieldProtectionId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProtectionHealthCheckAssociation(String name) {
        this(name, ProtectionHealthCheckAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProtectionHealthCheckAssociation(String name, ProtectionHealthCheckAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProtectionHealthCheckAssociation(String name, ProtectionHealthCheckAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:shield/protectionHealthCheckAssociation:ProtectionHealthCheckAssociation", name, args == null ? ProtectionHealthCheckAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProtectionHealthCheckAssociation(String name, Output<String> id, @Nullable ProtectionHealthCheckAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:shield/protectionHealthCheckAssociation:ProtectionHealthCheckAssociation", name, state, makeResourceOptions(options, id));
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
    public static ProtectionHealthCheckAssociation get(String name, Output<String> id, @Nullable ProtectionHealthCheckAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProtectionHealthCheckAssociation(name, id, state, options);
    }
}