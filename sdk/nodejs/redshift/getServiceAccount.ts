// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get the Account ID of the [AWS Redshift Service Account](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
 * in a given region for the purpose of allowing Redshift to store audit data in S3.
 *
 * > **Note:** AWS documentation [states that](https://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-bucket-permissions) a [service principal name](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services) should be used instead of an AWS account ID in any relevant IAM policy.
 * The `aws.redshift.getServiceAccount` data source has been deprecated and will be removed in a future version.
 */
export function getServiceAccount(args?: GetServiceAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceAccountResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:redshift/getServiceAccount:getServiceAccount", {
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceAccount.
 */
export interface GetServiceAccountArgs {
    /**
     * Name of the region whose AWS Redshift account ID is desired.
     * Defaults to the region from the AWS provider configuration.
     */
    region?: string;
}

/**
 * A collection of values returned by getServiceAccount.
 */
export interface GetServiceAccountResult {
    /**
     * ARN of the AWS Redshift service account in the selected region.
     */
    readonly arn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly region?: string;
}
/**
 * Use this data source to get the Account ID of the [AWS Redshift Service Account](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
 * in a given region for the purpose of allowing Redshift to store audit data in S3.
 *
 * > **Note:** AWS documentation [states that](https://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-bucket-permissions) a [service principal name](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services) should be used instead of an AWS account ID in any relevant IAM policy.
 * The `aws.redshift.getServiceAccount` data source has been deprecated and will be removed in a future version.
 */
export function getServiceAccountOutput(args?: GetServiceAccountOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceAccountResult> {
    return pulumi.output(args).apply((a: any) => getServiceAccount(a, opts))
}

/**
 * A collection of arguments for invoking getServiceAccount.
 */
export interface GetServiceAccountOutputArgs {
    /**
     * Name of the region whose AWS Redshift account ID is desired.
     * Defaults to the region from the AWS provider configuration.
     */
    region?: pulumi.Input<string>;
}
