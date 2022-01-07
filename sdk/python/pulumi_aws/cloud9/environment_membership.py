# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['EnvironmentMembershipArgs', 'EnvironmentMembership']

@pulumi.input_type
class EnvironmentMembershipArgs:
    def __init__(__self__, *,
                 environment_id: pulumi.Input[str],
                 permissions: pulumi.Input[str],
                 user_arn: pulumi.Input[str]):
        """
        The set of arguments for constructing a EnvironmentMembership resource.
        :param pulumi.Input[str] environment_id: The ID of the environment that contains the environment member you want to add.
        :param pulumi.Input[str] permissions: The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
        :param pulumi.Input[str] user_arn: The Amazon Resource Name (ARN) of the environment member you want to add.
        """
        pulumi.set(__self__, "environment_id", environment_id)
        pulumi.set(__self__, "permissions", permissions)
        pulumi.set(__self__, "user_arn", user_arn)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Input[str]:
        """
        The ID of the environment that contains the environment member you want to add.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Input[str]:
        """
        The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: pulumi.Input[str]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="userArn")
    def user_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) of the environment member you want to add.
        """
        return pulumi.get(self, "user_arn")

    @user_arn.setter
    def user_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_arn", value)


@pulumi.input_type
class _EnvironmentMembershipState:
    def __init__(__self__, *,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[str]] = None,
                 user_arn: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EnvironmentMembership resources.
        :param pulumi.Input[str] environment_id: The ID of the environment that contains the environment member you want to add.
        :param pulumi.Input[str] permissions: The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
        :param pulumi.Input[str] user_arn: The Amazon Resource Name (ARN) of the environment member you want to add.
        :param pulumi.Input[str] user_id: he user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
        """
        if environment_id is not None:
            pulumi.set(__self__, "environment_id", environment_id)
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)
        if user_arn is not None:
            pulumi.set(__self__, "user_arn", user_arn)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the environment that contains the environment member you want to add.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[str]]:
        """
        The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="userArn")
    def user_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the environment member you want to add.
        """
        return pulumi.get(self, "user_arn")

    @user_arn.setter
    def user_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_arn", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        he user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class EnvironmentMembership(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[str]] = None,
                 user_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an environment member to an AWS Cloud9 development environment.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test_environment_ec2 = aws.cloud9.EnvironmentEC2("testEnvironmentEC2", instance_type="t2.micro")
        test_user = aws.iam.User("testUser")
        test_environment_membership = aws.cloud9.EnvironmentMembership("testEnvironmentMembership",
            environment_id=test_environment_ec2.id,
            permissions="read-only",
            user_arn=test_user.arn)
        ```

        ## Import

        Cloud9 environment membership can be imported using the `environment-id#user-arn`, e.g.

        ```sh
         $ pulumi import aws:cloud9/environmentMembership:EnvironmentMembership test environment-id#user-arn
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] environment_id: The ID of the environment that contains the environment member you want to add.
        :param pulumi.Input[str] permissions: The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
        :param pulumi.Input[str] user_arn: The Amazon Resource Name (ARN) of the environment member you want to add.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EnvironmentMembershipArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an environment member to an AWS Cloud9 development environment.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test_environment_ec2 = aws.cloud9.EnvironmentEC2("testEnvironmentEC2", instance_type="t2.micro")
        test_user = aws.iam.User("testUser")
        test_environment_membership = aws.cloud9.EnvironmentMembership("testEnvironmentMembership",
            environment_id=test_environment_ec2.id,
            permissions="read-only",
            user_arn=test_user.arn)
        ```

        ## Import

        Cloud9 environment membership can be imported using the `environment-id#user-arn`, e.g.

        ```sh
         $ pulumi import aws:cloud9/environmentMembership:EnvironmentMembership test environment-id#user-arn
        ```

        :param str resource_name: The name of the resource.
        :param EnvironmentMembershipArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EnvironmentMembershipArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[str]] = None,
                 user_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EnvironmentMembershipArgs.__new__(EnvironmentMembershipArgs)

            if environment_id is None and not opts.urn:
                raise TypeError("Missing required property 'environment_id'")
            __props__.__dict__["environment_id"] = environment_id
            if permissions is None and not opts.urn:
                raise TypeError("Missing required property 'permissions'")
            __props__.__dict__["permissions"] = permissions
            if user_arn is None and not opts.urn:
                raise TypeError("Missing required property 'user_arn'")
            __props__.__dict__["user_arn"] = user_arn
            __props__.__dict__["user_id"] = None
        super(EnvironmentMembership, __self__).__init__(
            'aws:cloud9/environmentMembership:EnvironmentMembership',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            environment_id: Optional[pulumi.Input[str]] = None,
            permissions: Optional[pulumi.Input[str]] = None,
            user_arn: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'EnvironmentMembership':
        """
        Get an existing EnvironmentMembership resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] environment_id: The ID of the environment that contains the environment member you want to add.
        :param pulumi.Input[str] permissions: The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
        :param pulumi.Input[str] user_arn: The Amazon Resource Name (ARN) of the environment member you want to add.
        :param pulumi.Input[str] user_id: he user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EnvironmentMembershipState.__new__(_EnvironmentMembershipState)

        __props__.__dict__["environment_id"] = environment_id
        __props__.__dict__["permissions"] = permissions
        __props__.__dict__["user_arn"] = user_arn
        __props__.__dict__["user_id"] = user_id
        return EnvironmentMembership(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Output[str]:
        """
        The ID of the environment that contains the environment member you want to add.
        """
        return pulumi.get(self, "environment_id")

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Output[str]:
        """
        The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter(name="userArn")
    def user_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the environment member you want to add.
        """
        return pulumi.get(self, "user_arn")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        he user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
        """
        return pulumi.get(self, "user_id")
