// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/config.proto

package org.tensorflow.framework;

/**
 * <pre>
 * Options passed to the graph optimizer
 * </pre>
 *
 * Protobuf type {@code tensorflow.OptimizerOptions}
 */
public  final class OptimizerOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.OptimizerOptions)
    OptimizerOptionsOrBuilder {
  // Use OptimizerOptions.newBuilder() to construct.
  private OptimizerOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OptimizerOptions() {
    doCommonSubexpressionElimination_ = false;
    doConstantFolding_ = false;
    doFunctionInlining_ = false;
    optLevel_ = 0;
    globalJitLevel_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private OptimizerOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            doCommonSubexpressionElimination_ = input.readBool();
            break;
          }
          case 16: {

            doConstantFolding_ = input.readBool();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            optLevel_ = rawValue;
            break;
          }
          case 32: {

            doFunctionInlining_ = input.readBool();
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            globalJitLevel_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_OptimizerOptions_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_OptimizerOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.OptimizerOptions.class, org.tensorflow.framework.OptimizerOptions.Builder.class);
  }

  /**
   * <pre>
   * Optimization level
   * </pre>
   *
   * Protobuf enum {@code tensorflow.OptimizerOptions.Level}
   */
  public enum Level
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * L1 is the default level.
     * Optimization performed at L1 :
     * 1. Common subexpression elimination
     * 2. Constant folding
     * </pre>
     *
     * <code>L1 = 0;</code>
     */
    L1(0),
    /**
     * <pre>
     * No optimizations
     * </pre>
     *
     * <code>L0 = -1;</code>
     */
    L0(-1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * L1 is the default level.
     * Optimization performed at L1 :
     * 1. Common subexpression elimination
     * 2. Constant folding
     * </pre>
     *
     * <code>L1 = 0;</code>
     */
    public static final int L1_VALUE = 0;
    /**
     * <pre>
     * No optimizations
     * </pre>
     *
     * <code>L0 = -1;</code>
     */
    public static final int L0_VALUE = -1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Level valueOf(int value) {
      return forNumber(value);
    }

    public static Level forNumber(int value) {
      switch (value) {
        case 0: return L1;
        case -1: return L0;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Level>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Level> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Level>() {
            public Level findValueByNumber(int number) {
              return Level.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.tensorflow.framework.OptimizerOptions.getDescriptor().getEnumTypes().get(0);
    }

    private static final Level[] VALUES = values();

    public static Level valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Level(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:tensorflow.OptimizerOptions.Level)
  }

  /**
   * <pre>
   * Control the use of the compiler/jit.  Experimental.
   * </pre>
   *
   * Protobuf enum {@code tensorflow.OptimizerOptions.GlobalJitLevel}
   */
  public enum GlobalJitLevel
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default setting ("off" now, but later expected to be "on")
     * </pre>
     *
     * <code>DEFAULT = 0;</code>
     */
    DEFAULT(0),
    /**
     * <code>OFF = -1;</code>
     */
    OFF(-1),
    /**
     * <pre>
     * The following settings turn on compilation, with higher values being
     * more aggressive.  Higher values may reduce opportunities for parallelism
     * and may use more memory.  (At present, there is no distinction, but this
     * is expected to change.)
     * </pre>
     *
     * <code>ON_1 = 1;</code>
     */
    ON_1(1),
    /**
     * <code>ON_2 = 2;</code>
     */
    ON_2(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Default setting ("off" now, but later expected to be "on")
     * </pre>
     *
     * <code>DEFAULT = 0;</code>
     */
    public static final int DEFAULT_VALUE = 0;
    /**
     * <code>OFF = -1;</code>
     */
    public static final int OFF_VALUE = -1;
    /**
     * <pre>
     * The following settings turn on compilation, with higher values being
     * more aggressive.  Higher values may reduce opportunities for parallelism
     * and may use more memory.  (At present, there is no distinction, but this
     * is expected to change.)
     * </pre>
     *
     * <code>ON_1 = 1;</code>
     */
    public static final int ON_1_VALUE = 1;
    /**
     * <code>ON_2 = 2;</code>
     */
    public static final int ON_2_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GlobalJitLevel valueOf(int value) {
      return forNumber(value);
    }

    public static GlobalJitLevel forNumber(int value) {
      switch (value) {
        case 0: return DEFAULT;
        case -1: return OFF;
        case 1: return ON_1;
        case 2: return ON_2;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GlobalJitLevel>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GlobalJitLevel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GlobalJitLevel>() {
            public GlobalJitLevel findValueByNumber(int number) {
              return GlobalJitLevel.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.tensorflow.framework.OptimizerOptions.getDescriptor().getEnumTypes().get(1);
    }

    private static final GlobalJitLevel[] VALUES = values();

    public static GlobalJitLevel valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private GlobalJitLevel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:tensorflow.OptimizerOptions.GlobalJitLevel)
  }

  public static final int DO_COMMON_SUBEXPRESSION_ELIMINATION_FIELD_NUMBER = 1;
  private boolean doCommonSubexpressionElimination_;
  /**
   * <pre>
   * If true, optimize the graph using common subexpression elimination.
   * </pre>
   *
   * <code>bool do_common_subexpression_elimination = 1;</code>
   */
  public boolean getDoCommonSubexpressionElimination() {
    return doCommonSubexpressionElimination_;
  }

  public static final int DO_CONSTANT_FOLDING_FIELD_NUMBER = 2;
  private boolean doConstantFolding_;
  /**
   * <pre>
   * If true, perform constant folding optimization on the graph.
   * </pre>
   *
   * <code>bool do_constant_folding = 2;</code>
   */
  public boolean getDoConstantFolding() {
    return doConstantFolding_;
  }

  public static final int DO_FUNCTION_INLINING_FIELD_NUMBER = 4;
  private boolean doFunctionInlining_;
  /**
   * <pre>
   * If true, perform function inlining on the graph.
   * </pre>
   *
   * <code>bool do_function_inlining = 4;</code>
   */
  public boolean getDoFunctionInlining() {
    return doFunctionInlining_;
  }

  public static final int OPT_LEVEL_FIELD_NUMBER = 3;
  private int optLevel_;
  /**
   * <code>.tensorflow.OptimizerOptions.Level opt_level = 3;</code>
   */
  public int getOptLevelValue() {
    return optLevel_;
  }
  /**
   * <code>.tensorflow.OptimizerOptions.Level opt_level = 3;</code>
   */
  public org.tensorflow.framework.OptimizerOptions.Level getOptLevel() {
    org.tensorflow.framework.OptimizerOptions.Level result = org.tensorflow.framework.OptimizerOptions.Level.valueOf(optLevel_);
    return result == null ? org.tensorflow.framework.OptimizerOptions.Level.UNRECOGNIZED : result;
  }

  public static final int GLOBAL_JIT_LEVEL_FIELD_NUMBER = 5;
  private int globalJitLevel_;
  /**
   * <code>.tensorflow.OptimizerOptions.GlobalJitLevel global_jit_level = 5;</code>
   */
  public int getGlobalJitLevelValue() {
    return globalJitLevel_;
  }
  /**
   * <code>.tensorflow.OptimizerOptions.GlobalJitLevel global_jit_level = 5;</code>
   */
  public org.tensorflow.framework.OptimizerOptions.GlobalJitLevel getGlobalJitLevel() {
    org.tensorflow.framework.OptimizerOptions.GlobalJitLevel result = org.tensorflow.framework.OptimizerOptions.GlobalJitLevel.valueOf(globalJitLevel_);
    return result == null ? org.tensorflow.framework.OptimizerOptions.GlobalJitLevel.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (doCommonSubexpressionElimination_ != false) {
      output.writeBool(1, doCommonSubexpressionElimination_);
    }
    if (doConstantFolding_ != false) {
      output.writeBool(2, doConstantFolding_);
    }
    if (optLevel_ != org.tensorflow.framework.OptimizerOptions.Level.L1.getNumber()) {
      output.writeEnum(3, optLevel_);
    }
    if (doFunctionInlining_ != false) {
      output.writeBool(4, doFunctionInlining_);
    }
    if (globalJitLevel_ != org.tensorflow.framework.OptimizerOptions.GlobalJitLevel.DEFAULT.getNumber()) {
      output.writeEnum(5, globalJitLevel_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (doCommonSubexpressionElimination_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, doCommonSubexpressionElimination_);
    }
    if (doConstantFolding_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, doConstantFolding_);
    }
    if (optLevel_ != org.tensorflow.framework.OptimizerOptions.Level.L1.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, optLevel_);
    }
    if (doFunctionInlining_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, doFunctionInlining_);
    }
    if (globalJitLevel_ != org.tensorflow.framework.OptimizerOptions.GlobalJitLevel.DEFAULT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, globalJitLevel_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.framework.OptimizerOptions)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.OptimizerOptions other = (org.tensorflow.framework.OptimizerOptions) obj;

    boolean result = true;
    result = result && (getDoCommonSubexpressionElimination()
        == other.getDoCommonSubexpressionElimination());
    result = result && (getDoConstantFolding()
        == other.getDoConstantFolding());
    result = result && (getDoFunctionInlining()
        == other.getDoFunctionInlining());
    result = result && optLevel_ == other.optLevel_;
    result = result && globalJitLevel_ == other.globalJitLevel_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DO_COMMON_SUBEXPRESSION_ELIMINATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDoCommonSubexpressionElimination());
    hash = (37 * hash) + DO_CONSTANT_FOLDING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDoConstantFolding());
    hash = (37 * hash) + DO_FUNCTION_INLINING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDoFunctionInlining());
    hash = (37 * hash) + OPT_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + optLevel_;
    hash = (37 * hash) + GLOBAL_JIT_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + globalJitLevel_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.OptimizerOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.OptimizerOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.OptimizerOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.OptimizerOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.OptimizerOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.OptimizerOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.OptimizerOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.OptimizerOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.OptimizerOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.OptimizerOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.framework.OptimizerOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Options passed to the graph optimizer
   * </pre>
   *
   * Protobuf type {@code tensorflow.OptimizerOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.OptimizerOptions)
      org.tensorflow.framework.OptimizerOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_OptimizerOptions_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_OptimizerOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.OptimizerOptions.class, org.tensorflow.framework.OptimizerOptions.Builder.class);
    }

    // Construct using org.tensorflow.framework.OptimizerOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      doCommonSubexpressionElimination_ = false;

      doConstantFolding_ = false;

      doFunctionInlining_ = false;

      optLevel_ = 0;

      globalJitLevel_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.ConfigProtos.internal_static_tensorflow_OptimizerOptions_descriptor;
    }

    public org.tensorflow.framework.OptimizerOptions getDefaultInstanceForType() {
      return org.tensorflow.framework.OptimizerOptions.getDefaultInstance();
    }

    public org.tensorflow.framework.OptimizerOptions build() {
      org.tensorflow.framework.OptimizerOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tensorflow.framework.OptimizerOptions buildPartial() {
      org.tensorflow.framework.OptimizerOptions result = new org.tensorflow.framework.OptimizerOptions(this);
      result.doCommonSubexpressionElimination_ = doCommonSubexpressionElimination_;
      result.doConstantFolding_ = doConstantFolding_;
      result.doFunctionInlining_ = doFunctionInlining_;
      result.optLevel_ = optLevel_;
      result.globalJitLevel_ = globalJitLevel_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.framework.OptimizerOptions) {
        return mergeFrom((org.tensorflow.framework.OptimizerOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.OptimizerOptions other) {
      if (other == org.tensorflow.framework.OptimizerOptions.getDefaultInstance()) return this;
      if (other.getDoCommonSubexpressionElimination() != false) {
        setDoCommonSubexpressionElimination(other.getDoCommonSubexpressionElimination());
      }
      if (other.getDoConstantFolding() != false) {
        setDoConstantFolding(other.getDoConstantFolding());
      }
      if (other.getDoFunctionInlining() != false) {
        setDoFunctionInlining(other.getDoFunctionInlining());
      }
      if (other.optLevel_ != 0) {
        setOptLevelValue(other.getOptLevelValue());
      }
      if (other.globalJitLevel_ != 0) {
        setGlobalJitLevelValue(other.getGlobalJitLevelValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.framework.OptimizerOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.OptimizerOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean doCommonSubexpressionElimination_ ;
    /**
     * <pre>
     * If true, optimize the graph using common subexpression elimination.
     * </pre>
     *
     * <code>bool do_common_subexpression_elimination = 1;</code>
     */
    public boolean getDoCommonSubexpressionElimination() {
      return doCommonSubexpressionElimination_;
    }
    /**
     * <pre>
     * If true, optimize the graph using common subexpression elimination.
     * </pre>
     *
     * <code>bool do_common_subexpression_elimination = 1;</code>
     */
    public Builder setDoCommonSubexpressionElimination(boolean value) {
      
      doCommonSubexpressionElimination_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, optimize the graph using common subexpression elimination.
     * </pre>
     *
     * <code>bool do_common_subexpression_elimination = 1;</code>
     */
    public Builder clearDoCommonSubexpressionElimination() {
      
      doCommonSubexpressionElimination_ = false;
      onChanged();
      return this;
    }

    private boolean doConstantFolding_ ;
    /**
     * <pre>
     * If true, perform constant folding optimization on the graph.
     * </pre>
     *
     * <code>bool do_constant_folding = 2;</code>
     */
    public boolean getDoConstantFolding() {
      return doConstantFolding_;
    }
    /**
     * <pre>
     * If true, perform constant folding optimization on the graph.
     * </pre>
     *
     * <code>bool do_constant_folding = 2;</code>
     */
    public Builder setDoConstantFolding(boolean value) {
      
      doConstantFolding_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, perform constant folding optimization on the graph.
     * </pre>
     *
     * <code>bool do_constant_folding = 2;</code>
     */
    public Builder clearDoConstantFolding() {
      
      doConstantFolding_ = false;
      onChanged();
      return this;
    }

    private boolean doFunctionInlining_ ;
    /**
     * <pre>
     * If true, perform function inlining on the graph.
     * </pre>
     *
     * <code>bool do_function_inlining = 4;</code>
     */
    public boolean getDoFunctionInlining() {
      return doFunctionInlining_;
    }
    /**
     * <pre>
     * If true, perform function inlining on the graph.
     * </pre>
     *
     * <code>bool do_function_inlining = 4;</code>
     */
    public Builder setDoFunctionInlining(boolean value) {
      
      doFunctionInlining_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, perform function inlining on the graph.
     * </pre>
     *
     * <code>bool do_function_inlining = 4;</code>
     */
    public Builder clearDoFunctionInlining() {
      
      doFunctionInlining_ = false;
      onChanged();
      return this;
    }

    private int optLevel_ = 0;
    /**
     * <code>.tensorflow.OptimizerOptions.Level opt_level = 3;</code>
     */
    public int getOptLevelValue() {
      return optLevel_;
    }
    /**
     * <code>.tensorflow.OptimizerOptions.Level opt_level = 3;</code>
     */
    public Builder setOptLevelValue(int value) {
      optLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.OptimizerOptions.Level opt_level = 3;</code>
     */
    public org.tensorflow.framework.OptimizerOptions.Level getOptLevel() {
      org.tensorflow.framework.OptimizerOptions.Level result = org.tensorflow.framework.OptimizerOptions.Level.valueOf(optLevel_);
      return result == null ? org.tensorflow.framework.OptimizerOptions.Level.UNRECOGNIZED : result;
    }
    /**
     * <code>.tensorflow.OptimizerOptions.Level opt_level = 3;</code>
     */
    public Builder setOptLevel(org.tensorflow.framework.OptimizerOptions.Level value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      optLevel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.OptimizerOptions.Level opt_level = 3;</code>
     */
    public Builder clearOptLevel() {
      
      optLevel_ = 0;
      onChanged();
      return this;
    }

    private int globalJitLevel_ = 0;
    /**
     * <code>.tensorflow.OptimizerOptions.GlobalJitLevel global_jit_level = 5;</code>
     */
    public int getGlobalJitLevelValue() {
      return globalJitLevel_;
    }
    /**
     * <code>.tensorflow.OptimizerOptions.GlobalJitLevel global_jit_level = 5;</code>
     */
    public Builder setGlobalJitLevelValue(int value) {
      globalJitLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.OptimizerOptions.GlobalJitLevel global_jit_level = 5;</code>
     */
    public org.tensorflow.framework.OptimizerOptions.GlobalJitLevel getGlobalJitLevel() {
      org.tensorflow.framework.OptimizerOptions.GlobalJitLevel result = org.tensorflow.framework.OptimizerOptions.GlobalJitLevel.valueOf(globalJitLevel_);
      return result == null ? org.tensorflow.framework.OptimizerOptions.GlobalJitLevel.UNRECOGNIZED : result;
    }
    /**
     * <code>.tensorflow.OptimizerOptions.GlobalJitLevel global_jit_level = 5;</code>
     */
    public Builder setGlobalJitLevel(org.tensorflow.framework.OptimizerOptions.GlobalJitLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      globalJitLevel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.OptimizerOptions.GlobalJitLevel global_jit_level = 5;</code>
     */
    public Builder clearGlobalJitLevel() {
      
      globalJitLevel_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.OptimizerOptions)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.OptimizerOptions)
  private static final org.tensorflow.framework.OptimizerOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.OptimizerOptions();
  }

  public static org.tensorflow.framework.OptimizerOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OptimizerOptions>
      PARSER = new com.google.protobuf.AbstractParser<OptimizerOptions>() {
    public OptimizerOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new OptimizerOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OptimizerOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OptimizerOptions> getParserForType() {
    return PARSER;
  }

  public org.tensorflow.framework.OptimizerOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

