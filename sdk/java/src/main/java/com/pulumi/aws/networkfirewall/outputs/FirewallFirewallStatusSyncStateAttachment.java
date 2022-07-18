// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallFirewallStatusSyncStateAttachment {
    /**
     * @return The identifier of the firewall endpoint that AWS Network Firewall has instantiated in the subnet. You use this to identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the endpoint.
     * 
     */
    private final @Nullable String endpointId;
    /**
     * @return The unique identifier for the subnet.
     * 
     */
    private final @Nullable String subnetId;

    @CustomType.Constructor
    private FirewallFirewallStatusSyncStateAttachment(
        @CustomType.Parameter("endpointId") @Nullable String endpointId,
        @CustomType.Parameter("subnetId") @Nullable String subnetId) {
        this.endpointId = endpointId;
        this.subnetId = subnetId;
    }

    /**
     * @return The identifier of the firewall endpoint that AWS Network Firewall has instantiated in the subnet. You use this to identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the endpoint.
     * 
     */
    public Optional<String> endpointId() {
        return Optional.ofNullable(this.endpointId);
    }
    /**
     * @return The unique identifier for the subnet.
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallFirewallStatusSyncStateAttachment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpointId;
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallFirewallStatusSyncStateAttachment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointId = defaults.endpointId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder endpointId(@Nullable String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }        public FirewallFirewallStatusSyncStateAttachment build() {
            return new FirewallFirewallStatusSyncStateAttachment(endpointId, subnetId);
        }
    }
}