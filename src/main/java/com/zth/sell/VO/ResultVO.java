package com.zth.sell.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * Author: 3zZ.
 * Date: 2019/10/21 5:28 下午
 */
@Data
public class ResultVO<T> {
    /** 错误码 */
    private Integer code;
    /** 提示信息 */
    private String msg;
    /** 具体内容 */
    private T data;
}
