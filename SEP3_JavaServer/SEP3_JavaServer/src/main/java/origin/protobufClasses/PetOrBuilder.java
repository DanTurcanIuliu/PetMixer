// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package origin.protobufClasses;

public interface PetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Pet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string petName = 1;</code>
   */
  String getPetName();
  /**
   * <code>string petName = 1;</code>
   */
  com.google.protobuf.ByteString
      getPetNameBytes();

  /**
   * <pre>
   * dog, cat ....
   * </pre>
   *
   * <code>string petType = 2;</code>
   */
  String getPetType();
  /**
   * <pre>
   * dog, cat ....
   * </pre>
   *
   * <code>string petType = 2;</code>
   */
  com.google.protobuf.ByteString
      getPetTypeBytes();

  /**
   * <code>int32 weight = 3;</code>
   */
  int getWeight();

  /**
   * <code>bool isVaccinated = 4;</code>
   */
  boolean getIsVaccinated();

  /**
   * <code>string dietDescription = 5;</code>
   */
  String getDietDescription();
  /**
   * <code>string dietDescription = 5;</code>
   */
  com.google.protobuf.ByteString
      getDietDescriptionBytes();
}
