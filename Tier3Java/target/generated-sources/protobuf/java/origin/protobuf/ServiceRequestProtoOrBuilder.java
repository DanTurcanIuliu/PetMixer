// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package origin.protobuf;

public interface ServiceRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ServiceRequestProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string initiatorEmail = 1;</code>
   */
  java.lang.String getInitiatorEmail();
  /**
   * <code>string initiatorEmail = 1;</code>
   */
  com.google.protobuf.ByteString
      getInitiatorEmailBytes();

  /**
   * <code>int32 announcementId = 2;</code>
   */
  int getAnnouncementId();

  /**
   * <code>string recipientEmail = 3;</code>
   */
  java.lang.String getRecipientEmail();
  /**
   * <code>string recipientEmail = 3;</code>
   */
  com.google.protobuf.ByteString
      getRecipientEmailBytes();

  /**
   * <code>.ServiceRequestProto.Status status = 4;</code>
   */
  int getStatusValue();
  /**
   * <code>.ServiceRequestProto.Status status = 4;</code>
   */
  origin.protobuf.ServiceRequestProto.Status getStatus();

  /**
   * <code>int32 id = 5;</code>
   */
  int getId();
}
