// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnalyticsApplicationInputsSchemaRecordColumnArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsSchemaRecordColumnArgs Empty = new AnalyticsApplicationInputsSchemaRecordColumnArgs();

    /**
     * The Mapping reference to the data element.
     * 
     */
    @Import(name="mapping")
    private @Nullable Output<String> mapping;

    /**
     * @return The Mapping reference to the data element.
     * 
     */
    public Optional<Output<String>> mapping() {
        return Optional.ofNullable(this.mapping);
    }

    /**
     * Name of the column.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the column.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The SQL Type of the column.
     * 
     */
    @Import(name="sqlType", required=true)
    private Output<String> sqlType;

    /**
     * @return The SQL Type of the column.
     * 
     */
    public Output<String> sqlType() {
        return this.sqlType;
    }

    private AnalyticsApplicationInputsSchemaRecordColumnArgs() {}

    private AnalyticsApplicationInputsSchemaRecordColumnArgs(AnalyticsApplicationInputsSchemaRecordColumnArgs $) {
        this.mapping = $.mapping;
        this.name = $.name;
        this.sqlType = $.sqlType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyticsApplicationInputsSchemaRecordColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsApplicationInputsSchemaRecordColumnArgs $;

        public Builder() {
            $ = new AnalyticsApplicationInputsSchemaRecordColumnArgs();
        }

        public Builder(AnalyticsApplicationInputsSchemaRecordColumnArgs defaults) {
            $ = new AnalyticsApplicationInputsSchemaRecordColumnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mapping The Mapping reference to the data element.
         * 
         * @return builder
         * 
         */
        public Builder mapping(@Nullable Output<String> mapping) {
            $.mapping = mapping;
            return this;
        }

        /**
         * @param mapping The Mapping reference to the data element.
         * 
         * @return builder
         * 
         */
        public Builder mapping(String mapping) {
            return mapping(Output.of(mapping));
        }

        /**
         * @param name Name of the column.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the column.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sqlType The SQL Type of the column.
         * 
         * @return builder
         * 
         */
        public Builder sqlType(Output<String> sqlType) {
            $.sqlType = sqlType;
            return this;
        }

        /**
         * @param sqlType The SQL Type of the column.
         * 
         * @return builder
         * 
         */
        public Builder sqlType(String sqlType) {
            return sqlType(Output.of(sqlType));
        }

        public AnalyticsApplicationInputsSchemaRecordColumnArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.sqlType = Objects.requireNonNull($.sqlType, "expected parameter 'sqlType' to be non-null");
            return $;
        }
    }

}