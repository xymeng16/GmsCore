// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protos-repo/mcs.proto
package org.microg.gms.gcm.mcs;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;
import static com.squareup.wire.Message.Label.REQUIRED;

/**
 * TAG: 8
 */
public final class DataMessageStanza extends Message {

  public static final String DEFAULT_ID = "";
  public static final String DEFAULT_FROM = "";
  public static final String DEFAULT_TO = "";
  public static final String DEFAULT_CATEGORY = "";
  public static final String DEFAULT_TOKEN = "";
  public static final List<AppData> DEFAULT_APP_DATA = Collections.emptyList();
  public static final Boolean DEFAULT_FROM_TRUSTED_SERVER = false;
  public static final String DEFAULT_PERSISTENT_ID = "";
  public static final Integer DEFAULT_STREAM_ID = 0;
  public static final Integer DEFAULT_LAST_STREAM_ID_RECEIVED = 0;
  public static final String DEFAULT_REG_ID = "";
  public static final Long DEFAULT_DEVICE_USER_ID = 0L;
  public static final Integer DEFAULT_TTL = 0;
  public static final Long DEFAULT_SENT = 0L;
  public static final Integer DEFAULT_QUEUED = 0;
  public static final Long DEFAULT_STATUS = 0L;

  /**
   * Not used.
   * optional int64 rmq_id = 1;
   * This is the message ID, set by client, DMP.9 (message_id)
   */
  @ProtoField(tag = 2, type = STRING)
  public final String id;

  /**
   * Project ID of the sender, DMP.1
   */
  @ProtoField(tag = 3, type = STRING, label = REQUIRED)
  public final String from;

  /**
   * Part of DMRequest - also the key in DataMessageProto.
   */
  @ProtoField(tag = 4, type = STRING)
  public final String to;

  /**
   * Package name. DMP.2
   */
  @ProtoField(tag = 5, type = STRING, label = REQUIRED)
  public final String category;

  /**
   * The collapsed key, DMP.3
   */
  @ProtoField(tag = 6, type = STRING)
  public final String token;

  /**
   * User data + GOOGLE. prefixed special entries, DMP.4
   */
  @ProtoField(tag = 7, label = REPEATED, messageType = AppData.class)
  public final List<AppData> app_data;

  /**
   * Not used.
   */
  @ProtoField(tag = 8, type = BOOL)
  public final Boolean from_trusted_server;

  /**
   * Part of the ACK protocol, returned in DataMessageResponse on server side.
   * It's part of the key of DMP.
   */
  @ProtoField(tag = 9, type = STRING)
  public final String persistent_id;

  /**
   * In-stream ack. Increments on each message sent - a bit redundant
   * Not used in DMP/DMR.
   */
  @ProtoField(tag = 10, type = INT32)
  public final Integer stream_id;

  @ProtoField(tag = 11, type = INT32)
  public final Integer last_stream_id_received;

  /**
   * Not used.
   * optional string permission = 12;
   * Sent by the device shortly after registration.
   */
  @ProtoField(tag = 13, type = STRING)
  public final String reg_id;

  /**
   * Not used.
   * optional string pkg_signature = 14;
   * Not used.
   * optional string client_id = 15;
   * serial number of the target user, DMP.8
   * It is the 'serial number' according to user manager.
   */
  @ProtoField(tag = 16, type = INT64)
  public final Long device_user_id;

  /**
   * Time to live, in seconds.
   */
  @ProtoField(tag = 17, type = INT32)
  public final Integer ttl;

  /**
   * Timestamp ( according to client ) when message was sent by app, in seconds
   */
  @ProtoField(tag = 18, type = INT64)
  public final Long sent;

  /**
   * How long has the message been queued before the flush, in seconds.
   * This is needed to account for the time difference between server and
   * client: server should adjust 'sent' based on his 'receive' time.
   */
  @ProtoField(tag = 19, type = INT32)
  public final Integer queued;

  @ProtoField(tag = 20, type = INT64)
  public final Long status;

  public DataMessageStanza(String id, String from, String to, String category, String token, List<AppData> app_data, Boolean from_trusted_server, String persistent_id, Integer stream_id, Integer last_stream_id_received, String reg_id, Long device_user_id, Integer ttl, Long sent, Integer queued, Long status) {
    this.id = id;
    this.from = from;
    this.to = to;
    this.category = category;
    this.token = token;
    this.app_data = immutableCopyOf(app_data);
    this.from_trusted_server = from_trusted_server;
    this.persistent_id = persistent_id;
    this.stream_id = stream_id;
    this.last_stream_id_received = last_stream_id_received;
    this.reg_id = reg_id;
    this.device_user_id = device_user_id;
    this.ttl = ttl;
    this.sent = sent;
    this.queued = queued;
    this.status = status;
  }

