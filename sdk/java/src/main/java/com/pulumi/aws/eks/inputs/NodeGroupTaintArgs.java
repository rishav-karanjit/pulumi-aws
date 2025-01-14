// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeGroupTaintArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeGroupTaintArgs Empty = new NodeGroupTaintArgs();

    /**
     * The effect of the taint. Valid values: `NO_SCHEDULE`, `NO_EXECUTE`, `PREFER_NO_SCHEDULE`.
     * 
     */
    @Import(name="effect", required=true)
    private Output<String> effect;

    /**
     * @return The effect of the taint. Valid values: `NO_SCHEDULE`, `NO_EXECUTE`, `PREFER_NO_SCHEDULE`.
     * 
     */
    public Output<String> effect() {
        return this.effect;
    }

    /**
     * The key of the taint. Maximum length of 63.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The key of the taint. Maximum length of 63.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The value of the taint. Maximum length of 63.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the taint. Maximum length of 63.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private NodeGroupTaintArgs() {}

    private NodeGroupTaintArgs(NodeGroupTaintArgs $) {
        this.effect = $.effect;
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeGroupTaintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeGroupTaintArgs $;

        public Builder() {
            $ = new NodeGroupTaintArgs();
        }

        public Builder(NodeGroupTaintArgs defaults) {
            $ = new NodeGroupTaintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param effect The effect of the taint. Valid values: `NO_SCHEDULE`, `NO_EXECUTE`, `PREFER_NO_SCHEDULE`.
         * 
         * @return builder
         * 
         */
        public Builder effect(Output<String> effect) {
            $.effect = effect;
            return this;
        }

        /**
         * @param effect The effect of the taint. Valid values: `NO_SCHEDULE`, `NO_EXECUTE`, `PREFER_NO_SCHEDULE`.
         * 
         * @return builder
         * 
         */
        public Builder effect(String effect) {
            return effect(Output.of(effect));
        }

        /**
         * @param key The key of the taint. Maximum length of 63.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key of the taint. Maximum length of 63.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The value of the taint. Maximum length of 63.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the taint. Maximum length of 63.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public NodeGroupTaintArgs build() {
            $.effect = Objects.requireNonNull($.effect, "expected parameter 'effect' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
