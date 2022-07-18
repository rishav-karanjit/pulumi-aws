// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datapipeline.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPipelineDefinitionParameterValue {
    /**
     * @return ID of the object.
     * 
     */
    private final String id;
    /**
     * @return Field value, expressed as a String.
     * 
     */
    private final String stringValue;

    @CustomType.Constructor
    private GetPipelineDefinitionParameterValue(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("stringValue") String stringValue) {
        this.id = id;
        this.stringValue = stringValue;
    }

    /**
     * @return ID of the object.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Field value, expressed as a String.
     * 
     */
    public String stringValue() {
        return this.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineDefinitionParameterValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineDefinitionParameterValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder stringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }        public GetPipelineDefinitionParameterValue build() {
            return new GetPipelineDefinitionParameterValue(id, stringValue);
        }
    }
}