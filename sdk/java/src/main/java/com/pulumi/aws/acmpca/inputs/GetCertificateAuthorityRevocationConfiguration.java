// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca.inputs;

import com.pulumi.aws.acmpca.inputs.GetCertificateAuthorityRevocationConfigurationCrlConfiguration;
import com.pulumi.aws.acmpca.inputs.GetCertificateAuthorityRevocationConfigurationOcspConfiguration;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class GetCertificateAuthorityRevocationConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateAuthorityRevocationConfiguration Empty = new GetCertificateAuthorityRevocationConfiguration();

    @Import(name="crlConfigurations", required=true)
    private List<GetCertificateAuthorityRevocationConfigurationCrlConfiguration> crlConfigurations;

    public List<GetCertificateAuthorityRevocationConfigurationCrlConfiguration> crlConfigurations() {
        return this.crlConfigurations;
    }

    @Import(name="ocspConfigurations", required=true)
    private List<GetCertificateAuthorityRevocationConfigurationOcspConfiguration> ocspConfigurations;

    public List<GetCertificateAuthorityRevocationConfigurationOcspConfiguration> ocspConfigurations() {
        return this.ocspConfigurations;
    }

    private GetCertificateAuthorityRevocationConfiguration() {}

    private GetCertificateAuthorityRevocationConfiguration(GetCertificateAuthorityRevocationConfiguration $) {
        this.crlConfigurations = $.crlConfigurations;
        this.ocspConfigurations = $.ocspConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateAuthorityRevocationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateAuthorityRevocationConfiguration $;

        public Builder() {
            $ = new GetCertificateAuthorityRevocationConfiguration();
        }

        public Builder(GetCertificateAuthorityRevocationConfiguration defaults) {
            $ = new GetCertificateAuthorityRevocationConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder crlConfigurations(List<GetCertificateAuthorityRevocationConfigurationCrlConfiguration> crlConfigurations) {
            $.crlConfigurations = crlConfigurations;
            return this;
        }

        public Builder crlConfigurations(GetCertificateAuthorityRevocationConfigurationCrlConfiguration... crlConfigurations) {
            return crlConfigurations(List.of(crlConfigurations));
        }

        public Builder ocspConfigurations(List<GetCertificateAuthorityRevocationConfigurationOcspConfiguration> ocspConfigurations) {
            $.ocspConfigurations = ocspConfigurations;
            return this;
        }

        public Builder ocspConfigurations(GetCertificateAuthorityRevocationConfigurationOcspConfiguration... ocspConfigurations) {
            return ocspConfigurations(List.of(ocspConfigurations));
        }

        public GetCertificateAuthorityRevocationConfiguration build() {
            $.crlConfigurations = Objects.requireNonNull($.crlConfigurations, "expected parameter 'crlConfigurations' to be non-null");
            $.ocspConfigurations = Objects.requireNonNull($.ocspConfigurations, "expected parameter 'ocspConfigurations' to be non-null");
            return $;
        }
    }

}