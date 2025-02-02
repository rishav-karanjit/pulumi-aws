// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.identitystore.outputs;

import com.pulumi.aws.identitystore.outputs.GetGroupAlternateIdentifierExternalId;
import com.pulumi.aws.identitystore.outputs.GetGroupAlternateIdentifierUniqueAttribute;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGroupAlternateIdentifier {
    /**
     * @return Configuration block for filtering by the identifier issued by an external identity provider. Detailed below.
     * 
     */
    private @Nullable GetGroupAlternateIdentifierExternalId externalId;
    /**
     * @return An entity attribute that&#39;s unique to a specific entity. Detailed below.
     * 
     * &gt; Exactly one of the above arguments must be provided.
     * 
     */
    private @Nullable GetGroupAlternateIdentifierUniqueAttribute uniqueAttribute;

    private GetGroupAlternateIdentifier() {}
    /**
     * @return Configuration block for filtering by the identifier issued by an external identity provider. Detailed below.
     * 
     */
    public Optional<GetGroupAlternateIdentifierExternalId> externalId() {
        return Optional.ofNullable(this.externalId);
    }
    /**
     * @return An entity attribute that&#39;s unique to a specific entity. Detailed below.
     * 
     * &gt; Exactly one of the above arguments must be provided.
     * 
     */
    public Optional<GetGroupAlternateIdentifierUniqueAttribute> uniqueAttribute() {
        return Optional.ofNullable(this.uniqueAttribute);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupAlternateIdentifier defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetGroupAlternateIdentifierExternalId externalId;
        private @Nullable GetGroupAlternateIdentifierUniqueAttribute uniqueAttribute;
        public Builder() {}
        public Builder(GetGroupAlternateIdentifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalId = defaults.externalId;
    	      this.uniqueAttribute = defaults.uniqueAttribute;
        }

        @CustomType.Setter
        public Builder externalId(@Nullable GetGroupAlternateIdentifierExternalId externalId) {
            this.externalId = externalId;
            return this;
        }
        @CustomType.Setter
        public Builder uniqueAttribute(@Nullable GetGroupAlternateIdentifierUniqueAttribute uniqueAttribute) {
            this.uniqueAttribute = uniqueAttribute;
            return this;
        }
        public GetGroupAlternateIdentifier build() {
            final var o = new GetGroupAlternateIdentifier();
            o.externalId = externalId;
            o.uniqueAttribute = uniqueAttribute;
            return o;
        }
    }
}
