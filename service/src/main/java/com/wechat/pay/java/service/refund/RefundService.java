// Copyright 2021 Tencent Inc. All rights reserved.
//
// 境内普通商户退款API
//
// 境内普通商户退款功能涉及的API文档
//
// API version: 1.2.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.refund;

import static java.util.Objects.requireNonNull;

import com.wechat.pay.java.core.Config;
import com.wechat.pay.java.core.exception.HttpException;
import com.wechat.pay.java.core.exception.ParseException;
import com.wechat.pay.java.core.exception.ServiceException;
import com.wechat.pay.java.core.exception.ValidationException;
import com.wechat.pay.java.core.http.Constant;
import com.wechat.pay.java.core.http.DefaultHttpClientBuilder;
import com.wechat.pay.java.core.http.HttpClient;
import com.wechat.pay.java.core.http.HttpHeaders;
import com.wechat.pay.java.core.http.HttpMethod;
import com.wechat.pay.java.core.http.HttpRequest;
import com.wechat.pay.java.core.http.HttpResponse;
import com.wechat.pay.java.core.http.JsonRequestBody;
import com.wechat.pay.java.core.http.MediaType;
import com.wechat.pay.java.service.refund.model.CreateRequest;
import com.wechat.pay.java.service.refund.model.QueryByOutRefundNoRefundsRequest;
import com.wechat.pay.java.service.refund.model.Refund;

/** RefundService服务 */
public class RefundService {

  private final HttpClient httpClient;

  public RefundService(Config config) {
    this.httpClient =
        new DefaultHttpClientBuilder()
            .credential(requireNonNull(config.createCredential()))
            .validator(requireNonNull(config.createValidator()))
            .build();
  }

  public RefundService(HttpClient httpClient) {
    this.httpClient = requireNonNull(httpClient);
  }

  /**
   * 退款申请
   *
   * @param request 请求参数
   * @return Refund
   * @throws HttpException 发送HTTP请求失败。例如构建请求参数失败、发送请求失败、I/O错误等。包含请求信息。
   * @throws ValidationException 发送HTTP请求成功，验证微信支付返回签名失败。
   * @throws ServiceException 发送HTTP请求成功，服务返回异常。例如返回状态码小于200或大于等于300。
   * @throws ParseException 服务返回成功，content-type不为application/json、解析返回体失败。
   */
  public Refund createRefunds(CreateRequest request) {
    String requestPath = "https://api.mch.weixin.qq.com/v3/refund/domestic/refunds";
    HttpHeaders headers = new HttpHeaders();
    headers.addHeader(Constant.ACCEPT, " */*");
    headers.addHeader(Constant.CONTENT_TYPE, MediaType.APPLICATION_JSON.getValue());
    HttpRequest httpRequest =
        new HttpRequest.Builder()
            .httpMethod(HttpMethod.POST)
            .url(requestPath)
            .headers(headers)
            .body(new JsonRequestBody.Builder().body(request.toString()).build())
            .build();
    HttpResponse<Refund> httpResponse = httpClient.execute(httpRequest, Refund.class);
    return httpResponse.getServiceResponse();
  }

  /**
   * 查询单笔退款（通过商户退款单号）
   *
   * @param request 请求参数
   * @return Refund
   * @throws HttpException 发送HTTP请求失败。例如构建请求参数失败、发送请求失败、I/O错误等。包含请求信息。
   * @throws ValidationException 发送HTTP请求成功，验证微信支付返回签名失败。
   * @throws ServiceException 发送HTTP请求成功，服务返回异常。例如返回状态码小于200或大于等于300。
   * @throws ParseException 服务返回成功，content-type不为application/json、解析返回体失败。
   */
  public Refund queryByOutRefundNoRefunds(QueryByOutRefundNoRefundsRequest request) {
    String requestPath = "https://api.mch.weixin.qq.com/v3/refund/domestic/refunds/{out_refund_no}";
    // 添加 path param
    requestPath = requestPath.replace("{" + "out_refund_no" + "}", request.getOutRefundNo());
    // 添加 query param
    if (request.getSubMchid() != null) {
      requestPath += "?subMchid=" + request.getSubMchid();
    }
    HttpHeaders headers = new HttpHeaders();
    headers.addHeader(Constant.ACCEPT, " */*");
    headers.addHeader(Constant.CONTENT_TYPE, MediaType.APPLICATION_JSON.getValue());
    HttpRequest httpRequest =
        new HttpRequest.Builder()
            .httpMethod(HttpMethod.GET)
            .url(requestPath)
            .headers(headers)
            .build();
    HttpResponse<Refund> httpResponse = httpClient.execute(httpRequest, Refund.class);
    return httpResponse.getServiceResponse();
  }
}
