// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecr.inputs.GetAuthorizationTokenArgs;
import com.pulumi.aws.ecr.inputs.GetAuthorizationTokenPlainArgs;
import com.pulumi.aws.ecr.inputs.GetCredentialsArgs;
import com.pulumi.aws.ecr.inputs.GetCredentialsPlainArgs;
import com.pulumi.aws.ecr.inputs.GetImageArgs;
import com.pulumi.aws.ecr.inputs.GetImagePlainArgs;
import com.pulumi.aws.ecr.inputs.GetRepositoryArgs;
import com.pulumi.aws.ecr.inputs.GetRepositoryPlainArgs;
import com.pulumi.aws.ecr.outputs.GetAuthorizationTokenResult;
import com.pulumi.aws.ecr.outputs.GetCredentialsResult;
import com.pulumi.aws.ecr.outputs.GetImageResult;
import com.pulumi.aws.ecr.outputs.GetRepositoryResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class EcrFunctions {
    /**
     * The ECR Authorization Token data source allows the authorization token, proxy endpoint, token expiration date, user name and password to be retrieved for an ECR repository.
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
     *         final var token = Output.of(EcrFunctions.getAuthorizationToken());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAuthorizationTokenResult> getAuthorizationToken() {
        return getAuthorizationToken(GetAuthorizationTokenArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * The ECR Authorization Token data source allows the authorization token, proxy endpoint, token expiration date, user name and password to be retrieved for an ECR repository.
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
     *         final var token = Output.of(EcrFunctions.getAuthorizationToken());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAuthorizationTokenResult> getAuthorizationTokenPlain() {
        return getAuthorizationTokenPlain(GetAuthorizationTokenPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * The ECR Authorization Token data source allows the authorization token, proxy endpoint, token expiration date, user name and password to be retrieved for an ECR repository.
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
     *         final var token = Output.of(EcrFunctions.getAuthorizationToken());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAuthorizationTokenResult> getAuthorizationToken(GetAuthorizationTokenArgs args) {
        return getAuthorizationToken(args, InvokeOptions.Empty);
    }
    /**
     * The ECR Authorization Token data source allows the authorization token, proxy endpoint, token expiration date, user name and password to be retrieved for an ECR repository.
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
     *         final var token = Output.of(EcrFunctions.getAuthorizationToken());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAuthorizationTokenResult> getAuthorizationTokenPlain(GetAuthorizationTokenPlainArgs args) {
        return getAuthorizationTokenPlain(args, InvokeOptions.Empty);
    }
    /**
     * The ECR Authorization Token data source allows the authorization token, proxy endpoint, token expiration date, user name and password to be retrieved for an ECR repository.
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
     *         final var token = Output.of(EcrFunctions.getAuthorizationToken());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAuthorizationTokenResult> getAuthorizationToken(GetAuthorizationTokenArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ecr/getAuthorizationToken:getAuthorizationToken", TypeShape.of(GetAuthorizationTokenResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The ECR Authorization Token data source allows the authorization token, proxy endpoint, token expiration date, user name and password to be retrieved for an ECR repository.
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
     *         final var token = Output.of(EcrFunctions.getAuthorizationToken());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAuthorizationTokenResult> getAuthorizationTokenPlain(GetAuthorizationTokenPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecr/getAuthorizationToken:getAuthorizationToken", TypeShape.of(GetAuthorizationTokenResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetCredentialsResult> getCredentials(GetCredentialsArgs args) {
        return getCredentials(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCredentialsResult> getCredentialsPlain(GetCredentialsPlainArgs args) {
        return getCredentialsPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetCredentialsResult> getCredentials(GetCredentialsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ecr/getCredentials:getCredentials", TypeShape.of(GetCredentialsResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetCredentialsResult> getCredentialsPlain(GetCredentialsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecr/getCredentials:getCredentials", TypeShape.of(GetCredentialsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The ECR Image data source allows the details of an image with a particular tag or digest to be retrieved.
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
     *         final var serviceImage = Output.of(EcrFunctions.getImage(GetImageArgs.builder()
     *             .imageTag(&#34;latest&#34;)
     *             .repositoryName(&#34;my/service&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetImageResult> getImage(GetImageArgs args) {
        return getImage(args, InvokeOptions.Empty);
    }
    /**
     * The ECR Image data source allows the details of an image with a particular tag or digest to be retrieved.
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
     *         final var serviceImage = Output.of(EcrFunctions.getImage(GetImageArgs.builder()
     *             .imageTag(&#34;latest&#34;)
     *             .repositoryName(&#34;my/service&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetImageResult> getImagePlain(GetImagePlainArgs args) {
        return getImagePlain(args, InvokeOptions.Empty);
    }
    /**
     * The ECR Image data source allows the details of an image with a particular tag or digest to be retrieved.
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
     *         final var serviceImage = Output.of(EcrFunctions.getImage(GetImageArgs.builder()
     *             .imageTag(&#34;latest&#34;)
     *             .repositoryName(&#34;my/service&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetImageResult> getImage(GetImageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ecr/getImage:getImage", TypeShape.of(GetImageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The ECR Image data source allows the details of an image with a particular tag or digest to be retrieved.
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
     *         final var serviceImage = Output.of(EcrFunctions.getImage(GetImageArgs.builder()
     *             .imageTag(&#34;latest&#34;)
     *             .repositoryName(&#34;my/service&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetImageResult> getImagePlain(GetImagePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecr/getImage:getImage", TypeShape.of(GetImageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The ECR Repository data source allows the ARN, Repository URI and Registry ID to be retrieved for an ECR repository.
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
     *         final var service = Output.of(EcrFunctions.getRepository(GetRepositoryArgs.builder()
     *             .name(&#34;ecr-repository&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetRepositoryResult> getRepository(GetRepositoryArgs args) {
        return getRepository(args, InvokeOptions.Empty);
    }
    /**
     * The ECR Repository data source allows the ARN, Repository URI and Registry ID to be retrieved for an ECR repository.
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
     *         final var service = Output.of(EcrFunctions.getRepository(GetRepositoryArgs.builder()
     *             .name(&#34;ecr-repository&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRepositoryResult> getRepositoryPlain(GetRepositoryPlainArgs args) {
        return getRepositoryPlain(args, InvokeOptions.Empty);
    }
    /**
     * The ECR Repository data source allows the ARN, Repository URI and Registry ID to be retrieved for an ECR repository.
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
     *         final var service = Output.of(EcrFunctions.getRepository(GetRepositoryArgs.builder()
     *             .name(&#34;ecr-repository&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetRepositoryResult> getRepository(GetRepositoryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ecr/getRepository:getRepository", TypeShape.of(GetRepositoryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The ECR Repository data source allows the ARN, Repository URI and Registry ID to be retrieved for an ECR repository.
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
     *         final var service = Output.of(EcrFunctions.getRepository(GetRepositoryArgs.builder()
     *             .name(&#34;ecr-repository&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRepositoryResult> getRepositoryPlain(GetRepositoryPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecr/getRepository:getRepository", TypeShape.of(GetRepositoryResult.class), args, Utilities.withVersion(options));
    }
}