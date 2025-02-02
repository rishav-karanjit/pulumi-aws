// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUserAuthenticationMode {
    private @Nullable Integer passwordCount;
    private @Nullable String type;

    private GetUserAuthenticationMode() {}
    public Optional<Integer> passwordCount() {
        return Optional.ofNullable(this.passwordCount);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserAuthenticationMode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer passwordCount;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetUserAuthenticationMode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwordCount = defaults.passwordCount;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder passwordCount(@Nullable Integer passwordCount) {
            this.passwordCount = passwordCount;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public GetUserAuthenticationMode build() {
            final var o = new GetUserAuthenticationMode();
            o.passwordCount = passwordCount;
            o.type = type;
            return o;
        }
    }
}
