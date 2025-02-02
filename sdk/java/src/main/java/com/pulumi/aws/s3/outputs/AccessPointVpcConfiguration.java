// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccessPointVpcConfiguration {
    /**
     * @return This access point will only allow connections from the specified VPC ID.
     * 
     */
    private String vpcId;

    private AccessPointVpcConfiguration() {}
    /**
     * @return This access point will only allow connections from the specified VPC ID.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointVpcConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String vpcId;
        public Builder() {}
        public Builder(AccessPointVpcConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public AccessPointVpcConfiguration build() {
            final var o = new AccessPointVpcConfiguration();
            o.vpcId = vpcId;
            return o;
        }
    }
}
