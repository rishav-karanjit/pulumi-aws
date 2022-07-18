// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.aws.autoscaling.outputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecification;
import com.pulumi.aws.autoscaling.outputs.PolicyTargetTrackingConfigurationPredefinedMetricSpecification;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyTargetTrackingConfiguration {
    /**
     * @return A customized metric. Conflicts with `predefined_metric_specification`.
     * 
     */
    private final @Nullable PolicyTargetTrackingConfigurationCustomizedMetricSpecification customizedMetricSpecification;
    /**
     * @return Indicates whether scale in by the target tracking policy is disabled.
     * 
     */
    private final @Nullable Boolean disableScaleIn;
    /**
     * @return A predefined metric. Conflicts with `customized_metric_specification`.
     * 
     */
    private final @Nullable PolicyTargetTrackingConfigurationPredefinedMetricSpecification predefinedMetricSpecification;
    /**
     * @return The target value for the metric.
     * 
     */
    private final Double targetValue;

    @CustomType.Constructor
    private PolicyTargetTrackingConfiguration(
        @CustomType.Parameter("customizedMetricSpecification") @Nullable PolicyTargetTrackingConfigurationCustomizedMetricSpecification customizedMetricSpecification,
        @CustomType.Parameter("disableScaleIn") @Nullable Boolean disableScaleIn,
        @CustomType.Parameter("predefinedMetricSpecification") @Nullable PolicyTargetTrackingConfigurationPredefinedMetricSpecification predefinedMetricSpecification,
        @CustomType.Parameter("targetValue") Double targetValue) {
        this.customizedMetricSpecification = customizedMetricSpecification;
        this.disableScaleIn = disableScaleIn;
        this.predefinedMetricSpecification = predefinedMetricSpecification;
        this.targetValue = targetValue;
    }

    /**
     * @return A customized metric. Conflicts with `predefined_metric_specification`.
     * 
     */
    public Optional<PolicyTargetTrackingConfigurationCustomizedMetricSpecification> customizedMetricSpecification() {
        return Optional.ofNullable(this.customizedMetricSpecification);
    }
    /**
     * @return Indicates whether scale in by the target tracking policy is disabled.
     * 
     */
    public Optional<Boolean> disableScaleIn() {
        return Optional.ofNullable(this.disableScaleIn);
    }
    /**
     * @return A predefined metric. Conflicts with `customized_metric_specification`.
     * 
     */
    public Optional<PolicyTargetTrackingConfigurationPredefinedMetricSpecification> predefinedMetricSpecification() {
        return Optional.ofNullable(this.predefinedMetricSpecification);
    }
    /**
     * @return The target value for the metric.
     * 
     */
    public Double targetValue() {
        return this.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTargetTrackingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PolicyTargetTrackingConfigurationCustomizedMetricSpecification customizedMetricSpecification;
        private @Nullable Boolean disableScaleIn;
        private @Nullable PolicyTargetTrackingConfigurationPredefinedMetricSpecification predefinedMetricSpecification;
        private Double targetValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTargetTrackingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customizedMetricSpecification = defaults.customizedMetricSpecification;
    	      this.disableScaleIn = defaults.disableScaleIn;
    	      this.predefinedMetricSpecification = defaults.predefinedMetricSpecification;
    	      this.targetValue = defaults.targetValue;
        }

        public Builder customizedMetricSpecification(@Nullable PolicyTargetTrackingConfigurationCustomizedMetricSpecification customizedMetricSpecification) {
            this.customizedMetricSpecification = customizedMetricSpecification;
            return this;
        }
        public Builder disableScaleIn(@Nullable Boolean disableScaleIn) {
            this.disableScaleIn = disableScaleIn;
            return this;
        }
        public Builder predefinedMetricSpecification(@Nullable PolicyTargetTrackingConfigurationPredefinedMetricSpecification predefinedMetricSpecification) {
            this.predefinedMetricSpecification = predefinedMetricSpecification;
            return this;
        }
        public Builder targetValue(Double targetValue) {
            this.targetValue = Objects.requireNonNull(targetValue);
            return this;
        }        public PolicyTargetTrackingConfiguration build() {
            return new PolicyTargetTrackingConfiguration(customizedMetricSpecification, disableScaleIn, predefinedMetricSpecification, targetValue);
        }
    }
}