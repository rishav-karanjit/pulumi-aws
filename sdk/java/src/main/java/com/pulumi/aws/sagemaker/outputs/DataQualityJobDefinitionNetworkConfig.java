// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.aws.sagemaker.outputs.DataQualityJobDefinitionNetworkConfigVpcConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataQualityJobDefinitionNetworkConfig {
    /**
     * @return Whether to encrypt all communications between the instances used for the monitoring jobs. Choose `true` to encrypt communications. Encryption provides greater security for distributed jobs, but the processing might take longer.
     * 
     */
    private @Nullable Boolean enableInterContainerTrafficEncryption;
    /**
     * @return Whether to allow inbound and outbound network calls to and from the containers used for the monitoring job.
     * 
     */
    private @Nullable Boolean enableNetworkIsolation;
    /**
     * @return Specifies a VPC that your training jobs and hosted models have access to. Control access to and from your training and model containers by configuring the VPC. Fields are documented below.
     * 
     */
    private @Nullable DataQualityJobDefinitionNetworkConfigVpcConfig vpcConfig;

    private DataQualityJobDefinitionNetworkConfig() {}
    /**
     * @return Whether to encrypt all communications between the instances used for the monitoring jobs. Choose `true` to encrypt communications. Encryption provides greater security for distributed jobs, but the processing might take longer.
     * 
     */
    public Optional<Boolean> enableInterContainerTrafficEncryption() {
        return Optional.ofNullable(this.enableInterContainerTrafficEncryption);
    }
    /**
     * @return Whether to allow inbound and outbound network calls to and from the containers used for the monitoring job.
     * 
     */
    public Optional<Boolean> enableNetworkIsolation() {
        return Optional.ofNullable(this.enableNetworkIsolation);
    }
    /**
     * @return Specifies a VPC that your training jobs and hosted models have access to. Control access to and from your training and model containers by configuring the VPC. Fields are documented below.
     * 
     */
    public Optional<DataQualityJobDefinitionNetworkConfigVpcConfig> vpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionNetworkConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableInterContainerTrafficEncryption;
        private @Nullable Boolean enableNetworkIsolation;
        private @Nullable DataQualityJobDefinitionNetworkConfigVpcConfig vpcConfig;
        public Builder() {}
        public Builder(DataQualityJobDefinitionNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInterContainerTrafficEncryption = defaults.enableInterContainerTrafficEncryption;
    	      this.enableNetworkIsolation = defaults.enableNetworkIsolation;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        @CustomType.Setter
        public Builder enableInterContainerTrafficEncryption(@Nullable Boolean enableInterContainerTrafficEncryption) {
            this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder enableNetworkIsolation(@Nullable Boolean enableNetworkIsolation) {
            this.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }
        @CustomType.Setter
        public Builder vpcConfig(@Nullable DataQualityJobDefinitionNetworkConfigVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public DataQualityJobDefinitionNetworkConfig build() {
            final var o = new DataQualityJobDefinitionNetworkConfig();
            o.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
            o.enableNetworkIsolation = enableNetworkIsolation;
            o.vpcConfig = vpcConfig;
            return o;
        }
    }
}
