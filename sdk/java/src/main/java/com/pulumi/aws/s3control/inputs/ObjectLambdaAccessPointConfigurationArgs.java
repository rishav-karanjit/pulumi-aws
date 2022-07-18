// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.inputs;

import com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectLambdaAccessPointConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectLambdaAccessPointConfigurationArgs Empty = new ObjectLambdaAccessPointConfigurationArgs();

    /**
     * Allowed features. Valid values: `GetObject-Range`, `GetObject-PartNumber`.
     * 
     */
    @Import(name="allowedFeatures")
    private @Nullable Output<List<String>> allowedFeatures;

    /**
     * @return Allowed features. Valid values: `GetObject-Range`, `GetObject-PartNumber`.
     * 
     */
    public Optional<Output<List<String>>> allowedFeatures() {
        return Optional.ofNullable(this.allowedFeatures);
    }

    /**
     * Whether or not the CloudWatch metrics configuration is enabled.
     * 
     */
    @Import(name="cloudWatchMetricsEnabled")
    private @Nullable Output<Boolean> cloudWatchMetricsEnabled;

    /**
     * @return Whether or not the CloudWatch metrics configuration is enabled.
     * 
     */
    public Optional<Output<Boolean>> cloudWatchMetricsEnabled() {
        return Optional.ofNullable(this.cloudWatchMetricsEnabled);
    }

    /**
     * Standard access point associated with the Object Lambda Access Point.
     * 
     */
    @Import(name="supportingAccessPoint", required=true)
    private Output<String> supportingAccessPoint;

    /**
     * @return Standard access point associated with the Object Lambda Access Point.
     * 
     */
    public Output<String> supportingAccessPoint() {
        return this.supportingAccessPoint;
    }

    /**
     * List of transformation configurations for the Object Lambda Access Point. See Transformation Configuration below for more details.
     * 
     */
    @Import(name="transformationConfigurations", required=true)
    private Output<List<ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs>> transformationConfigurations;

    /**
     * @return List of transformation configurations for the Object Lambda Access Point. See Transformation Configuration below for more details.
     * 
     */
    public Output<List<ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs>> transformationConfigurations() {
        return this.transformationConfigurations;
    }

    private ObjectLambdaAccessPointConfigurationArgs() {}

    private ObjectLambdaAccessPointConfigurationArgs(ObjectLambdaAccessPointConfigurationArgs $) {
        this.allowedFeatures = $.allowedFeatures;
        this.cloudWatchMetricsEnabled = $.cloudWatchMetricsEnabled;
        this.supportingAccessPoint = $.supportingAccessPoint;
        this.transformationConfigurations = $.transformationConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectLambdaAccessPointConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectLambdaAccessPointConfigurationArgs $;

        public Builder() {
            $ = new ObjectLambdaAccessPointConfigurationArgs();
        }

        public Builder(ObjectLambdaAccessPointConfigurationArgs defaults) {
            $ = new ObjectLambdaAccessPointConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedFeatures Allowed features. Valid values: `GetObject-Range`, `GetObject-PartNumber`.
         * 
         * @return builder
         * 
         */
        public Builder allowedFeatures(@Nullable Output<List<String>> allowedFeatures) {
            $.allowedFeatures = allowedFeatures;
            return this;
        }

        /**
         * @param allowedFeatures Allowed features. Valid values: `GetObject-Range`, `GetObject-PartNumber`.
         * 
         * @return builder
         * 
         */
        public Builder allowedFeatures(List<String> allowedFeatures) {
            return allowedFeatures(Output.of(allowedFeatures));
        }

        /**
         * @param allowedFeatures Allowed features. Valid values: `GetObject-Range`, `GetObject-PartNumber`.
         * 
         * @return builder
         * 
         */
        public Builder allowedFeatures(String... allowedFeatures) {
            return allowedFeatures(List.of(allowedFeatures));
        }

        /**
         * @param cloudWatchMetricsEnabled Whether or not the CloudWatch metrics configuration is enabled.
         * 
         * @return builder
         * 
         */
        public Builder cloudWatchMetricsEnabled(@Nullable Output<Boolean> cloudWatchMetricsEnabled) {
            $.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
            return this;
        }

        /**
         * @param cloudWatchMetricsEnabled Whether or not the CloudWatch metrics configuration is enabled.
         * 
         * @return builder
         * 
         */
        public Builder cloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
            return cloudWatchMetricsEnabled(Output.of(cloudWatchMetricsEnabled));
        }

        /**
         * @param supportingAccessPoint Standard access point associated with the Object Lambda Access Point.
         * 
         * @return builder
         * 
         */
        public Builder supportingAccessPoint(Output<String> supportingAccessPoint) {
            $.supportingAccessPoint = supportingAccessPoint;
            return this;
        }

        /**
         * @param supportingAccessPoint Standard access point associated with the Object Lambda Access Point.
         * 
         * @return builder
         * 
         */
        public Builder supportingAccessPoint(String supportingAccessPoint) {
            return supportingAccessPoint(Output.of(supportingAccessPoint));
        }

        /**
         * @param transformationConfigurations List of transformation configurations for the Object Lambda Access Point. See Transformation Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder transformationConfigurations(Output<List<ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs>> transformationConfigurations) {
            $.transformationConfigurations = transformationConfigurations;
            return this;
        }

        /**
         * @param transformationConfigurations List of transformation configurations for the Object Lambda Access Point. See Transformation Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder transformationConfigurations(List<ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs> transformationConfigurations) {
            return transformationConfigurations(Output.of(transformationConfigurations));
        }

        /**
         * @param transformationConfigurations List of transformation configurations for the Object Lambda Access Point. See Transformation Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder transformationConfigurations(ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs... transformationConfigurations) {
            return transformationConfigurations(List.of(transformationConfigurations));
        }

        public ObjectLambdaAccessPointConfigurationArgs build() {
            $.supportingAccessPoint = Objects.requireNonNull($.supportingAccessPoint, "expected parameter 'supportingAccessPoint' to be non-null");
            $.transformationConfigurations = Objects.requireNonNull($.transformationConfigurations, "expected parameter 'transformationConfigurations' to be non-null");
            return $;
        }
    }

}