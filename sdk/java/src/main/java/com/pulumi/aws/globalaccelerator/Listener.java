// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.globalaccelerator;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.globalaccelerator.ListenerArgs;
import com.pulumi.aws.globalaccelerator.inputs.ListenerState;
import com.pulumi.aws.globalaccelerator.outputs.ListenerPortRange;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Global Accelerator listener.
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
 *         var exampleAccelerator = new Accelerator(&#34;exampleAccelerator&#34;, AcceleratorArgs.builder()        
 *             .ipAddressType(&#34;IPV4&#34;)
 *             .enabled(true)
 *             .attributes(AcceleratorAttributesArgs.builder()
 *                 .flowLogsEnabled(true)
 *                 .flowLogsS3Bucket(&#34;example-bucket&#34;)
 *                 .flowLogsS3Prefix(&#34;flow-logs/&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleListener = new Listener(&#34;exampleListener&#34;, ListenerArgs.builder()        
 *             .acceleratorArn(exampleAccelerator.id())
 *             .clientAffinity(&#34;SOURCE_IP&#34;)
 *             .protocol(&#34;TCP&#34;)
 *             .portRanges(ListenerPortRangeArgs.builder()
 *                 .fromPort(80)
 *                 .toPort(80)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Global Accelerator listeners can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:globalaccelerator/listener:Listener example arn:aws:globalaccelerator::111111111111:accelerator/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/listener/xxxxxxxx
 * ```
 * 
 */
@ResourceType(type="aws:globalaccelerator/listener:Listener")
public class Listener extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of your accelerator.
     * 
     */
    @Export(name="acceleratorArn", type=String.class, parameters={})
    private Output<String> acceleratorArn;

    /**
     * @return The Amazon Resource Name (ARN) of your accelerator.
     * 
     */
    public Output<String> acceleratorArn() {
        return this.acceleratorArn;
    }
    /**
     * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the &#34;five-tuple&#34; properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the &#34;two-tuple&#34; properties of source (client) IP address and destination IP address to select the hash value.
     * 
     */
    @Export(name="clientAffinity", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientAffinity;

    /**
     * @return Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the &#34;five-tuple&#34; properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the &#34;two-tuple&#34; properties of source (client) IP address and destination IP address to select the hash value.
     * 
     */
    public Output<Optional<String>> clientAffinity() {
        return Codegen.optional(this.clientAffinity);
    }
    /**
     * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     * 
     */
    @Export(name="portRanges", type=List.class, parameters={ListenerPortRange.class})
    private Output<List<ListenerPortRange>> portRanges;

    /**
     * @return The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     * 
     */
    public Output<List<ListenerPortRange>> portRanges() {
        return this.portRanges;
    }
    /**
     * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Listener(String name) {
        this(name, ListenerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Listener(String name, ListenerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Listener(String name, ListenerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:globalaccelerator/listener:Listener", name, args == null ? ListenerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Listener(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:globalaccelerator/listener:Listener", name, state, makeResourceOptions(options, id));
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
    public static Listener get(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Listener(name, id, state, options);
    }
}