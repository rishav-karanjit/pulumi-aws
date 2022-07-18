// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations.outputs;

import com.pulumi.aws.organizations.outputs.GetOrganizationRootPolicyType;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOrganizationRoot {
    /**
     * @return ARN of the root
     * 
     */
    private final String arn;
    /**
     * @return Identifier of the root
     * 
     */
    private final String id;
    /**
     * @return The name of the policy type
     * 
     */
    private final String name;
    /**
     * @return List of policy types enabled for this root. All elements have these attributes:
     * 
     */
    private final List<GetOrganizationRootPolicyType> policyTypes;

    @CustomType.Constructor
    private GetOrganizationRoot(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policyTypes") List<GetOrganizationRootPolicyType> policyTypes) {
        this.arn = arn;
        this.id = id;
        this.name = name;
        this.policyTypes = policyTypes;
    }

    /**
     * @return ARN of the root
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Identifier of the root
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the policy type
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of policy types enabled for this root. All elements have these attributes:
     * 
     */
    public List<GetOrganizationRootPolicyType> policyTypes() {
        return this.policyTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationRoot defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String name;
        private List<GetOrganizationRootPolicyType> policyTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationRoot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.policyTypes = defaults.policyTypes;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policyTypes(List<GetOrganizationRootPolicyType> policyTypes) {
            this.policyTypes = Objects.requireNonNull(policyTypes);
            return this;
        }
        public Builder policyTypes(GetOrganizationRootPolicyType... policyTypes) {
            return policyTypes(List.of(policyTypes));
        }        public GetOrganizationRoot build() {
            return new GetOrganizationRoot(arn, id, name, policyTypes);
        }
    }
}