// Copyright 2021 Tencent Inc. All rights reserved.
//
// JSAPI支付
//
// JSAPI支付API
//
// API version: 1.2.3

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.payment.jsapi.model;

import com.google.gson.annotations.SerializedName;
import com.wechat.pay.java.core.util.GsonUtil;

/** Payer */
public class Payer {
  /** 用户标识 说明：用户在商户appid下的唯一标识。 */
  @SerializedName("openid")
  private String openid;

  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  @Override
  public String toString() {
    return GsonUtil.createGson().toJson(this);
  }
}
