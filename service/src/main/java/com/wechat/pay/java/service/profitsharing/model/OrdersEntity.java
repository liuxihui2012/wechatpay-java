// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微信支付分账API
//
// 微信支付分账API
//
// API version: 0.0.9

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.profitsharing.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/** OrdersEntity */
public class OrdersEntity {
  /** 子商户号 说明：微信支付分配的子商户号，即分账的出资商户号。（直连商户不需要，服务商需要） */
  @SerializedName("sub_mchid")
  private String subMchid;
  /** 微信订单号 说明：微信支付订单号 */
  @SerializedName("transaction_id")
  private String transactionId;
  /** 商户分账单号 说明：商户系统内部的分账单号，在商户系统内部唯一，同一分账单号多次请求等同一次。只能是数字、大小写字母\\_\\-\\|\\*@ */
  @SerializedName("out_order_no")
  private String outOrderNo;
  /** 微信分账单号 说明：微信分账单号，微信系统返回的唯一标识 */
  @SerializedName("order_id")
  private String orderId;
  /** 分账单状态 说明：分账单状态（每个接收方的分账结果请查看receivers中的result字段） */
  @SerializedName("state")
  private OrderStatus state;
  /** 分账接收方列表 说明：分账接收方列表 */
  @SerializedName("receivers")
  private List<OrderReceiverDetail> receivers;

  public String getSubMchid() {
    return subMchid;
  }

  public void setSubMchid(String subMchid) {
    this.subMchid = subMchid;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public String getOutOrderNo() {
    return outOrderNo;
  }

  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public OrderStatus getState() {
    return state;
  }

  public void setState(OrderStatus state) {
    this.state = state;
  }

  public List<OrderReceiverDetail> getReceivers() {
    return receivers;
  }

  public void setReceivers(List<OrderReceiverDetail> receivers) {
    this.receivers = receivers;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersEntity {\n");
    sb.append("    subMchid: ").append(toIndentedString(subMchid)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    receivers: ").append(toIndentedString(receivers)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
