// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: danmaku.proto

package top.weixiansen574.bilibiliArchive.core.biliApis.protobuf.danmaku;

public final class Danmaku {
  private Danmaku() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_community_service_dm_v1_DanmakuElem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_community_service_dm_v1_DanmakuElem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bilibili_community_service_dm_v1_DanmakuEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bilibili_community_service_dm_v1_DanmakuEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rdanmaku.proto\022 bilibili.community.serv" +
      "ice.dm.v1\"\351\001\n\013DanmakuElem\022\n\n\002id\030\001 \001(\003\022\020\n" +
      "\010progress\030\002 \001(\005\022\014\n\004mode\030\003 \001(\005\022\020\n\010fontsiz" +
      "e\030\004 \001(\005\022\r\n\005color\030\005 \001(\r\022\017\n\007midHash\030\006 \001(\t\022" +
      "\017\n\007content\030\007 \001(\t\022\r\n\005ctime\030\010 \001(\003\022\016\n\006weigh" +
      "t\030\t \001(\005\022\016\n\006action\030\n \001(\t\022\014\n\004pool\030\013 \001(\005\022\r\n" +
      "\005idStr\030\014 \001(\t\022\014\n\004attr\030\r \001(\005\022\021\n\tanimation\030" +
      "\026 \001(\t\"L\n\014DanmakuEvent\022<\n\005elems\030\001 \003(\0132-.b" +
      "ilibili.community.service.dm.v1.DanmakuE" +
      "lemBH\n;top.weixiansen574.bilibiliArchive" +
      ".biliApis.protobuf.danmakuB\007DanmakuP\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_bilibili_community_service_dm_v1_DanmakuElem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bilibili_community_service_dm_v1_DanmakuElem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_community_service_dm_v1_DanmakuElem_descriptor,
        new String[] { "Id", "Progress", "Mode", "Fontsize", "Color", "MidHash", "Content", "Ctime", "Weight", "Action", "Pool", "IdStr", "Attr", "Animation", });
    internal_static_bilibili_community_service_dm_v1_DanmakuEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bilibili_community_service_dm_v1_DanmakuEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bilibili_community_service_dm_v1_DanmakuEvent_descriptor,
        new String[] { "Elems", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
