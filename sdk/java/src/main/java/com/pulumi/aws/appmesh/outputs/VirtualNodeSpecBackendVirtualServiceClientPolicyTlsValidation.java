// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNames;
import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation {
    /**
     * @return The SANs for a TLS validation context.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames;
    /**
     * @return The TLS validation context trust.
     * 
     */
    private final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust trust;

    @CustomType.Constructor
    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation(
        @CustomType.Parameter("subjectAlternativeNames") @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames,
        @CustomType.Parameter("trust") VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust trust) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.trust = trust;
    }

    /**
     * @return The SANs for a TLS validation context.
     * 
     */
    public Optional<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNames> subjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }
    /**
     * @return The TLS validation context trust.
     * 
     */
    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust trust() {
        return this.trust;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames;
        private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust trust;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.trust = defaults.trust;
        }

        public Builder subjectAlternativeNames(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public Builder trust(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust trust) {
            this.trust = Objects.requireNonNull(trust);
            return this;
        }        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation(subjectAlternativeNames, trust);
        }
    }
}