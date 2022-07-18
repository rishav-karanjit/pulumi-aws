// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.wafregional.RegexMatchSetArgs;
import com.pulumi.aws.wafregional.inputs.RegexMatchSetState;
import com.pulumi.aws.wafregional.outputs.RegexMatchSetRegexMatchTuple;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a WAF Regional Regex Match Set Resource
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
 *         var exampleRegexPatternSet = new RegexPatternSet(&#34;exampleRegexPatternSet&#34;, RegexPatternSetArgs.builder()        
 *             .regexPatternStrings(            
 *                 &#34;one&#34;,
 *                 &#34;two&#34;)
 *             .build());
 * 
 *         var exampleRegexMatchSet = new RegexMatchSet(&#34;exampleRegexMatchSet&#34;, RegexMatchSetArgs.builder()        
 *             .regexMatchTuples(RegexMatchSetRegexMatchTupleArgs.builder()
 *                 .fieldToMatch(RegexMatchSetRegexMatchTupleFieldToMatchArgs.builder()
 *                     .data(&#34;User-Agent&#34;)
 *                     .type(&#34;HEADER&#34;)
 *                     .build())
 *                 .regexPatternSetId(exampleRegexPatternSet.id())
 *                 .textTransformation(&#34;NONE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * WAF Regional Regex Match Set can be imported using the id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:wafregional/regexMatchSet:RegexMatchSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:wafregional/regexMatchSet:RegexMatchSet")
public class RegexMatchSet extends com.pulumi.resources.CustomResource {
    /**
     * The name or description of the Regex Match Set.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name or description of the Regex Match Set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
     * 
     */
    @Export(name="regexMatchTuples", type=List.class, parameters={RegexMatchSetRegexMatchTuple.class})
    private Output</* @Nullable */ List<RegexMatchSetRegexMatchTuple>> regexMatchTuples;

    /**
     * @return The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
     * 
     */
    public Output<Optional<List<RegexMatchSetRegexMatchTuple>>> regexMatchTuples() {
        return Codegen.optional(this.regexMatchTuples);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegexMatchSet(String name) {
        this(name, RegexMatchSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegexMatchSet(String name, @Nullable RegexMatchSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegexMatchSet(String name, @Nullable RegexMatchSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/regexMatchSet:RegexMatchSet", name, args == null ? RegexMatchSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegexMatchSet(String name, Output<String> id, @Nullable RegexMatchSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/regexMatchSet:RegexMatchSet", name, state, makeResourceOptions(options, id));
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
    public static RegexMatchSet get(String name, Output<String> id, @Nullable RegexMatchSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegexMatchSet(name, id, state, options);
    }
}