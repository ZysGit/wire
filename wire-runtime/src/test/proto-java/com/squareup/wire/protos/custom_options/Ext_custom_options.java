// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/custom_options.proto
package com.squareup.wire.protos.custom_options;

import com.google.protobuf.EnumOptions;
import com.google.protobuf.EnumValueOptions;
import com.google.protobuf.FieldOptions;
import com.google.protobuf.MessageOptions;
import com.squareup.wire.Extension;
import com.squareup.wire.WireField;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.util.Arrays;
import java.util.List;

public final class Ext_custom_options {
  public static final Extension<MessageOptions, FooBar> my_message_option_one = Extension.get(MessageOptions.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.custom_options.my_message_option_one",
      50001,
      "com.squareup.wire.protos.custom_options.FooBar#ADAPTER");

  public static final Extension<MessageOptions, Float> my_message_option_two = Extension.get(MessageOptions.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.custom_options.my_message_option_two",
      50002,
      "com.squareup.wire.ProtoAdapter#FLOAT");

  public static final Extension<MessageOptions, FooBar> my_message_option_three = Extension.get(MessageOptions.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.custom_options.my_message_option_three",
      50003,
      "com.squareup.wire.protos.custom_options.FooBar#ADAPTER");

  public static final Extension<MessageOptions, FooBar.FooBarBazEnum> my_message_option_four = Extension.get(MessageOptions.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.custom_options.my_message_option_four",
      50004,
      "com.squareup.wire.protos.custom_options.FooBar$FooBarBazEnum#ADAPTER");

  public static final Extension<MessageOptions, FooBar> my_message_option_five = Extension.get(MessageOptions.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.custom_options.my_message_option_five",
      50005,
      "com.squareup.wire.protos.custom_options.FooBar#ADAPTER");

  public static final Extension<MessageOptions, FooBar> my_message_option_six = Extension.get(MessageOptions.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.custom_options.my_message_option_six",
      50006,
      "com.squareup.wire.protos.custom_options.FooBar#ADAPTER");

  public static final Extension<FieldOptions, Integer> my_field_option_one = Extension.get(FieldOptions.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.custom_options.my_field_option_one",
      60001,
      "com.squareup.wire.ProtoAdapter#INT32");

  public static final Extension<FieldOptions, Float> my_field_option_two = Extension.get(FieldOptions.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.custom_options.my_field_option_two",
      60002,
      "com.squareup.wire.ProtoAdapter#FLOAT");

  public static final Extension<FieldOptions, FooBar.FooBarBazEnum> my_field_option_three = Extension.get(FieldOptions.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.custom_options.my_field_option_three",
      60003,
      "com.squareup.wire.protos.custom_options.FooBar$FooBarBazEnum#ADAPTER");

  public static final Extension<FieldOptions, FooBar> my_field_option_four = Extension.get(FieldOptions.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.custom_options.my_field_option_four",
      60004,
      "com.squareup.wire.protos.custom_options.FooBar#ADAPTER");

  public static final Extension<EnumValueOptions, Integer> enum_value_option = Extension.get(EnumValueOptions.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.custom_options.enum_value_option",
      70000,
      "com.squareup.wire.ProtoAdapter#INT32");

  public static final Extension<EnumValueOptions, FooBar.More> complex_enum_value_option = Extension.get(EnumValueOptions.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.custom_options.complex_enum_value_option",
      70001,
      "com.squareup.wire.protos.custom_options.FooBar$More#ADAPTER");

  public static final Extension<EnumOptions, Boolean> enum_option = Extension.get(EnumOptions.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.custom_options.enum_option",
      71000,
      "com.squareup.wire.ProtoAdapter#BOOL");

  public static final Extension<FooBar, FooBar.FooBarBazEnum> ext = Extension.get(FooBar.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.custom_options.ext",
      101,
      "com.squareup.wire.protos.custom_options.FooBar$FooBarBazEnum#ADAPTER");

  public static final Extension<FooBar, List<FooBar.FooBarBazEnum>> rep = Extension.get(FooBar.class,
      WireField.Label.REPEATED,
      "squareup.protos.custom_options.rep",
      102,
      "com.squareup.wire.protos.custom_options.FooBar$FooBarBazEnum#ADAPTER");

  public static final List<Extension<?, ?>> EXTENSIONS = Arrays.<Extension<?, ?>>asList(
      my_message_option_one,
      my_message_option_two,
      my_message_option_three,
      my_message_option_four,
      my_message_option_five,
      my_message_option_six,
      my_field_option_one,
      my_field_option_two,
      my_field_option_three,
      my_field_option_four,
      enum_value_option,
      complex_enum_value_option,
      enum_option,
      ext,
      rep);

  private Ext_custom_options() {
  }
}