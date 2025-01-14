// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEncoderSettingsCaptionDescriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsCaptionDescriptionArgs Empty = new ChannelEncoderSettingsCaptionDescriptionArgs();

    /**
     * Indicates whether the caption track implements accessibility features such as written descriptions of spoken dialog, music, and sounds.
     * 
     */
    @Import(name="accessibility")
    private @Nullable Output<String> accessibility;

    /**
     * @return Indicates whether the caption track implements accessibility features such as written descriptions of spoken dialog, music, and sounds.
     * 
     */
    public Optional<Output<String>> accessibility() {
        return Optional.ofNullable(this.accessibility);
    }

    /**
     * Specifies which input caption selector to use as a caption source when generating output captions. This field should match a captionSelector name.
     * 
     */
    @Import(name="captionSelectorName", required=true)
    private Output<String> captionSelectorName;

    /**
     * @return Specifies which input caption selector to use as a caption source when generating output captions. This field should match a captionSelector name.
     * 
     */
    public Output<String> captionSelectorName() {
        return this.captionSelectorName;
    }

    /**
     * Additional settings for captions destination that depend on the destination type. See Destination Settings for more details.
     * 
     */
    @Import(name="destinationSettings")
    private @Nullable Output<ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs> destinationSettings;

    /**
     * @return Additional settings for captions destination that depend on the destination type. See Destination Settings for more details.
     * 
     */
    public Optional<Output<ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs>> destinationSettings() {
        return Optional.ofNullable(this.destinationSettings);
    }

    /**
     * ISO 639-2 three-digit code.
     * 
     */
    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    /**
     * @return ISO 639-2 three-digit code.
     * 
     */
    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    /**
     * Human readable information to indicate captions available for players (eg. English, or Spanish).
     * 
     */
    @Import(name="languageDescription")
    private @Nullable Output<String> languageDescription;

    /**
     * @return Human readable information to indicate captions available for players (eg. English, or Spanish).
     * 
     */
    public Optional<Output<String>> languageDescription() {
        return Optional.ofNullable(this.languageDescription);
    }

    /**
     * Name of the caption description. Used to associate a caption description with an output. Names must be unique within an event.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the caption description. Used to associate a caption description with an output. Names must be unique within an event.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private ChannelEncoderSettingsCaptionDescriptionArgs() {}

    private ChannelEncoderSettingsCaptionDescriptionArgs(ChannelEncoderSettingsCaptionDescriptionArgs $) {
        this.accessibility = $.accessibility;
        this.captionSelectorName = $.captionSelectorName;
        this.destinationSettings = $.destinationSettings;
        this.languageCode = $.languageCode;
        this.languageDescription = $.languageDescription;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsCaptionDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsCaptionDescriptionArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsCaptionDescriptionArgs();
        }

        public Builder(ChannelEncoderSettingsCaptionDescriptionArgs defaults) {
            $ = new ChannelEncoderSettingsCaptionDescriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessibility Indicates whether the caption track implements accessibility features such as written descriptions of spoken dialog, music, and sounds.
         * 
         * @return builder
         * 
         */
        public Builder accessibility(@Nullable Output<String> accessibility) {
            $.accessibility = accessibility;
            return this;
        }

        /**
         * @param accessibility Indicates whether the caption track implements accessibility features such as written descriptions of spoken dialog, music, and sounds.
         * 
         * @return builder
         * 
         */
        public Builder accessibility(String accessibility) {
            return accessibility(Output.of(accessibility));
        }

        /**
         * @param captionSelectorName Specifies which input caption selector to use as a caption source when generating output captions. This field should match a captionSelector name.
         * 
         * @return builder
         * 
         */
        public Builder captionSelectorName(Output<String> captionSelectorName) {
            $.captionSelectorName = captionSelectorName;
            return this;
        }

        /**
         * @param captionSelectorName Specifies which input caption selector to use as a caption source when generating output captions. This field should match a captionSelector name.
         * 
         * @return builder
         * 
         */
        public Builder captionSelectorName(String captionSelectorName) {
            return captionSelectorName(Output.of(captionSelectorName));
        }

        /**
         * @param destinationSettings Additional settings for captions destination that depend on the destination type. See Destination Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder destinationSettings(@Nullable Output<ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs> destinationSettings) {
            $.destinationSettings = destinationSettings;
            return this;
        }

        /**
         * @param destinationSettings Additional settings for captions destination that depend on the destination type. See Destination Settings for more details.
         * 
         * @return builder
         * 
         */
        public Builder destinationSettings(ChannelEncoderSettingsCaptionDescriptionDestinationSettingsArgs destinationSettings) {
            return destinationSettings(Output.of(destinationSettings));
        }

        /**
         * @param languageCode ISO 639-2 three-digit code.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param languageCode ISO 639-2 three-digit code.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        /**
         * @param languageDescription Human readable information to indicate captions available for players (eg. English, or Spanish).
         * 
         * @return builder
         * 
         */
        public Builder languageDescription(@Nullable Output<String> languageDescription) {
            $.languageDescription = languageDescription;
            return this;
        }

        /**
         * @param languageDescription Human readable information to indicate captions available for players (eg. English, or Spanish).
         * 
         * @return builder
         * 
         */
        public Builder languageDescription(String languageDescription) {
            return languageDescription(Output.of(languageDescription));
        }

        /**
         * @param name Name of the caption description. Used to associate a caption description with an output. Names must be unique within an event.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the caption description. Used to associate a caption description with an output. Names must be unique within an event.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ChannelEncoderSettingsCaptionDescriptionArgs build() {
            $.captionSelectorName = Objects.requireNonNull($.captionSelectorName, "expected parameter 'captionSelectorName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
