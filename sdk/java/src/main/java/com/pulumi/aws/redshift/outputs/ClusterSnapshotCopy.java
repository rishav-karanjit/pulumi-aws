// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterSnapshotCopy {
    /**
     * @return The destination region that you want to copy snapshots to.
     * 
     */
    private final String destinationRegion;
    /**
     * @return The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
     * 
     */
    private final @Nullable String grantName;
    /**
     * @return The number of days to retain automated snapshots in the destination region after they are copied from the source region. Defaults to `7`.
     * 
     */
    private final @Nullable Integer retentionPeriod;

    @CustomType.Constructor
    private ClusterSnapshotCopy(
        @CustomType.Parameter("destinationRegion") String destinationRegion,
        @CustomType.Parameter("grantName") @Nullable String grantName,
        @CustomType.Parameter("retentionPeriod") @Nullable Integer retentionPeriod) {
        this.destinationRegion = destinationRegion;
        this.grantName = grantName;
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * @return The destination region that you want to copy snapshots to.
     * 
     */
    public String destinationRegion() {
        return this.destinationRegion;
    }
    /**
     * @return The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
     * 
     */
    public Optional<String> grantName() {
        return Optional.ofNullable(this.grantName);
    }
    /**
     * @return The number of days to retain automated snapshots in the destination region after they are copied from the source region. Defaults to `7`.
     * 
     */
    public Optional<Integer> retentionPeriod() {
        return Optional.ofNullable(this.retentionPeriod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSnapshotCopy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationRegion;
        private @Nullable String grantName;
        private @Nullable Integer retentionPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSnapshotCopy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationRegion = defaults.destinationRegion;
    	      this.grantName = defaults.grantName;
    	      this.retentionPeriod = defaults.retentionPeriod;
        }

        public Builder destinationRegion(String destinationRegion) {
            this.destinationRegion = Objects.requireNonNull(destinationRegion);
            return this;
        }
        public Builder grantName(@Nullable String grantName) {
            this.grantName = grantName;
            return this;
        }
        public Builder retentionPeriod(@Nullable Integer retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }        public ClusterSnapshotCopy build() {
            return new ClusterSnapshotCopy(destinationRegion, grantName, retentionPeriod);
        }
    }
}