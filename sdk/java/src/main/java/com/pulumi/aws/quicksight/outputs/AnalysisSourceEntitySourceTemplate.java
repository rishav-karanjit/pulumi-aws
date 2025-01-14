// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.aws.quicksight.outputs.AnalysisSourceEntitySourceTemplateDataSetReference;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AnalysisSourceEntitySourceTemplate {
    /**
     * @return The Amazon Resource Name (ARN) of the resource.
     * 
     */
    private String arn;
    /**
     * @return List of dataset references. See data_set_references.
     * 
     */
    private List<AnalysisSourceEntitySourceTemplateDataSetReference> dataSetReferences;

    private AnalysisSourceEntitySourceTemplate() {}
    /**
     * @return The Amazon Resource Name (ARN) of the resource.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return List of dataset references. See data_set_references.
     * 
     */
    public List<AnalysisSourceEntitySourceTemplateDataSetReference> dataSetReferences() {
        return this.dataSetReferences;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalysisSourceEntitySourceTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private List<AnalysisSourceEntitySourceTemplateDataSetReference> dataSetReferences;
        public Builder() {}
        public Builder(AnalysisSourceEntitySourceTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataSetReferences = defaults.dataSetReferences;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder dataSetReferences(List<AnalysisSourceEntitySourceTemplateDataSetReference> dataSetReferences) {
            this.dataSetReferences = Objects.requireNonNull(dataSetReferences);
            return this;
        }
        public Builder dataSetReferences(AnalysisSourceEntitySourceTemplateDataSetReference... dataSetReferences) {
            return dataSetReferences(List.of(dataSetReferences));
        }
        public AnalysisSourceEntitySourceTemplate build() {
            final var o = new AnalysisSourceEntitySourceTemplate();
            o.arn = arn;
            o.dataSetReferences = dataSetReferences;
            return o;
        }
    }
}
