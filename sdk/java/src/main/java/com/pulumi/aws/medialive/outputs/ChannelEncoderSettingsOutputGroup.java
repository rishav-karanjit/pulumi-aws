// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsOutputGroupOutput;
import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsOutputGroupOutputGroupSettings;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsOutputGroup {
    /**
     * @return Custom output group name defined by the user.
     * 
     */
    private @Nullable String name;
    /**
     * @return Settings associated with the output group. See Output Group Settings for more details.
     * 
     */
    private ChannelEncoderSettingsOutputGroupOutputGroupSettings outputGroupSettings;
    /**
     * @return List of outputs. See Outputs for more details.
     * 
     */
    private List<ChannelEncoderSettingsOutputGroupOutput> outputs;

    private ChannelEncoderSettingsOutputGroup() {}
    /**
     * @return Custom output group name defined by the user.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Settings associated with the output group. See Output Group Settings for more details.
     * 
     */
    public ChannelEncoderSettingsOutputGroupOutputGroupSettings outputGroupSettings() {
        return this.outputGroupSettings;
    }
    /**
     * @return List of outputs. See Outputs for more details.
     * 
     */
    public List<ChannelEncoderSettingsOutputGroupOutput> outputs() {
        return this.outputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsOutputGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private ChannelEncoderSettingsOutputGroupOutputGroupSettings outputGroupSettings;
        private List<ChannelEncoderSettingsOutputGroupOutput> outputs;
        public Builder() {}
        public Builder(ChannelEncoderSettingsOutputGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.outputGroupSettings = defaults.outputGroupSettings;
    	      this.outputs = defaults.outputs;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder outputGroupSettings(ChannelEncoderSettingsOutputGroupOutputGroupSettings outputGroupSettings) {
            this.outputGroupSettings = Objects.requireNonNull(outputGroupSettings);
            return this;
        }
        @CustomType.Setter
        public Builder outputs(List<ChannelEncoderSettingsOutputGroupOutput> outputs) {
            this.outputs = Objects.requireNonNull(outputs);
            return this;
        }
        public Builder outputs(ChannelEncoderSettingsOutputGroupOutput... outputs) {
            return outputs(List.of(outputs));
        }
        public ChannelEncoderSettingsOutputGroup build() {
            final var o = new ChannelEncoderSettingsOutputGroup();
            o.name = name;
            o.outputGroupSettings = outputGroupSettings;
            o.outputs = outputs;
            return o;
        }
    }
}
