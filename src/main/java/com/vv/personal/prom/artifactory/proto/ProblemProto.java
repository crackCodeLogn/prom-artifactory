// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Problem.proto

package com.vv.personal.prom.artifactory.proto;

public final class ProblemProto {
  static final com.google.protobuf.Descriptors.Descriptor
          internal_static_com_vv_personal_prom_artifactory_proto_Problem_descriptor;
  static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_com_vv_personal_prom_artifactory_proto_Problem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
          internal_static_com_vv_personal_prom_artifactory_proto_Problems_descriptor;
  static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_com_vv_personal_prom_artifactory_proto_Problems_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.FileDescriptor
          descriptor;

  static {
    java.lang.String[] descriptorData = {
            "\n\rProblem.proto\022&com.vv.personal.prom.ar" +
                    "tifactory.proto\"1\n\007Problem\022\021\n\tproblemId\030" +
                    "\001 \001(\005\022\023\n\013problemName\030\002 \001(\t\"M\n\010Problems\022A" +
                    "\n\010problems\030\001 \003(\0132/.com.vv.personal.prom." +
                    "artifactory.proto.ProblemB\020B\014ProblemProt" +
                    "oP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
            new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
              public com.google.protobuf.ExtensionRegistry assignDescriptors(
                      com.google.protobuf.Descriptors.FileDescriptor root) {
                descriptor = root;
                return null;
              }
            };
    com.google.protobuf.Descriptors.FileDescriptor
            .internalBuildGeneratedFileFrom(descriptorData,
                    new com.google.protobuf.Descriptors.FileDescriptor[]{
                    }, assigner);
    internal_static_com_vv_personal_prom_artifactory_proto_Problem_descriptor =
            getDescriptor().getMessageTypes().get(0);
    internal_static_com_vv_personal_prom_artifactory_proto_Problem_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_com_vv_personal_prom_artifactory_proto_Problem_descriptor,
            new java.lang.String[]{"ProblemId", "ProblemName",});
    internal_static_com_vv_personal_prom_artifactory_proto_Problems_descriptor =
            getDescriptor().getMessageTypes().get(1);
    internal_static_com_vv_personal_prom_artifactory_proto_Problems_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_com_vv_personal_prom_artifactory_proto_Problems_descriptor,
            new java.lang.String[]{"Problems",});
  }

  private ProblemProto() {
  }

  public static void registerAllExtensions(
          com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
          com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
            (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }

  // @@protoc_insertion_point(outer_class_scope)
}
