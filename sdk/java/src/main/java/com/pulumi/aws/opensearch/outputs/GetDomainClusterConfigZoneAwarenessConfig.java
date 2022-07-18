// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetDomainClusterConfigZoneAwarenessConfig {
    /**
     * @return Number of availability zones used.
     * 
     */
    private final Integer availabilityZoneCount;

    @CustomType.Constructor
    private GetDomainClusterConfigZoneAwarenessConfig(@CustomType.Parameter("availabilityZoneCount") Integer availabilityZoneCount) {
        this.availabilityZoneCount = availabilityZoneCount;
    }

    /**
     * @return Number of availability zones used.
     * 
     */
    public Integer availabilityZoneCount() {
        return this.availabilityZoneCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainClusterConfigZoneAwarenessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer availabilityZoneCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainClusterConfigZoneAwarenessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZoneCount = defaults.availabilityZoneCount;
        }

        public Builder availabilityZoneCount(Integer availabilityZoneCount) {
            this.availabilityZoneCount = Objects.requireNonNull(availabilityZoneCount);
            return this;
        }        public GetDomainClusterConfigZoneAwarenessConfig build() {
            return new GetDomainClusterConfigZoneAwarenessConfig(availabilityZoneCount);
        }
    }
}