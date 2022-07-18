// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySize {
    /**
     * @return Specifies the endpoint capacity type. Valid values are: `INSTANCE_COUNT`, or `CAPACITY_PERCENT`.
     * 
     */
    private final String type;
    /**
     * @return Defines the capacity size, either as a number of instances or a capacity percentage.
     * 
     */
    private final Integer value;

    @CustomType.Constructor
    private EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySize(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") Integer value) {
        this.type = type;
        this.value = value;
    }

    /**
     * @return Specifies the endpoint capacity type. Valid values are: `INSTANCE_COUNT`, or `CAPACITY_PERCENT`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Defines the capacity size, either as a number of instances or a capacity percentage.
     * 
     */
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySize defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySize defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySize build() {
            return new EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySize(type, value);
        }
    }
}