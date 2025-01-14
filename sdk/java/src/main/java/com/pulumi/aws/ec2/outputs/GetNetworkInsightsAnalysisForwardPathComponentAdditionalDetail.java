// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetNetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponent;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetworkInsightsAnalysisForwardPathComponentAdditionalDetail {
    private String additionalDetailType;
    private List<GetNetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponent> components;

    private GetNetworkInsightsAnalysisForwardPathComponentAdditionalDetail() {}
    public String additionalDetailType() {
        return this.additionalDetailType;
    }
    public List<GetNetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponent> components() {
        return this.components;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInsightsAnalysisForwardPathComponentAdditionalDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String additionalDetailType;
        private List<GetNetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponent> components;
        public Builder() {}
        public Builder(GetNetworkInsightsAnalysisForwardPathComponentAdditionalDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalDetailType = defaults.additionalDetailType;
    	      this.components = defaults.components;
        }

        @CustomType.Setter
        public Builder additionalDetailType(String additionalDetailType) {
            this.additionalDetailType = Objects.requireNonNull(additionalDetailType);
            return this;
        }
        @CustomType.Setter
        public Builder components(List<GetNetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponent> components) {
            this.components = Objects.requireNonNull(components);
            return this;
        }
        public Builder components(GetNetworkInsightsAnalysisForwardPathComponentAdditionalDetailComponent... components) {
            return components(List.of(components));
        }
        public GetNetworkInsightsAnalysisForwardPathComponentAdditionalDetail build() {
            final var o = new GetNetworkInsightsAnalysisForwardPathComponentAdditionalDetail();
            o.additionalDetailType = additionalDetailType;
            o.components = components;
            return o;
        }
    }
}