  private DataMessageStanza(Builder builder) {
    this(builder.id, builder.from, builder.to, builder.category, builder.token, builder.app_data, builder.from_trusted_server, builder.persistent_id, builder.stream_id, builder.last_stream_id_received, builder.reg_id, builder.device_user_id, builder.ttl, builder.sent, builder.queued, builder.status);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DataMessageStanza)) return false;
    DataMessageStanza o = (DataMessageStanza) other;
    return equals(id, o.id)
        && equals(from, o.from)
        && equals(to, o.to)
        && equals(category, o.category)
        && equals(token, o.token)
        && equals(app_data, o.app_data)
        && equals(from_trusted_server, o.from_trusted_server)
        && equals(persistent_id, o.persistent_id)
        && equals(stream_id, o.stream_id)
        && equals(last_stream_id_received, o.last_stream_id_received)
        && equals(reg_id, o.reg_id)
        && equals(device_user_id, o.device_user_id)
        && equals(ttl, o.ttl)
        && equals(sent, o.sent)
        && equals(queued, o.queued)
        && equals(status, o.status);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = id != null ? id.hashCode() : 0;
      result = result * 37 + (from != null ? from.hashCode() : 0);
      result = result * 37 + (to != null ? to.hashCode() : 0);
      result = result * 37 + (category != null ? category.hashCode() : 0);
      result = result * 37 + (token != null ? token.hashCode() : 0);
      result = result * 37 + (app_data != null ? app_data.hashCode() : 1);
      result = result * 37 + (from_trusted_server != null ? from_trusted_server.hashCode() : 0);
      result = result * 37 + (persistent_id != null ? persistent_id.hashCode() : 0);
      result = result * 37 + (stream_id != null ? stream_id.hashCode() : 0);
      result = result * 37 + (last_stream_id_received != null ? last_stream_id_received.hashCode() : 0);
      result = result * 37 + (reg_id != null ? reg_id.hashCode() : 0);
      result = result * 37 + (device_user_id != null ? device_user_id.hashCode() : 0);
      result = result * 37 + (ttl != null ? ttl.hashCode() : 0);
      result = result * 37 + (sent != null ? sent.hashCode() : 0);
      result = result * 37 + (queued != null ? queued.hashCode() : 0);
      result = result * 37 + (status != null ? status.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<DataMessageStanza> {

    public String id;
    public String from;
    public String to;
    public String category;
    public String token;
    public List<AppData> app_data;
    public Boolean from_trusted_server;
    public String persistent_id;
    public Integer stream_id;
    public Integer last_stream_id_received;
    public String reg_id;
    public Long device_user_id;
    public Integer ttl;
    public Long sent;
    public Integer queued;
    public Long status;

    public Builder() {
    }

    public Builder(DataMessageStanza message) {
      super(message);
      if (message == null) return;
      this.id = message.id;
      this.from = message.from;
      this.to = message.to;
      this.category = message.category;
      this.token = message.token;
      this.app_data = copyOf(message.app_data);
      this.from_trusted_server = message.from_trusted_server;
      this.persistent_id = message.persistent_id;
      this.stream_id = message.stream_id;
      this.last_stream_id_received = message.last_stream_id_received;
      this.reg_id = message.reg_id;
      this.device_user_id = message.device_user_id;
      this.ttl = message.ttl;
      this.sent = message.sent;
      this.queued = message.queued;
      this.status = message.status;
    }

    /**
     * Not used.
     * optional int64 rmq_id = 1;
     * This is the message ID, set by client, DMP.9 (message_id)
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Project ID of the sender, DMP.1
     */
    public Builder from(String from) {
      this.from = from;
      return this;
    }

    /**
     * Part of DMRequest - also the key in DataMessageProto.
     */
    public Builder to(String to) {
      this.to = to;
      return this;
    }

    /**
     * Package name. DMP.2
     */
    public Builder category(String category) {
      this.category = category;
      return this;
    }

    /**
     * The collapsed key, DMP.3
     */
    public Builder token(String token) {
      this.token = token;
      return this;
    }

    /**
     * User data + GOOGLE. prefixed special entries, DMP.4
     */
    public Builder app_data(List<AppData> app_data) {
      this.app_data = checkForNulls(app_data);
      return this;
    }

    /**
     * Not used.
     */
    public Builder from_trusted_server(Boolean from_trusted_server) {
      this.from_trusted_server = from_trusted_server;
      return this;
    }

    /**
     * Part of the ACK protocol, returned in DataMessageResponse on server side.
     * It's part of the key of DMP.
     */
    public Builder persistent_id(String persistent_id) {
      this.persistent_id = persistent_id;
      return this;
    }

    /**
     * In-stream ack. Increments on each message sent - a bit redundant
     * Not used in DMP/DMR.
     */
    public Builder stream_id(Integer stream_id) {
      this.stream_id = stream_id;
      return this;
    }

    public Builder last_stream_id_received(Integer last_stream_id_received) {
      this.last_stream_id_received = last_stream_id_received;
      return this;
    }

    /**
     * Not used.
     * optional string permission = 12;
     * Sent by the device shortly after registration.
     */
    public Builder reg_id(String reg_id) {
      this.reg_id = reg_id;
      return this;
    }

    /**
     * Not used.
     * optional string pkg_signature = 14;
     * Not used.
     * optional string client_id = 15;
     * serial number of the target user, DMP.8
     * It is the 'serial number' according to user manager.
     */
    public Builder device_user_id(Long device_user_id) {
      this.device_user_id = device_user_id;
      return this;
    }

    /**
     * Time to live, in seconds.
     */
    public Builder ttl(Integer ttl) {
      this.ttl = ttl;
      return this;
    }

    /**
     * Timestamp ( according to client ) when message was sent by app, in seconds
     */
    public Builder sent(Long sent) {
      this.sent = sent;
      return this;
    }

    /**
     * How long has the message been queued before the flush, in seconds.
     * This is needed to account for the time difference between server and
     * client: server should adjust 'sent' based on his 'receive' time.
     */
    public Builder queued(Integer queued) {
      this.queued = queued;
      return this;
    }

    public Builder status(Long status) {
      this.status = status;
      return this;
    }

    @Override
    public DataMessageStanza build() {
      checkRequiredFields();
      return new DataMessageStanza(this);
    }
  }
}