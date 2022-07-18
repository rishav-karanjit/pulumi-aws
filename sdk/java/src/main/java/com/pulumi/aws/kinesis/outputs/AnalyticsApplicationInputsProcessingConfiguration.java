// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.aws.kinesis.outputs.AnalyticsApplicationInputsProcessingConfigurationLambda;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class AnalyticsApplicationInputsProcessingConfiguration {
    /**
     * @return The Lambda function configuration. See Lambda below for more details.
     * 
     */
    private final AnalyticsApplicationInputsProcessingConfigurationLambda lambda;

    @CustomType.Constructor
    private AnalyticsApplicationInputsProcessingConfiguration(@CustomType.Parameter("lambda") AnalyticsApplicationInputsProcessingConfigurationLambda lambda) {
        this.lambda = lambda;
    }

    /**
     * @return The Lambda function configuration. See Lambda below for more details.
     * 
     */
    public AnalyticsApplicationInputsProcessingConfigurationLambda lambda() {
        return this.lambda;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsProcessingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsApplicationInputsProcessingConfigurationLambda lambda;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsProcessingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambda = defaults.lambda;
        }

        public Builder lambda(AnalyticsApplicationInputsProcessingConfigurationLambda lambda) {
            this.lambda = Objects.requireNonNull(lambda);
            return this;
        }        public AnalyticsApplicationInputsProcessingConfiguration build() {
            return new AnalyticsApplicationInputsProcessingConfiguration(lambda);
        }
    }
}