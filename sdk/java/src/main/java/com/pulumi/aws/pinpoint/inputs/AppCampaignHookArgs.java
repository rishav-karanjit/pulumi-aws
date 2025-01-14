// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pinpoint.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppCampaignHookArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppCampaignHookArgs Empty = new AppCampaignHookArgs();

    /**
     * Lambda function name or ARN to be called for delivery. Conflicts with `web_url`
     * 
     */
    @Import(name="lambdaFunctionName")
    private @Nullable Output<String> lambdaFunctionName;

    /**
     * @return Lambda function name or ARN to be called for delivery. Conflicts with `web_url`
     * 
     */
    public Optional<Output<String>> lambdaFunctionName() {
        return Optional.ofNullable(this.lambdaFunctionName);
    }

    /**
     * What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambda_function_name`
     * 
     */
    @Import(name="webUrl")
    private @Nullable Output<String> webUrl;

    /**
     * @return Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambda_function_name`
     * 
     */
    public Optional<Output<String>> webUrl() {
        return Optional.ofNullable(this.webUrl);
    }

    private AppCampaignHookArgs() {}

    private AppCampaignHookArgs(AppCampaignHookArgs $) {
        this.lambdaFunctionName = $.lambdaFunctionName;
        this.mode = $.mode;
        this.webUrl = $.webUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppCampaignHookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppCampaignHookArgs $;

        public Builder() {
            $ = new AppCampaignHookArgs();
        }

        public Builder(AppCampaignHookArgs defaults) {
            $ = new AppCampaignHookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lambdaFunctionName Lambda function name or ARN to be called for delivery. Conflicts with `web_url`
         * 
         * @return builder
         * 
         */
        public Builder lambdaFunctionName(@Nullable Output<String> lambdaFunctionName) {
            $.lambdaFunctionName = lambdaFunctionName;
            return this;
        }

        /**
         * @param lambdaFunctionName Lambda function name or ARN to be called for delivery. Conflicts with `web_url`
         * 
         * @return builder
         * 
         */
        public Builder lambdaFunctionName(String lambdaFunctionName) {
            return lambdaFunctionName(Output.of(lambdaFunctionName));
        }

        /**
         * @param mode What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode What mode Lambda should be invoked in. Valid values for this parameter are `DELIVERY`, `FILTER`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param webUrl Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambda_function_name`
         * 
         * @return builder
         * 
         */
        public Builder webUrl(@Nullable Output<String> webUrl) {
            $.webUrl = webUrl;
            return this;
        }

        /**
         * @param webUrl Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request. Conflicts with `lambda_function_name`
         * 
         * @return builder
         * 
         */
        public Builder webUrl(String webUrl) {
            return webUrl(Output.of(webUrl));
        }

        public AppCampaignHookArgs build() {
            return $;
        }
    }

}
