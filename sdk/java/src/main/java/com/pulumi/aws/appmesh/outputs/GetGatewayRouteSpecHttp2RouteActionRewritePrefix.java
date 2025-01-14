// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayRouteSpecHttp2RouteActionRewritePrefix {
    private String defaultPrefix;
    private String value;

    private GetGatewayRouteSpecHttp2RouteActionRewritePrefix() {}
    public String defaultPrefix() {
        return this.defaultPrefix;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayRouteSpecHttp2RouteActionRewritePrefix defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String defaultPrefix;
        private String value;
        public Builder() {}
        public Builder(GetGatewayRouteSpecHttp2RouteActionRewritePrefix defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultPrefix = defaults.defaultPrefix;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder defaultPrefix(String defaultPrefix) {
            this.defaultPrefix = Objects.requireNonNull(defaultPrefix);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetGatewayRouteSpecHttp2RouteActionRewritePrefix build() {
            final var o = new GetGatewayRouteSpecHttp2RouteActionRewritePrefix();
            o.defaultPrefix = defaultPrefix;
            o.value = value;
            return o;
        }
    }
}
