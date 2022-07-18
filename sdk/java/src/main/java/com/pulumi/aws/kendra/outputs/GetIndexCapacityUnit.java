// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetIndexCapacityUnit {
    /**
     * @return The amount of extra query capacity for an index and GetQuerySuggestions capacity. For more information, refer to [QueryCapacityUnits](https://docs.aws.amazon.com/kendra/latest/dg/API_CapacityUnitsConfiguration.html#Kendra-Type-CapacityUnitsConfiguration-QueryCapacityUnits).
     * 
     */
    private final Integer queryCapacityUnits;
    /**
     * @return The amount of extra storage capacity for an index. A single capacity unit provides 30 GB of storage space or 100,000 documents, whichever is reached first. Minimum value of 0.
     * 
     */
    private final Integer storageCapacityUnits;

    @CustomType.Constructor
    private GetIndexCapacityUnit(
        @CustomType.Parameter("queryCapacityUnits") Integer queryCapacityUnits,
        @CustomType.Parameter("storageCapacityUnits") Integer storageCapacityUnits) {
        this.queryCapacityUnits = queryCapacityUnits;
        this.storageCapacityUnits = storageCapacityUnits;
    }

    /**
     * @return The amount of extra query capacity for an index and GetQuerySuggestions capacity. For more information, refer to [QueryCapacityUnits](https://docs.aws.amazon.com/kendra/latest/dg/API_CapacityUnitsConfiguration.html#Kendra-Type-CapacityUnitsConfiguration-QueryCapacityUnits).
     * 
     */
    public Integer queryCapacityUnits() {
        return this.queryCapacityUnits;
    }
    /**
     * @return The amount of extra storage capacity for an index. A single capacity unit provides 30 GB of storage space or 100,000 documents, whichever is reached first. Minimum value of 0.
     * 
     */
    public Integer storageCapacityUnits() {
        return this.storageCapacityUnits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIndexCapacityUnit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer queryCapacityUnits;
        private Integer storageCapacityUnits;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIndexCapacityUnit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryCapacityUnits = defaults.queryCapacityUnits;
    	      this.storageCapacityUnits = defaults.storageCapacityUnits;
        }

        public Builder queryCapacityUnits(Integer queryCapacityUnits) {
            this.queryCapacityUnits = Objects.requireNonNull(queryCapacityUnits);
            return this;
        }
        public Builder storageCapacityUnits(Integer storageCapacityUnits) {
            this.storageCapacityUnits = Objects.requireNonNull(storageCapacityUnits);
            return this;
        }        public GetIndexCapacityUnit build() {
            return new GetIndexCapacityUnit(queryCapacityUnits, storageCapacityUnits);
        }
    }
}