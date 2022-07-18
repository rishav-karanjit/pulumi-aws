// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCostCategoryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCostCategoryPlainArgs Empty = new GetCostCategoryPlainArgs();

    /**
     * Unique name for the Cost Category.
     * 
     */
    @Import(name="costCategoryArn", required=true)
    private String costCategoryArn;

    /**
     * @return Unique name for the Cost Category.
     * 
     */
    public String costCategoryArn() {
        return this.costCategoryArn;
    }

    private GetCostCategoryPlainArgs() {}

    private GetCostCategoryPlainArgs(GetCostCategoryPlainArgs $) {
        this.costCategoryArn = $.costCategoryArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCostCategoryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCostCategoryPlainArgs $;

        public Builder() {
            $ = new GetCostCategoryPlainArgs();
        }

        public Builder(GetCostCategoryPlainArgs defaults) {
            $ = new GetCostCategoryPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param costCategoryArn Unique name for the Cost Category.
         * 
         * @return builder
         * 
         */
        public Builder costCategoryArn(String costCategoryArn) {
            $.costCategoryArn = costCategoryArn;
            return this;
        }

        public GetCostCategoryPlainArgs build() {
            $.costCategoryArn = Objects.requireNonNull($.costCategoryArn, "expected parameter 'costCategoryArn' to be non-null");
            return $;
        }
    }

}