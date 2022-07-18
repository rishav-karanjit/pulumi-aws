// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEndpointPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEndpointPlainArgs Empty = new GetEndpointPlainArgs();

    /**
     * Endpoint type. Valid values: `iot:CredentialProvider`, `iot:Data`, `iot:Data-ATS`, `iot:Jobs`.
     * 
     */
    @Import(name="endpointType")
    private @Nullable String endpointType;

    /**
     * @return Endpoint type. Valid values: `iot:CredentialProvider`, `iot:Data`, `iot:Data-ATS`, `iot:Jobs`.
     * 
     */
    public Optional<String> endpointType() {
        return Optional.ofNullable(this.endpointType);
    }

    private GetEndpointPlainArgs() {}

    private GetEndpointPlainArgs(GetEndpointPlainArgs $) {
        this.endpointType = $.endpointType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEndpointPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEndpointPlainArgs $;

        public Builder() {
            $ = new GetEndpointPlainArgs();
        }

        public Builder(GetEndpointPlainArgs defaults) {
            $ = new GetEndpointPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointType Endpoint type. Valid values: `iot:CredentialProvider`, `iot:Data`, `iot:Data-ATS`, `iot:Jobs`.
         * 
         * @return builder
         * 
         */
        public Builder endpointType(@Nullable String endpointType) {
            $.endpointType = endpointType;
            return this;
        }

        public GetEndpointPlainArgs build() {
            return $;
        }
    }

}