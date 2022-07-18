// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionTargetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class GatewayRouteSpecHttp2RouteActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttp2RouteActionArgs Empty = new GatewayRouteSpecHttp2RouteActionArgs();

    /**
     * The target that traffic is routed to when a request matches the gateway route.
     * 
     */
    @Import(name="target", required=true)
    private Output<GatewayRouteSpecHttp2RouteActionTargetArgs> target;

    /**
     * @return The target that traffic is routed to when a request matches the gateway route.
     * 
     */
    public Output<GatewayRouteSpecHttp2RouteActionTargetArgs> target() {
        return this.target;
    }

    private GatewayRouteSpecHttp2RouteActionArgs() {}

    private GatewayRouteSpecHttp2RouteActionArgs(GatewayRouteSpecHttp2RouteActionArgs $) {
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayRouteSpecHttp2RouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecHttp2RouteActionArgs $;

        public Builder() {
            $ = new GatewayRouteSpecHttp2RouteActionArgs();
        }

        public Builder(GatewayRouteSpecHttp2RouteActionArgs defaults) {
            $ = new GatewayRouteSpecHttp2RouteActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param target The target that traffic is routed to when a request matches the gateway route.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<GatewayRouteSpecHttp2RouteActionTargetArgs> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The target that traffic is routed to when a request matches the gateway route.
         * 
         * @return builder
         * 
         */
        public Builder target(GatewayRouteSpecHttp2RouteActionTargetArgs target) {
            return target(Output.of(target));
        }

        public GatewayRouteSpecHttp2RouteActionArgs build() {
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}