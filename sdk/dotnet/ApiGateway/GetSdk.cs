// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ApiGateway
{
    public static class GetSdk
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.ApiGateway.GetSdk.InvokeAsync(new Aws.ApiGateway.GetSdkArgs
        ///         {
        ///             RestApiId = aws_api_gateway_stage.Example.Rest_api_id,
        ///             StageName = aws_api_gateway_stage.Example.Stage_name,
        ///             SdkType = "android",
        ///             Parameters = 
        ///             {
        ///                 { "groupId", "example" },
        ///                 { "artifactId", "example" },
        ///                 { "artifactVersion", "example" },
        ///                 { "invokerPackage", "example" },
        ///             },
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSdkResult> InvokeAsync(GetSdkArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSdkResult>("aws:apigateway/getSdk:getSdk", args ?? new GetSdkArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.ApiGateway.GetSdk.InvokeAsync(new Aws.ApiGateway.GetSdkArgs
        ///         {
        ///             RestApiId = aws_api_gateway_stage.Example.Rest_api_id,
        ///             StageName = aws_api_gateway_stage.Example.Stage_name,
        ///             SdkType = "android",
        ///             Parameters = 
        ///             {
        ///                 { "groupId", "example" },
        ///                 { "artifactId", "example" },
        ///                 { "artifactVersion", "example" },
        ///                 { "invokerPackage", "example" },
        ///             },
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSdkResult> Invoke(GetSdkInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetSdkResult>("aws:apigateway/getSdk:getSdk", args ?? new GetSdkInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSdkArgs : Pulumi.InvokeArgs
    {
        [Input("parameters")]
        private Dictionary<string, string>? _parameters;

        /// <summary>
        /// A key-value map of query string parameters `sdk_type` properties of the SDK. For SDK Type of `objectivec` or `swift`, a parameter named `classPrefix` is required. For SDK Type of `android`, parameters named `groupId`, `artifactId`, `artifactVersion`, and `invokerPackage` are required. For SDK Type of `java`, parameters named `serviceName` and `javaPackageName` are required.
        /// </summary>
        public Dictionary<string, string> Parameters
        {
            get => _parameters ?? (_parameters = new Dictionary<string, string>());
            set => _parameters = value;
        }

        /// <summary>
        /// The identifier of the associated REST API.
        /// </summary>
        [Input("restApiId", required: true)]
        public string RestApiId { get; set; } = null!;

        /// <summary>
        /// The language for the generated SDK. Currently `java`, `javascript`, `android`, `objectivec` (for iOS), `swift` (for iOS), and `ruby` are supported.
        /// </summary>
        [Input("sdkType", required: true)]
        public string SdkType { get; set; } = null!;

        /// <summary>
        /// The name of the Stage that will be exported.
        /// </summary>
        [Input("stageName", required: true)]
        public string StageName { get; set; } = null!;

        public GetSdkArgs()
        {
        }
    }

    public sealed class GetSdkInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// A key-value map of query string parameters `sdk_type` properties of the SDK. For SDK Type of `objectivec` or `swift`, a parameter named `classPrefix` is required. For SDK Type of `android`, parameters named `groupId`, `artifactId`, `artifactVersion`, and `invokerPackage` are required. For SDK Type of `java`, parameters named `serviceName` and `javaPackageName` are required.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// The identifier of the associated REST API.
        /// </summary>
        [Input("restApiId", required: true)]
        public Input<string> RestApiId { get; set; } = null!;

        /// <summary>
        /// The language for the generated SDK. Currently `java`, `javascript`, `android`, `objectivec` (for iOS), `swift` (for iOS), and `ruby` are supported.
        /// </summary>
        [Input("sdkType", required: true)]
        public Input<string> SdkType { get; set; } = null!;

        /// <summary>
        /// The name of the Stage that will be exported.
        /// </summary>
        [Input("stageName", required: true)]
        public Input<string> StageName { get; set; } = null!;

        public GetSdkInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetSdkResult
    {
        /// <summary>
        /// The SDK as a string.
        /// </summary>
        public readonly string Body;
        /// <summary>
        /// The content-disposition header value in the HTTP response.
        /// </summary>
        public readonly string ContentDisposition;
        /// <summary>
        /// The content-type header value in the HTTP response.
        /// </summary>
        public readonly string ContentType;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableDictionary<string, string>? Parameters;
        public readonly string RestApiId;
        public readonly string SdkType;
        public readonly string StageName;

        [OutputConstructor]
        private GetSdkResult(
            string body,

            string contentDisposition,

            string contentType,

            string id,

            ImmutableDictionary<string, string>? parameters,

            string restApiId,

            string sdkType,

            string stageName)
        {
            Body = body;
            ContentDisposition = contentDisposition;
            ContentType = contentType;
            Id = id;
            Parameters = parameters;
            RestApiId = restApiId;
            SdkType = sdkType;
            StageName = stageName;
        }
    }
}