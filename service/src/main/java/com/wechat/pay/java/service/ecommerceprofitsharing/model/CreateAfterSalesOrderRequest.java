// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微信支付电商平台分账API
//
// 微信支付电商平台分账API
//
// API version: 1.0.21

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.ecommerceprofitsharing.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** CreateAfterSalesOrderRequest */
public class CreateAfterSalesOrderRequest {
  /** 子商户号 说明：分账出资的商户，填写微信支付分配的商户号 */
  @SerializedName("sub_mchid")
  private String subMchid;
  /** 微信订单号 说明：微信支付订单号 */
  @SerializedName("transaction_id")
  private String transactionId;
  /** 分账金额 说明：分账金额，单位为分，只能为整数，不能超过原订单支付金额及最大分账比例金额 */
  @SerializedName("amount")
  private Long amount;
  /** 类型 说明：枚举值：1、SERVICE_FEE_INCOME：服务费收入分账 */
  @SerializedName("type")
  private String type;
  /** 场景 说明：枚举值： 1、REFUND_TICKET：退票 2、CHANGE_TICKET：改签 3、RETURN_GOODS：退货 */
  @SerializedName("scene")
  private String scene;
  /** 微信退款单号 说明：该笔微信订单对应的微信退款单号。退票收入分账、改签退款收入分账、退货收入分账时必填。 */
  @SerializedName("refund_id")
  private String refundId;

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

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getScene() {
    return scene;
  }

  public void setScene(String scene) {
    this.scene = scene;
  }

  public String getRefundId() {
    return refundId;
  }

  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAfterSalesOrderRequest {\n");
    sb.append("    subMchid: ").append(toIndentedString(subMchid)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
