// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StandardsControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final StandardsControlArgs Empty = new StandardsControlArgs();

    /**
     * The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
     * 
     */
    @Import(name="controlStatus", required=true)
    private Output<String> controlStatus;

    /**
     * @return The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
     * 
     */
    public Output<String> controlStatus() {
        return this.controlStatus;
    }

    /**
     * A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
     * 
     */
    @Import(name="disabledReason")
    private @Nullable Output<String> disabledReason;

    /**
     * @return A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
     * 
     */
    public Optional<Output<String>> disabledReason() {
        return Optional.ofNullable(this.disabledReason);
    }

    /**
     * The standards control ARN.
     * 
     */
    @Import(name="standardsControlArn", required=true)
    private Output<String> standardsControlArn;

    /**
     * @return The standards control ARN.
     * 
     */
    public Output<String> standardsControlArn() {
        return this.standardsControlArn;
    }

    private StandardsControlArgs() {}

    private StandardsControlArgs(StandardsControlArgs $) {
        this.controlStatus = $.controlStatus;
        this.disabledReason = $.disabledReason;
        this.standardsControlArn = $.standardsControlArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardsControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardsControlArgs $;

        public Builder() {
            $ = new StandardsControlArgs();
        }

        public Builder(StandardsControlArgs defaults) {
            $ = new StandardsControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param controlStatus The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
         * 
         * @return builder
         * 
         */
        public Builder controlStatus(Output<String> controlStatus) {
            $.controlStatus = controlStatus;
            return this;
        }

        /**
         * @param controlStatus The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
         * 
         * @return builder
         * 
         */
        public Builder controlStatus(String controlStatus) {
            return controlStatus(Output.of(controlStatus));
        }

        /**
         * @param disabledReason A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
         * 
         * @return builder
         * 
         */
        public Builder disabledReason(@Nullable Output<String> disabledReason) {
            $.disabledReason = disabledReason;
            return this;
        }

        /**
         * @param disabledReason A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
         * 
         * @return builder
         * 
         */
        public Builder disabledReason(String disabledReason) {
            return disabledReason(Output.of(disabledReason));
        }

        /**
         * @param standardsControlArn The standards control ARN.
         * 
         * @return builder
         * 
         */
        public Builder standardsControlArn(Output<String> standardsControlArn) {
            $.standardsControlArn = standardsControlArn;
            return this;
        }

        /**
         * @param standardsControlArn The standards control ARN.
         * 
         * @return builder
         * 
         */
        public Builder standardsControlArn(String standardsControlArn) {
            return standardsControlArn(Output.of(standardsControlArn));
        }

        public StandardsControlArgs build() {
            $.controlStatus = Objects.requireNonNull($.controlStatus, "expected parameter 'controlStatus' to be non-null");
            $.standardsControlArn = Objects.requireNonNull($.standardsControlArn, "expected parameter 'standardsControlArn' to be non-null");
            return $;
        }
    }

}