// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs Empty = new DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs();

    /**
     * Column name.
     * 
     */
    @Import(name="columnName", required=true)
    private Output<String> columnName;

    /**
     * @return Column name.
     * 
     */
    public Output<String> columnName() {
        return this.columnName;
    }

    /**
     * When casting a column from string to datetime type, you can supply a string in a format supported by Amazon QuickSight to denote the source data format.
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return When casting a column from string to datetime type, you can supply a string in a format supported by Amazon QuickSight to denote the source data format.
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * New column data type. Valid values are `STRING`, `INTEGER`, `DECIMAL`, `DATETIME`.
     * 
     */
    @Import(name="newColumnType", required=true)
    private Output<String> newColumnType;

    /**
     * @return New column data type. Valid values are `STRING`, `INTEGER`, `DECIMAL`, `DATETIME`.
     * 
     */
    public Output<String> newColumnType() {
        return this.newColumnType;
    }

    private DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs() {}

    private DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs(DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs $) {
        this.columnName = $.columnName;
        this.format = $.format;
        this.newColumnType = $.newColumnType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs $;

        public Builder() {
            $ = new DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs();
        }

        public Builder(DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs defaults) {
            $ = new DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columnName Column name.
         * 
         * @return builder
         * 
         */
        public Builder columnName(Output<String> columnName) {
            $.columnName = columnName;
            return this;
        }

        /**
         * @param columnName Column name.
         * 
         * @return builder
         * 
         */
        public Builder columnName(String columnName) {
            return columnName(Output.of(columnName));
        }

        /**
         * @param format When casting a column from string to datetime type, you can supply a string in a format supported by Amazon QuickSight to denote the source data format.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format When casting a column from string to datetime type, you can supply a string in a format supported by Amazon QuickSight to denote the source data format.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param newColumnType New column data type. Valid values are `STRING`, `INTEGER`, `DECIMAL`, `DATETIME`.
         * 
         * @return builder
         * 
         */
        public Builder newColumnType(Output<String> newColumnType) {
            $.newColumnType = newColumnType;
            return this;
        }

        /**
         * @param newColumnType New column data type. Valid values are `STRING`, `INTEGER`, `DECIMAL`, `DATETIME`.
         * 
         * @return builder
         * 
         */
        public Builder newColumnType(String newColumnType) {
            return newColumnType(Output.of(newColumnType));
        }

        public DataSetLogicalTableMapDataTransformCastColumnTypeOperationArgs build() {
            $.columnName = Objects.requireNonNull($.columnName, "expected parameter 'columnName' to be non-null");
            $.newColumnType = Objects.requireNonNull($.newColumnType, "expected parameter 'newColumnType' to be non-null");
            return $;
        }
    }

}
