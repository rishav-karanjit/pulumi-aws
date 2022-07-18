// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CostCategoryRuleInheritedValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final CostCategoryRuleInheritedValueArgs Empty = new CostCategoryRuleInheritedValueArgs();

    /**
     * Key to extract cost category values.
     * 
     */
    @Import(name="dimensionKey")
    private @Nullable Output<String> dimensionKey;

    /**
     * @return Key to extract cost category values.
     * 
     */
    public Optional<Output<String>> dimensionKey() {
        return Optional.ofNullable(this.dimensionKey);
    }

    /**
     * Name of the dimension that&#39;s used to group costs. If you specify `LINKED_ACCOUNT_NAME`, the cost category value is based on account name. If you specify `TAG`, the cost category value will be based on the value of the specified tag key. Valid values are `LINKED_ACCOUNT_NAME`, `TAG`
     * 
     */
    @Import(name="dimensionName")
    private @Nullable Output<String> dimensionName;

    /**
     * @return Name of the dimension that&#39;s used to group costs. If you specify `LINKED_ACCOUNT_NAME`, the cost category value is based on account name. If you specify `TAG`, the cost category value will be based on the value of the specified tag key. Valid values are `LINKED_ACCOUNT_NAME`, `TAG`
     * 
     */
    public Optional<Output<String>> dimensionName() {
        return Optional.ofNullable(this.dimensionName);
    }

    private CostCategoryRuleInheritedValueArgs() {}

    private CostCategoryRuleInheritedValueArgs(CostCategoryRuleInheritedValueArgs $) {
        this.dimensionKey = $.dimensionKey;
        this.dimensionName = $.dimensionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CostCategoryRuleInheritedValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CostCategoryRuleInheritedValueArgs $;

        public Builder() {
            $ = new CostCategoryRuleInheritedValueArgs();
        }

        public Builder(CostCategoryRuleInheritedValueArgs defaults) {
            $ = new CostCategoryRuleInheritedValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dimensionKey Key to extract cost category values.
         * 
         * @return builder
         * 
         */
        public Builder dimensionKey(@Nullable Output<String> dimensionKey) {
            $.dimensionKey = dimensionKey;
            return this;
        }

        /**
         * @param dimensionKey Key to extract cost category values.
         * 
         * @return builder
         * 
         */
        public Builder dimensionKey(String dimensionKey) {
            return dimensionKey(Output.of(dimensionKey));
        }

        /**
         * @param dimensionName Name of the dimension that&#39;s used to group costs. If you specify `LINKED_ACCOUNT_NAME`, the cost category value is based on account name. If you specify `TAG`, the cost category value will be based on the value of the specified tag key. Valid values are `LINKED_ACCOUNT_NAME`, `TAG`
         * 
         * @return builder
         * 
         */
        public Builder dimensionName(@Nullable Output<String> dimensionName) {
            $.dimensionName = dimensionName;
            return this;
        }

        /**
         * @param dimensionName Name of the dimension that&#39;s used to group costs. If you specify `LINKED_ACCOUNT_NAME`, the cost category value is based on account name. If you specify `TAG`, the cost category value will be based on the value of the specified tag key. Valid values are `LINKED_ACCOUNT_NAME`, `TAG`
         * 
         * @return builder
         * 
         */
        public Builder dimensionName(String dimensionName) {
            return dimensionName(Output.of(dimensionName));
        }

        public CostCategoryRuleInheritedValueArgs build() {
            return $;
        }
    }

}