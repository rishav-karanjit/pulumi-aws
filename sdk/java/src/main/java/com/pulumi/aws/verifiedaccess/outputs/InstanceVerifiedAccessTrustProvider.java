// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.verifiedaccess.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceVerifiedAccessTrustProvider {
    /**
     * @return A description for the AWS Verified Access Instance.
     * 
     */
    private @Nullable String description;
    /**
     * @return The type of device-based trust provider.
     * 
     */
    private @Nullable String deviceTrustProviderType;
    /**
     * @return The type of trust provider (user- or device-based).
     * 
     */
    private @Nullable String trustProviderType;
    /**
     * @return The type of user-based trust provider.
     * 
     */
    private @Nullable String userTrustProviderType;
    /**
     * @return The ID of the trust provider.
     * 
     */
    private @Nullable String verifiedAccessTrustProviderId;

    private InstanceVerifiedAccessTrustProvider() {}
    /**
     * @return A description for the AWS Verified Access Instance.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The type of device-based trust provider.
     * 
     */
    public Optional<String> deviceTrustProviderType() {
        return Optional.ofNullable(this.deviceTrustProviderType);
    }
    /**
     * @return The type of trust provider (user- or device-based).
     * 
     */
    public Optional<String> trustProviderType() {
        return Optional.ofNullable(this.trustProviderType);
    }
    /**
     * @return The type of user-based trust provider.
     * 
     */
    public Optional<String> userTrustProviderType() {
        return Optional.ofNullable(this.userTrustProviderType);
    }
    /**
     * @return The ID of the trust provider.
     * 
     */
    public Optional<String> verifiedAccessTrustProviderId() {
        return Optional.ofNullable(this.verifiedAccessTrustProviderId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceVerifiedAccessTrustProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable String deviceTrustProviderType;
        private @Nullable String trustProviderType;
        private @Nullable String userTrustProviderType;
        private @Nullable String verifiedAccessTrustProviderId;
        public Builder() {}
        public Builder(InstanceVerifiedAccessTrustProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.deviceTrustProviderType = defaults.deviceTrustProviderType;
    	      this.trustProviderType = defaults.trustProviderType;
    	      this.userTrustProviderType = defaults.userTrustProviderType;
    	      this.verifiedAccessTrustProviderId = defaults.verifiedAccessTrustProviderId;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder deviceTrustProviderType(@Nullable String deviceTrustProviderType) {
            this.deviceTrustProviderType = deviceTrustProviderType;
            return this;
        }
        @CustomType.Setter
        public Builder trustProviderType(@Nullable String trustProviderType) {
            this.trustProviderType = trustProviderType;
            return this;
        }
        @CustomType.Setter
        public Builder userTrustProviderType(@Nullable String userTrustProviderType) {
            this.userTrustProviderType = userTrustProviderType;
            return this;
        }
        @CustomType.Setter
        public Builder verifiedAccessTrustProviderId(@Nullable String verifiedAccessTrustProviderId) {
            this.verifiedAccessTrustProviderId = verifiedAccessTrustProviderId;
            return this;
        }
        public InstanceVerifiedAccessTrustProvider build() {
            final var o = new InstanceVerifiedAccessTrustProvider();
            o.description = description;
            o.deviceTrustProviderType = deviceTrustProviderType;
            o.trustProviderType = trustProviderType;
            o.userTrustProviderType = userTrustProviderType;
            o.verifiedAccessTrustProviderId = verifiedAccessTrustProviderId;
            return o;
        }
    }
}
