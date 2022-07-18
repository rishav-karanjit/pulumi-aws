// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetLinkBandwidth {
    /**
     * @return Download speed in Mbps.
     * 
     */
    private final Integer downloadSpeed;
    /**
     * @return Upload speed in Mbps.
     * 
     */
    private final Integer uploadSpeed;

    @CustomType.Constructor
    private GetLinkBandwidth(
        @CustomType.Parameter("downloadSpeed") Integer downloadSpeed,
        @CustomType.Parameter("uploadSpeed") Integer uploadSpeed) {
        this.downloadSpeed = downloadSpeed;
        this.uploadSpeed = uploadSpeed;
    }

    /**
     * @return Download speed in Mbps.
     * 
     */
    public Integer downloadSpeed() {
        return this.downloadSpeed;
    }
    /**
     * @return Upload speed in Mbps.
     * 
     */
    public Integer uploadSpeed() {
        return this.uploadSpeed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkBandwidth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer downloadSpeed;
        private Integer uploadSpeed;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkBandwidth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.downloadSpeed = defaults.downloadSpeed;
    	      this.uploadSpeed = defaults.uploadSpeed;
        }

        public Builder downloadSpeed(Integer downloadSpeed) {
            this.downloadSpeed = Objects.requireNonNull(downloadSpeed);
            return this;
        }
        public Builder uploadSpeed(Integer uploadSpeed) {
            this.uploadSpeed = Objects.requireNonNull(uploadSpeed);
            return this;
        }        public GetLinkBandwidth build() {
            return new GetLinkBandwidth(downloadSpeed, uploadSpeed);
        }
    }
}