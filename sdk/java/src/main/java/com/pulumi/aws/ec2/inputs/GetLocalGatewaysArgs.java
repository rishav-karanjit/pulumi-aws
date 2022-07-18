// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetLocalGatewaysFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLocalGatewaysArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocalGatewaysArgs Empty = new GetLocalGatewaysArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetLocalGatewaysFilterArgs>> filters;

    /**
     * @return Custom filter block as described below.
     * 
     */
    public Optional<Output<List<GetLocalGatewaysFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A mapping of tags, each pair of which must exactly match
     * a pair on the desired local_gateways.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags, each pair of which must exactly match
     * a pair on the desired local_gateways.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetLocalGatewaysArgs() {}

    private GetLocalGatewaysArgs(GetLocalGatewaysArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocalGatewaysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocalGatewaysArgs $;

        public Builder() {
            $ = new GetLocalGatewaysArgs();
        }

        public Builder(GetLocalGatewaysArgs defaults) {
            $ = new GetLocalGatewaysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetLocalGatewaysFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetLocalGatewaysFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetLocalGatewaysFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param tags A mapping of tags, each pair of which must exactly match
         * a pair on the desired local_gateways.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags, each pair of which must exactly match
         * a pair on the desired local_gateways.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetLocalGatewaysArgs build() {
            return $;
        }
    }

}