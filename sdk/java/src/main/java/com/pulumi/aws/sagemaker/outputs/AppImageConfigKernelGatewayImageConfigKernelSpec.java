// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppImageConfigKernelGatewayImageConfigKernelSpec {
    /**
     * @return The display name of the kernel.
     * 
     */
    private @Nullable String displayName;
    /**
     * @return The name of the kernel.
     * 
     */
    private String name;

    private AppImageConfigKernelGatewayImageConfigKernelSpec() {}
    /**
     * @return The display name of the kernel.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return The name of the kernel.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigKernelGatewayImageConfigKernelSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String displayName;
        private String name;
        public Builder() {}
        public Builder(AppImageConfigKernelGatewayImageConfigKernelSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public AppImageConfigKernelGatewayImageConfigKernelSpec build() {
            final var o = new AppImageConfigKernelGatewayImageConfigKernelSpec();
            o.displayName = displayName;
            o.name = name;
            return o;
        }
    }
}
