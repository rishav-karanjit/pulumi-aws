// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecListenerConnectionPoolHttp {
    /**
     * @return Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    private final Integer maxConnections;
    /**
     * @return Number of overflowing requests after `max_connections` Envoy will queue to upstream cluster. Minimum value of `1`.
     * 
     */
    private final @Nullable Integer maxPendingRequests;

    @CustomType.Constructor
    private VirtualNodeSpecListenerConnectionPoolHttp(
        @CustomType.Parameter("maxConnections") Integer maxConnections,
        @CustomType.Parameter("maxPendingRequests") @Nullable Integer maxPendingRequests) {
        this.maxConnections = maxConnections;
        this.maxPendingRequests = maxPendingRequests;
    }

    /**
     * @return Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    public Integer maxConnections() {
        return this.maxConnections;
    }
    /**
     * @return Number of overflowing requests after `max_connections` Envoy will queue to upstream cluster. Minimum value of `1`.
     * 
     */
    public Optional<Integer> maxPendingRequests() {
        return Optional.ofNullable(this.maxPendingRequests);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerConnectionPoolHttp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxConnections;
        private @Nullable Integer maxPendingRequests;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerConnectionPoolHttp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxPendingRequests = defaults.maxPendingRequests;
        }

        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }
        public Builder maxPendingRequests(@Nullable Integer maxPendingRequests) {
            this.maxPendingRequests = maxPendingRequests;
            return this;
        }        public VirtualNodeSpecListenerConnectionPoolHttp build() {
            return new VirtualNodeSpecListenerConnectionPoolHttp(maxConnections, maxPendingRequests);
        }
    }
}