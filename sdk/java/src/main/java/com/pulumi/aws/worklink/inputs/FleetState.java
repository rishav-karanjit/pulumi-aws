// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.worklink.inputs;

import com.pulumi.aws.worklink.inputs.FleetIdentityProviderArgs;
import com.pulumi.aws.worklink.inputs.FleetNetworkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetState extends com.pulumi.resources.ResourceArgs {

    public static final FleetState Empty = new FleetState();

    /**
     * The ARN of the created WorkLink Fleet.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the created WorkLink Fleet.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `&#34;AmazonWorkLink-&#34;`.
     * 
     */
    @Import(name="auditStreamArn")
    private @Nullable Output<String> auditStreamArn;

    /**
     * @return The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `&#34;AmazonWorkLink-&#34;`.
     * 
     */
    public Optional<Output<String>> auditStreamArn() {
        return Optional.ofNullable(this.auditStreamArn);
    }

    /**
     * The identifier used by users to sign in to the Amazon WorkLink app.
     * 
     */
    @Import(name="companyCode")
    private @Nullable Output<String> companyCode;

    /**
     * @return The identifier used by users to sign in to the Amazon WorkLink app.
     * 
     */
    public Optional<Output<String>> companyCode() {
        return Optional.ofNullable(this.companyCode);
    }

    /**
     * The time that the fleet was created.
     * 
     */
    @Import(name="createdTime")
    private @Nullable Output<String> createdTime;

    /**
     * @return The time that the fleet was created.
     * 
     */
    public Optional<Output<String>> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }

    /**
     * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
     * 
     */
    @Import(name="deviceCaCertificate")
    private @Nullable Output<String> deviceCaCertificate;

    /**
     * @return The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
     * 
     */
    public Optional<Output<String>> deviceCaCertificate() {
        return Optional.ofNullable(this.deviceCaCertificate);
    }

    /**
     * The name of the fleet.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name of the fleet.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
     * 
     */
    @Import(name="identityProvider")
    private @Nullable Output<FleetIdentityProviderArgs> identityProvider;

    /**
     * @return Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
     * 
     */
    public Optional<Output<FleetIdentityProviderArgs>> identityProvider() {
        return Optional.ofNullable(this.identityProvider);
    }

    /**
     * The time that the fleet was last updated.
     * 
     */
    @Import(name="lastUpdatedTime")
    private @Nullable Output<String> lastUpdatedTime;

    /**
     * @return The time that the fleet was last updated.
     * 
     */
    public Optional<Output<String>> lastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }

    /**
     * A region-unique name for the AMI.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A region-unique name for the AMI.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Provide this to allow manage the company network configuration for the fleet. Fields documented below.
     * 
     */
    @Import(name="network")
    private @Nullable Output<FleetNetworkArgs> network;

    /**
     * @return Provide this to allow manage the company network configuration for the fleet. Fields documented below.
     * 
     */
    public Optional<Output<FleetNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
     * 
     */
    @Import(name="optimizeForEndUserLocation")
    private @Nullable Output<Boolean> optimizeForEndUserLocation;

    /**
     * @return The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> optimizeForEndUserLocation() {
        return Optional.ofNullable(this.optimizeForEndUserLocation);
    }

    private FleetState() {}

    private FleetState(FleetState $) {
        this.arn = $.arn;
        this.auditStreamArn = $.auditStreamArn;
        this.companyCode = $.companyCode;
        this.createdTime = $.createdTime;
        this.deviceCaCertificate = $.deviceCaCertificate;
        this.displayName = $.displayName;
        this.identityProvider = $.identityProvider;
        this.lastUpdatedTime = $.lastUpdatedTime;
        this.name = $.name;
        this.network = $.network;
        this.optimizeForEndUserLocation = $.optimizeForEndUserLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetState $;

        public Builder() {
            $ = new FleetState();
        }

        public Builder(FleetState defaults) {
            $ = new FleetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the created WorkLink Fleet.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the created WorkLink Fleet.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param auditStreamArn The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `&#34;AmazonWorkLink-&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder auditStreamArn(@Nullable Output<String> auditStreamArn) {
            $.auditStreamArn = auditStreamArn;
            return this;
        }

        /**
         * @param auditStreamArn The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `&#34;AmazonWorkLink-&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder auditStreamArn(String auditStreamArn) {
            return auditStreamArn(Output.of(auditStreamArn));
        }

        /**
         * @param companyCode The identifier used by users to sign in to the Amazon WorkLink app.
         * 
         * @return builder
         * 
         */
        public Builder companyCode(@Nullable Output<String> companyCode) {
            $.companyCode = companyCode;
            return this;
        }

        /**
         * @param companyCode The identifier used by users to sign in to the Amazon WorkLink app.
         * 
         * @return builder
         * 
         */
        public Builder companyCode(String companyCode) {
            return companyCode(Output.of(companyCode));
        }

        /**
         * @param createdTime The time that the fleet was created.
         * 
         * @return builder
         * 
         */
        public Builder createdTime(@Nullable Output<String> createdTime) {
            $.createdTime = createdTime;
            return this;
        }

        /**
         * @param createdTime The time that the fleet was created.
         * 
         * @return builder
         * 
         */
        public Builder createdTime(String createdTime) {
            return createdTime(Output.of(createdTime));
        }

        /**
         * @param deviceCaCertificate The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
         * 
         * @return builder
         * 
         */
        public Builder deviceCaCertificate(@Nullable Output<String> deviceCaCertificate) {
            $.deviceCaCertificate = deviceCaCertificate;
            return this;
        }

        /**
         * @param deviceCaCertificate The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
         * 
         * @return builder
         * 
         */
        public Builder deviceCaCertificate(String deviceCaCertificate) {
            return deviceCaCertificate(Output.of(deviceCaCertificate));
        }

        /**
         * @param displayName The name of the fleet.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the fleet.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param identityProvider Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder identityProvider(@Nullable Output<FleetIdentityProviderArgs> identityProvider) {
            $.identityProvider = identityProvider;
            return this;
        }

        /**
         * @param identityProvider Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder identityProvider(FleetIdentityProviderArgs identityProvider) {
            return identityProvider(Output.of(identityProvider));
        }

        /**
         * @param lastUpdatedTime The time that the fleet was last updated.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedTime(@Nullable Output<String> lastUpdatedTime) {
            $.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        /**
         * @param lastUpdatedTime The time that the fleet was last updated.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedTime(String lastUpdatedTime) {
            return lastUpdatedTime(Output.of(lastUpdatedTime));
        }

        /**
         * @param name A region-unique name for the AMI.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A region-unique name for the AMI.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network Provide this to allow manage the company network configuration for the fleet. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<FleetNetworkArgs> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Provide this to allow manage the company network configuration for the fleet. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder network(FleetNetworkArgs network) {
            return network(Output.of(network));
        }

        /**
         * @param optimizeForEndUserLocation The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder optimizeForEndUserLocation(@Nullable Output<Boolean> optimizeForEndUserLocation) {
            $.optimizeForEndUserLocation = optimizeForEndUserLocation;
            return this;
        }

        /**
         * @param optimizeForEndUserLocation The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder optimizeForEndUserLocation(Boolean optimizeForEndUserLocation) {
            return optimizeForEndUserLocation(Output.of(optimizeForEndUserLocation));
        }

        public FleetState build() {
            return $;
        }
    }

}