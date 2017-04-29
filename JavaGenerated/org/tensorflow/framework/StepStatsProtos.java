// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/step_stats.proto

package org.tensorflow.framework;

public final class StepStatsProtos {
  private StepStatsProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_AllocatorMemoryUsed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_AllocatorMemoryUsed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_NodeOutput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_NodeOutput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_MemoryStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_MemoryStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_NodeExecStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_NodeExecStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DeviceStepStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_DeviceStepStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_StepStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_StepStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*tensorflow/core/framework/step_stats.p" +
      "roto\022\ntensorflow\0326tensorflow/core/framew" +
      "ork/allocation_description.proto\0322tensor" +
      "flow/core/framework/tensor_description.p" +
      "roto\"j\n\023AllocatorMemoryUsed\022\026\n\016allocator" +
      "_name\030\001 \001(\t\022\023\n\013total_bytes\030\002 \001(\003\022\022\n\npeak" +
      "_bytes\030\003 \001(\003\022\022\n\nlive_bytes\030\004 \001(\003\"U\n\nNode" +
      "Output\022\014\n\004slot\030\001 \001(\005\0229\n\022tensor_descripti" +
      "on\030\003 \001(\0132\035.tensorflow.TensorDescription\"" +
      "\357\001\n\013MemoryStats\022\035\n\025host_temp_memory_size",
      "\030\001 \001(\003\022\037\n\027device_temp_memory_size\030\002 \001(\003\022" +
      "#\n\033host_persistent_memory_size\030\003 \001(\003\022%\n\035" +
      "device_persistent_memory_size\030\004 \001(\003\022(\n h" +
      "ost_persistent_tensor_alloc_ids\030\005 \003(\003\022*\n" +
      "\"device_persistent_tensor_alloc_ids\030\006 \003(" +
      "\003\"\233\003\n\rNodeExecStats\022\021\n\tnode_name\030\001 \001(\t\022\030" +
      "\n\020all_start_micros\030\002 \001(\003\022\033\n\023op_start_rel" +
      "_micros\030\003 \001(\003\022\031\n\021op_end_rel_micros\030\004 \001(\003" +
      "\022\032\n\022all_end_rel_micros\030\005 \001(\003\022/\n\006memory\030\006" +
      " \003(\0132\037.tensorflow.AllocatorMemoryUsed\022&\n",
      "\006output\030\007 \003(\0132\026.tensorflow.NodeOutput\022\026\n" +
      "\016timeline_label\030\010 \001(\t\022\030\n\020scheduled_micro" +
      "s\030\t \001(\003\022\021\n\tthread_id\030\n \001(\r\022<\n\021referenced" +
      "_tensor\030\013 \003(\0132!.tensorflow.AllocationDes" +
      "cription\022-\n\014memory_stats\030\014 \001(\0132\027.tensorf" +
      "low.MemoryStats\"P\n\017DeviceStepStats\022\016\n\006de" +
      "vice\030\001 \001(\t\022-\n\nnode_stats\030\002 \003(\0132\031.tensorf" +
      "low.NodeExecStats\";\n\tStepStats\022.\n\tdev_st" +
      "ats\030\001 \003(\0132\033.tensorflow.DeviceStepStatsB0" +
      "\n\030org.tensorflow.frameworkB\017StepStatsPro",
      "tosP\001\370\001\001b\006proto3"
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
          org.tensorflow.framework.AllocationDescriptionProtos.getDescriptor(),
          org.tensorflow.framework.TensorDescriptionProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_AllocatorMemoryUsed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_AllocatorMemoryUsed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_AllocatorMemoryUsed_descriptor,
        new java.lang.String[] { "AllocatorName", "TotalBytes", "PeakBytes", "LiveBytes", });
    internal_static_tensorflow_NodeOutput_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_NodeOutput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_NodeOutput_descriptor,
        new java.lang.String[] { "Slot", "TensorDescription", });
    internal_static_tensorflow_MemoryStats_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_MemoryStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_MemoryStats_descriptor,
        new java.lang.String[] { "HostTempMemorySize", "DeviceTempMemorySize", "HostPersistentMemorySize", "DevicePersistentMemorySize", "HostPersistentTensorAllocIds", "DevicePersistentTensorAllocIds", });
    internal_static_tensorflow_NodeExecStats_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_NodeExecStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_NodeExecStats_descriptor,
        new java.lang.String[] { "NodeName", "AllStartMicros", "OpStartRelMicros", "OpEndRelMicros", "AllEndRelMicros", "Memory", "Output", "TimelineLabel", "ScheduledMicros", "ThreadId", "ReferencedTensor", "MemoryStats", });
    internal_static_tensorflow_DeviceStepStats_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_DeviceStepStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_DeviceStepStats_descriptor,
        new java.lang.String[] { "Device", "NodeStats", });
    internal_static_tensorflow_StepStats_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_StepStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_StepStats_descriptor,
        new java.lang.String[] { "DevStats", });
    org.tensorflow.framework.AllocationDescriptionProtos.getDescriptor();
    org.tensorflow.framework.TensorDescriptionProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
