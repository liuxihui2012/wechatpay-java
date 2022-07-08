// Copyright 2021 Tencent Inc. All rights reserved.
//
// APP支付
//
// APP支付API
//
// API version: 1.2.3

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.payment.app.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.wechat.pay.java.core.util.GsonUtil;

/** CloseOrderRequest */
public class CloseOrderRequest {
  /** outTradeNo */
  @SerializedName("out_trade_no")
  @Expose(serialize = false)
  private String outTradeNo;
  /** mchid 说明：直连商户号 */
  @SerializedName("mchid")
  private String mchid;

  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }

  public String getMchid() {
    return mchid;
  }

  public void setMchid(String mchid) {
    this.mchid = mchid;
  }

  @Override
  public String toString() {
    return GsonUtil.createGson().toJson(this);
  }
}
