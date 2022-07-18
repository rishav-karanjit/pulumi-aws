// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementNotStatementStatementNotStatementStatementLabelMatchStatement {
    /**
     * @return String to match against.
     * 
     */
    private final String key;
    /**
     * @return Specify whether you want to match using the label name or just the namespace. Valid values are `LABEL` or `NAMESPACE`.
     * 
     */
    private final String scope;

    @CustomType.Constructor
    private WebAclRuleStatementNotStatementStatementNotStatementStatementLabelMatchStatement(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("scope") String scope) {
        this.key = key;
        this.scope = scope;
    }

    /**
     * @return String to match against.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Specify whether you want to match using the label name or just the namespace. Valid values are `LABEL` or `NAMESPACE`.
     * 
     */
    public String scope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementNotStatementStatementLabelMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementNotStatementStatementLabelMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.scope = defaults.scope;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }        public WebAclRuleStatementNotStatementStatementNotStatementStatementLabelMatchStatement build() {
            return new WebAclRuleStatementNotStatementStatementNotStatementStatementLabelMatchStatement(key, scope);
        }
    }
}