// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session_entity_type.proto

package com.google.cloud.dialogflow.v2;

public interface UpdateSessionEntityTypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The entity type to update. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type
   * Display Name&gt;`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SessionEntityType session_entity_type = 1;</code>
   */
  boolean hasSessionEntityType();
  /**
   * <pre>
   * Required. The entity type to update. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type
   * Display Name&gt;`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SessionEntityType session_entity_type = 1;</code>
   */
  com.google.cloud.dialogflow.v2.SessionEntityType getSessionEntityType();
  /**
   * <pre>
   * Required. The entity type to update. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type
   * Display Name&gt;`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SessionEntityType session_entity_type = 1;</code>
   */
  com.google.cloud.dialogflow.v2.SessionEntityTypeOrBuilder getSessionEntityTypeOrBuilder();

  /**
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}