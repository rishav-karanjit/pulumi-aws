// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ReplicatorKafkaClusterAmazonMskClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicatorKafkaClusterAmazonMskClusterArgs Empty = new ReplicatorKafkaClusterAmazonMskClusterArgs();

    /**
     * The ARN of an Amazon MSK cluster.
     * 
     */
    @Import(name="mskClusterArn", required=true)
    private Output<String> mskClusterArn;

    /**
     * @return The ARN of an Amazon MSK cluster.
     * 
     */
    public Output<String> mskClusterArn() {
        return this.mskClusterArn;
    }

    private ReplicatorKafkaClusterAmazonMskClusterArgs() {}

    private ReplicatorKafkaClusterAmazonMskClusterArgs(ReplicatorKafkaClusterAmazonMskClusterArgs $) {
        this.mskClusterArn = $.mskClusterArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicatorKafkaClusterAmazonMskClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicatorKafkaClusterAmazonMskClusterArgs $;

        public Builder() {
            $ = new ReplicatorKafkaClusterAmazonMskClusterArgs();
        }

        public Builder(ReplicatorKafkaClusterAmazonMskClusterArgs defaults) {
            $ = new ReplicatorKafkaClusterAmazonMskClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mskClusterArn The ARN of an Amazon MSK cluster.
         * 
         * @return builder
         * 
         */
        public Builder mskClusterArn(Output<String> mskClusterArn) {
            $.mskClusterArn = mskClusterArn;
            return this;
        }

        /**
         * @param mskClusterArn The ARN of an Amazon MSK cluster.
         * 
         * @return builder
         * 
         */
        public Builder mskClusterArn(String mskClusterArn) {
            return mskClusterArn(Output.of(mskClusterArn));
        }

        public ReplicatorKafkaClusterAmazonMskClusterArgs build() {
            $.mskClusterArn = Objects.requireNonNull($.mskClusterArn, "expected parameter 'mskClusterArn' to be non-null");
            return $;
        }
    }

}
