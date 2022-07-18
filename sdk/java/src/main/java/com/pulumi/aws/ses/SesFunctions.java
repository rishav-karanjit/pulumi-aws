// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ses.inputs.GetDomainIdentityArgs;
import com.pulumi.aws.ses.inputs.GetDomainIdentityPlainArgs;
import com.pulumi.aws.ses.inputs.GetEmailIdentityArgs;
import com.pulumi.aws.ses.inputs.GetEmailIdentityPlainArgs;
import com.pulumi.aws.ses.outputs.GetActiveReceiptRuleSetResult;
import com.pulumi.aws.ses.outputs.GetDomainIdentityResult;
import com.pulumi.aws.ses.outputs.GetEmailIdentityResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class SesFunctions {
    /**
     * Retrieve the active SES receipt rule set
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
     *         final var main = Output.of(SesFunctions.getActiveReceiptRuleSet());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetActiveReceiptRuleSetResult> getActiveReceiptRuleSet() {
        return getActiveReceiptRuleSet(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieve the active SES receipt rule set
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
     *         final var main = Output.of(SesFunctions.getActiveReceiptRuleSet());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetActiveReceiptRuleSetResult> getActiveReceiptRuleSetPlain() {
        return getActiveReceiptRuleSetPlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieve the active SES receipt rule set
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
     *         final var main = Output.of(SesFunctions.getActiveReceiptRuleSet());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetActiveReceiptRuleSetResult> getActiveReceiptRuleSet(InvokeArgs args) {
        return getActiveReceiptRuleSet(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve the active SES receipt rule set
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
     *         final var main = Output.of(SesFunctions.getActiveReceiptRuleSet());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetActiveReceiptRuleSetResult> getActiveReceiptRuleSetPlain(InvokeArgs args) {
        return getActiveReceiptRuleSetPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve the active SES receipt rule set
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
     *         final var main = Output.of(SesFunctions.getActiveReceiptRuleSet());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetActiveReceiptRuleSetResult> getActiveReceiptRuleSet(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ses/getActiveReceiptRuleSet:getActiveReceiptRuleSet", TypeShape.of(GetActiveReceiptRuleSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve the active SES receipt rule set
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
     *         final var main = Output.of(SesFunctions.getActiveReceiptRuleSet());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetActiveReceiptRuleSetResult> getActiveReceiptRuleSetPlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ses/getActiveReceiptRuleSet:getActiveReceiptRuleSet", TypeShape.of(GetActiveReceiptRuleSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve the SES domain identity
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
     *         final var example = Output.of(SesFunctions.getDomainIdentity(GetDomainIdentityArgs.builder()
     *             .domain(&#34;example.com&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDomainIdentityResult> getDomainIdentity(GetDomainIdentityArgs args) {
        return getDomainIdentity(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve the SES domain identity
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
     *         final var example = Output.of(SesFunctions.getDomainIdentity(GetDomainIdentityArgs.builder()
     *             .domain(&#34;example.com&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDomainIdentityResult> getDomainIdentityPlain(GetDomainIdentityPlainArgs args) {
        return getDomainIdentityPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve the SES domain identity
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
     *         final var example = Output.of(SesFunctions.getDomainIdentity(GetDomainIdentityArgs.builder()
     *             .domain(&#34;example.com&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDomainIdentityResult> getDomainIdentity(GetDomainIdentityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ses/getDomainIdentity:getDomainIdentity", TypeShape.of(GetDomainIdentityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve the SES domain identity
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
     *         final var example = Output.of(SesFunctions.getDomainIdentity(GetDomainIdentityArgs.builder()
     *             .domain(&#34;example.com&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDomainIdentityResult> getDomainIdentityPlain(GetDomainIdentityPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ses/getDomainIdentity:getDomainIdentity", TypeShape.of(GetDomainIdentityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve the active SES email identity
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
     *         final var example = Output.of(SesFunctions.getEmailIdentity(GetEmailIdentityArgs.builder()
     *             .email(&#34;awesome@example.com&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetEmailIdentityResult> getEmailIdentity(GetEmailIdentityArgs args) {
        return getEmailIdentity(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve the active SES email identity
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
     *         final var example = Output.of(SesFunctions.getEmailIdentity(GetEmailIdentityArgs.builder()
     *             .email(&#34;awesome@example.com&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetEmailIdentityResult> getEmailIdentityPlain(GetEmailIdentityPlainArgs args) {
        return getEmailIdentityPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve the active SES email identity
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
     *         final var example = Output.of(SesFunctions.getEmailIdentity(GetEmailIdentityArgs.builder()
     *             .email(&#34;awesome@example.com&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetEmailIdentityResult> getEmailIdentity(GetEmailIdentityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ses/getEmailIdentity:getEmailIdentity", TypeShape.of(GetEmailIdentityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve the active SES email identity
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
     *         final var example = Output.of(SesFunctions.getEmailIdentity(GetEmailIdentityArgs.builder()
     *             .email(&#34;awesome@example.com&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetEmailIdentityResult> getEmailIdentityPlain(GetEmailIdentityPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ses/getEmailIdentity:getEmailIdentity", TypeShape.of(GetEmailIdentityResult.class), args, Utilities.withVersion(options));
    }
}