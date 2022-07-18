// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.costexplorer.inputs.GetCostCategoryArgs;
import com.pulumi.aws.costexplorer.inputs.GetCostCategoryPlainArgs;
import com.pulumi.aws.costexplorer.inputs.GetTagsArgs;
import com.pulumi.aws.costexplorer.inputs.GetTagsPlainArgs;
import com.pulumi.aws.costexplorer.outputs.GetCostCategoryResult;
import com.pulumi.aws.costexplorer.outputs.GetTagsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CostexplorerFunctions {
    /**
     * Provides details about a specific CostExplorer Cost Category.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(CostexplorerFunctions.getCostCategory(GetCostCategoryArgs.builder()
     *             .costCategoryArn(&#34;costCategoryARN&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetCostCategoryResult> getCostCategory(GetCostCategoryArgs args) {
        return getCostCategory(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about a specific CostExplorer Cost Category.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(CostexplorerFunctions.getCostCategory(GetCostCategoryArgs.builder()
     *             .costCategoryArn(&#34;costCategoryARN&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCostCategoryResult> getCostCategoryPlain(GetCostCategoryPlainArgs args) {
        return getCostCategoryPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about a specific CostExplorer Cost Category.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(CostexplorerFunctions.getCostCategory(GetCostCategoryArgs.builder()
     *             .costCategoryArn(&#34;costCategoryARN&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetCostCategoryResult> getCostCategory(GetCostCategoryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:costexplorer/getCostCategory:getCostCategory", TypeShape.of(GetCostCategoryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a specific CostExplorer Cost Category.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = Output.of(CostexplorerFunctions.getCostCategory(GetCostCategoryArgs.builder()
     *             .costCategoryArn(&#34;costCategoryARN&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCostCategoryResult> getCostCategoryPlain(GetCostCategoryPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:costexplorer/getCostCategory:getCostCategory", TypeShape.of(GetCostCategoryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a specific CE Tags.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = Output.of(CostexplorerFunctions.getTags(GetTagsArgs.builder()
     *             .timePeriod(GetTagsTimePeriodArgs.builder()
     *                 .end(&#34;2022-12-01&#34;)
     *                 .start(&#34;2021-01-01&#34;)
     *                 .build())
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetTagsResult> getTags(GetTagsArgs args) {
        return getTags(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about a specific CE Tags.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = Output.of(CostexplorerFunctions.getTags(GetTagsArgs.builder()
     *             .timePeriod(GetTagsTimePeriodArgs.builder()
     *                 .end(&#34;2022-12-01&#34;)
     *                 .start(&#34;2021-01-01&#34;)
     *                 .build())
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTagsResult> getTagsPlain(GetTagsPlainArgs args) {
        return getTagsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about a specific CE Tags.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = Output.of(CostexplorerFunctions.getTags(GetTagsArgs.builder()
     *             .timePeriod(GetTagsTimePeriodArgs.builder()
     *                 .end(&#34;2022-12-01&#34;)
     *                 .start(&#34;2021-01-01&#34;)
     *                 .build())
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetTagsResult> getTags(GetTagsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:costexplorer/getTags:getTags", TypeShape.of(GetTagsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a specific CE Tags.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = Output.of(CostexplorerFunctions.getTags(GetTagsArgs.builder()
     *             .timePeriod(GetTagsTimePeriodArgs.builder()
     *                 .end(&#34;2022-12-01&#34;)
     *                 .start(&#34;2021-01-01&#34;)
     *                 .build())
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTagsResult> getTagsPlain(GetTagsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:costexplorer/getTags:getTags", TypeShape.of(GetTagsResult.class), args, Utilities.withVersion(options));
    }
}