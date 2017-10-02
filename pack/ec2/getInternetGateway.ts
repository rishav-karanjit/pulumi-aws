// *** WARNING: this file was generated by the Pulumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "pulumi";

/**
 * `aws_internet_gateway` provides details about a specific Internet Gateway.
 */
export function getInternetGateway(args?: GetInternetGatewayArgs): Promise<GetInternetGatewayResult> {
    args = args || {};
    return pulumi.runtime.invoke("aws:ec2/getInternetGateway:getInternetGateway", {
        "filter": args.filter,
        "internetGatewayId": args.internetGatewayId,
        "tags": args.tags,
    });
}

/**
 * A collection of arguments for invoking getInternetGateway.
 */
export interface GetInternetGatewayArgs {
    /**
     * Custom filter block as described below.
     */
    filter?: pulumi.ComputedValue<{ name: pulumi.ComputedValue<string>, values: pulumi.ComputedValue<pulumi.ComputedValue<string>>[] }>[];
    /**
     * The id of the specific Internet Gateway to retrieve.
     */
    internetGatewayId?: pulumi.ComputedValue<string>;
    /**
     * A mapping of tags, each pair of which must exactly match
     * a pair on the desired Internet Gateway.
     */
    tags?: pulumi.ComputedValue<{[key: string]: any}>;
}

/**
 * A collection of values returned by getInternetGateway.
 */
export interface GetInternetGatewayResult {
    attachments: { state: string, vpcId: string }[];
    internetGatewayId: string;
    tags: {[key: string]: any};
}
