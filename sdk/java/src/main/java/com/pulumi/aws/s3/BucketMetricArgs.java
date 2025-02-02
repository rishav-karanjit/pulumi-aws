// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.s3.inputs.BucketMetricFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketMetricArgs Empty = new BucketMetricArgs();

    /**
     * Name of the bucket to put metric configuration.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return Name of the bucket to put metric configuration.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
     * 
     */
    @Import(name="filter")
    private @Nullable Output<BucketMetricFilterArgs> filter;

    /**
     * @return [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
     * 
     */
    public Optional<Output<BucketMetricFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Unique identifier of the metrics configuration for the bucket. Must be less than or equal to 64 characters in length.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique identifier of the metrics configuration for the bucket. Must be less than or equal to 64 characters in length.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private BucketMetricArgs() {}

    private BucketMetricArgs(BucketMetricArgs $) {
        this.bucket = $.bucket;
        this.filter = $.filter;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketMetricArgs $;

        public Builder() {
            $ = new BucketMetricArgs();
        }

        public Builder(BucketMetricArgs defaults) {
            $ = new BucketMetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket Name of the bucket to put metric configuration.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Name of the bucket to put metric configuration.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param filter [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<BucketMetricFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
         * 
         * @return builder
         * 
         */
        public Builder filter(BucketMetricFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param name Unique identifier of the metrics configuration for the bucket. Must be less than or equal to 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique identifier of the metrics configuration for the bucket. Must be less than or equal to 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public BucketMetricArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
