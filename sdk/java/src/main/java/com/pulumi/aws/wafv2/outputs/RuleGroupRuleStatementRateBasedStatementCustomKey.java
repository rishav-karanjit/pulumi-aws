// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementCustomKeyCookie;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementCustomKeyForwardedIp;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementCustomKeyHeader;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementCustomKeyHttpMethod;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementCustomKeyIp;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementCustomKeyLabelNamespace;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementCustomKeyQueryArgument;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementCustomKeyQueryString;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementRateBasedStatementCustomKeyUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementRateBasedStatementCustomKey {
    /**
     * @return (Optional) Use the value of a cookie in the request as an aggregate key. See RateLimit `cookie` below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyCookie cookie;
    /**
     * @return (Optional) Use the first IP address in an HTTP header as an aggregate key. See `forwarded_ip` below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyForwardedIp forwardedIp;
    /**
     * @return (Optional) Use the value of a header in the request as an aggregate key. See RateLimit `header` below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyHeader header;
    /**
     * @return (Optional) Use the request&#39;s HTTP method as an aggregate key. See RateLimit `http_method` below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyHttpMethod httpMethod;
    /**
     * @return (Optional) Use the request&#39;s originating IP address as an aggregate key. See `RateLimit ip` below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyIp ip;
    /**
     * @return (Optional) Use the specified label namespace as an aggregate key. See RateLimit `label_namespace` below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyLabelNamespace labelNamespace;
    /**
     * @return (Optional) Use the specified query argument as an aggregate key. See RateLimit `query_argument` below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyQueryArgument queryArgument;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyQueryString queryString;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyUriPath uriPath;

    private RuleGroupRuleStatementRateBasedStatementCustomKey() {}
    /**
     * @return (Optional) Use the value of a cookie in the request as an aggregate key. See RateLimit `cookie` below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementCustomKeyCookie> cookie() {
        return Optional.ofNullable(this.cookie);
    }
    /**
     * @return (Optional) Use the first IP address in an HTTP header as an aggregate key. See `forwarded_ip` below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementCustomKeyForwardedIp> forwardedIp() {
        return Optional.ofNullable(this.forwardedIp);
    }
    /**
     * @return (Optional) Use the value of a header in the request as an aggregate key. See RateLimit `header` below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementCustomKeyHeader> header() {
        return Optional.ofNullable(this.header);
    }
    /**
     * @return (Optional) Use the request&#39;s HTTP method as an aggregate key. See RateLimit `http_method` below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementCustomKeyHttpMethod> httpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }
    /**
     * @return (Optional) Use the request&#39;s originating IP address as an aggregate key. See `RateLimit ip` below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementCustomKeyIp> ip() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * @return (Optional) Use the specified label namespace as an aggregate key. See RateLimit `label_namespace` below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementCustomKeyLabelNamespace> labelNamespace() {
        return Optional.ofNullable(this.labelNamespace);
    }
    /**
     * @return (Optional) Use the specified query argument as an aggregate key. See RateLimit `query_argument` below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementCustomKeyQueryArgument> queryArgument() {
        return Optional.ofNullable(this.queryArgument);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementCustomKeyQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<RuleGroupRuleStatementRateBasedStatementCustomKeyUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementRateBasedStatementCustomKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyCookie cookie;
        private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyForwardedIp forwardedIp;
        private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyHeader header;
        private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyHttpMethod httpMethod;
        private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyIp ip;
        private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyLabelNamespace labelNamespace;
        private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyQueryArgument queryArgument;
        private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyQueryString queryString;
        private @Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyUriPath uriPath;
        public Builder() {}
        public Builder(RuleGroupRuleStatementRateBasedStatementCustomKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookie = defaults.cookie;
    	      this.forwardedIp = defaults.forwardedIp;
    	      this.header = defaults.header;
    	      this.httpMethod = defaults.httpMethod;
    	      this.ip = defaults.ip;
    	      this.labelNamespace = defaults.labelNamespace;
    	      this.queryArgument = defaults.queryArgument;
    	      this.queryString = defaults.queryString;
    	      this.uriPath = defaults.uriPath;
        }

        @CustomType.Setter
        public Builder cookie(@Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyCookie cookie) {
            this.cookie = cookie;
            return this;
        }
        @CustomType.Setter
        public Builder forwardedIp(@Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyForwardedIp forwardedIp) {
            this.forwardedIp = forwardedIp;
            return this;
        }
        @CustomType.Setter
        public Builder header(@Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyHeader header) {
            this.header = header;
            return this;
        }
        @CustomType.Setter
        public Builder httpMethod(@Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyHttpMethod httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyIp ip) {
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder labelNamespace(@Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyLabelNamespace labelNamespace) {
            this.labelNamespace = labelNamespace;
            return this;
        }
        @CustomType.Setter
        public Builder queryArgument(@Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyQueryArgument queryArgument) {
            this.queryArgument = queryArgument;
            return this;
        }
        @CustomType.Setter
        public Builder queryString(@Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        @CustomType.Setter
        public Builder uriPath(@Nullable RuleGroupRuleStatementRateBasedStatementCustomKeyUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public RuleGroupRuleStatementRateBasedStatementCustomKey build() {
            final var o = new RuleGroupRuleStatementRateBasedStatementCustomKey();
            o.cookie = cookie;
            o.forwardedIp = forwardedIp;
            o.header = header;
            o.httpMethod = httpMethod;
            o.ip = ip;
            o.labelNamespace = labelNamespace;
            o.queryArgument = queryArgument;
            o.queryString = queryString;
            o.uriPath = uriPath;
            return o;
        }
    }
}
