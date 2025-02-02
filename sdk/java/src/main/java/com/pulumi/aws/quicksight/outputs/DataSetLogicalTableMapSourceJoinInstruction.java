// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.aws.quicksight.outputs.DataSetLogicalTableMapSourceJoinInstructionLeftJoinKeyProperties;
import com.pulumi.aws.quicksight.outputs.DataSetLogicalTableMapSourceJoinInstructionRightJoinKeyProperties;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSetLogicalTableMapSourceJoinInstruction {
    /**
     * @return Join key properties of the left operand. See left_join_key_properties.
     * 
     */
    private @Nullable DataSetLogicalTableMapSourceJoinInstructionLeftJoinKeyProperties leftJoinKeyProperties;
    /**
     * @return Operand on the left side of a join.
     * 
     */
    private String leftOperand;
    /**
     * @return Join instructions provided in the ON clause of a join.
     * 
     */
    private String onClause;
    /**
     * @return Join key properties of the right operand. See right_join_key_properties.
     * 
     */
    private @Nullable DataSetLogicalTableMapSourceJoinInstructionRightJoinKeyProperties rightJoinKeyProperties;
    /**
     * @return Operand on the right side of a join.
     * 
     */
    private String rightOperand;
    /**
     * @return Type of join. Valid values are `INNER`, `OUTER`, `LEFT`, and `RIGHT`.
     * 
     */
    private String type;

    private DataSetLogicalTableMapSourceJoinInstruction() {}
    /**
     * @return Join key properties of the left operand. See left_join_key_properties.
     * 
     */
    public Optional<DataSetLogicalTableMapSourceJoinInstructionLeftJoinKeyProperties> leftJoinKeyProperties() {
        return Optional.ofNullable(this.leftJoinKeyProperties);
    }
    /**
     * @return Operand on the left side of a join.
     * 
     */
    public String leftOperand() {
        return this.leftOperand;
    }
    /**
     * @return Join instructions provided in the ON clause of a join.
     * 
     */
    public String onClause() {
        return this.onClause;
    }
    /**
     * @return Join key properties of the right operand. See right_join_key_properties.
     * 
     */
    public Optional<DataSetLogicalTableMapSourceJoinInstructionRightJoinKeyProperties> rightJoinKeyProperties() {
        return Optional.ofNullable(this.rightJoinKeyProperties);
    }
    /**
     * @return Operand on the right side of a join.
     * 
     */
    public String rightOperand() {
        return this.rightOperand;
    }
    /**
     * @return Type of join. Valid values are `INNER`, `OUTER`, `LEFT`, and `RIGHT`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetLogicalTableMapSourceJoinInstruction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DataSetLogicalTableMapSourceJoinInstructionLeftJoinKeyProperties leftJoinKeyProperties;
        private String leftOperand;
        private String onClause;
        private @Nullable DataSetLogicalTableMapSourceJoinInstructionRightJoinKeyProperties rightJoinKeyProperties;
        private String rightOperand;
        private String type;
        public Builder() {}
        public Builder(DataSetLogicalTableMapSourceJoinInstruction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.leftJoinKeyProperties = defaults.leftJoinKeyProperties;
    	      this.leftOperand = defaults.leftOperand;
    	      this.onClause = defaults.onClause;
    	      this.rightJoinKeyProperties = defaults.rightJoinKeyProperties;
    	      this.rightOperand = defaults.rightOperand;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder leftJoinKeyProperties(@Nullable DataSetLogicalTableMapSourceJoinInstructionLeftJoinKeyProperties leftJoinKeyProperties) {
            this.leftJoinKeyProperties = leftJoinKeyProperties;
            return this;
        }
        @CustomType.Setter
        public Builder leftOperand(String leftOperand) {
            this.leftOperand = Objects.requireNonNull(leftOperand);
            return this;
        }
        @CustomType.Setter
        public Builder onClause(String onClause) {
            this.onClause = Objects.requireNonNull(onClause);
            return this;
        }
        @CustomType.Setter
        public Builder rightJoinKeyProperties(@Nullable DataSetLogicalTableMapSourceJoinInstructionRightJoinKeyProperties rightJoinKeyProperties) {
            this.rightJoinKeyProperties = rightJoinKeyProperties;
            return this;
        }
        @CustomType.Setter
        public Builder rightOperand(String rightOperand) {
            this.rightOperand = Objects.requireNonNull(rightOperand);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DataSetLogicalTableMapSourceJoinInstruction build() {
            final var o = new DataSetLogicalTableMapSourceJoinInstruction();
            o.leftJoinKeyProperties = leftJoinKeyProperties;
            o.leftOperand = leftOperand;
            o.onClause = onClause;
            o.rightJoinKeyProperties = rightJoinKeyProperties;
            o.rightOperand = rightOperand;
            o.type = type;
            return o;
        }
    }
}
