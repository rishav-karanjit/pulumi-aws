// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.inputs;

import com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrCostCategory;
import com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrDimension;
import com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrTags;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTagsFilterOr extends com.pulumi.resources.InvokeArgs {

    public static final GetTagsFilterOr Empty = new GetTagsFilterOr();

    /**
     * Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    @Import(name="costCategory")
    private @Nullable GetTagsFilterOrCostCategory costCategory;

    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    public Optional<GetTagsFilterOrCostCategory> costCategory() {
        return Optional.ofNullable(this.costCategory);
    }

    /**
     * Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    @Import(name="dimension")
    private @Nullable GetTagsFilterOrDimension dimension;

    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    public Optional<GetTagsFilterOrDimension> dimension() {
        return Optional.ofNullable(this.dimension);
    }

    /**
     * Tags that match your request.
     * 
     */
    @Import(name="tags")
    private @Nullable GetTagsFilterOrTags tags;

    /**
     * @return Tags that match your request.
     * 
     */
    public Optional<GetTagsFilterOrTags> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetTagsFilterOr() {}

    private GetTagsFilterOr(GetTagsFilterOr $) {
        this.costCategory = $.costCategory;
        this.dimension = $.dimension;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagsFilterOr defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagsFilterOr $;

        public Builder() {
            $ = new GetTagsFilterOr();
        }

        public Builder(GetTagsFilterOr defaults) {
            $ = new GetTagsFilterOr(Objects.requireNonNull(defaults));
        }

        /**
         * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
         * 
         * @return builder
         * 
         */
        public Builder costCategory(@Nullable GetTagsFilterOrCostCategory costCategory) {
            $.costCategory = costCategory;
            return this;
        }

        /**
         * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
         * 
         * @return builder
         * 
         */
        public Builder dimension(@Nullable GetTagsFilterOrDimension dimension) {
            $.dimension = dimension;
            return this;
        }

        /**
         * @param tags Tags that match your request.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable GetTagsFilterOrTags tags) {
            $.tags = tags;
            return this;
        }

        public GetTagsFilterOr build() {
            return $;
        }
    }

}
