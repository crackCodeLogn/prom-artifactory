// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Problem.proto

package com.vv.personal.prom.artifactory.proto;

public interface ProblemOrBuilder extends
        // @@protoc_insertion_point(interface_extends:com.vv.personal.prom.artifactory.proto.Problem)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * assuming that there'll never be need to go to long
     * </pre>
     *
     * <code>int32 problemId = 1;</code>
     */
    int getProblemId();

    /**
     * <code>string problemName = 2;</code>
     */
    java.lang.String getProblemName();

    /**
     * <code>string problemName = 2;</code>
     */
    com.google.protobuf.ByteString
    getProblemNameBytes();

    /**
     * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 3;</code>
     */
    boolean hasAuth();

    /**
     * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 3;</code>
     */
    com.vv.personal.prom.artifactory.proto.Auth getAuth();

    /**
     * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 3;</code>
     */
    com.vv.personal.prom.artifactory.proto.AuthOrBuilder getAuthOrBuilder();
}
