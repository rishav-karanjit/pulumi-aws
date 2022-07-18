// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs Empty = new GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs();

    /**
     * Desired value to use with a game server group target-based scaling policy.
     * 
     */
    @Import(name="targetValue", required=true)
    private Output<Double> targetValue;

    /**
     * @return Desired value to use with a game server group target-based scaling policy.
     * 
     */
    public Output<Double> targetValue() {
        return this.targetValue;
    }

    private GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs() {}

    private GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs(GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs $) {
        this.targetValue = $.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs $;

        public Builder() {
            $ = new GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs();
        }

        public Builder(GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs defaults) {
            $ = new GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param targetValue Desired value to use with a game server group target-based scaling policy.
         * 
         * @return builder
         * 
         */
        public Builder targetValue(Output<Double> targetValue) {
            $.targetValue = targetValue;
            return this;
        }

        /**
         * @param targetValue Desired value to use with a game server group target-based scaling policy.
         * 
         * @return builder
         * 
         */
        public Builder targetValue(Double targetValue) {
            return targetValue(Output.of(targetValue));
        }

        public GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs build() {
            $.targetValue = Objects.requireNonNull($.targetValue, "expected parameter 'targetValue' to be non-null");
            return $;
        }
    }

}