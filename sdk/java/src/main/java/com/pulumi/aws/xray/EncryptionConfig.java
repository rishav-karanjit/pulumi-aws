// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.xray;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.xray.EncryptionConfigArgs;
import com.pulumi.aws.xray.inputs.EncryptionConfigState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages an AWS XRay Encryption Config.
 * 
 * &gt; **NOTE:** Removing this resource from the provider has no effect to the encryption configuration within X-Ray.
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
 *         var example = new EncryptionConfig(&#34;example&#34;, EncryptionConfigArgs.builder()        
 *             .type(&#34;NONE&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With KMS Key
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
 *         final var current = Output.of(AwsFunctions.getCallerIdentity());
 * 
 *         var exampleKey = new Key(&#34;exampleKey&#34;, KeyArgs.builder()        
 *             .description(&#34;Some Key&#34;)
 *             .deletionWindowInDays(7)
 *             .policy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Id&#34;: &#34;kms-tf-1&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Sid&#34;: &#34;Enable IAM User Permissions&#34;,
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Principal&#34;: {
 *         &#34;AWS&#34;: &#34;arn:aws:iam::%s:root&#34;
 *       },
 *       &#34;Action&#34;: &#34;kms:*&#34;,
 *       &#34;Resource&#34;: &#34;*&#34;
 *     }
 *   ]
 * }
 * &#34;, current.apply(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId())))
 *             .build());
 * 
 *         var exampleEncryptionConfig = new EncryptionConfig(&#34;exampleEncryptionConfig&#34;, EncryptionConfigArgs.builder()        
 *             .type(&#34;KMS&#34;)
 *             .keyId(exampleKey.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * XRay Encryption Config can be imported using the region name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:xray/encryptionConfig:EncryptionConfig example us-west-2
 * ```
 * 
 */
@ResourceType(type="aws:xray/encryptionConfig:EncryptionConfig")
public class EncryptionConfig extends com.pulumi.resources.CustomResource {
    /**
     * An AWS KMS customer master key (CMK) ARN.
     * 
     */
    @Export(name="keyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyId;

    /**
     * @return An AWS KMS customer master key (CMK) ARN.
     * 
     */
    public Output<Optional<String>> keyId() {
        return Codegen.optional(this.keyId);
    }
    /**
     * The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EncryptionConfig(String name) {
        this(name, EncryptionConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EncryptionConfig(String name, EncryptionConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EncryptionConfig(String name, EncryptionConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:xray/encryptionConfig:EncryptionConfig", name, args == null ? EncryptionConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EncryptionConfig(String name, Output<String> id, @Nullable EncryptionConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:xray/encryptionConfig:EncryptionConfig", name, state, makeResourceOptions(options, id));
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
    public static EncryptionConfig get(String name, Output<String> id, @Nullable EncryptionConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EncryptionConfig(name, id, state, options);
    }
}