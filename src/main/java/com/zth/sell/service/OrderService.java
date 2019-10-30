package com.zth.sell.service;

import com.zth.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

/**
 * Author: 3zZ.
 * Date: 2019/10/25 7:06 下午
 */
public interface OrderService {
    /** 创建订单 */
    OrderDTO create(OrderDTO orderDTO);
    /** 查询单个订单 */
    OrderDTO findOne(OrderDTO orderId);
    /** 查询多个订单 */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);
    /** 取消订单 */
    OrderDTO cancel(OrderDTO orderDTO);
    /** 完结订单 */
    OrderDTO finish(OrderDTO orderDTO);
    /** 支付订单 */
    OrderDTO paid(OrderDTO orderDTO);
}
