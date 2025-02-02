// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sesv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sesv2.ConfigurationSetEventDestinationArgs;
import com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationState;
import com.pulumi.aws.sesv2.outputs.ConfigurationSetEventDestinationEventDestination;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS SESv2 (Simple Email V2) Configuration Set Event Destination.
 * 
 * ## Example Usage
 * ### Cloud Watch Destination
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sesv2.ConfigurationSet;
 * import com.pulumi.aws.sesv2.ConfigurationSetArgs;
 * import com.pulumi.aws.sesv2.ConfigurationSetEventDestination;
 * import com.pulumi.aws.sesv2.ConfigurationSetEventDestinationArgs;
 * import com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs;
 * import com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleConfigurationSet = new ConfigurationSet(&#34;exampleConfigurationSet&#34;, ConfigurationSetArgs.builder()        
 *             .configurationSetName(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleConfigurationSetEventDestination = new ConfigurationSetEventDestination(&#34;exampleConfigurationSetEventDestination&#34;, ConfigurationSetEventDestinationArgs.builder()        
 *             .configurationSetName(exampleConfigurationSet.configurationSetName())
 *             .eventDestinationName(&#34;example&#34;)
 *             .eventDestination(ConfigurationSetEventDestinationEventDestinationArgs.builder()
 *                 .cloudWatchDestination(ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs.builder()
 *                     .dimensionConfigurations(ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfigurationArgs.builder()
 *                         .defaultDimensionValue(&#34;example&#34;)
 *                         .dimensionName(&#34;example&#34;)
 *                         .dimensionValueSource(&#34;MESSAGE_TAG&#34;)
 *                         .build())
 *                     .build())
 *                 .enabled(true)
 *                 .matchingEventTypes(&#34;SEND&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Kinesis Firehose Destination
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sesv2.ConfigurationSet;
 * import com.pulumi.aws.sesv2.ConfigurationSetArgs;
 * import com.pulumi.aws.sesv2.ConfigurationSetEventDestination;
 * import com.pulumi.aws.sesv2.ConfigurationSetEventDestinationArgs;
 * import com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs;
 * import com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleConfigurationSet = new ConfigurationSet(&#34;exampleConfigurationSet&#34;, ConfigurationSetArgs.builder()        
 *             .configurationSetName(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleConfigurationSetEventDestination = new ConfigurationSetEventDestination(&#34;exampleConfigurationSetEventDestination&#34;, ConfigurationSetEventDestinationArgs.builder()        
 *             .configurationSetName(exampleConfigurationSet.configurationSetName())
 *             .eventDestinationName(&#34;example&#34;)
 *             .eventDestination(ConfigurationSetEventDestinationEventDestinationArgs.builder()
 *                 .kinesisFirehoseDestination(ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs.builder()
 *                     .deliveryStreamArn(aws_kinesis_firehose_delivery_stream.example().arn())
 *                     .iamRoleArn(aws_iam_role.example().arn())
 *                     .build())
 *                 .enabled(true)
 *                 .matchingEventTypes(&#34;SEND&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Pinpoint Destination
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sesv2.ConfigurationSet;
 * import com.pulumi.aws.sesv2.ConfigurationSetArgs;
 * import com.pulumi.aws.sesv2.ConfigurationSetEventDestination;
 * import com.pulumi.aws.sesv2.ConfigurationSetEventDestinationArgs;
 * import com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs;
 * import com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationPinpointDestinationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleConfigurationSet = new ConfigurationSet(&#34;exampleConfigurationSet&#34;, ConfigurationSetArgs.builder()        
 *             .configurationSetName(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleConfigurationSetEventDestination = new ConfigurationSetEventDestination(&#34;exampleConfigurationSetEventDestination&#34;, ConfigurationSetEventDestinationArgs.builder()        
 *             .configurationSetName(exampleConfigurationSet.configurationSetName())
 *             .eventDestinationName(&#34;example&#34;)
 *             .eventDestination(ConfigurationSetEventDestinationEventDestinationArgs.builder()
 *                 .pinpointDestination(ConfigurationSetEventDestinationEventDestinationPinpointDestinationArgs.builder()
 *                     .applicationArn(aws_pinpoint_app.example().arn())
 *                     .build())
 *                 .enabled(true)
 *                 .matchingEventTypes(&#34;SEND&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### SNS Destination
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sesv2.ConfigurationSet;
 * import com.pulumi.aws.sesv2.ConfigurationSetArgs;
 * import com.pulumi.aws.sesv2.ConfigurationSetEventDestination;
 * import com.pulumi.aws.sesv2.ConfigurationSetEventDestinationArgs;
 * import com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs;
 * import com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationSnsDestinationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleConfigurationSet = new ConfigurationSet(&#34;exampleConfigurationSet&#34;, ConfigurationSetArgs.builder()        
 *             .configurationSetName(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleConfigurationSetEventDestination = new ConfigurationSetEventDestination(&#34;exampleConfigurationSetEventDestination&#34;, ConfigurationSetEventDestinationArgs.builder()        
 *             .configurationSetName(exampleConfigurationSet.configurationSetName())
 *             .eventDestinationName(&#34;example&#34;)
 *             .eventDestination(ConfigurationSetEventDestinationEventDestinationArgs.builder()
 *                 .snsDestination(ConfigurationSetEventDestinationEventDestinationSnsDestinationArgs.builder()
 *                     .topicArn(aws_sns_topic.example().arn())
 *                     .build())
 *                 .enabled(true)
 *                 .matchingEventTypes(&#34;SEND&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SESv2 (Simple Email V2) Configuration Set Event Destination using the `id` (`configuration_set_name|event_destination_name`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:sesv2/configurationSetEventDestination:ConfigurationSetEventDestination example example_configuration_set|example_event_destination
 * ```
 * 
 */
@ResourceType(type="aws:sesv2/configurationSetEventDestination:ConfigurationSetEventDestination")
public class ConfigurationSetEventDestination extends com.pulumi.resources.CustomResource {
    /**
     * The name of the configuration set.
     * 
     */
    @Export(name="configurationSetName", refs={String.class}, tree="[0]")
    private Output<String> configurationSetName;

    /**
     * @return The name of the configuration set.
     * 
     */
    public Output<String> configurationSetName() {
        return this.configurationSetName;
    }
    /**
     * A name that identifies the event destination within the configuration set.
     * 
     */
    @Export(name="eventDestination", refs={ConfigurationSetEventDestinationEventDestination.class}, tree="[0]")
    private Output<ConfigurationSetEventDestinationEventDestination> eventDestination;

    /**
     * @return A name that identifies the event destination within the configuration set.
     * 
     */
    public Output<ConfigurationSetEventDestinationEventDestination> eventDestination() {
        return this.eventDestination;
    }
    /**
     * An object that defines the event destination. See event_destination below.
     * 
     */
    @Export(name="eventDestinationName", refs={String.class}, tree="[0]")
    private Output<String> eventDestinationName;

    /**
     * @return An object that defines the event destination. See event_destination below.
     * 
     */
    public Output<String> eventDestinationName() {
        return this.eventDestinationName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigurationSetEventDestination(String name) {
        this(name, ConfigurationSetEventDestinationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationSetEventDestination(String name, ConfigurationSetEventDestinationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationSetEventDestination(String name, ConfigurationSetEventDestinationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sesv2/configurationSetEventDestination:ConfigurationSetEventDestination", name, args == null ? ConfigurationSetEventDestinationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigurationSetEventDestination(String name, Output<String> id, @Nullable ConfigurationSetEventDestinationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sesv2/configurationSetEventDestination:ConfigurationSetEventDestination", name, state, makeResourceOptions(options, id));
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
    public static ConfigurationSetEventDestination get(String name, Output<String> id, @Nullable ConfigurationSetEventDestinationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationSetEventDestination(name, id, state, options);
    }
}
