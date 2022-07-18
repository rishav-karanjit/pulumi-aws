// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.redshift.ClusterArgs;
import com.pulumi.aws.redshift.inputs.ClusterState;
import com.pulumi.aws.redshift.outputs.ClusterClusterNode;
import com.pulumi.aws.redshift.outputs.ClusterLogging;
import com.pulumi.aws.redshift.outputs.ClusterSnapshotCopy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Redshift Cluster Resource.
 * 
 * &gt; **NOTE:** A Redshift cluster&#39;s default IAM role can be managed both by this resource&#39;s `default_iam_role_arn` argument and the `aws.redshift.ClusterIamRoles` resource&#39;s `default_iam_role_arn` argument. Do not configure different values for both arguments. Doing so will cause a conflict of default IAM roles.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Cluster(&#34;example&#34;, ClusterArgs.builder()        
 *             .clusterIdentifier(&#34;tf-redshift-cluster&#34;)
 *             .clusterType(&#34;single-node&#34;)
 *             .databaseName(&#34;mydb&#34;)
 *             .masterPassword(&#34;Mustbe8characters&#34;)
 *             .masterUsername(&#34;exampleuser&#34;)
 *             .nodeType(&#34;dc1.large&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Redshift Clusters can be imported using the `cluster_identifier`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:redshift/cluster:Cluster myprodcluster tf-redshift-cluster-12345
 * ```
 * 
 */
@ResourceType(type="aws:redshift/cluster:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * If true , major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. Default is `true`.
     * 
     */
    @Export(name="allowVersionUpgrade", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowVersionUpgrade;

    /**
     * @return If true , major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. Default is `true`.
     * 
     */
    public Output<Optional<Boolean>> allowVersionUpgrade() {
        return Codegen.optional(this.allowVersionUpgrade);
    }
    /**
     * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    @Export(name="applyImmediately", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> applyImmediately;

    /**
     * @return Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> applyImmediately() {
        return Codegen.optional(this.applyImmediately);
    }
    /**
     * The value represents how the cluster is configured to use AQUA (Advanced Query Accelerator) after the cluster is restored. Possible values are `enabled`, `disabled`, and `auto`. Requires Cluster reboot.
     * 
     */
    @Export(name="aquaConfigurationStatus", type=String.class, parameters={})
    private Output<String> aquaConfigurationStatus;

    /**
     * @return The value represents how the cluster is configured to use AQUA (Advanced Query Accelerator) after the cluster is restored. Possible values are `enabled`, `disabled`, and `auto`. Requires Cluster reboot.
     * 
     */
    public Output<String> aquaConfigurationStatus() {
        return this.aquaConfigurationStatus;
    }
    /**
     * Amazon Resource Name (ARN) of cluster
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of cluster
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with create-cluster-snapshot. Default is 1.
     * 
     */
    @Export(name="automatedSnapshotRetentionPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> automatedSnapshotRetentionPeriod;

    /**
     * @return The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with create-cluster-snapshot. Default is 1.
     * 
     */
    public Output<Optional<Integer>> automatedSnapshotRetentionPeriod() {
        return Codegen.optional(this.automatedSnapshotRetentionPeriod);
    }
    /**
     * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be provisioned in the same zone in order to decrease network latency. Can only be changed if `availability_zone_relocation_enabled` is `true`.
     * 
     */
    @Export(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be provisioned in the same zone in order to decrease network latency. Can only be changed if `availability_zone_relocation_enabled` is `true`.
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * If true, the cluster can be relocated to another availabity zone, either automatically by AWS or when requested. Default is `false`. Available for use on clusters from the RA3 instance family.
     * 
     */
    @Export(name="availabilityZoneRelocationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> availabilityZoneRelocationEnabled;

    /**
     * @return If true, the cluster can be relocated to another availabity zone, either automatically by AWS or when requested. Default is `false`. Available for use on clusters from the RA3 instance family.
     * 
     */
    public Output<Optional<Boolean>> availabilityZoneRelocationEnabled() {
        return Codegen.optional(this.availabilityZoneRelocationEnabled);
    }
    /**
     * The Cluster Identifier. Must be a lower case string.
     * 
     */
    @Export(name="clusterIdentifier", type=String.class, parameters={})
    private Output<String> clusterIdentifier;

    /**
     * @return The Cluster Identifier. Must be a lower case string.
     * 
     */
    public Output<String> clusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * The nodes in the cluster. Cluster node blocks are documented below
     * 
     */
    @Export(name="clusterNodes", type=List.class, parameters={ClusterClusterNode.class})
    private Output<List<ClusterClusterNode>> clusterNodes;

    /**
     * @return The nodes in the cluster. Cluster node blocks are documented below
     * 
     */
    public Output<List<ClusterClusterNode>> clusterNodes() {
        return this.clusterNodes;
    }
    /**
     * The name of the parameter group to be associated with this cluster.
     * 
     */
    @Export(name="clusterParameterGroupName", type=String.class, parameters={})
    private Output<String> clusterParameterGroupName;

    /**
     * @return The name of the parameter group to be associated with this cluster.
     * 
     */
    public Output<String> clusterParameterGroupName() {
        return this.clusterParameterGroupName;
    }
    /**
     * The public key for the cluster
     * 
     */
    @Export(name="clusterPublicKey", type=String.class, parameters={})
    private Output<String> clusterPublicKey;

    /**
     * @return The public key for the cluster
     * 
     */
    public Output<String> clusterPublicKey() {
        return this.clusterPublicKey;
    }
    /**
     * The specific revision number of the database in the cluster
     * 
     */
    @Export(name="clusterRevisionNumber", type=String.class, parameters={})
    private Output<String> clusterRevisionNumber;

    /**
     * @return The specific revision number of the database in the cluster
     * 
     */
    public Output<String> clusterRevisionNumber() {
        return this.clusterRevisionNumber;
    }
    /**
     * A list of security groups to be associated with this cluster.
     * 
     */
    @Export(name="clusterSecurityGroups", type=List.class, parameters={String.class})
    private Output<List<String>> clusterSecurityGroups;

    /**
     * @return A list of security groups to be associated with this cluster.
     * 
     */
    public Output<List<String>> clusterSecurityGroups() {
        return this.clusterSecurityGroups;
    }
    /**
     * The name of a cluster subnet group to be associated with this cluster. If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
     * 
     */
    @Export(name="clusterSubnetGroupName", type=String.class, parameters={})
    private Output<String> clusterSubnetGroupName;

    /**
     * @return The name of a cluster subnet group to be associated with this cluster. If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
     * 
     */
    public Output<String> clusterSubnetGroupName() {
        return this.clusterSubnetGroupName;
    }
    /**
     * The cluster type to use. Either `single-node` or `multi-node`.
     * 
     */
    @Export(name="clusterType", type=String.class, parameters={})
    private Output<String> clusterType;

    /**
     * @return The cluster type to use. Either `single-node` or `multi-node`.
     * 
     */
    public Output<String> clusterType() {
        return this.clusterType;
    }
    /**
     * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
     * The version selected runs on all the nodes in the cluster.
     * 
     */
    @Export(name="clusterVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterVersion;

    /**
     * @return The version of the Amazon Redshift engine software that you want to deploy on the cluster.
     * The version selected runs on all the nodes in the cluster.
     * 
     */
    public Output<Optional<String>> clusterVersion() {
        return Codegen.optional(this.clusterVersion);
    }
    /**
     * The name of the first database to be created when the cluster is created.
     * If you do not provide a name, Amazon Redshift will create a default database called `dev`.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return The name of the first database to be created when the cluster is created.
     * If you do not provide a name, Amazon Redshift will create a default database called `dev`.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    /**
     * The Amazon Resource Name (ARN) for the IAM role that was set as default for the cluster when the cluster was created.
     * 
     */
    @Export(name="defaultIamRoleArn", type=String.class, parameters={})
    private Output<String> defaultIamRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) for the IAM role that was set as default for the cluster when the cluster was created.
     * 
     */
    public Output<String> defaultIamRoleArn() {
        return this.defaultIamRoleArn;
    }
    /**
     * The DNS name of the cluster
     * 
     */
    @Export(name="dnsName", type=String.class, parameters={})
    private Output<String> dnsName;

    /**
     * @return The DNS name of the cluster
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * The Elastic IP (EIP) address for the cluster.
     * 
     */
    @Export(name="elasticIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> elasticIp;

    /**
     * @return The Elastic IP (EIP) address for the cluster.
     * 
     */
    public Output<Optional<String>> elasticIp() {
        return Codegen.optional(this.elasticIp);
    }
    /**
     * If true , the data in the cluster is encrypted at rest.
     * 
     */
    @Export(name="encrypted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> encrypted;

    /**
     * @return If true , the data in the cluster is encrypted at rest.
     * 
     */
    public Output<Optional<Boolean>> encrypted() {
        return Codegen.optional(this.encrypted);
    }
    /**
     * The connection endpoint
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The connection endpoint
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * If true , enhanced VPC routing is enabled.
     * 
     */
    @Export(name="enhancedVpcRouting", type=Boolean.class, parameters={})
    private Output<Boolean> enhancedVpcRouting;

    /**
     * @return If true , enhanced VPC routing is enabled.
     * 
     */
    public Output<Boolean> enhancedVpcRouting() {
        return this.enhancedVpcRouting;
    }
    /**
     * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this parameter is provided, `skip_final_snapshot` must be false.
     * 
     */
    @Export(name="finalSnapshotIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> finalSnapshotIdentifier;

    /**
     * @return The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this parameter is provided, `skip_final_snapshot` must be false.
     * 
     */
    public Output<Optional<String>> finalSnapshotIdentifier() {
        return Codegen.optional(this.finalSnapshotIdentifier);
    }
    /**
     * A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
     * 
     */
    @Export(name="iamRoles", type=List.class, parameters={String.class})
    private Output<List<String>> iamRoles;

    /**
     * @return A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
     * 
     */
    public Output<List<String>> iamRoles() {
        return this.iamRoles;
    }
    /**
     * The ARN for the KMS encryption key. When specifying `kms_key_id`, `encrypted` needs to be set to true.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key. When specifying `kms_key_id`, `encrypted` needs to be set to true.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * Logging, documented below.
     * 
     */
    @Export(name="logging", type=ClusterLogging.class, parameters={})
    private Output</* @Nullable */ ClusterLogging> logging;

    /**
     * @return Logging, documented below.
     * 
     */
    public Output<Optional<ClusterLogging>> logging() {
        return Codegen.optional(this.logging);
    }
    /**
     * The name of the maintenance track for the restored cluster. When you take a snapshot, the snapshot inherits the MaintenanceTrack value from the cluster. The snapshot might be on a different track than the cluster that was the source for the snapshot. For example, suppose that you take a snapshot of  a cluster that is on the current track and then change the cluster to be on the trailing track. In this case, the snapshot and the source cluster are on different tracks. Default value is `current`.
     * 
     */
    @Export(name="maintenanceTrackName", type=String.class, parameters={})
    private Output</* @Nullable */ String> maintenanceTrackName;

    /**
     * @return The name of the maintenance track for the restored cluster. When you take a snapshot, the snapshot inherits the MaintenanceTrack value from the cluster. The snapshot might be on a different track than the cluster that was the source for the snapshot. For example, suppose that you take a snapshot of  a cluster that is on the current track and then change the cluster to be on the trailing track. In this case, the snapshot and the source cluster are on different tracks. Default value is `current`.
     * 
     */
    public Output<Optional<String>> maintenanceTrackName() {
        return Codegen.optional(this.maintenanceTrackName);
    }
    /**
     * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained indefinitely. This setting doesn&#39;t change the retention period of existing snapshots. Valid values are between `-1` and `3653`. Default value is `-1`.
     * 
     */
    @Export(name="manualSnapshotRetentionPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> manualSnapshotRetentionPeriod;

    /**
     * @return The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained indefinitely. This setting doesn&#39;t change the retention period of existing snapshots. Valid values are between `-1` and `3653`. Default value is `-1`.
     * 
     */
    public Output<Optional<Integer>> manualSnapshotRetentionPeriod() {
        return Codegen.optional(this.manualSnapshotRetentionPeriod);
    }
    /**
     * Password for the master DB user.
     * Note that this may show up in logs, and it will be stored in the state file. Password must contain at least 8 chars and
     * contain at least one uppercase letter, one lowercase letter, and one number.
     * 
     */
    @Export(name="masterPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> masterPassword;

    /**
     * @return Password for the master DB user.
     * Note that this may show up in logs, and it will be stored in the state file. Password must contain at least 8 chars and
     * contain at least one uppercase letter, one lowercase letter, and one number.
     * 
     */
    public Output<Optional<String>> masterPassword() {
        return Codegen.optional(this.masterPassword);
    }
    /**
     * Username for the master DB user.
     * 
     */
    @Export(name="masterUsername", type=String.class, parameters={})
    private Output</* @Nullable */ String> masterUsername;

    /**
     * @return Username for the master DB user.
     * 
     */
    public Output<Optional<String>> masterUsername() {
        return Codegen.optional(this.masterUsername);
    }
    /**
     * The node type to be provisioned for the cluster.
     * 
     */
    @Export(name="nodeType", type=String.class, parameters={})
    private Output<String> nodeType;

    /**
     * @return The node type to be provisioned for the cluster.
     * 
     */
    public Output<String> nodeType() {
        return this.nodeType;
    }
    /**
     * The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node. Default is 1.
     * 
     */
    @Export(name="numberOfNodes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numberOfNodes;

    /**
     * @return The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node. Default is 1.
     * 
     */
    public Output<Optional<Integer>> numberOfNodes() {
        return Codegen.optional(this.numberOfNodes);
    }
    /**
     * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
     * 
     */
    @Export(name="ownerAccount", type=String.class, parameters={})
    private Output</* @Nullable */ String> ownerAccount;

    /**
     * @return The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
     * 
     */
    public Output<Optional<String>> ownerAccount() {
        return Codegen.optional(this.ownerAccount);
    }
    /**
     * The port number on which the cluster accepts incoming connections. Valid values are between `1115` and `65535`.
     * The cluster is accessible only via the JDBC and ODBC connection strings.
     * Part of the connection string requires the port on which the cluster will listen for incoming connections.
     * Default port is `5439`.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port number on which the cluster accepts incoming connections. Valid values are between `1115` and `65535`.
     * The cluster is accessible only via the JDBC and ODBC connection strings.
     * Part of the connection string requires the port on which the cluster will listen for incoming connections.
     * Default port is `5439`.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * The weekly time range (in UTC) during which automated cluster maintenance can occur.
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * 
     */
    @Export(name="preferredMaintenanceWindow", type=String.class, parameters={})
    private Output<String> preferredMaintenanceWindow;

    /**
     * @return The weekly time range (in UTC) during which automated cluster maintenance can occur.
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * 
     */
    public Output<String> preferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    /**
     * If true, the cluster can be accessed from a public network. Default is `true`.
     * 
     */
    @Export(name="publiclyAccessible", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publiclyAccessible;

    /**
     * @return If true, the cluster can be accessed from a public network. Default is `true`.
     * 
     */
    public Output<Optional<Boolean>> publiclyAccessible() {
        return Codegen.optional(this.publiclyAccessible);
    }
    /**
     * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If true , a final cluster snapshot is not created. If false , a final cluster snapshot is created before the cluster is deleted. Default is false.
     * 
     */
    @Export(name="skipFinalSnapshot", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> skipFinalSnapshot;

    /**
     * @return Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If true , a final cluster snapshot is not created. If false , a final cluster snapshot is created before the cluster is deleted. Default is false.
     * 
     */
    public Output<Optional<Boolean>> skipFinalSnapshot() {
        return Codegen.optional(this.skipFinalSnapshot);
    }
    /**
     * The name of the cluster the source snapshot was created from.
     * 
     */
    @Export(name="snapshotClusterIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotClusterIdentifier;

    /**
     * @return The name of the cluster the source snapshot was created from.
     * 
     */
    public Output<Optional<String>> snapshotClusterIdentifier() {
        return Codegen.optional(this.snapshotClusterIdentifier);
    }
    /**
     * Configuration of automatic copy of snapshots from one region to another. Documented below.
     * 
     */
    @Export(name="snapshotCopy", type=ClusterSnapshotCopy.class, parameters={})
    private Output</* @Nullable */ ClusterSnapshotCopy> snapshotCopy;

    /**
     * @return Configuration of automatic copy of snapshots from one region to another. Documented below.
     * 
     */
    public Output<Optional<ClusterSnapshotCopy>> snapshotCopy() {
        return Codegen.optional(this.snapshotCopy);
    }
    /**
     * The name of the snapshot from which to create the new cluster.
     * 
     */
    @Export(name="snapshotIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotIdentifier;

    /**
     * @return The name of the snapshot from which to create the new cluster.
     * 
     */
    public Output<Optional<String>> snapshotIdentifier() {
        return Codegen.optional(this.snapshotIdentifier);
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
     * 
     */
    @Export(name="vpcSecurityGroupIds", type=List.class, parameters={String.class})
    private Output<List<String>> vpcSecurityGroupIds;

    /**
     * @return A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
     * 
     */
    public Output<List<String>> vpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/cluster:Cluster", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}