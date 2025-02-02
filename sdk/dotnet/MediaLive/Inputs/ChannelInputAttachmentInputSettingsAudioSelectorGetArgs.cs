// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelInputAttachmentInputSettingsAudioSelectorGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the Channel.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The audio selector settings. See Audio Selector Settings for more details.
        /// </summary>
        [Input("selectorSettings")]
        public Input<Inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsGetArgs>? SelectorSettings { get; set; }

        public ChannelInputAttachmentInputSettingsAudioSelectorGetArgs()
        {
        }
        public static new ChannelInputAttachmentInputSettingsAudioSelectorGetArgs Empty => new ChannelInputAttachmentInputSettingsAudioSelectorGetArgs();
    }
}
