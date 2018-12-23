// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package appmesh

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides an AWS App Mesh route resource.
type Route struct {
	s *pulumi.ResourceState
}

// NewRoute registers a new resource with the given unique name, arguments, and options.
func NewRoute(ctx *pulumi.Context,
	name string, args *RouteArgs, opts ...pulumi.ResourceOpt) (*Route, error) {
	if args == nil || args.MeshName == nil {
		return nil, errors.New("missing required argument 'MeshName'")
	}
	if args == nil || args.Spec == nil {
		return nil, errors.New("missing required argument 'Spec'")
	}
	if args == nil || args.VirtualRouterName == nil {
		return nil, errors.New("missing required argument 'VirtualRouterName'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["meshName"] = nil
		inputs["name"] = nil
		inputs["spec"] = nil
		inputs["virtualRouterName"] = nil
	} else {
		inputs["meshName"] = args.MeshName
		inputs["name"] = args.Name
		inputs["spec"] = args.Spec
		inputs["virtualRouterName"] = args.VirtualRouterName
	}
	inputs["arn"] = nil
	inputs["createdDate"] = nil
	inputs["lastUpdatedDate"] = nil
	s, err := ctx.RegisterResource("aws:appmesh/route:Route", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Route{s: s}, nil
}

// GetRoute gets an existing Route resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRoute(ctx *pulumi.Context,
	name string, id pulumi.ID, state *RouteState, opts ...pulumi.ResourceOpt) (*Route, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["arn"] = state.Arn
		inputs["createdDate"] = state.CreatedDate
		inputs["lastUpdatedDate"] = state.LastUpdatedDate
		inputs["meshName"] = state.MeshName
		inputs["name"] = state.Name
		inputs["spec"] = state.Spec
		inputs["virtualRouterName"] = state.VirtualRouterName
	}
	s, err := ctx.ReadResource("aws:appmesh/route:Route", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Route{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Route) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Route) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The ARN of the route.
func (r *Route) Arn() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["arn"])
}

// The creation date of the route.
func (r *Route) CreatedDate() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["createdDate"])
}

// The last update date of the route.
func (r *Route) LastUpdatedDate() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["lastUpdatedDate"])
}

// The name of the service mesh in which to create the route.
func (r *Route) MeshName() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["meshName"])
}

// The name to use for the route.
func (r *Route) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// The route specification to apply.
func (r *Route) Spec() *pulumi.Output {
	return r.s.State["spec"]
}

func (r *Route) VirtualRouterName() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["virtualRouterName"])
}

// Input properties used for looking up and filtering Route resources.
type RouteState struct {
	// The ARN of the route.
	Arn interface{}
	// The creation date of the route.
	CreatedDate interface{}
	// The last update date of the route.
	LastUpdatedDate interface{}
	// The name of the service mesh in which to create the route.
	MeshName interface{}
	// The name to use for the route.
	Name interface{}
	// The route specification to apply.
	Spec interface{}
	VirtualRouterName interface{}
}

// The set of arguments for constructing a Route resource.
type RouteArgs struct {
	// The name of the service mesh in which to create the route.
	MeshName interface{}
	// The name to use for the route.
	Name interface{}
	// The route specification to apply.
	Spec interface{}
	VirtualRouterName interface{}
}