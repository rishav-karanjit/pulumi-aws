// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CatalogDatabaseTargetDatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final CatalogDatabaseTargetDatabaseArgs Empty = new CatalogDatabaseTargetDatabaseArgs();

    /**
     * ID of the Data Catalog in which the database resides.
     * 
     */
    @Import(name="catalogId", required=true)
    private Output<String> catalogId;

    /**
     * @return ID of the Data Catalog in which the database resides.
     * 
     */
    public Output<String> catalogId() {
        return this.catalogId;
    }

    /**
     * Name of the catalog database.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return Name of the catalog database.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    private CatalogDatabaseTargetDatabaseArgs() {}

    private CatalogDatabaseTargetDatabaseArgs(CatalogDatabaseTargetDatabaseArgs $) {
        this.catalogId = $.catalogId;
        this.databaseName = $.databaseName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogDatabaseTargetDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogDatabaseTargetDatabaseArgs $;

        public Builder() {
            $ = new CatalogDatabaseTargetDatabaseArgs();
        }

        public Builder(CatalogDatabaseTargetDatabaseArgs defaults) {
            $ = new CatalogDatabaseTargetDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogId ID of the Data Catalog in which the database resides.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        /**
         * @param catalogId ID of the Data Catalog in which the database resides.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        /**
         * @param databaseName Name of the catalog database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName Name of the catalog database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public CatalogDatabaseTargetDatabaseArgs build() {
            $.catalogId = Objects.requireNonNull($.catalogId, "expected parameter 'catalogId' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            return $;
        }
    }

}