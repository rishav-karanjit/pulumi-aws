// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClassifierXmlClassifier {
    /**
     * @return An identifier of the data format that the classifier matches.
     * 
     */
    private final String classification;
    /**
     * @return The XML tag designating the element that contains each record in an XML document being parsed. Note that this cannot identify a self-closing element (closed by `/&gt;`). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, `&lt;row item_a=&#34;A&#34; item_b=&#34;B&#34;&gt;&lt;/row&gt;` is okay, but `&lt;row item_a=&#34;A&#34; item_b=&#34;B&#34; /&gt;` is not).
     * 
     */
    private final String rowTag;

    @CustomType.Constructor
    private ClassifierXmlClassifier(
        @CustomType.Parameter("classification") String classification,
        @CustomType.Parameter("rowTag") String rowTag) {
        this.classification = classification;
        this.rowTag = rowTag;
    }

    /**
     * @return An identifier of the data format that the classifier matches.
     * 
     */
    public String classification() {
        return this.classification;
    }
    /**
     * @return The XML tag designating the element that contains each record in an XML document being parsed. Note that this cannot identify a self-closing element (closed by `/&gt;`). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, `&lt;row item_a=&#34;A&#34; item_b=&#34;B&#34;&gt;&lt;/row&gt;` is okay, but `&lt;row item_a=&#34;A&#34; item_b=&#34;B&#34; /&gt;` is not).
     * 
     */
    public String rowTag() {
        return this.rowTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassifierXmlClassifier defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String classification;
        private String rowTag;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassifierXmlClassifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.rowTag = defaults.rowTag;
        }

        public Builder classification(String classification) {
            this.classification = Objects.requireNonNull(classification);
            return this;
        }
        public Builder rowTag(String rowTag) {
            this.rowTag = Objects.requireNonNull(rowTag);
            return this;
        }        public ClassifierXmlClassifier build() {
            return new ClassifierXmlClassifier(classification, rowTag);
        }
    }
}