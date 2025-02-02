// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.outputs;

import com.pulumi.aws.apprunner.outputs.ServiceSourceConfigurationAuthenticationConfiguration;
import com.pulumi.aws.apprunner.outputs.ServiceSourceConfigurationCodeRepository;
import com.pulumi.aws.apprunner.outputs.ServiceSourceConfigurationImageRepository;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceSourceConfiguration {
    /**
     * @return Describes resources needed to authenticate access to some source repositories. See Authentication Configuration below for more details.
     * 
     */
    private @Nullable ServiceSourceConfigurationAuthenticationConfiguration authenticationConfiguration;
    /**
     * @return Whether continuous integration from the source repository is enabled for the App Runner service. If set to `true`, each repository change (source code commit or new image version) starts a deployment. Defaults to `true`.
     * 
     */
    private @Nullable Boolean autoDeploymentsEnabled;
    /**
     * @return Description of a source code repository. See Code Repository below for more details.
     * 
     */
    private @Nullable ServiceSourceConfigurationCodeRepository codeRepository;
    /**
     * @return Description of a source image repository. See Image Repository below for more details.
     * 
     */
    private @Nullable ServiceSourceConfigurationImageRepository imageRepository;

    private ServiceSourceConfiguration() {}
    /**
     * @return Describes resources needed to authenticate access to some source repositories. See Authentication Configuration below for more details.
     * 
     */
    public Optional<ServiceSourceConfigurationAuthenticationConfiguration> authenticationConfiguration() {
        return Optional.ofNullable(this.authenticationConfiguration);
    }
    /**
     * @return Whether continuous integration from the source repository is enabled for the App Runner service. If set to `true`, each repository change (source code commit or new image version) starts a deployment. Defaults to `true`.
     * 
     */
    public Optional<Boolean> autoDeploymentsEnabled() {
        return Optional.ofNullable(this.autoDeploymentsEnabled);
    }
    /**
     * @return Description of a source code repository. See Code Repository below for more details.
     * 
     */
    public Optional<ServiceSourceConfigurationCodeRepository> codeRepository() {
        return Optional.ofNullable(this.codeRepository);
    }
    /**
     * @return Description of a source image repository. See Image Repository below for more details.
     * 
     */
    public Optional<ServiceSourceConfigurationImageRepository> imageRepository() {
        return Optional.ofNullable(this.imageRepository);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ServiceSourceConfigurationAuthenticationConfiguration authenticationConfiguration;
        private @Nullable Boolean autoDeploymentsEnabled;
        private @Nullable ServiceSourceConfigurationCodeRepository codeRepository;
        private @Nullable ServiceSourceConfigurationImageRepository imageRepository;
        public Builder() {}
        public Builder(ServiceSourceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationConfiguration = defaults.authenticationConfiguration;
    	      this.autoDeploymentsEnabled = defaults.autoDeploymentsEnabled;
    	      this.codeRepository = defaults.codeRepository;
    	      this.imageRepository = defaults.imageRepository;
        }

        @CustomType.Setter
        public Builder authenticationConfiguration(@Nullable ServiceSourceConfigurationAuthenticationConfiguration authenticationConfiguration) {
            this.authenticationConfiguration = authenticationConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder autoDeploymentsEnabled(@Nullable Boolean autoDeploymentsEnabled) {
            this.autoDeploymentsEnabled = autoDeploymentsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder codeRepository(@Nullable ServiceSourceConfigurationCodeRepository codeRepository) {
            this.codeRepository = codeRepository;
            return this;
        }
        @CustomType.Setter
        public Builder imageRepository(@Nullable ServiceSourceConfigurationImageRepository imageRepository) {
            this.imageRepository = imageRepository;
            return this;
        }
        public ServiceSourceConfiguration build() {
            final var o = new ServiceSourceConfiguration();
            o.authenticationConfiguration = authenticationConfiguration;
            o.autoDeploymentsEnabled = autoDeploymentsEnabled;
            o.codeRepository = codeRepository;
            o.imageRepository = imageRepository;
            return o;
        }
    }
}
