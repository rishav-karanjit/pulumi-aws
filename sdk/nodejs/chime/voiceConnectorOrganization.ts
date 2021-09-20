// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Enable origination settings to control inbound calling to your SIP infrastructure.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const defaultVoiceConnector = new aws.chime.VoiceConnector("defaultVoiceConnector", {requireEncryption: true});
 * const defaultVoiceConnectorOrganization = new aws.chime.VoiceConnectorOrganization("defaultVoiceConnectorOrganization", {
 *     disabled: false,
 *     voiceConnectorId: defaultVoiceConnector.id,
 *     routes: [
 *         {
 *             host: "127.0.0.1",
 *             port: 8081,
 *             protocol: "TCP",
 *             priority: 1,
 *             weight: 1,
 *         },
 *         {
 *             host: "127.0.0.2",
 *             port: 8082,
 *             protocol: "TCP",
 *             priority: 2,
 *             weight: 10,
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Chime Voice Connector Origination can be imported using the `voice_connector_id`, e.g.
 *
 * ```sh
 *  $ pulumi import aws:chime/voiceConnectorOrganization:VoiceConnectorOrganization default abcdef1ghij2klmno3pqr4
 * ```
 */
export class VoiceConnectorOrganization extends pulumi.CustomResource {
    /**
     * Get an existing VoiceConnectorOrganization resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VoiceConnectorOrganizationState, opts?: pulumi.CustomResourceOptions): VoiceConnectorOrganization {
        return new VoiceConnectorOrganization(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:chime/voiceConnectorOrganization:VoiceConnectorOrganization';

    /**
     * Returns true if the given object is an instance of VoiceConnectorOrganization.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VoiceConnectorOrganization {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VoiceConnectorOrganization.__pulumiType;
    }

    /**
     * When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
     */
    public readonly disabled!: pulumi.Output<boolean | undefined>;
    /**
     * Set of call distribution properties defined for your SIP hosts. See route below for more details. Minimum of 1. Maximum of 20.
     */
    public readonly routes!: pulumi.Output<outputs.chime.VoiceConnectorOrganizationRoute[]>;
    /**
     * The Amazon Chime Voice Connector ID.
     */
    public readonly voiceConnectorId!: pulumi.Output<string>;

    /**
     * Create a VoiceConnectorOrganization resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VoiceConnectorOrganizationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VoiceConnectorOrganizationArgs | VoiceConnectorOrganizationState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VoiceConnectorOrganizationState | undefined;
            inputs["disabled"] = state ? state.disabled : undefined;
            inputs["routes"] = state ? state.routes : undefined;
            inputs["voiceConnectorId"] = state ? state.voiceConnectorId : undefined;
        } else {
            const args = argsOrState as VoiceConnectorOrganizationArgs | undefined;
            if ((!args || args.routes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'routes'");
            }
            if ((!args || args.voiceConnectorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'voiceConnectorId'");
            }
            inputs["disabled"] = args ? args.disabled : undefined;
            inputs["routes"] = args ? args.routes : undefined;
            inputs["voiceConnectorId"] = args ? args.voiceConnectorId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(VoiceConnectorOrganization.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VoiceConnectorOrganization resources.
 */
export interface VoiceConnectorOrganizationState {
    /**
     * When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * Set of call distribution properties defined for your SIP hosts. See route below for more details. Minimum of 1. Maximum of 20.
     */
    routes?: pulumi.Input<pulumi.Input<inputs.chime.VoiceConnectorOrganizationRoute>[]>;
    /**
     * The Amazon Chime Voice Connector ID.
     */
    voiceConnectorId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VoiceConnectorOrganization resource.
 */
export interface VoiceConnectorOrganizationArgs {
    /**
     * When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * Set of call distribution properties defined for your SIP hosts. See route below for more details. Minimum of 1. Maximum of 20.
     */
    routes: pulumi.Input<pulumi.Input<inputs.chime.VoiceConnectorOrganizationRoute>[]>;
    /**
     * The Amazon Chime Voice Connector ID.
     */
    voiceConnectorId: pulumi.Input<string>;
}