// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.inputs;

import com.pulumi.aws.route53.inputs.GetResolverEndpointFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResolverEndpointPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResolverEndpointPlainArgs Empty = new GetResolverEndpointPlainArgs();

    /**
     * One or more name/value pairs to use as filters. There are
     * several valid keys, for a full reference, check out
     * [Route53resolver Filter value in the AWS API reference][1].
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetResolverEndpointFilter> filters;

    /**
     * @return One or more name/value pairs to use as filters. There are
     * several valid keys, for a full reference, check out
     * [Route53resolver Filter value in the AWS API reference][1].
     * 
     */
    public Optional<List<GetResolverEndpointFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The ID of the Route53 Resolver Endpoint.
     * 
     */
    @Import(name="resolverEndpointId")
    private @Nullable String resolverEndpointId;

    /**
     * @return The ID of the Route53 Resolver Endpoint.
     * 
     */
    public Optional<String> resolverEndpointId() {
        return Optional.ofNullable(this.resolverEndpointId);
    }

    private GetResolverEndpointPlainArgs() {}

    private GetResolverEndpointPlainArgs(GetResolverEndpointPlainArgs $) {
        this.filters = $.filters;
        this.resolverEndpointId = $.resolverEndpointId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResolverEndpointPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResolverEndpointPlainArgs $;

        public Builder() {
            $ = new GetResolverEndpointPlainArgs();
        }

        public Builder(GetResolverEndpointPlainArgs defaults) {
            $ = new GetResolverEndpointPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more name/value pairs to use as filters. There are
         * several valid keys, for a full reference, check out
         * [Route53resolver Filter value in the AWS API reference][1].
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetResolverEndpointFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more name/value pairs to use as filters. There are
         * several valid keys, for a full reference, check out
         * [Route53resolver Filter value in the AWS API reference][1].
         * 
         * @return builder
         * 
         */
        public Builder filters(GetResolverEndpointFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param resolverEndpointId The ID of the Route53 Resolver Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder resolverEndpointId(@Nullable String resolverEndpointId) {
            $.resolverEndpointId = resolverEndpointId;
            return this;
        }

        public GetResolverEndpointPlainArgs build() {
            return $;
        }
    }

}