// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/contrib/verbs/verbs_service.proto

package org.tensorflow.contrib.verbs;

public final class VerbsServiceProtos {
  private VerbsServiceProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Channel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Channel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_MemoryRegion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_MemoryRegion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GetRemoteAddressRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GetRemoteAddressRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GetRemoteAddressResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GetRemoteAddressResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,tensorflow/contrib/verbs/verbs_service" +
      ".proto\022\ntensorflow\"0\n\007Channel\022\013\n\003lid\030\001 \001" +
      "(\005\022\013\n\003qpn\030\002 \001(\005\022\013\n\003psn\030\003 \001(\005\"1\n\014MemoryRe" +
      "gion\022\023\n\013remote_addr\030\001 \001(\004\022\014\n\004rkey\030\002 \001(\r\"" +
      "x\n\027GetRemoteAddressRequest\022\021\n\thost_name\030" +
      "\001 \001(\t\022$\n\007channel\030\002 \001(\0132\023.tensorflow.Chan" +
      "nel\022$\n\002mr\030\003 \003(\0132\030.tensorflow.MemoryRegio" +
      "n\"y\n\030GetRemoteAddressResponse\022\021\n\thost_na" +
      "me\030\001 \001(\t\022$\n\007channel\030\002 \001(\0132\023.tensorflow.C" +
      "hannel\022$\n\002mr\030\003 \003(\0132\030.tensorflow.MemoryRe",
      "gion2m\n\014VerbsService\022]\n\020GetRemoteAddress" +
      "\022#.tensorflow.GetRemoteAddressRequest\032$." +
      "tensorflow.GetRemoteAddressResponseB4\n\034o" +
      "rg.tensorflow.contrib.verbsB\022VerbsServic" +
      "eProtosP\001b\006proto3"
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
    internal_static_tensorflow_Channel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_Channel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Channel_descriptor,
        new java.lang.String[] { "Lid", "Qpn", "Psn", });
    internal_static_tensorflow_MemoryRegion_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_MemoryRegion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_MemoryRegion_descriptor,
        new java.lang.String[] { "RemoteAddr", "Rkey", });
    internal_static_tensorflow_GetRemoteAddressRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_GetRemoteAddressRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GetRemoteAddressRequest_descriptor,
        new java.lang.String[] { "HostName", "Channel", "Mr", });
    internal_static_tensorflow_GetRemoteAddressResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_GetRemoteAddressResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GetRemoteAddressResponse_descriptor,
        new java.lang.String[] { "HostName", "Channel", "Mr", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
