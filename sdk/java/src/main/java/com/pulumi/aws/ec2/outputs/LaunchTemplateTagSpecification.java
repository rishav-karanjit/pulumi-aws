// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LaunchTemplateTagSpecification {
    /**
     * @return The type of resource to tag.
     * 
     */
    private final @Nullable String resourceType;
    /**
     * @return A map of tags to assign to the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;

    @CustomType.Constructor
    private LaunchTemplateTagSpecification(
        @CustomType.Parameter("resourceType") @Nullable String resourceType,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags) {
        this.resourceType = resourceType;
        this.tags = tags;
    }

    /**
     * @return The type of resource to tag.
     * 
     */
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    /**
     * @return A map of tags to assign to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateTagSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceType;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateTagSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.tags = defaults.tags;
        }

        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public LaunchTemplateTagSpecification build() {
            return new LaunchTemplateTagSpecification(resourceType, tags);
        }
    }
}