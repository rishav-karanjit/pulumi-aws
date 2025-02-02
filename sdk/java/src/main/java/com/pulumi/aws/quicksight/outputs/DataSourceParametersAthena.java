// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceParametersAthena {
    /**
     * @return The work-group to which to connect.
     * 
     */
    private @Nullable String workGroup;

    private DataSourceParametersAthena() {}
    /**
     * @return The work-group to which to connect.
     * 
     */
    public Optional<String> workGroup() {
        return Optional.ofNullable(this.workGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersAthena defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String workGroup;
        public Builder() {}
        public Builder(DataSourceParametersAthena defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workGroup = defaults.workGroup;
        }

        @CustomType.Setter
        public Builder workGroup(@Nullable String workGroup) {
            this.workGroup = workGroup;
            return this;
        }
        public DataSourceParametersAthena build() {
            final var o = new DataSourceParametersAthena();
            o.workGroup = workGroup;
            return o;
        }
    }
}
