// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatement {
    /**
     * @return Statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    private final List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatement> statements;

    @CustomType.Constructor
    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatement(@CustomType.Parameter("statements") List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatement> statements) {
        this.statements = statements;
    }

    /**
     * @return Statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    public List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatement... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatement build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatement(statements);
        }
    }
}