// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.aws.costexplorer.outputs.GetTagsFilterAndCostCategory;
import com.pulumi.aws.costexplorer.outputs.GetTagsFilterAndDimension;
import com.pulumi.aws.costexplorer.outputs.GetTagsFilterAndTags;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTagsFilterAnd {
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    private final @Nullable GetTagsFilterAndCostCategory costCategory;
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    private final @Nullable GetTagsFilterAndDimension dimension;
    /**
     * @return Tags that match your request.
     * 
     */
    private final @Nullable GetTagsFilterAndTags tags;

    @CustomType.Constructor
    private GetTagsFilterAnd(
        @CustomType.Parameter("costCategory") @Nullable GetTagsFilterAndCostCategory costCategory,
        @CustomType.Parameter("dimension") @Nullable GetTagsFilterAndDimension dimension,
        @CustomType.Parameter("tags") @Nullable GetTagsFilterAndTags tags) {
        this.costCategory = costCategory;
        this.dimension = dimension;
        this.tags = tags;
    }

    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    public Optional<GetTagsFilterAndCostCategory> costCategory() {
        return Optional.ofNullable(this.costCategory);
    }
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    public Optional<GetTagsFilterAndDimension> dimension() {
        return Optional.ofNullable(this.dimension);
    }
    /**
     * @return Tags that match your request.
     * 
     */
    public Optional<GetTagsFilterAndTags> tags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagsFilterAnd defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GetTagsFilterAndCostCategory costCategory;
        private @Nullable GetTagsFilterAndDimension dimension;
        private @Nullable GetTagsFilterAndTags tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTagsFilterAnd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.costCategory = defaults.costCategory;
    	      this.dimension = defaults.dimension;
    	      this.tags = defaults.tags;
        }

        public Builder costCategory(@Nullable GetTagsFilterAndCostCategory costCategory) {
            this.costCategory = costCategory;
            return this;
        }
        public Builder dimension(@Nullable GetTagsFilterAndDimension dimension) {
            this.dimension = dimension;
            return this;
        }
        public Builder tags(@Nullable GetTagsFilterAndTags tags) {
            this.tags = tags;
            return this;
        }        public GetTagsFilterAnd build() {
            return new GetTagsFilterAnd(costCategory, dimension, tags);
        }
    }
}