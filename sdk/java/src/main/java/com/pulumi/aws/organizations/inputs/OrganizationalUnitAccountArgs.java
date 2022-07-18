// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationalUnitAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationalUnitAccountArgs Empty = new OrganizationalUnitAccountArgs();

    /**
     * ARN of the organizational unit
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the organizational unit
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Email of the account
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return Email of the account
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * Identifier of the organization unit
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Identifier of the organization unit
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name for the organizational unit
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the organizational unit
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private OrganizationalUnitAccountArgs() {}

    private OrganizationalUnitAccountArgs(OrganizationalUnitAccountArgs $) {
        this.arn = $.arn;
        this.email = $.email;
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationalUnitAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationalUnitAccountArgs $;

        public Builder() {
            $ = new OrganizationalUnitAccountArgs();
        }

        public Builder(OrganizationalUnitAccountArgs defaults) {
            $ = new OrganizationalUnitAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the organizational unit
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the organizational unit
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param email Email of the account
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Email of the account
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param id Identifier of the organization unit
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Identifier of the organization unit
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name for the organizational unit
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the organizational unit
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public OrganizationalUnitAccountArgs build() {
            return $;
        }
    }

}