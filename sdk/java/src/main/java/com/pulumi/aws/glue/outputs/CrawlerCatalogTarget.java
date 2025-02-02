// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CrawlerCatalogTarget {
    /**
     * @return The name of the connection for an Amazon S3-backed Data Catalog table to be a target of the crawl when using a Catalog connection type paired with a `NETWORK` Connection type.
     * 
     */
    private @Nullable String connectionName;
    /**
     * @return The name of the Glue database to be synchronized.
     * 
     */
    private String databaseName;
    /**
     * @return A valid Amazon SQS ARN.
     * 
     * &gt; **Note:** `deletion_behavior` of catalog target doesn&#39;t support `DEPRECATE_IN_DATABASE`.
     * 
     * &gt; **Note:** `configuration` for catalog target crawlers will have `{ ... &#34;Grouping&#34;: { &#34;TableGroupingPolicy&#34;: &#34;CombineCompatibleSchemas&#34;} }` by default.
     * 
     */
    private @Nullable String dlqEventQueueArn;
    /**
     * @return A valid Amazon SQS ARN.
     * 
     */
    private @Nullable String eventQueueArn;
    /**
     * @return A list of catalog tables to be synchronized.
     * 
     */
    private List<String> tables;

    private CrawlerCatalogTarget() {}
    /**
     * @return The name of the connection for an Amazon S3-backed Data Catalog table to be a target of the crawl when using a Catalog connection type paired with a `NETWORK` Connection type.
     * 
     */
    public Optional<String> connectionName() {
        return Optional.ofNullable(this.connectionName);
    }
    /**
     * @return The name of the Glue database to be synchronized.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * @return A valid Amazon SQS ARN.
     * 
     * &gt; **Note:** `deletion_behavior` of catalog target doesn&#39;t support `DEPRECATE_IN_DATABASE`.
     * 
     * &gt; **Note:** `configuration` for catalog target crawlers will have `{ ... &#34;Grouping&#34;: { &#34;TableGroupingPolicy&#34;: &#34;CombineCompatibleSchemas&#34;} }` by default.
     * 
     */
    public Optional<String> dlqEventQueueArn() {
        return Optional.ofNullable(this.dlqEventQueueArn);
    }
    /**
     * @return A valid Amazon SQS ARN.
     * 
     */
    public Optional<String> eventQueueArn() {
        return Optional.ofNullable(this.eventQueueArn);
    }
    /**
     * @return A list of catalog tables to be synchronized.
     * 
     */
    public List<String> tables() {
        return this.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerCatalogTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String connectionName;
        private String databaseName;
        private @Nullable String dlqEventQueueArn;
        private @Nullable String eventQueueArn;
        private List<String> tables;
        public Builder() {}
        public Builder(CrawlerCatalogTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionName = defaults.connectionName;
    	      this.databaseName = defaults.databaseName;
    	      this.dlqEventQueueArn = defaults.dlqEventQueueArn;
    	      this.eventQueueArn = defaults.eventQueueArn;
    	      this.tables = defaults.tables;
        }

        @CustomType.Setter
        public Builder connectionName(@Nullable String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        @CustomType.Setter
        public Builder dlqEventQueueArn(@Nullable String dlqEventQueueArn) {
            this.dlqEventQueueArn = dlqEventQueueArn;
            return this;
        }
        @CustomType.Setter
        public Builder eventQueueArn(@Nullable String eventQueueArn) {
            this.eventQueueArn = eventQueueArn;
            return this;
        }
        @CustomType.Setter
        public Builder tables(List<String> tables) {
            this.tables = Objects.requireNonNull(tables);
            return this;
        }
        public Builder tables(String... tables) {
            return tables(List.of(tables));
        }
        public CrawlerCatalogTarget build() {
            final var o = new CrawlerCatalogTarget();
            o.connectionName = connectionName;
            o.databaseName = databaseName;
            o.dlqEventQueueArn = dlqEventQueueArn;
            o.eventQueueArn = eventQueueArn;
            o.tables = tables;
            return o;
        }
    }
}
