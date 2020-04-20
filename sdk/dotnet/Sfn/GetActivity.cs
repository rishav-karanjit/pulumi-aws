// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sfn
{
    public static class GetActivity
    {
        /// <summary>
        /// Provides a Step Functions Activity data source
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetActivityResult> InvokeAsync(GetActivityArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetActivityResult>("aws:sfn/getActivity:getActivity", args ?? new GetActivityArgs(), options.WithVersion());
    }


    public sealed class GetActivityArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) that identifies the activity.
        /// </summary>
        [Input("arn")]
        public string? Arn { get; set; }

        /// <summary>
        /// The name that identifies the activity.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetActivityArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetActivityResult
    {
        public readonly string Arn;
        /// <summary>
        /// The date the activity was created.
        /// </summary>
        public readonly string CreationDate;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetActivityResult(
            string arn,

            string creationDate,

            string id,

            string name)
        {
            Arn = arn;
            CreationDate = creationDate;
            Id = id;
            Name = name;
        }
    }
}