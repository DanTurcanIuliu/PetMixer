// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package origin.protobuf;

public interface DatePeriodOfCaretakerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:DatePeriodOfCaretaker)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string caretakerEmail = 1;</code>
   */
  java.lang.String getCaretakerEmail();
  /**
   * <code>string caretakerEmail = 1;</code>
   */
  com.google.protobuf.ByteString
      getCaretakerEmailBytes();

  /**
   * <code>.google.protobuf.Timestamp startDate = 2;</code>
   */
  boolean hasStartDate();
  /**
   * <code>.google.protobuf.Timestamp startDate = 2;</code>
   */
  com.google.protobuf.Timestamp getStartDate();
  /**
   * <code>.google.protobuf.Timestamp startDate = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDateOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp endDate = 3;</code>
   */
  boolean hasEndDate();
  /**
   * <code>.google.protobuf.Timestamp endDate = 3;</code>
   */
  com.google.protobuf.Timestamp getEndDate();
  /**
   * <code>.google.protobuf.Timestamp endDate = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndDateOrBuilder();
}
