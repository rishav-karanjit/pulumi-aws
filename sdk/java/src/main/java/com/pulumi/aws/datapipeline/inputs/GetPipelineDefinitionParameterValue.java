// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datapipeline.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPipelineDefinitionParameterValue extends com.pulumi.resources.InvokeArgs {

    public static final GetPipelineDefinitionParameterValue Empty = new GetPipelineDefinitionParameterValue();

    /**
     * ID of the object.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return ID of the object.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Field value, expressed as a String.
     * 
     */
    @Import(name="stringValue", required=true)
    private String stringValue;

    /**
     * @return Field value, expressed as a String.
     * 
     */
    public String stringValue() {
        return this.stringValue;
    }

    private GetPipelineDefinitionParameterValue() {}

    private GetPipelineDefinitionParameterValue(GetPipelineDefinitionParameterValue $) {
        this.id = $.id;
        this.stringValue = $.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPipelineDefinitionParameterValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPipelineDefinitionParameterValue $;

        public Builder() {
            $ = new GetPipelineDefinitionParameterValue();
        }

        public Builder(GetPipelineDefinitionParameterValue defaults) {
            $ = new GetPipelineDefinitionParameterValue(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the object.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param stringValue Field value, expressed as a String.
         * 
         * @return builder
         * 
         */
        public Builder stringValue(String stringValue) {
            $.stringValue = stringValue;
            return this;
        }

        public GetPipelineDefinitionParameterValue build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.stringValue = Objects.requireNonNull($.stringValue, "expected parameter 'stringValue' to be non-null");
            return $;
        }
    }

}