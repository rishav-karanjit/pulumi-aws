// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationCloudwatchLoggingOptions {
    private @Nullable String cloudwatchLoggingOptionId;
    /**
     * @return The ARN of the CloudWatch log stream to receive application messages.
     * 
     */
    private String logStreamArn;

    private ApplicationCloudwatchLoggingOptions() {}
    public Optional<String> cloudwatchLoggingOptionId() {
        return Optional.ofNullable(this.cloudwatchLoggingOptionId);
    }
    /**
     * @return The ARN of the CloudWatch log stream to receive application messages.
     * 
     */
    public String logStreamArn() {
        return this.logStreamArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationCloudwatchLoggingOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cloudwatchLoggingOptionId;
        private String logStreamArn;
        public Builder() {}
        public Builder(ApplicationCloudwatchLoggingOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLoggingOptionId = defaults.cloudwatchLoggingOptionId;
    	      this.logStreamArn = defaults.logStreamArn;
        }

        @CustomType.Setter
        public Builder cloudwatchLoggingOptionId(@Nullable String cloudwatchLoggingOptionId) {
            this.cloudwatchLoggingOptionId = cloudwatchLoggingOptionId;
            return this;
        }
        @CustomType.Setter
        public Builder logStreamArn(String logStreamArn) {
            this.logStreamArn = Objects.requireNonNull(logStreamArn);
            return this;
        }
        public ApplicationCloudwatchLoggingOptions build() {
            final var o = new ApplicationCloudwatchLoggingOptions();
            o.cloudwatchLoggingOptionId = cloudwatchLoggingOptionId;
            o.logStreamArn = logStreamArn;
            return o;
        }
    }
}
