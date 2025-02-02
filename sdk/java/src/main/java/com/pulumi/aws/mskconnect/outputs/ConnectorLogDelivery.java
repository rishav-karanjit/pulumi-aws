// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.outputs;

import com.pulumi.aws.mskconnect.outputs.ConnectorLogDeliveryWorkerLogDelivery;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ConnectorLogDelivery {
    /**
     * @return The workers can send worker logs to different destination types. This configuration specifies the details of these destinations. See below.
     * 
     */
    private ConnectorLogDeliveryWorkerLogDelivery workerLogDelivery;

    private ConnectorLogDelivery() {}
    /**
     * @return The workers can send worker logs to different destination types. This configuration specifies the details of these destinations. See below.
     * 
     */
    public ConnectorLogDeliveryWorkerLogDelivery workerLogDelivery() {
        return this.workerLogDelivery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorLogDelivery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ConnectorLogDeliveryWorkerLogDelivery workerLogDelivery;
        public Builder() {}
        public Builder(ConnectorLogDelivery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workerLogDelivery = defaults.workerLogDelivery;
        }

        @CustomType.Setter
        public Builder workerLogDelivery(ConnectorLogDeliveryWorkerLogDelivery workerLogDelivery) {
            this.workerLogDelivery = Objects.requireNonNull(workerLogDelivery);
            return this;
        }
        public ConnectorLogDelivery build() {
            final var o = new ConnectorLogDelivery();
            o.workerLogDelivery = workerLogDelivery;
            return o;
        }
    }
}
