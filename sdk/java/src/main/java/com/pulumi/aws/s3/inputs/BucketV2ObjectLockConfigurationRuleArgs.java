// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationRuleDefaultRetentionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class BucketV2ObjectLockConfigurationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketV2ObjectLockConfigurationRuleArgs Empty = new BucketV2ObjectLockConfigurationRuleArgs();

    /**
     * Default retention period that you want to apply to new objects placed in this bucket (documented below).
     * 
     */
    @Import(name="defaultRetentions", required=true)
    private Output<List<BucketV2ObjectLockConfigurationRuleDefaultRetentionArgs>> defaultRetentions;

    /**
     * @return Default retention period that you want to apply to new objects placed in this bucket (documented below).
     * 
     */
    public Output<List<BucketV2ObjectLockConfigurationRuleDefaultRetentionArgs>> defaultRetentions() {
        return this.defaultRetentions;
    }

    private BucketV2ObjectLockConfigurationRuleArgs() {}

    private BucketV2ObjectLockConfigurationRuleArgs(BucketV2ObjectLockConfigurationRuleArgs $) {
        this.defaultRetentions = $.defaultRetentions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketV2ObjectLockConfigurationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketV2ObjectLockConfigurationRuleArgs $;

        public Builder() {
            $ = new BucketV2ObjectLockConfigurationRuleArgs();
        }

        public Builder(BucketV2ObjectLockConfigurationRuleArgs defaults) {
            $ = new BucketV2ObjectLockConfigurationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultRetentions Default retention period that you want to apply to new objects placed in this bucket (documented below).
         * 
         * @return builder
         * 
         */
        public Builder defaultRetentions(Output<List<BucketV2ObjectLockConfigurationRuleDefaultRetentionArgs>> defaultRetentions) {
            $.defaultRetentions = defaultRetentions;
            return this;
        }

        /**
         * @param defaultRetentions Default retention period that you want to apply to new objects placed in this bucket (documented below).
         * 
         * @return builder
         * 
         */
        public Builder defaultRetentions(List<BucketV2ObjectLockConfigurationRuleDefaultRetentionArgs> defaultRetentions) {
            return defaultRetentions(Output.of(defaultRetentions));
        }

        /**
         * @param defaultRetentions Default retention period that you want to apply to new objects placed in this bucket (documented below).
         * 
         * @return builder
         * 
         */
        public Builder defaultRetentions(BucketV2ObjectLockConfigurationRuleDefaultRetentionArgs... defaultRetentions) {
            return defaultRetentions(List.of(defaultRetentions));
        }

        public BucketV2ObjectLockConfigurationRuleArgs build() {
            $.defaultRetentions = Objects.requireNonNull($.defaultRetentions, "expected parameter 'defaultRetentions' to be non-null");
            return $;
        }
    }

}
