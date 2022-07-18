// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowCustomRequestHandlingInsertHeaderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleActionAllowCustomRequestHandlingArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionAllowCustomRequestHandlingArgs Empty = new WebAclRuleActionAllowCustomRequestHandlingArgs();

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    @Import(name="insertHeaders", required=true)
    private Output<List<WebAclRuleActionAllowCustomRequestHandlingInsertHeaderArgs>> insertHeaders;

    /**
     * @return The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    public Output<List<WebAclRuleActionAllowCustomRequestHandlingInsertHeaderArgs>> insertHeaders() {
        return this.insertHeaders;
    }

    private WebAclRuleActionAllowCustomRequestHandlingArgs() {}

    private WebAclRuleActionAllowCustomRequestHandlingArgs(WebAclRuleActionAllowCustomRequestHandlingArgs $) {
        this.insertHeaders = $.insertHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleActionAllowCustomRequestHandlingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleActionAllowCustomRequestHandlingArgs $;

        public Builder() {
            $ = new WebAclRuleActionAllowCustomRequestHandlingArgs();
        }

        public Builder(WebAclRuleActionAllowCustomRequestHandlingArgs defaults) {
            $ = new WebAclRuleActionAllowCustomRequestHandlingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param insertHeaders The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder insertHeaders(Output<List<WebAclRuleActionAllowCustomRequestHandlingInsertHeaderArgs>> insertHeaders) {
            $.insertHeaders = insertHeaders;
            return this;
        }

        /**
         * @param insertHeaders The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder insertHeaders(List<WebAclRuleActionAllowCustomRequestHandlingInsertHeaderArgs> insertHeaders) {
            return insertHeaders(Output.of(insertHeaders));
        }

        /**
         * @param insertHeaders The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder insertHeaders(WebAclRuleActionAllowCustomRequestHandlingInsertHeaderArgs... insertHeaders) {
            return insertHeaders(List.of(insertHeaders));
        }

        public WebAclRuleActionAllowCustomRequestHandlingArgs build() {
            $.insertHeaders = Objects.requireNonNull($.insertHeaders, "expected parameter 'insertHeaders' to be non-null");
            return $;
        }
    }

}