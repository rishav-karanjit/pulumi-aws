// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ChannelEncoderSettingsAudioDescriptionCodecSettingsPassThroughSettings {
    private ChannelEncoderSettingsAudioDescriptionCodecSettingsPassThroughSettings() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsAudioDescriptionCodecSettingsPassThroughSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(ChannelEncoderSettingsAudioDescriptionCodecSettingsPassThroughSettings defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public ChannelEncoderSettingsAudioDescriptionCodecSettingsPassThroughSettings build() {
            final var o = new ChannelEncoderSettingsAudioDescriptionCodecSettingsPassThroughSettings();
            return o;
        }
    }
}
