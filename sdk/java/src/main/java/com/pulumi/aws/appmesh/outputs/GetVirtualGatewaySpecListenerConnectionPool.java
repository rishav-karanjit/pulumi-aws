// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetVirtualGatewaySpecListenerConnectionPoolGrpc;
import com.pulumi.aws.appmesh.outputs.GetVirtualGatewaySpecListenerConnectionPoolHttp2;
import com.pulumi.aws.appmesh.outputs.GetVirtualGatewaySpecListenerConnectionPoolHttp;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualGatewaySpecListenerConnectionPool {
    private List<GetVirtualGatewaySpecListenerConnectionPoolGrpc> grpcs;
    private List<GetVirtualGatewaySpecListenerConnectionPoolHttp2> http2s;
    private List<GetVirtualGatewaySpecListenerConnectionPoolHttp> https;

    private GetVirtualGatewaySpecListenerConnectionPool() {}
    public List<GetVirtualGatewaySpecListenerConnectionPoolGrpc> grpcs() {
        return this.grpcs;
    }
    public List<GetVirtualGatewaySpecListenerConnectionPoolHttp2> http2s() {
        return this.http2s;
    }
    public List<GetVirtualGatewaySpecListenerConnectionPoolHttp> https() {
        return this.https;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualGatewaySpecListenerConnectionPool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetVirtualGatewaySpecListenerConnectionPoolGrpc> grpcs;
        private List<GetVirtualGatewaySpecListenerConnectionPoolHttp2> http2s;
        private List<GetVirtualGatewaySpecListenerConnectionPoolHttp> https;
        public Builder() {}
        public Builder(GetVirtualGatewaySpecListenerConnectionPool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpcs = defaults.grpcs;
    	      this.http2s = defaults.http2s;
    	      this.https = defaults.https;
        }

        @CustomType.Setter
        public Builder grpcs(List<GetVirtualGatewaySpecListenerConnectionPoolGrpc> grpcs) {
            this.grpcs = Objects.requireNonNull(grpcs);
            return this;
        }
        public Builder grpcs(GetVirtualGatewaySpecListenerConnectionPoolGrpc... grpcs) {
            return grpcs(List.of(grpcs));
        }
        @CustomType.Setter
        public Builder http2s(List<GetVirtualGatewaySpecListenerConnectionPoolHttp2> http2s) {
            this.http2s = Objects.requireNonNull(http2s);
            return this;
        }
        public Builder http2s(GetVirtualGatewaySpecListenerConnectionPoolHttp2... http2s) {
            return http2s(List.of(http2s));
        }
        @CustomType.Setter
        public Builder https(List<GetVirtualGatewaySpecListenerConnectionPoolHttp> https) {
            this.https = Objects.requireNonNull(https);
            return this;
        }
        public Builder https(GetVirtualGatewaySpecListenerConnectionPoolHttp... https) {
            return https(List.of(https));
        }
        public GetVirtualGatewaySpecListenerConnectionPool build() {
            final var o = new GetVirtualGatewaySpecListenerConnectionPool();
            o.grpcs = grpcs;
            o.http2s = http2s;
            o.https = https;
            return o;
        }
    }
}
