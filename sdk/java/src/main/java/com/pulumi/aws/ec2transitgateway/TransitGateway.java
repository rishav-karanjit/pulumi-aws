// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2transitgateway.TransitGatewayArgs;
import com.pulumi.aws.ec2transitgateway.inputs.TransitGatewayState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an EC2 Transit Gateway.
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
 *         var example = new TransitGateway(&#34;example&#34;, TransitGatewayArgs.builder()        
 *             .description(&#34;example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_ec2_transit_gateway` can be imported by using the EC2 Transit Gateway identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2transitgateway/transitGateway:TransitGateway example tgw-12345678
 * ```
 * 
 */
@ResourceType(type="aws:ec2transitgateway/transitGateway:TransitGateway")
public class TransitGateway extends com.pulumi.resources.CustomResource {
    /**
     * Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
     * 
     */
    @Export(name="amazonSideAsn", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> amazonSideAsn;

    /**
     * @return Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
     * 
     */
    public Output<Optional<Integer>> amazonSideAsn() {
        return Codegen.optional(this.amazonSideAsn);
    }
    /**
     * EC2 Transit Gateway Amazon Resource Name (ARN)
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return EC2 Transit Gateway Amazon Resource Name (ARN)
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Identifier of the default association route table
     * 
     */
    @Export(name="associationDefaultRouteTableId", type=String.class, parameters={})
    private Output<String> associationDefaultRouteTableId;

    /**
     * @return Identifier of the default association route table
     * 
     */
    public Output<String> associationDefaultRouteTableId() {
        return this.associationDefaultRouteTableId;
    }
    /**
     * Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @Export(name="autoAcceptSharedAttachments", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoAcceptSharedAttachments;

    /**
     * @return Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    public Output<Optional<String>> autoAcceptSharedAttachments() {
        return Codegen.optional(this.autoAcceptSharedAttachments);
    }
    /**
     * Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @Export(name="defaultRouteTableAssociation", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultRouteTableAssociation;

    /**
     * @return Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    public Output<Optional<String>> defaultRouteTableAssociation() {
        return Codegen.optional(this.defaultRouteTableAssociation);
    }
    /**
     * Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @Export(name="defaultRouteTablePropagation", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultRouteTablePropagation;

    /**
     * @return Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    public Output<Optional<String>> defaultRouteTablePropagation() {
        return Codegen.optional(this.defaultRouteTablePropagation);
    }
    /**
     * Description of the EC2 Transit Gateway.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the EC2 Transit Gateway.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @Export(name="dnsSupport", type=String.class, parameters={})
    private Output</* @Nullable */ String> dnsSupport;

    /**
     * @return Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    public Output<Optional<String>> dnsSupport() {
        return Codegen.optional(this.dnsSupport);
    }
    /**
     * Whether Multicast support is enabled. Required to use `ec2_transit_gateway_multicast_domain`. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @Export(name="multicastSupport", type=String.class, parameters={})
    private Output</* @Nullable */ String> multicastSupport;

    /**
     * @return Whether Multicast support is enabled. Required to use `ec2_transit_gateway_multicast_domain`. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    public Output<Optional<String>> multicastSupport() {
        return Codegen.optional(this.multicastSupport);
    }
    /**
     * Identifier of the AWS account that owns the EC2 Transit Gateway
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return Identifier of the AWS account that owns the EC2 Transit Gateway
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * Identifier of the default propagation route table
     * 
     */
    @Export(name="propagationDefaultRouteTableId", type=String.class, parameters={})
    private Output<String> propagationDefaultRouteTableId;

    /**
     * @return Identifier of the default propagation route table
     * 
     */
    public Output<String> propagationDefaultRouteTableId() {
        return this.propagationDefaultRouteTableId;
    }
    /**
     * Key-value tags for the EC2 Transit Gateway. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value tags for the EC2 Transit Gateway. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * One or more IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4, or a size /64 CIDR block or larger for IPv6.
     * 
     */
    @Export(name="transitGatewayCidrBlocks", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> transitGatewayCidrBlocks;

    /**
     * @return One or more IPv4 or IPv6 CIDR blocks for the transit gateway. Must be a size /24 CIDR block or larger for IPv4, or a size /64 CIDR block or larger for IPv6.
     * 
     */
    public Output<Optional<List<String>>> transitGatewayCidrBlocks() {
        return Codegen.optional(this.transitGatewayCidrBlocks);
    }
    /**
     * Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @Export(name="vpnEcmpSupport", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpnEcmpSupport;

    /**
     * @return Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    public Output<Optional<String>> vpnEcmpSupport() {
        return Codegen.optional(this.vpnEcmpSupport);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitGateway(String name) {
        this(name, TransitGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitGateway(String name, @Nullable TransitGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGateway(String name, @Nullable TransitGatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/transitGateway:TransitGateway", name, args == null ? TransitGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitGateway(String name, Output<String> id, @Nullable TransitGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/transitGateway:TransitGateway", name, state, makeResourceOptions(options, id));
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
    public static TransitGateway get(String name, Output<String> id, @Nullable TransitGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitGateway(name, id, state, options);
    }
}