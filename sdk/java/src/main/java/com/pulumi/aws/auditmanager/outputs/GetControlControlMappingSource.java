// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.auditmanager.outputs;

import com.pulumi.aws.auditmanager.outputs.GetControlControlMappingSourceSourceKeyword;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetControlControlMappingSource {
    private String sourceDescription;
    private String sourceFrequency;
    private String sourceId;
    private @Nullable GetControlControlMappingSourceSourceKeyword sourceKeyword;
    private String sourceName;
    private String sourceSetUpOption;
    private String sourceType;
    private String troubleshootingText;

    private GetControlControlMappingSource() {}
    public String sourceDescription() {
        return this.sourceDescription;
    }
    public String sourceFrequency() {
        return this.sourceFrequency;
    }
    public String sourceId() {
        return this.sourceId;
    }
    public Optional<GetControlControlMappingSourceSourceKeyword> sourceKeyword() {
        return Optional.ofNullable(this.sourceKeyword);
    }
    public String sourceName() {
        return this.sourceName;
    }
    public String sourceSetUpOption() {
        return this.sourceSetUpOption;
    }
    public String sourceType() {
        return this.sourceType;
    }
    public String troubleshootingText() {
        return this.troubleshootingText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetControlControlMappingSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String sourceDescription;
        private String sourceFrequency;
        private String sourceId;
        private @Nullable GetControlControlMappingSourceSourceKeyword sourceKeyword;
        private String sourceName;
        private String sourceSetUpOption;
        private String sourceType;
        private String troubleshootingText;
        public Builder() {}
        public Builder(GetControlControlMappingSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceDescription = defaults.sourceDescription;
    	      this.sourceFrequency = defaults.sourceFrequency;
    	      this.sourceId = defaults.sourceId;
    	      this.sourceKeyword = defaults.sourceKeyword;
    	      this.sourceName = defaults.sourceName;
    	      this.sourceSetUpOption = defaults.sourceSetUpOption;
    	      this.sourceType = defaults.sourceType;
    	      this.troubleshootingText = defaults.troubleshootingText;
        }

        @CustomType.Setter
        public Builder sourceDescription(String sourceDescription) {
            this.sourceDescription = Objects.requireNonNull(sourceDescription);
            return this;
        }
        @CustomType.Setter
        public Builder sourceFrequency(String sourceFrequency) {
            this.sourceFrequency = Objects.requireNonNull(sourceFrequency);
            return this;
        }
        @CustomType.Setter
        public Builder sourceId(String sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }
        @CustomType.Setter
        public Builder sourceKeyword(@Nullable GetControlControlMappingSourceSourceKeyword sourceKeyword) {
            this.sourceKeyword = sourceKeyword;
            return this;
        }
        @CustomType.Setter
        public Builder sourceName(String sourceName) {
            this.sourceName = Objects.requireNonNull(sourceName);
            return this;
        }
        @CustomType.Setter
        public Builder sourceSetUpOption(String sourceSetUpOption) {
            this.sourceSetUpOption = Objects.requireNonNull(sourceSetUpOption);
            return this;
        }
        @CustomType.Setter
        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }
        @CustomType.Setter
        public Builder troubleshootingText(String troubleshootingText) {
            this.troubleshootingText = Objects.requireNonNull(troubleshootingText);
            return this;
        }
        public GetControlControlMappingSource build() {
            final var o = new GetControlControlMappingSource();
            o.sourceDescription = sourceDescription;
            o.sourceFrequency = sourceFrequency;
            o.sourceId = sourceId;
            o.sourceKeyword = sourceKeyword;
            o.sourceName = sourceName;
            o.sourceSetUpOption = sourceSetUpOption;
            o.sourceType = sourceType;
            o.troubleshootingText = troubleshootingText;
            return o;
        }
    }
}
