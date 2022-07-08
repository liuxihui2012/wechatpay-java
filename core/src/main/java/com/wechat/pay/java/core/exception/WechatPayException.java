package com.wechat.pay.java.core.exception;

/** 微信支付异常基类 */
public abstract class WechatPayException extends RuntimeException {

  private static final long serialVersionUID = -5896431877288268263L;

  public WechatPayException(String format, Object... objects) {
    super(String.format(format, objects));
  }

  public WechatPayException(Throwable cause, String format, Object... objects) {
    super(String.format(format, objects), cause);
  }

  public WechatPayException(String message) {
    super(message);
  }

  public WechatPayException(String message, Throwable cause) {
    super(message, cause);
  }
}
