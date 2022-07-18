// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfig {
    /**
     * @return The number of seconds a response should be cached for. The default is 5 minutes (300 seconds). The Lambda function can override this by returning a `ttlOverride` key in its response. A value of 0 disables caching of responses. Minimum value of 0. Maximum value of 3600.
     * 
     */
    private final @Nullable Integer authorizerResultTtlInSeconds;
    /**
     * @return The ARN of the Lambda function to be called for authorization. Note: This Lambda function must have a resource-based policy assigned to it, to allow `lambda:InvokeFunction` from service principal `appsync.amazonaws.com`.
     * 
     */
    private final String authorizerUri;
    /**
     * @return A regular expression for validation of tokens before the Lambda function is called.
     * 
     */
    private final @Nullable String identityValidationExpression;

    @CustomType.Constructor
    private GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfig(
        @CustomType.Parameter("authorizerResultTtlInSeconds") @Nullable Integer authorizerResultTtlInSeconds,
        @CustomType.Parameter("authorizerUri") String authorizerUri,
        @CustomType.Parameter("identityValidationExpression") @Nullable String identityValidationExpression) {
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
        this.authorizerUri = authorizerUri;
        this.identityValidationExpression = identityValidationExpression;
    }

    /**
     * @return The number of seconds a response should be cached for. The default is 5 minutes (300 seconds). The Lambda function can override this by returning a `ttlOverride` key in its response. A value of 0 disables caching of responses. Minimum value of 0. Maximum value of 3600.
     * 
     */
    public Optional<Integer> authorizerResultTtlInSeconds() {
        return Optional.ofNullable(this.authorizerResultTtlInSeconds);
    }
    /**
     * @return The ARN of the Lambda function to be called for authorization. Note: This Lambda function must have a resource-based policy assigned to it, to allow `lambda:InvokeFunction` from service principal `appsync.amazonaws.com`.
     * 
     */
    public String authorizerUri() {
        return this.authorizerUri;
    }
    /**
     * @return A regular expression for validation of tokens before the Lambda function is called.
     * 
     */
    public Optional<String> identityValidationExpression() {
        return Optional.ofNullable(this.identityValidationExpression);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer authorizerResultTtlInSeconds;
        private String authorizerUri;
        private @Nullable String identityValidationExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizerResultTtlInSeconds = defaults.authorizerResultTtlInSeconds;
    	      this.authorizerUri = defaults.authorizerUri;
    	      this.identityValidationExpression = defaults.identityValidationExpression;
        }

        public Builder authorizerResultTtlInSeconds(@Nullable Integer authorizerResultTtlInSeconds) {
            this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
            return this;
        }
        public Builder authorizerUri(String authorizerUri) {
            this.authorizerUri = Objects.requireNonNull(authorizerUri);
            return this;
        }
        public Builder identityValidationExpression(@Nullable String identityValidationExpression) {
            this.identityValidationExpression = identityValidationExpression;
            return this;
        }        public GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfig build() {
            return new GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfig(authorizerResultTtlInSeconds, authorizerUri, identityValidationExpression);
        }
    }
}