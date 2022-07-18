// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPatchBaselineSource {
    /**
     * @return The value of the yum repo configuration.
     * 
     */
    private final String configuration;
    /**
     * @return The name specified to identify the patch source.
     * 
     */
    private final String name;
    /**
     * @return The specific operating system versions a patch repository applies to.
     * 
     */
    private final List<String> products;

    @CustomType.Constructor
    private GetPatchBaselineSource(
        @CustomType.Parameter("configuration") String configuration,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("products") List<String> products) {
        this.configuration = configuration;
        this.name = name;
        this.products = products;
    }

    /**
     * @return The value of the yum repo configuration.
     * 
     */
    public String configuration() {
        return this.configuration;
    }
    /**
     * @return The name specified to identify the patch source.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The specific operating system versions a patch repository applies to.
     * 
     */
    public List<String> products() {
        return this.products;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPatchBaselineSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configuration;
        private String name;
        private List<String> products;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPatchBaselineSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.name = defaults.name;
    	      this.products = defaults.products;
        }

        public Builder configuration(String configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder products(List<String> products) {
            this.products = Objects.requireNonNull(products);
            return this;
        }
        public Builder products(String... products) {
            return products(List.of(products));
        }        public GetPatchBaselineSource build() {
            return new GetPatchBaselineSource(configuration, name, products);
        }
    }
}