// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Problem.proto

package com.vv.personal.prom.artifactory.proto;

public interface ProblemListOrBuilder extends
        // @@protoc_insertion_point(interface_extends:com.vv.personal.prom.artifactory.proto.ProblemList)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Problem problem = 1;</code>
     */
    java.util.List<com.vv.personal.prom.artifactory.proto.Problem>
    getProblemList();

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Problem problem = 1;</code>
     */
    com.vv.personal.prom.artifactory.proto.Problem getProblem(int index);

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Problem problem = 1;</code>
     */
    int getProblemCount();

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Problem problem = 1;</code>
     */
    java.util.List<? extends com.vv.personal.prom.artifactory.proto.ProblemOrBuilder>
    getProblemOrBuilderList();

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Problem problem = 1;</code>
     */
    com.vv.personal.prom.artifactory.proto.ProblemOrBuilder getProblemOrBuilder(
            int index);

    /**
     * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 2;</code>
     */
    boolean hasAuth();

    /**
     * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 2;</code>
     */
    com.vv.personal.prom.artifactory.proto.Auth getAuth();

    /**
     * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 2;</code>
     */
    com.vv.personal.prom.artifactory.proto.AuthOrBuilder getAuthOrBuilder();
}
