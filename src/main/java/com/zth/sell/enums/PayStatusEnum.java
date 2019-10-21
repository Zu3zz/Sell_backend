package com.zth.sell.enums;

import lombok.Getter;

/**
 * Author: 3zZ.
 * Date: 2019/10/21 7:32 下午
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;
    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
