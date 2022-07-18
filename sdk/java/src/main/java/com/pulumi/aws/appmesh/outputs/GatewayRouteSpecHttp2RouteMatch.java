// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GatewayRouteSpecHttp2RouteMatch {
    /**
     * @return Specifies the path to match requests with. This parameter must always start with `/`, which by itself matches all requests to the virtual service name.
     * 
     */
    private final String prefix;

    @CustomType.Constructor
    private GatewayRouteSpecHttp2RouteMatch(@CustomType.Parameter("prefix") String prefix) {
        this.prefix = prefix;
    }

    /**
     * @return Specifies the path to match requests with. This parameter must always start with `/`, which by itself matches all requests to the virtual service name.
     * 
     */
    public String prefix() {
        return this.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttp2RouteMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttp2RouteMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
        }

        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }        public GatewayRouteSpecHttp2RouteMatch build() {
            return new GatewayRouteSpecHttp2RouteMatch(prefix);
        }
    }
}