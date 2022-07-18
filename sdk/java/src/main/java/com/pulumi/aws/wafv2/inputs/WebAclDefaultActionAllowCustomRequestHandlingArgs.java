// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclDefaultActionAllowCustomRequestHandlingArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclDefaultActionAllowCustomRequestHandlingArgs Empty = new WebAclDefaultActionAllowCustomRequestHandlingArgs();

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    @Import(name="insertHeaders", required=true)
    private Output<List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderArgs>> insertHeaders;

    /**
     * @return The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    public Output<List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderArgs>> insertHeaders() {
        return this.insertHeaders;
    }

    private WebAclDefaultActionAllowCustomRequestHandlingArgs() {}

    private WebAclDefaultActionAllowCustomRequestHandlingArgs(WebAclDefaultActionAllowCustomRequestHandlingArgs $) {
        this.insertHeaders = $.insertHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclDefaultActionAllowCustomRequestHandlingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclDefaultActionAllowCustomRequestHandlingArgs $;

        public Builder() {
            $ = new WebAclDefaultActionAllowCustomRequestHandlingArgs();
        }

        public Builder(WebAclDefaultActionAllowCustomRequestHandlingArgs defaults) {
            $ = new WebAclDefaultActionAllowCustomRequestHandlingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param insertHeaders The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder insertHeaders(Output<List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderArgs>> insertHeaders) {
            $.insertHeaders = insertHeaders;
            return this;
        }

        /**
         * @param insertHeaders The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder insertHeaders(List<WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderArgs> insertHeaders) {
            return insertHeaders(Output.of(insertHeaders));
        }

        /**
         * @param insertHeaders The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder insertHeaders(WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderArgs... insertHeaders) {
            return insertHeaders(List.of(insertHeaders));
        }

        public WebAclDefaultActionAllowCustomRequestHandlingArgs build() {
            $.insertHeaders = Objects.requireNonNull($.insertHeaders, "expected parameter 'insertHeaders' to be non-null");
            return $;
        }
    }

}