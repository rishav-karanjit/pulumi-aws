// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupMixedInstancesPolicyInstancesDistribution {
    /**
     * @return Strategy to use when launching on-demand instances. Valid values: `prioritized`. Default: `prioritized`.
     * 
     */
    private final @Nullable String onDemandAllocationStrategy;
    /**
     * @return Absolute minimum amount of desired capacity that must be fulfilled by on-demand instances. Default: `0`.
     * 
     */
    private final @Nullable Integer onDemandBaseCapacity;
    /**
     * @return Percentage split between on-demand and Spot instances above the base on-demand capacity. Default: `100`.
     * 
     */
    private final @Nullable Integer onDemandPercentageAboveBaseCapacity;
    /**
     * @return How to allocate capacity across the Spot pools. Valid values: `lowest-price`, `capacity-optimized`, `capacity-optimized-prioritized`. Default: `lowest-price`.
     * 
     */
    private final @Nullable String spotAllocationStrategy;
    /**
     * @return Number of Spot pools per availability zone to allocate capacity. EC2 Auto Scaling selects the cheapest Spot pools and evenly allocates Spot capacity across the number of Spot pools that you specify. Only available with `spot_allocation_strategy` set to `lowest-price`. Otherwise it must be set to `0`, if it has been defined before. Default: `2`.
     * 
     */
    private final @Nullable Integer spotInstancePools;
    /**
     * @return Maximum price per unit hour that the user is willing to pay for the Spot instances. Default: an empty string which means the on-demand price.
     * 
     */
    private final @Nullable String spotMaxPrice;

    @CustomType.Constructor
    private GroupMixedInstancesPolicyInstancesDistribution(
        @CustomType.Parameter("onDemandAllocationStrategy") @Nullable String onDemandAllocationStrategy,
        @CustomType.Parameter("onDemandBaseCapacity") @Nullable Integer onDemandBaseCapacity,
        @CustomType.Parameter("onDemandPercentageAboveBaseCapacity") @Nullable Integer onDemandPercentageAboveBaseCapacity,
        @CustomType.Parameter("spotAllocationStrategy") @Nullable String spotAllocationStrategy,
        @CustomType.Parameter("spotInstancePools") @Nullable Integer spotInstancePools,
        @CustomType.Parameter("spotMaxPrice") @Nullable String spotMaxPrice) {
        this.onDemandAllocationStrategy = onDemandAllocationStrategy;
        this.onDemandBaseCapacity = onDemandBaseCapacity;
        this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
        this.spotAllocationStrategy = spotAllocationStrategy;
        this.spotInstancePools = spotInstancePools;
        this.spotMaxPrice = spotMaxPrice;
    }

    /**
     * @return Strategy to use when launching on-demand instances. Valid values: `prioritized`. Default: `prioritized`.
     * 
     */
    public Optional<String> onDemandAllocationStrategy() {
        return Optional.ofNullable(this.onDemandAllocationStrategy);
    }
    /**
     * @return Absolute minimum amount of desired capacity that must be fulfilled by on-demand instances. Default: `0`.
     * 
     */
    public Optional<Integer> onDemandBaseCapacity() {
        return Optional.ofNullable(this.onDemandBaseCapacity);
    }
    /**
     * @return Percentage split between on-demand and Spot instances above the base on-demand capacity. Default: `100`.
     * 
     */
    public Optional<Integer> onDemandPercentageAboveBaseCapacity() {
        return Optional.ofNullable(this.onDemandPercentageAboveBaseCapacity);
    }
    /**
     * @return How to allocate capacity across the Spot pools. Valid values: `lowest-price`, `capacity-optimized`, `capacity-optimized-prioritized`. Default: `lowest-price`.
     * 
     */
    public Optional<String> spotAllocationStrategy() {
        return Optional.ofNullable(this.spotAllocationStrategy);
    }
    /**
     * @return Number of Spot pools per availability zone to allocate capacity. EC2 Auto Scaling selects the cheapest Spot pools and evenly allocates Spot capacity across the number of Spot pools that you specify. Only available with `spot_allocation_strategy` set to `lowest-price`. Otherwise it must be set to `0`, if it has been defined before. Default: `2`.
     * 
     */
    public Optional<Integer> spotInstancePools() {
        return Optional.ofNullable(this.spotInstancePools);
    }
    /**
     * @return Maximum price per unit hour that the user is willing to pay for the Spot instances. Default: an empty string which means the on-demand price.
     * 
     */
    public Optional<String> spotMaxPrice() {
        return Optional.ofNullable(this.spotMaxPrice);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMixedInstancesPolicyInstancesDistribution defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String onDemandAllocationStrategy;
        private @Nullable Integer onDemandBaseCapacity;
        private @Nullable Integer onDemandPercentageAboveBaseCapacity;
        private @Nullable String spotAllocationStrategy;
        private @Nullable Integer spotInstancePools;
        private @Nullable String spotMaxPrice;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMixedInstancesPolicyInstancesDistribution defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onDemandAllocationStrategy = defaults.onDemandAllocationStrategy;
    	      this.onDemandBaseCapacity = defaults.onDemandBaseCapacity;
    	      this.onDemandPercentageAboveBaseCapacity = defaults.onDemandPercentageAboveBaseCapacity;
    	      this.spotAllocationStrategy = defaults.spotAllocationStrategy;
    	      this.spotInstancePools = defaults.spotInstancePools;
    	      this.spotMaxPrice = defaults.spotMaxPrice;
        }

        public Builder onDemandAllocationStrategy(@Nullable String onDemandAllocationStrategy) {
            this.onDemandAllocationStrategy = onDemandAllocationStrategy;
            return this;
        }
        public Builder onDemandBaseCapacity(@Nullable Integer onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Builder onDemandPercentageAboveBaseCapacity(@Nullable Integer onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Builder spotAllocationStrategy(@Nullable String spotAllocationStrategy) {
            this.spotAllocationStrategy = spotAllocationStrategy;
            return this;
        }
        public Builder spotInstancePools(@Nullable Integer spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public Builder spotMaxPrice(@Nullable String spotMaxPrice) {
            this.spotMaxPrice = spotMaxPrice;
            return this;
        }        public GroupMixedInstancesPolicyInstancesDistribution build() {
            return new GroupMixedInstancesPolicyInstancesDistribution(onDemandAllocationStrategy, onDemandBaseCapacity, onDemandPercentageAboveBaseCapacity, spotAllocationStrategy, spotInstancePools, spotMaxPrice);
        }
    }
}