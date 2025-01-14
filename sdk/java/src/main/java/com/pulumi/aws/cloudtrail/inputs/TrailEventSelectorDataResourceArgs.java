// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudtrail.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class TrailEventSelectorDataResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrailEventSelectorDataResourceArgs Empty = new TrailEventSelectorDataResourceArgs();

    /**
     * Resource type in which you want to log data events. You can specify only the following value: &#34;AWS::S3::Object&#34;, &#34;AWS::Lambda::Function&#34; and &#34;AWS::DynamoDB::Table&#34;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Resource type in which you want to log data events. You can specify only the following value: &#34;AWS::S3::Object&#34;, &#34;AWS::Lambda::Function&#34; and &#34;AWS::DynamoDB::Table&#34;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * List of ARN strings or partial ARN strings to specify selectors for data audit events over data resources. ARN list is specific to single-valued `type`. For example, `arn:aws:s3:::&lt;bucket name&gt;/` for all objects in a bucket, `arn:aws:s3:::&lt;bucket name&gt;/key` for specific objects, `arn:aws:lambda` for all lambda events within an account, `arn:aws:lambda:&lt;region&gt;:&lt;account number&gt;:function:&lt;function name&gt;` for a specific Lambda function, `arn:aws:dynamodb` for all DDB events for all tables within an account, or `arn:aws:dynamodb:&lt;region&gt;:&lt;account number&gt;:table/&lt;table name&gt;` for a specific DynamoDB table.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return List of ARN strings or partial ARN strings to specify selectors for data audit events over data resources. ARN list is specific to single-valued `type`. For example, `arn:aws:s3:::&lt;bucket name&gt;/` for all objects in a bucket, `arn:aws:s3:::&lt;bucket name&gt;/key` for specific objects, `arn:aws:lambda` for all lambda events within an account, `arn:aws:lambda:&lt;region&gt;:&lt;account number&gt;:function:&lt;function name&gt;` for a specific Lambda function, `arn:aws:dynamodb` for all DDB events for all tables within an account, or `arn:aws:dynamodb:&lt;region&gt;:&lt;account number&gt;:table/&lt;table name&gt;` for a specific DynamoDB table.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private TrailEventSelectorDataResourceArgs() {}

    private TrailEventSelectorDataResourceArgs(TrailEventSelectorDataResourceArgs $) {
        this.type = $.type;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrailEventSelectorDataResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrailEventSelectorDataResourceArgs $;

        public Builder() {
            $ = new TrailEventSelectorDataResourceArgs();
        }

        public Builder(TrailEventSelectorDataResourceArgs defaults) {
            $ = new TrailEventSelectorDataResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Resource type in which you want to log data events. You can specify only the following value: &#34;AWS::S3::Object&#34;, &#34;AWS::Lambda::Function&#34; and &#34;AWS::DynamoDB::Table&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Resource type in which you want to log data events. You can specify only the following value: &#34;AWS::S3::Object&#34;, &#34;AWS::Lambda::Function&#34; and &#34;AWS::DynamoDB::Table&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param values List of ARN strings or partial ARN strings to specify selectors for data audit events over data resources. ARN list is specific to single-valued `type`. For example, `arn:aws:s3:::&lt;bucket name&gt;/` for all objects in a bucket, `arn:aws:s3:::&lt;bucket name&gt;/key` for specific objects, `arn:aws:lambda` for all lambda events within an account, `arn:aws:lambda:&lt;region&gt;:&lt;account number&gt;:function:&lt;function name&gt;` for a specific Lambda function, `arn:aws:dynamodb` for all DDB events for all tables within an account, or `arn:aws:dynamodb:&lt;region&gt;:&lt;account number&gt;:table/&lt;table name&gt;` for a specific DynamoDB table.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values List of ARN strings or partial ARN strings to specify selectors for data audit events over data resources. ARN list is specific to single-valued `type`. For example, `arn:aws:s3:::&lt;bucket name&gt;/` for all objects in a bucket, `arn:aws:s3:::&lt;bucket name&gt;/key` for specific objects, `arn:aws:lambda` for all lambda events within an account, `arn:aws:lambda:&lt;region&gt;:&lt;account number&gt;:function:&lt;function name&gt;` for a specific Lambda function, `arn:aws:dynamodb` for all DDB events for all tables within an account, or `arn:aws:dynamodb:&lt;region&gt;:&lt;account number&gt;:table/&lt;table name&gt;` for a specific DynamoDB table.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values List of ARN strings or partial ARN strings to specify selectors for data audit events over data resources. ARN list is specific to single-valued `type`. For example, `arn:aws:s3:::&lt;bucket name&gt;/` for all objects in a bucket, `arn:aws:s3:::&lt;bucket name&gt;/key` for specific objects, `arn:aws:lambda` for all lambda events within an account, `arn:aws:lambda:&lt;region&gt;:&lt;account number&gt;:function:&lt;function name&gt;` for a specific Lambda function, `arn:aws:dynamodb` for all DDB events for all tables within an account, or `arn:aws:dynamodb:&lt;region&gt;:&lt;account number&gt;:table/&lt;table name&gt;` for a specific DynamoDB table.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public TrailEventSelectorDataResourceArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
