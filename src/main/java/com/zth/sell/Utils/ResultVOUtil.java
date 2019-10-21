package com.zth.sell.Utils;

import com.zth.sell.VO.ResultVO;

import javax.xml.transform.Result;

/**
 * ResultVO对象方法的封装
 * Author: 3zZ.
 * Date: 2019/10/21 6:54 下午
 */
public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        return resultVO;
    }
    public static ResultVO success() {
        return success(null);
    }
    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
