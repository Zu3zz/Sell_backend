package com.zth.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 * Author: 3zZ.
 * Date: 2019/10/14 2:37 下午
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架");
    private Integer code;
    private String message;
    ProductStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
