// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigurationAggregatorAccountAggregationSource {
    /**
     * @return List of 12-digit account IDs of the account(s) being aggregated.
     * 
     */
    private List<String> accountIds;
    /**
     * @return If true, aggregate existing AWS Config regions and future regions.
     * 
     */
    private @Nullable Boolean allRegions;
    /**
     * @return List of source regions being aggregated.
     * 
     * Either `regions` or `all_regions` (as true) must be specified.
     * 
     */
    private @Nullable List<String> regions;

    private ConfigurationAggregatorAccountAggregationSource() {}
    /**
     * @return List of 12-digit account IDs of the account(s) being aggregated.
     * 
     */
    public List<String> accountIds() {
        return this.accountIds;
    }
    /**
     * @return If true, aggregate existing AWS Config regions and future regions.
     * 
     */
    public Optional<Boolean> allRegions() {
        return Optional.ofNullable(this.allRegions);
    }
    /**
     * @return List of source regions being aggregated.
     * 
     * Either `regions` or `all_regions` (as true) must be specified.
     * 
     */
    public List<String> regions() {
        return this.regions == null ? List.of() : this.regions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAggregatorAccountAggregationSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> accountIds;
        private @Nullable Boolean allRegions;
        private @Nullable List<String> regions;
        public Builder() {}
        public Builder(ConfigurationAggregatorAccountAggregationSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountIds = defaults.accountIds;
    	      this.allRegions = defaults.allRegions;
    	      this.regions = defaults.regions;
        }

        @CustomType.Setter
        public Builder accountIds(List<String> accountIds) {
            this.accountIds = Objects.requireNonNull(accountIds);
            return this;
        }
        public Builder accountIds(String... accountIds) {
            return accountIds(List.of(accountIds));
        }
        @CustomType.Setter
        public Builder allRegions(@Nullable Boolean allRegions) {
            this.allRegions = allRegions;
            return this;
        }
        @CustomType.Setter
        public Builder regions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        public ConfigurationAggregatorAccountAggregationSource build() {
            final var o = new ConfigurationAggregatorAccountAggregationSource();
            o.accountIds = accountIds;
            o.allRegions = allRegions;
            o.regions = regions;
            return o;
        }
    }
}
