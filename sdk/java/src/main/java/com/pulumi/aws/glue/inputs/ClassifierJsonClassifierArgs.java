// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClassifierJsonClassifierArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassifierJsonClassifierArgs Empty = new ClassifierJsonClassifierArgs();

    /**
     * A `JsonPath` string defining the JSON data for the classifier to classify. AWS Glue supports a subset of `JsonPath`, as described in [Writing JsonPath Custom Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json).
     * 
     */
    @Import(name="jsonPath", required=true)
    private Output<String> jsonPath;

    /**
     * @return A `JsonPath` string defining the JSON data for the classifier to classify. AWS Glue supports a subset of `JsonPath`, as described in [Writing JsonPath Custom Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json).
     * 
     */
    public Output<String> jsonPath() {
        return this.jsonPath;
    }

    private ClassifierJsonClassifierArgs() {}

    private ClassifierJsonClassifierArgs(ClassifierJsonClassifierArgs $) {
        this.jsonPath = $.jsonPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassifierJsonClassifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassifierJsonClassifierArgs $;

        public Builder() {
            $ = new ClassifierJsonClassifierArgs();
        }

        public Builder(ClassifierJsonClassifierArgs defaults) {
            $ = new ClassifierJsonClassifierArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jsonPath A `JsonPath` string defining the JSON data for the classifier to classify. AWS Glue supports a subset of `JsonPath`, as described in [Writing JsonPath Custom Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json).
         * 
         * @return builder
         * 
         */
        public Builder jsonPath(Output<String> jsonPath) {
            $.jsonPath = jsonPath;
            return this;
        }

        /**
         * @param jsonPath A `JsonPath` string defining the JSON data for the classifier to classify. AWS Glue supports a subset of `JsonPath`, as described in [Writing JsonPath Custom Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json).
         * 
         * @return builder
         * 
         */
        public Builder jsonPath(String jsonPath) {
            return jsonPath(Output.of(jsonPath));
        }

        public ClassifierJsonClassifierArgs build() {
            $.jsonPath = Objects.requireNonNull($.jsonPath, "expected parameter 'jsonPath' to be non-null");
            return $;
        }
    }

}