// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.aws.imagebuilder.outputs.ContainerRecipeComponentParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ContainerRecipeComponent {
    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Component to associate.
     * 
     */
    private final String componentArn;
    /**
     * @return Configuration block(s) for parameters to configure the component. Detailed below.
     * 
     */
    private final @Nullable List<ContainerRecipeComponentParameter> parameters;

    @CustomType.Constructor
    private ContainerRecipeComponent(
        @CustomType.Parameter("componentArn") String componentArn,
        @CustomType.Parameter("parameters") @Nullable List<ContainerRecipeComponentParameter> parameters) {
        this.componentArn = componentArn;
        this.parameters = parameters;
    }

    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Component to associate.
     * 
     */
    public String componentArn() {
        return this.componentArn;
    }
    /**
     * @return Configuration block(s) for parameters to configure the component. Detailed below.
     * 
     */
    public List<ContainerRecipeComponentParameter> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRecipeComponent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String componentArn;
        private @Nullable List<ContainerRecipeComponentParameter> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRecipeComponent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentArn = defaults.componentArn;
    	      this.parameters = defaults.parameters;
        }

        public Builder componentArn(String componentArn) {
            this.componentArn = Objects.requireNonNull(componentArn);
            return this;
        }
        public Builder parameters(@Nullable List<ContainerRecipeComponentParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(ContainerRecipeComponentParameter... parameters) {
            return parameters(List.of(parameters));
        }        public ContainerRecipeComponent build() {
            return new ContainerRecipeComponent(componentArn, parameters);
        }
    }
}