// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketOwnershipControlsRule {
    /**
     * @return Object ownership. Valid values: `BucketOwnerPreferred`, `ObjectWriter` or `BucketOwnerEnforced`
     * 
     */
    private final String objectOwnership;

    @CustomType.Constructor
    private BucketOwnershipControlsRule(@CustomType.Parameter("objectOwnership") String objectOwnership) {
        this.objectOwnership = objectOwnership;
    }

    /**
     * @return Object ownership. Valid values: `BucketOwnerPreferred`, `ObjectWriter` or `BucketOwnerEnforced`
     * 
     */
    public String objectOwnership() {
        return this.objectOwnership;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketOwnershipControlsRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectOwnership;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketOwnershipControlsRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectOwnership = defaults.objectOwnership;
        }

        public Builder objectOwnership(String objectOwnership) {
            this.objectOwnership = Objects.requireNonNull(objectOwnership);
            return this;
        }        public BucketOwnershipControlsRule build() {
            return new BucketOwnershipControlsRule(objectOwnership);
        }
    }
}