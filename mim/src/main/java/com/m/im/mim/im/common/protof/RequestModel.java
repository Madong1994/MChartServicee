// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ImRequest.proto

package com.m.im.mim.im.common.protof;

public final class RequestModel {
  private RequestModel() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ImRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ImRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 handler = 1;</code>
     */
    int getHandler();

    /**
     * <code>optional int32 code = 2;</code>
     */
    int getCode();

    /**
     * <code>optional string uniqueOne = 3;</code>
     */
    String getUniqueOne();
    /**
     * <code>optional string uniqueOne = 3;</code>
     */
    com.google.protobuf.ByteString
        getUniqueOneBytes();

    /**
     * <code>optional string uniqueTwo = 4;</code>
     */
    String getUniqueTwo();
    /**
     * <code>optional string uniqueTwo = 4;</code>
     */
    com.google.protobuf.ByteString
        getUniqueTwoBytes();

    /**
     * <code>optional string time = 5;</code>
     */
    String getTime();
    /**
     * <code>optional string time = 5;</code>
     */
    com.google.protobuf.ByteString
        getTimeBytes();

    /**
     * <code>optional string data = 6;</code>
     */
    String getData();
    /**
     * <code>optional string data = 6;</code>
     */
    com.google.protobuf.ByteString
        getDataBytes();
  }
  /**
   * Protobuf type {@code ImRequest}
   */
  public  static final class ImRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ImRequest)
      ImRequestOrBuilder {
    // Use ImRequest.newBuilder() to construct.
    private ImRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ImRequest() {
      handler_ = 0;
      code_ = 0;
      uniqueOne_ = "";
      uniqueTwo_ = "";
      time_ = "";
      data_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ImRequest(
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

              handler_ = input.readInt32();
              break;
            }
            case 16: {

              code_ = input.readInt32();
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              uniqueOne_ = s;
              break;
            }
            case 34: {
              String s = input.readStringRequireUtf8();

              uniqueTwo_ = s;
              break;
            }
            case 42: {
              String s = input.readStringRequireUtf8();

              time_ = s;
              break;
            }
            case 50: {
              String s = input.readStringRequireUtf8();

              data_ = s;
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
      return RequestModel.internal_static_ImRequest_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RequestModel.internal_static_ImRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ImRequest.class, Builder.class);
    }

    public static final int HANDLER_FIELD_NUMBER = 1;
    private int handler_;
    /**
     * <code>optional int32 handler = 1;</code>
     */
    public int getHandler() {
      return handler_;
    }

    public static final int CODE_FIELD_NUMBER = 2;
    private int code_;
    /**
     * <code>optional int32 code = 2;</code>
     */
    public int getCode() {
      return code_;
    }

    public static final int UNIQUEONE_FIELD_NUMBER = 3;
    private volatile Object uniqueOne_;
    /**
     * <code>optional string uniqueOne = 3;</code>
     */
    public String getUniqueOne() {
      Object ref = uniqueOne_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        uniqueOne_ = s;
        return s;
      }
    }
    /**
     * <code>optional string uniqueOne = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUniqueOneBytes() {
      Object ref = uniqueOne_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        uniqueOne_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UNIQUETWO_FIELD_NUMBER = 4;
    private volatile Object uniqueTwo_;
    /**
     * <code>optional string uniqueTwo = 4;</code>
     */
    public String getUniqueTwo() {
      Object ref = uniqueTwo_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        uniqueTwo_ = s;
        return s;
      }
    }
    /**
     * <code>optional string uniqueTwo = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUniqueTwoBytes() {
      Object ref = uniqueTwo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        uniqueTwo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIME_FIELD_NUMBER = 5;
    private volatile Object time_;
    /**
     * <code>optional string time = 5;</code>
     */
    public String getTime() {
      Object ref = time_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        time_ = s;
        return s;
      }
    }
    /**
     * <code>optional string time = 5;</code>
     */
    public com.google.protobuf.ByteString
        getTimeBytes() {
      Object ref = time_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        time_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DATA_FIELD_NUMBER = 6;
    private volatile Object data_;
    /**
     * <code>optional string data = 6;</code>
     */
    public String getData() {
      Object ref = data_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        data_ = s;
        return s;
      }
    }
    /**
     * <code>optional string data = 6;</code>
     */
    public com.google.protobuf.ByteString
        getDataBytes() {
      Object ref = data_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (handler_ != 0) {
        output.writeInt32(1, handler_);
      }
      if (code_ != 0) {
        output.writeInt32(2, code_);
      }
      if (!getUniqueOneBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, uniqueOne_);
      }
      if (!getUniqueTwoBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, uniqueTwo_);
      }
      if (!getTimeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, time_);
      }
      if (!getDataBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, data_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (handler_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, handler_);
      }
      if (code_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, code_);
      }
      if (!getUniqueOneBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, uniqueOne_);
      }
      if (!getUniqueTwoBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, uniqueTwo_);
      }
      if (!getTimeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, time_);
      }
      if (!getDataBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, data_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ImRequest)) {
        return super.equals(obj);
      }
      ImRequest other = (ImRequest) obj;

      boolean result = true;
      result = result && (getHandler()
          == other.getHandler());
      result = result && (getCode()
          == other.getCode());
      result = result && getUniqueOne()
          .equals(other.getUniqueOne());
      result = result && getUniqueTwo()
          .equals(other.getUniqueTwo());
      result = result && getTime()
          .equals(other.getTime());
      result = result && getData()
          .equals(other.getData());
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + HANDLER_FIELD_NUMBER;
      hash = (53 * hash) + getHandler();
      hash = (37 * hash) + CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCode();
      hash = (37 * hash) + UNIQUEONE_FIELD_NUMBER;
      hash = (53 * hash) + getUniqueOne().hashCode();
      hash = (37 * hash) + UNIQUETWO_FIELD_NUMBER;
      hash = (53 * hash) + getUniqueTwo().hashCode();
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime().hashCode();
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ImRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ImRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ImRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ImRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ImRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ImRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ImRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ImRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ImRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ImRequest parseFrom(
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
    public static Builder newBuilder(ImRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ImRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ImRequest)
        ImRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RequestModel.internal_static_ImRequest_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RequestModel.internal_static_ImRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ImRequest.class, Builder.class);
      }

      // Construct using im.common.protof.RequestModel.ImRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
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
        handler_ = 0;

        code_ = 0;

        uniqueOne_ = "";

        uniqueTwo_ = "";

        time_ = "";

        data_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RequestModel.internal_static_ImRequest_descriptor;
      }

      public ImRequest getDefaultInstanceForType() {
        return ImRequest.getDefaultInstance();
      }

      public ImRequest build() {
        ImRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ImRequest buildPartial() {
        ImRequest result = new ImRequest(this);
        result.handler_ = handler_;
        result.code_ = code_;
        result.uniqueOne_ = uniqueOne_;
        result.uniqueTwo_ = uniqueTwo_;
        result.time_ = time_;
        result.data_ = data_;
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
        if (other instanceof ImRequest) {
          return mergeFrom((ImRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ImRequest other) {
        if (other == ImRequest.getDefaultInstance()) return this;
        if (other.getHandler() != 0) {
          setHandler(other.getHandler());
        }
        if (other.getCode() != 0) {
          setCode(other.getCode());
        }
        if (!other.getUniqueOne().isEmpty()) {
          uniqueOne_ = other.uniqueOne_;
          onChanged();
        }
        if (!other.getUniqueTwo().isEmpty()) {
          uniqueTwo_ = other.uniqueTwo_;
          onChanged();
        }
        if (!other.getTime().isEmpty()) {
          time_ = other.time_;
          onChanged();
        }
        if (!other.getData().isEmpty()) {
          data_ = other.data_;
          onChanged();
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
        ImRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ImRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int handler_ ;
      /**
       * <code>optional int32 handler = 1;</code>
       */
      public int getHandler() {
        return handler_;
      }
      /**
       * <code>optional int32 handler = 1;</code>
       */
      public Builder setHandler(int value) {
        
        handler_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 handler = 1;</code>
       */
      public Builder clearHandler() {
        
        handler_ = 0;
        onChanged();
        return this;
      }

      private int code_ ;
      /**
       * <code>optional int32 code = 2;</code>
       */
      public int getCode() {
        return code_;
      }
      /**
       * <code>optional int32 code = 2;</code>
       */
      public Builder setCode(int value) {
        
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 code = 2;</code>
       */
      public Builder clearCode() {
        
        code_ = 0;
        onChanged();
        return this;
      }

      private Object uniqueOne_ = "";
      /**
       * <code>optional string uniqueOne = 3;</code>
       */
      public String getUniqueOne() {
        Object ref = uniqueOne_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          uniqueOne_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string uniqueOne = 3;</code>
       */
      public com.google.protobuf.ByteString
          getUniqueOneBytes() {
        Object ref = uniqueOne_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          uniqueOne_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string uniqueOne = 3;</code>
       */
      public Builder setUniqueOne(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        uniqueOne_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string uniqueOne = 3;</code>
       */
      public Builder clearUniqueOne() {
        
        uniqueOne_ = getDefaultInstance().getUniqueOne();
        onChanged();
        return this;
      }
      /**
       * <code>optional string uniqueOne = 3;</code>
       */
      public Builder setUniqueOneBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        uniqueOne_ = value;
        onChanged();
        return this;
      }

      private Object uniqueTwo_ = "";
      /**
       * <code>optional string uniqueTwo = 4;</code>
       */
      public String getUniqueTwo() {
        Object ref = uniqueTwo_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          uniqueTwo_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string uniqueTwo = 4;</code>
       */
      public com.google.protobuf.ByteString
          getUniqueTwoBytes() {
        Object ref = uniqueTwo_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          uniqueTwo_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string uniqueTwo = 4;</code>
       */
      public Builder setUniqueTwo(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        uniqueTwo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string uniqueTwo = 4;</code>
       */
      public Builder clearUniqueTwo() {
        
        uniqueTwo_ = getDefaultInstance().getUniqueTwo();
        onChanged();
        return this;
      }
      /**
       * <code>optional string uniqueTwo = 4;</code>
       */
      public Builder setUniqueTwoBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        uniqueTwo_ = value;
        onChanged();
        return this;
      }

      private Object time_ = "";
      /**
       * <code>optional string time = 5;</code>
       */
      public String getTime() {
        Object ref = time_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          time_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string time = 5;</code>
       */
      public com.google.protobuf.ByteString
          getTimeBytes() {
        Object ref = time_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          time_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string time = 5;</code>
       */
      public Builder setTime(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string time = 5;</code>
       */
      public Builder clearTime() {
        
        time_ = getDefaultInstance().getTime();
        onChanged();
        return this;
      }
      /**
       * <code>optional string time = 5;</code>
       */
      public Builder setTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        time_ = value;
        onChanged();
        return this;
      }

      private Object data_ = "";
      /**
       * <code>optional string data = 6;</code>
       */
      public String getData() {
        Object ref = data_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          data_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string data = 6;</code>
       */
      public com.google.protobuf.ByteString
          getDataBytes() {
        Object ref = data_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          data_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string data = 6;</code>
       */
      public Builder setData(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string data = 6;</code>
       */
      public Builder clearData() {
        
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      /**
       * <code>optional string data = 6;</code>
       */
      public Builder setDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        data_ = value;
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


      // @@protoc_insertion_point(builder_scope:ImRequest)
    }

    // @@protoc_insertion_point(class_scope:ImRequest)
    private static final ImRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ImRequest();
    }

    public static ImRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ImRequest>
        PARSER = new com.google.protobuf.AbstractParser<ImRequest>() {
      public ImRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ImRequest> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ImRequest> getParserForType() {
      return PARSER;
    }

    public ImRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\017ImRequest.proto\"l\n\tImRequest\022\017\n\007handle" +
      "r\030\001 \001(\005\022\014\n\004code\030\002 \001(\005\022\021\n\tuniqueOne\030\003 \001(\t" +
      "\022\021\n\tuniqueTwo\030\004 \001(\t\022\014\n\004time\030\005 \001(\t\022\014\n\004dat" +
      "a\030\006 \001(\tB \n\020im.common.protofB\014RequestMode" +
      "lb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ImRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ImRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImRequest_descriptor,
        new String[] { "Handler", "Code", "UniqueOne", "UniqueTwo", "Time", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
