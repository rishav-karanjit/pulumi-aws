// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.aws.costexplorer.outputs.GetTagsFilterAnd;
import com.pulumi.aws.costexplorer.outputs.GetTagsFilterCostCategory;
import com.pulumi.aws.costexplorer.outputs.GetTagsFilterDimension;
import com.pulumi.aws.costexplorer.outputs.GetTagsFilterNot;
import com.pulumi.aws.costexplorer.outputs.GetTagsFilterOr;
import com.pulumi.aws.costexplorer.outputs.GetTagsFilterTags;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTagsFilter {
    /**
     * @return Return results that match both `Dimension` objects.
     * 
     */
    private @Nullable List<GetTagsFilterAnd> ands;
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    private @Nullable GetTagsFilterCostCategory costCategory;
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    private @Nullable GetTagsFilterDimension dimension;
    /**
     * @return Return results that match both `Dimension` object.
     * 
     */
    private @Nullable GetTagsFilterNot not;
    /**
     * @return Return results that match both `Dimension` object.
     * 
     */
    private @Nullable List<GetTagsFilterOr> ors;
    /**
     * @return Tags that match your request.
     * 
     */
    private @Nullable GetTagsFilterTags tags;

    private GetTagsFilter() {}
    /**
     * @return Return results that match both `Dimension` objects.
     * 
     */
    public List<GetTagsFilterAnd> ands() {
        return this.ands == null ? List.of() : this.ands;
    }
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    public Optional<GetTagsFilterCostCategory> costCategory() {
        return Optional.ofNullable(this.costCategory);
    }
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    public Optional<GetTagsFilterDimension> dimension() {
        return Optional.ofNullable(this.dimension);
    }
    /**
     * @return Return results that match both `Dimension` object.
     * 
     */
    public Optional<GetTagsFilterNot> not() {
        return Optional.ofNullable(this.not);
    }
    /**
     * @return Return results that match both `Dimension` object.
     * 
     */
    public List<GetTagsFilterOr> ors() {
        return this.ors == null ? List.of() : this.ors;
    }
    /**
     * @return Tags that match your request.
     * 
     */
    public Optional<GetTagsFilterTags> tags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagsFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetTagsFilterAnd> ands;
        private @Nullable GetTagsFilterCostCategory costCategory;
        private @Nullable GetTagsFilterDimension dimension;
        private @Nullable GetTagsFilterNot not;
        private @Nullable List<GetTagsFilterOr> ors;
        private @Nullable GetTagsFilterTags tags;
        public Builder() {}
        public Builder(GetTagsFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ands = defaults.ands;
    	      this.costCategory = defaults.costCategory;
    	      this.dimension = defaults.dimension;
    	      this.not = defaults.not;
    	      this.ors = defaults.ors;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder ands(@Nullable List<GetTagsFilterAnd> ands) {
            this.ands = ands;
            return this;
        }
        public Builder ands(GetTagsFilterAnd... ands) {
            return ands(List.of(ands));
        }
        @CustomType.Setter
        public Builder costCategory(@Nullable GetTagsFilterCostCategory costCategory) {
            this.costCategory = costCategory;
            return this;
        }
        @CustomType.Setter
        public Builder dimension(@Nullable GetTagsFilterDimension dimension) {
            this.dimension = dimension;
            return this;
        }
        @CustomType.Setter
        public Builder not(@Nullable GetTagsFilterNot not) {
            this.not = not;
            return this;
        }
        @CustomType.Setter
        public Builder ors(@Nullable List<GetTagsFilterOr> ors) {
            this.ors = ors;
            return this;
        }
        public Builder ors(GetTagsFilterOr... ors) {
            return ors(List.of(ors));
        }
        @CustomType.Setter
        public Builder tags(@Nullable GetTagsFilterTags tags) {
            this.tags = tags;
            return this;
        }
        public GetTagsFilter build() {
            final var o = new GetTagsFilter();
            o.ands = ands;
            o.costCategory = costCategory;
            o.dimension = dimension;
            o.not = not;
            o.ors = ors;
            o.tags = tags;
            return o;
        }
    }
}
