/**
 * Code generated by Wire protobuf compiler, do not edit.
 * Source file: ../wire-runtime/src/test/proto/all_types.proto
 */
package com.squareup.wire.protos.alltypes;

import com.squareup.wire.ByteString;
import com.squareup.wire.Extension;
import java.util.List;

public final class Ext_all_types {

  private Ext_all_types() {
  }

  public static final Extension<AllTypes, Integer> ext_opt_int32 = Extension
      .int32Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_int32")
      .setTag(1001)
      .buildOptional();
  public static final Extension<AllTypes, Integer> ext_opt_uint32 = Extension
      .uint32Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_uint32")
      .setTag(1002)
      .buildOptional();
  public static final Extension<AllTypes, Integer> ext_opt_sint32 = Extension
      .sint32Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_sint32")
      .setTag(1003)
      .buildOptional();
  public static final Extension<AllTypes, Integer> ext_opt_fixed32 = Extension
      .fixed32Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_fixed32")
      .setTag(1004)
      .buildOptional();
  public static final Extension<AllTypes, Integer> ext_opt_sfixed32 = Extension
      .sfixed32Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_sfixed32")
      .setTag(1005)
      .buildOptional();
  public static final Extension<AllTypes, Long> ext_opt_int64 = Extension
      .int64Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_int64")
      .setTag(1006)
      .buildOptional();
  public static final Extension<AllTypes, Long> ext_opt_uint64 = Extension
      .uint64Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_uint64")
      .setTag(1007)
      .buildOptional();
  public static final Extension<AllTypes, Long> ext_opt_sint64 = Extension
      .sint64Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_sint64")
      .setTag(1008)
      .buildOptional();
  public static final Extension<AllTypes, Long> ext_opt_fixed64 = Extension
      .fixed64Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_fixed64")
      .setTag(1009)
      .buildOptional();
  public static final Extension<AllTypes, Long> ext_opt_sfixed64 = Extension
      .sfixed64Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_sfixed64")
      .setTag(1010)
      .buildOptional();
  public static final Extension<AllTypes, Boolean> ext_opt_bool = Extension
      .boolExtending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_bool")
      .setTag(1011)
      .buildOptional();
  public static final Extension<AllTypes, Float> ext_opt_float = Extension
      .floatExtending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_float")
      .setTag(1012)
      .buildOptional();
  public static final Extension<AllTypes, Double> ext_opt_double = Extension
      .doubleExtending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_double")
      .setTag(1013)
      .buildOptional();
  public static final Extension<AllTypes, String> ext_opt_string = Extension
      .stringExtending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_string")
      .setTag(1014)
      .buildOptional();
  public static final Extension<AllTypes, ByteString> ext_opt_bytes = Extension
      .bytesExtending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_bytes")
      .setTag(1015)
      .buildOptional();
  public static final Extension<AllTypes, AllTypes.NestedEnum> ext_opt_nested_enum = Extension
      .enumExtending(AllTypes.NestedEnum.class, AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_nested_enum")
      .setTag(1016)
      .buildOptional();
  public static final Extension<AllTypes, AllTypes.NestedMessage> ext_opt_nested_message = Extension
      .messageExtending(AllTypes.NestedMessage.class, AllTypes.class)
      .setName("squareup.protos.alltypes.ext_opt_nested_message")
      .setTag(1017)
      .buildOptional();
  public static final Extension<AllTypes, List<Integer>> ext_rep_int32 = Extension
      .int32Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_int32")
      .setTag(1101)
      .buildRepeated();
  public static final Extension<AllTypes, List<Integer>> ext_rep_uint32 = Extension
      .uint32Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_uint32")
      .setTag(1102)
      .buildRepeated();
  public static final Extension<AllTypes, List<Integer>> ext_rep_sint32 = Extension
      .sint32Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_sint32")
      .setTag(1103)
      .buildRepeated();
  public static final Extension<AllTypes, List<Integer>> ext_rep_fixed32 = Extension
      .fixed32Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_fixed32")
      .setTag(1104)
      .buildRepeated();
  public static final Extension<AllTypes, List<Integer>> ext_rep_sfixed32 = Extension
      .sfixed32Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_sfixed32")
      .setTag(1105)
      .buildRepeated();
  public static final Extension<AllTypes, List<Long>> ext_rep_int64 = Extension
      .int64Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_int64")
      .setTag(1106)
      .buildRepeated();
  public static final Extension<AllTypes, List<Long>> ext_rep_uint64 = Extension
      .uint64Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_uint64")
      .setTag(1107)
      .buildRepeated();
  public static final Extension<AllTypes, List<Long>> ext_rep_sint64 = Extension
      .sint64Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_sint64")
      .setTag(1108)
      .buildRepeated();
  public static final Extension<AllTypes, List<Long>> ext_rep_fixed64 = Extension
      .fixed64Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_fixed64")
      .setTag(1109)
      .buildRepeated();
  public static final Extension<AllTypes, List<Long>> ext_rep_sfixed64 = Extension
      .sfixed64Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_sfixed64")
      .setTag(1110)
      .buildRepeated();
  public static final Extension<AllTypes, List<Boolean>> ext_rep_bool = Extension
      .boolExtending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_bool")
      .setTag(1111)
      .buildRepeated();
  public static final Extension<AllTypes, List<Float>> ext_rep_float = Extension
      .floatExtending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_float")
      .setTag(1112)
      .buildRepeated();
  public static final Extension<AllTypes, List<Double>> ext_rep_double = Extension
      .doubleExtending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_double")
      .setTag(1113)
      .buildRepeated();
  public static final Extension<AllTypes, List<String>> ext_rep_string = Extension
      .stringExtending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_string")
      .setTag(1114)
      .buildRepeated();
  public static final Extension<AllTypes, List<ByteString>> ext_rep_bytes = Extension
      .bytesExtending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_bytes")
      .setTag(1115)
      .buildRepeated();
  public static final Extension<AllTypes, List<AllTypes.NestedEnum>> ext_rep_nested_enum = Extension
      .enumExtending(AllTypes.NestedEnum.class, AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_nested_enum")
      .setTag(1116)
      .buildRepeated();
  public static final Extension<AllTypes, List<AllTypes.NestedMessage>> ext_rep_nested_message = Extension
      .messageExtending(AllTypes.NestedMessage.class, AllTypes.class)
      .setName("squareup.protos.alltypes.ext_rep_nested_message")
      .setTag(1117)
      .buildRepeated();
  public static final Extension<AllTypes, List<Integer>> ext_pack_int32 = Extension
      .int32Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_pack_int32")
      .setTag(1201)
      .buildPacked();
  public static final Extension<AllTypes, List<Integer>> ext_pack_uint32 = Extension
      .uint32Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_pack_uint32")
      .setTag(1202)
      .buildPacked();
  public static final Extension<AllTypes, List<Integer>> ext_pack_sint32 = Extension
      .sint32Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_pack_sint32")
      .setTag(1203)
      .buildPacked();
  public static final Extension<AllTypes, List<Integer>> ext_pack_fixed32 = Extension
      .fixed32Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_pack_fixed32")
      .setTag(1204)
      .buildPacked();
  public static final Extension<AllTypes, List<Integer>> ext_pack_sfixed32 = Extension
      .sfixed32Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_pack_sfixed32")
      .setTag(1205)
      .buildPacked();
  public static final Extension<AllTypes, List<Long>> ext_pack_int64 = Extension
      .int64Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_pack_int64")
      .setTag(1206)
      .buildPacked();
  public static final Extension<AllTypes, List<Long>> ext_pack_uint64 = Extension
      .uint64Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_pack_uint64")
      .setTag(1207)
      .buildPacked();
  public static final Extension<AllTypes, List<Long>> ext_pack_sint64 = Extension
      .sint64Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_pack_sint64")
      .setTag(1208)
      .buildPacked();
  public static final Extension<AllTypes, List<Long>> ext_pack_fixed64 = Extension
      .fixed64Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_pack_fixed64")
      .setTag(1209)
      .buildPacked();
  public static final Extension<AllTypes, List<Long>> ext_pack_sfixed64 = Extension
      .sfixed64Extending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_pack_sfixed64")
      .setTag(1210)
      .buildPacked();
  public static final Extension<AllTypes, List<Boolean>> ext_pack_bool = Extension
      .boolExtending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_pack_bool")
      .setTag(1211)
      .buildPacked();
  public static final Extension<AllTypes, List<Float>> ext_pack_float = Extension
      .floatExtending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_pack_float")
      .setTag(1212)
      .buildPacked();
  public static final Extension<AllTypes, List<Double>> ext_pack_double = Extension
      .doubleExtending(AllTypes.class)
      .setName("squareup.protos.alltypes.ext_pack_double")
      .setTag(1213)
      .buildPacked();
  public static final Extension<AllTypes, List<AllTypes.NestedEnum>> ext_pack_nested_enum = Extension
      .enumExtending(AllTypes.NestedEnum.class, AllTypes.class)
      .setName("squareup.protos.alltypes.ext_pack_nested_enum")
      .setTag(1216)
      .buildPacked();
}