// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.emr.StudioSessionMappingArgs;
import com.pulumi.aws.emr.inputs.StudioSessionMappingState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Elastic MapReduce Studio Session Mapping.
 * 
 * ## Example Usage
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
 *         var example = new StudioSessionMapping(&#34;example&#34;, StudioSessionMappingArgs.builder()        
 *             .studioId(aws_emr_studio.example().id())
 *             .identityType(&#34;USER&#34;)
 *             .identityId(&#34;example&#34;)
 *             .sessionPolicyArn(aws_iam_policy.example().arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * EMR studio session mappings can be imported using the `id`, e.g., `studio-id:identity-type:identity-id`
 * 
 * ```sh
 *  $ pulumi import aws:emr/studioSessionMapping:StudioSessionMapping example es-xxxxx:USER:xxxxx-xxx-xxx
 * ```
 * 
 */
@ResourceType(type="aws:emr/studioSessionMapping:StudioSessionMapping")
public class StudioSessionMapping extends com.pulumi.resources.CustomResource {
    /**
     * The globally unique identifier (GUID) of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    @Export(name="identityId", type=String.class, parameters={})
    private Output<String> identityId;

    /**
     * @return The globally unique identifier (GUID) of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    public Output<String> identityId() {
        return this.identityId;
    }
    /**
     * The name of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    @Export(name="identityName", type=String.class, parameters={})
    private Output<String> identityName;

    /**
     * @return The name of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    public Output<String> identityName() {
        return this.identityName;
    }
    /**
     * Specifies whether the identity to map to the Amazon EMR Studio is a `USER` or a `GROUP`.
     * 
     */
    @Export(name="identityType", type=String.class, parameters={})
    private Output<String> identityType;

    /**
     * @return Specifies whether the identity to map to the Amazon EMR Studio is a `USER` or a `GROUP`.
     * 
     */
    public Output<String> identityType() {
        return this.identityType;
    }
    /**
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role.
     * 
     */
    @Export(name="sessionPolicyArn", type=String.class, parameters={})
    private Output<String> sessionPolicyArn;

    /**
     * @return The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role.
     * 
     */
    public Output<String> sessionPolicyArn() {
        return this.sessionPolicyArn;
    }
    /**
     * The ID of the Amazon EMR Studio to which the user or group will be mapped.
     * 
     */
    @Export(name="studioId", type=String.class, parameters={})
    private Output<String> studioId;

    /**
     * @return The ID of the Amazon EMR Studio to which the user or group will be mapped.
     * 
     */
    public Output<String> studioId() {
        return this.studioId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StudioSessionMapping(String name) {
        this(name, StudioSessionMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StudioSessionMapping(String name, StudioSessionMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StudioSessionMapping(String name, StudioSessionMappingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:emr/studioSessionMapping:StudioSessionMapping", name, args == null ? StudioSessionMappingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StudioSessionMapping(String name, Output<String> id, @Nullable StudioSessionMappingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:emr/studioSessionMapping:StudioSessionMapping", name, state, makeResourceOptions(options, id));
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
    public static StudioSessionMapping get(String name, Output<String> id, @Nullable StudioSessionMappingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StudioSessionMapping(name, id, state, options);
    }
}