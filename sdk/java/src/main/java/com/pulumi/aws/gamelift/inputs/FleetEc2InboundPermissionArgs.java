// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class FleetEc2InboundPermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetEc2InboundPermissionArgs Empty = new FleetEc2InboundPermissionArgs();

    /**
     * Starting value for a range of allowed port numbers.
     * 
     */
    @Import(name="fromPort", required=true)
    private Output<Integer> fromPort;

    /**
     * @return Starting value for a range of allowed port numbers.
     * 
     */
    public Output<Integer> fromPort() {
        return this.fromPort;
    }

    /**
     * Range of allowed IP addresses expressed in CIDR notationE.g., `000.000.000.000/[subnet mask]` or `0.0.0.0/[subnet mask]`.
     * 
     */
    @Import(name="ipRange", required=true)
    private Output<String> ipRange;

    /**
     * @return Range of allowed IP addresses expressed in CIDR notationE.g., `000.000.000.000/[subnet mask]` or `0.0.0.0/[subnet mask]`.
     * 
     */
    public Output<String> ipRange() {
        return this.ipRange;
    }

    /**
     * Network communication protocol used by the fleetE.g., `TCP` or `UDP`
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return Network communication protocol used by the fleetE.g., `TCP` or `UDP`
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * Ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than `from_port`.
     * 
     */
    @Import(name="toPort", required=true)
    private Output<Integer> toPort;

    /**
     * @return Ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than `from_port`.
     * 
     */
    public Output<Integer> toPort() {
        return this.toPort;
    }

    private FleetEc2InboundPermissionArgs() {}

    private FleetEc2InboundPermissionArgs(FleetEc2InboundPermissionArgs $) {
        this.fromPort = $.fromPort;
        this.ipRange = $.ipRange;
        this.protocol = $.protocol;
        this.toPort = $.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetEc2InboundPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetEc2InboundPermissionArgs $;

        public Builder() {
            $ = new FleetEc2InboundPermissionArgs();
        }

        public Builder(FleetEc2InboundPermissionArgs defaults) {
            $ = new FleetEc2InboundPermissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fromPort Starting value for a range of allowed port numbers.
         * 
         * @return builder
         * 
         */
        public Builder fromPort(Output<Integer> fromPort) {
            $.fromPort = fromPort;
            return this;
        }

        /**
         * @param fromPort Starting value for a range of allowed port numbers.
         * 
         * @return builder
         * 
         */
        public Builder fromPort(Integer fromPort) {
            return fromPort(Output.of(fromPort));
        }

        /**
         * @param ipRange Range of allowed IP addresses expressed in CIDR notationE.g., `000.000.000.000/[subnet mask]` or `0.0.0.0/[subnet mask]`.
         * 
         * @return builder
         * 
         */
        public Builder ipRange(Output<String> ipRange) {
            $.ipRange = ipRange;
            return this;
        }

        /**
         * @param ipRange Range of allowed IP addresses expressed in CIDR notationE.g., `000.000.000.000/[subnet mask]` or `0.0.0.0/[subnet mask]`.
         * 
         * @return builder
         * 
         */
        public Builder ipRange(String ipRange) {
            return ipRange(Output.of(ipRange));
        }

        /**
         * @param protocol Network communication protocol used by the fleetE.g., `TCP` or `UDP`
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Network communication protocol used by the fleetE.g., `TCP` or `UDP`
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param toPort Ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than `from_port`.
         * 
         * @return builder
         * 
         */
        public Builder toPort(Output<Integer> toPort) {
            $.toPort = toPort;
            return this;
        }

        /**
         * @param toPort Ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than `from_port`.
         * 
         * @return builder
         * 
         */
        public Builder toPort(Integer toPort) {
            return toPort(Output.of(toPort));
        }

        public FleetEc2InboundPermissionArgs build() {
            $.fromPort = Objects.requireNonNull($.fromPort, "expected parameter 'fromPort' to be non-null");
            $.ipRange = Objects.requireNonNull($.ipRange, "expected parameter 'ipRange' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.toPort = Objects.requireNonNull($.toPort, "expected parameter 'toPort' to be non-null");
            return $;
        }
    }

}