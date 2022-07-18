// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor {
    /**
     * @return Array of processor parameters. More details are given below
     * 
     */
    private final @Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter> parameters;
    /**
     * @return The type of processor. Valid Values: `RecordDeAggregation`, `Lambda`, `MetadataExtraction`, `AppendDelimiterToRecord`. Validation is done against [AWS SDK constants](https://docs.aws.amazon.com/sdk-for-go/api/service/firehose/#pkg-constants); so that values not explicitly listed may also work.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor(
        @CustomType.Parameter("parameters") @Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter> parameters,
        @CustomType.Parameter("type") String type) {
        this.parameters = parameters;
        this.type = type;
    }

    /**
     * @return Array of processor parameters. More details are given below
     * 
     */
    public List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * @return The type of processor. Valid Values: `RecordDeAggregation`, `Lambda`, `MetadataExtraction`, `AppendDelimiterToRecord`. Validation is done against [AWS SDK constants](https://docs.aws.amazon.com/sdk-for-go/api/service/firehose/#pkg-constants); so that values not explicitly listed may also work.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter> parameters;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder parameters(@Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor build() {
            return new FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor(parameters, type);
        }
    }
}