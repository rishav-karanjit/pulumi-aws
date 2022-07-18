// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.macie2.InvitationAccepterArgs;
import com.pulumi.aws.macie2.inputs.InvitationAccepterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an [Amazon Macie Invitation Accepter](https://docs.aws.amazon.com/macie/latest/APIReference/invitations-accept.html).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import com.pulumi.resources.CustomResourceOptions;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var primaryAccount = new Account(&#34;primaryAccount&#34;, AccountArgs.Empty, CustomResourceOptions.builder()
 *             .provider(&#34;awsalternate&#34;)
 *             .build());
 * 
 *         var memberAccount = new Account(&#34;memberAccount&#34;);
 * 
 *         var primaryMember = new Member(&#34;primaryMember&#34;, MemberArgs.builder()        
 *             .accountId(&#34;ACCOUNT ID&#34;)
 *             .email(&#34;EMAIL&#34;)
 *             .invite(true)
 *             .invitationMessage(&#34;Message of the invite&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(&#34;awsalternate&#34;)
 *                 .dependsOn(primaryAccount)
 *                 .build());
 * 
 *         var memberInvitationAccepter = new InvitationAccepter(&#34;memberInvitationAccepter&#34;, InvitationAccepterArgs.builder()        
 *             .administratorAccountId(&#34;ADMINISTRATOR ACCOUNT ID&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(primaryMember)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_macie2_invitation_accepter` can be imported using the admin account ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:macie2/invitationAccepter:InvitationAccepter example 123456789012
 * ```
 * 
 */
@ResourceType(type="aws:macie2/invitationAccepter:InvitationAccepter")
public class InvitationAccepter extends com.pulumi.resources.CustomResource {
    /**
     * The AWS account ID for the account that sent the invitation.
     * 
     */
    @Export(name="administratorAccountId", type=String.class, parameters={})
    private Output<String> administratorAccountId;

    /**
     * @return The AWS account ID for the account that sent the invitation.
     * 
     */
    public Output<String> administratorAccountId() {
        return this.administratorAccountId;
    }
    /**
     * The unique identifier for the invitation.
     * 
     */
    @Export(name="invitationId", type=String.class, parameters={})
    private Output<String> invitationId;

    /**
     * @return The unique identifier for the invitation.
     * 
     */
    public Output<String> invitationId() {
        return this.invitationId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InvitationAccepter(String name) {
        this(name, InvitationAccepterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InvitationAccepter(String name, InvitationAccepterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InvitationAccepter(String name, InvitationAccepterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:macie2/invitationAccepter:InvitationAccepter", name, args == null ? InvitationAccepterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InvitationAccepter(String name, Output<String> id, @Nullable InvitationAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:macie2/invitationAccepter:InvitationAccepter", name, state, makeResourceOptions(options, id));
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
    public static InvitationAccepter get(String name, Output<String> id, @Nullable InvitationAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InvitationAccepter(name, id, state, options);
    }
}