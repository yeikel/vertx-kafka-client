package io.vertx.kafka.admin;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter and mapper for {@link io.vertx.kafka.admin.MemberDescription}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.kafka.admin.MemberDescription} original class using Vert.x codegen.
 */
public class MemberDescriptionConverter {

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, MemberDescription obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "consumerId":
          if (member.getValue() instanceof String) {
            obj.setConsumerId((String)member.getValue());
          }
          break;
        case "clientId":
          if (member.getValue() instanceof String) {
            obj.setClientId((String)member.getValue());
          }
          break;
        case "assignment":
          if (member.getValue() instanceof JsonObject) {
            obj.setAssignment(new io.vertx.kafka.admin.MemberAssignment((io.vertx.core.json.JsonObject)member.getValue()));
          }
          break;
        case "host":
          if (member.getValue() instanceof String) {
            obj.setHost((String)member.getValue());
          }
          break;
      }
    }
  }

   static void toJson(MemberDescription obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

   static void toJson(MemberDescription obj, java.util.Map<String, Object> json) {
    if (obj.getConsumerId() != null) {
      json.put("consumerId", obj.getConsumerId());
    }
    if (obj.getClientId() != null) {
      json.put("clientId", obj.getClientId());
    }
    if (obj.getAssignment() != null) {
      json.put("assignment", obj.getAssignment().toJson());
    }
    if (obj.getHost() != null) {
      json.put("host", obj.getHost());
    }
  }
}
