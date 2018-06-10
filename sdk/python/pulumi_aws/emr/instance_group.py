# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime

class InstanceGroup(pulumi.CustomResource):
    """
    Provides an Elastic MapReduce Cluster Instance Group configuration.
    See [Amazon Elastic MapReduce Documentation](https://aws.amazon.com/documentation/emr/) for more information.
    
    ~> **NOTE:** At this time, Instance Groups cannot be destroyed through the API nor
    web interface. Instance Groups are destroyed when the EMR Cluster is destroyed.
    Terraform will resize any Instance Group to zero when destroying the resource.
    """
    def __init__(__self__, __name__, __opts__=None, cluster_id=None, ebs_configs=None, ebs_optimized=None, instance_count=None, instance_type=None, name=None):
        """Create a InstanceGroup resource with the given unique name, props, and options."""
        if not __name__:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(__name__, basestring):
            raise TypeError('Expected resource name to be a string')
        if __opts__ and not isinstance(__opts__, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if not cluster_id:
            raise TypeError('Missing required property cluster_id')
        elif not isinstance(cluster_id, basestring):
            raise TypeError('Expected property cluster_id to be a basestring')
        __self__.cluster_id = cluster_id
        """
        ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
        """
        __props__['clusterId'] = cluster_id

        if ebs_configs and not isinstance(ebs_configs, list):
            raise TypeError('Expected property ebs_configs to be a list')
        __self__.ebs_configs = ebs_configs
        """
        One or more `ebs_config` blocks as defined below. Changing this forces a new resource to be created.
        """
        __props__['ebsConfigs'] = ebs_configs

        if ebs_optimized and not isinstance(ebs_optimized, bool):
            raise TypeError('Expected property ebs_optimized to be a bool')
        __self__.ebs_optimized = ebs_optimized
        """
        Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
        """
        __props__['ebsOptimized'] = ebs_optimized

        if instance_count and not isinstance(instance_count, int):
            raise TypeError('Expected property instance_count to be a int')
        __self__.instance_count = instance_count
        """
        Target number of instances for the instance group. Defaults to 0.
        """
        __props__['instanceCount'] = instance_count

        if not instance_type:
            raise TypeError('Missing required property instance_type')
        elif not isinstance(instance_type, basestring):
            raise TypeError('Expected property instance_type to be a basestring')
        __self__.instance_type = instance_type
        """
        The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
        """
        __props__['instanceType'] = instance_type

        if name and not isinstance(name, basestring):
            raise TypeError('Expected property name to be a basestring')
        __self__.name = name
        """
        Human friendly name given to the instance group. Changing this forces a new resource to be created.
        """
        __props__['name'] = name

        __self__.running_instance_count = pulumi.runtime.UNKNOWN
        __self__.status = pulumi.runtime.UNKNOWN

        super(InstanceGroup, __self__).__init__(
            'aws:emr/instanceGroup:InstanceGroup',
            __name__,
            __props__,
            __opts__)

    def set_outputs(self, outs):
        if 'clusterId' in outs:
            self.cluster_id = outs['clusterId']
        if 'ebsConfigs' in outs:
            self.ebs_configs = outs['ebsConfigs']
        if 'ebsOptimized' in outs:
            self.ebs_optimized = outs['ebsOptimized']
        if 'instanceCount' in outs:
            self.instance_count = outs['instanceCount']
        if 'instanceType' in outs:
            self.instance_type = outs['instanceType']
        if 'name' in outs:
            self.name = outs['name']
        if 'runningInstanceCount' in outs:
            self.running_instance_count = outs['runningInstanceCount']
        if 'status' in outs:
            self.status = outs['status']