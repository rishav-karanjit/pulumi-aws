// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyHeadersConfigHeader;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOriginRequestPolicyHeadersConfig {
    private final String headerBehavior;
    private final List<GetOriginRequestPolicyHeadersConfigHeader> headers;

    @CustomType.Constructor
    private GetOriginRequestPolicyHeadersConfig(
        @CustomType.Parameter("headerBehavior") String headerBehavior,
        @CustomType.Parameter("headers") List<GetOriginRequestPolicyHeadersConfigHeader> headers) {
        this.headerBehavior = headerBehavior;
        this.headers = headers;
    }

    public String headerBehavior() {
        return this.headerBehavior;
    }
    public List<GetOriginRequestPolicyHeadersConfigHeader> headers() {
        return this.headers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOriginRequestPolicyHeadersConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerBehavior;
        private List<GetOriginRequestPolicyHeadersConfigHeader> headers;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOriginRequestPolicyHeadersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerBehavior = defaults.headerBehavior;
    	      this.headers = defaults.headers;
        }

        public Builder headerBehavior(String headerBehavior) {
            this.headerBehavior = Objects.requireNonNull(headerBehavior);
            return this;
        }
        public Builder headers(List<GetOriginRequestPolicyHeadersConfigHeader> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }
        public Builder headers(GetOriginRequestPolicyHeadersConfigHeader... headers) {
            return headers(List.of(headers));
        }        public GetOriginRequestPolicyHeadersConfig build() {
            return new GetOriginRequestPolicyHeadersConfig(headerBehavior, headers);
        }
    }
}