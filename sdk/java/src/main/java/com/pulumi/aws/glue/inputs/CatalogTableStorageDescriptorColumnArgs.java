// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CatalogTableStorageDescriptorColumnArgs extends com.pulumi.resources.ResourceArgs {

    public static final CatalogTableStorageDescriptorColumnArgs Empty = new CatalogTableStorageDescriptorColumnArgs();

    /**
     * Free-form text comment.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Free-form text comment.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Name of the target table.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the target table.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Map of initialization parameters for the SerDe, in key-value form.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return Map of initialization parameters for the SerDe, in key-value form.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Datatype of data in the Column.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Datatype of data in the Column.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private CatalogTableStorageDescriptorColumnArgs() {}

    private CatalogTableStorageDescriptorColumnArgs(CatalogTableStorageDescriptorColumnArgs $) {
        this.comment = $.comment;
        this.name = $.name;
        this.parameters = $.parameters;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogTableStorageDescriptorColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogTableStorageDescriptorColumnArgs $;

        public Builder() {
            $ = new CatalogTableStorageDescriptorColumnArgs();
        }

        public Builder(CatalogTableStorageDescriptorColumnArgs defaults) {
            $ = new CatalogTableStorageDescriptorColumnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Free-form text comment.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Free-form text comment.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param name Name of the target table.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the target table.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters Map of initialization parameters for the SerDe, in key-value form.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Map of initialization parameters for the SerDe, in key-value form.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param type Datatype of data in the Column.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Datatype of data in the Column.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CatalogTableStorageDescriptorColumnArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}