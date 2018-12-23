// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package dlm

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a [Data Lifecycle Manager (DLM) lifecycle policy](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-lifecycle.html) for managing snapshots.
type LifecyclePolicy struct {
	s *pulumi.ResourceState
}

// NewLifecyclePolicy registers a new resource with the given unique name, arguments, and options.
func NewLifecyclePolicy(ctx *pulumi.Context,
	name string, args *LifecyclePolicyArgs, opts ...pulumi.ResourceOpt) (*LifecyclePolicy, error) {
	if args == nil || args.Description == nil {
		return nil, errors.New("missing required argument 'Description'")
	}
	if args == nil || args.ExecutionRoleArn == nil {
		return nil, errors.New("missing required argument 'ExecutionRoleArn'")
	}
	if args == nil || args.PolicyDetails == nil {
		return nil, errors.New("missing required argument 'PolicyDetails'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["description"] = nil
		inputs["executionRoleArn"] = nil
		inputs["policyDetails"] = nil
		inputs["state"] = nil
	} else {
		inputs["description"] = args.Description
		inputs["executionRoleArn"] = args.ExecutionRoleArn
		inputs["policyDetails"] = args.PolicyDetails
		inputs["state"] = args.State
	}
	s, err := ctx.RegisterResource("aws:dlm/lifecyclePolicy:LifecyclePolicy", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &LifecyclePolicy{s: s}, nil
}

// GetLifecyclePolicy gets an existing LifecyclePolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLifecyclePolicy(ctx *pulumi.Context,
	name string, id pulumi.ID, state *LifecyclePolicyState, opts ...pulumi.ResourceOpt) (*LifecyclePolicy, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["description"] = state.Description
		inputs["executionRoleArn"] = state.ExecutionRoleArn
		inputs["policyDetails"] = state.PolicyDetails
		inputs["state"] = state.State
	}
	s, err := ctx.ReadResource("aws:dlm/lifecyclePolicy:LifecyclePolicy", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &LifecyclePolicy{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *LifecyclePolicy) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *LifecyclePolicy) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// A description for the DLM lifecycle policy.
func (r *LifecyclePolicy) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

// The ARN of an IAM role that is able to be assumed by the DLM service.
func (r *LifecyclePolicy) ExecutionRoleArn() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["executionRoleArn"])
}

// See the `policy_details` configuration block. Max of 1.
func (r *LifecyclePolicy) PolicyDetails() *pulumi.Output {
	return r.s.State["policyDetails"]
}

// Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
func (r *LifecyclePolicy) State() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["state"])
}

// Input properties used for looking up and filtering LifecyclePolicy resources.
type LifecyclePolicyState struct {
	// A description for the DLM lifecycle policy.
	Description interface{}
	// The ARN of an IAM role that is able to be assumed by the DLM service.
	ExecutionRoleArn interface{}
	// See the `policy_details` configuration block. Max of 1.
	PolicyDetails interface{}
	// Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
	State interface{}
}

// The set of arguments for constructing a LifecyclePolicy resource.
type LifecyclePolicyArgs struct {
	// A description for the DLM lifecycle policy.
	Description interface{}
	// The ARN of an IAM role that is able to be assumed by the DLM service.
	ExecutionRoleArn interface{}
	// See the `policy_details` configuration block. Max of 1.
	PolicyDetails interface{}
	// Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
	State interface{}
}