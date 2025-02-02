// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs Empty = new ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs();

    /**
     * The Amazon Resource Name (ARN) of the destination Amazon CloudWatch Logs log group.
     * 
     */
    @Import(name="logGroupArn", required=true)
    private Output<String> logGroupArn;

    /**
     * @return The Amazon Resource Name (ARN) of the destination Amazon CloudWatch Logs log group.
     * 
     */
    public Output<String> logGroupArn() {
        return this.logGroupArn;
    }

    private ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs() {}

    private ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs(ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs $) {
        this.logGroupArn = $.logGroupArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs $;

        public Builder() {
            $ = new ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs();
        }

        public Builder(ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs defaults) {
            $ = new ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logGroupArn The Amazon Resource Name (ARN) of the destination Amazon CloudWatch Logs log group.
         * 
         * @return builder
         * 
         */
        public Builder logGroupArn(Output<String> logGroupArn) {
            $.logGroupArn = logGroupArn;
            return this;
        }

        /**
         * @param logGroupArn The Amazon Resource Name (ARN) of the destination Amazon CloudWatch Logs log group.
         * 
         * @return builder
         * 
         */
        public Builder logGroupArn(String logGroupArn) {
            return logGroupArn(Output.of(logGroupArn));
        }

        public ExperimentTemplateLogConfigurationCloudwatchLogsConfigurationArgs build() {
            $.logGroupArn = Objects.requireNonNull($.logGroupArn, "expected parameter 'logGroupArn' to be non-null");
            return $;
        }
    }

}
