package com.zth.sell.service.impl;

import com.zth.sell.dataobject.OrderDetail;
import com.zth.sell.dataobject.ProductInfo;
import com.zth.sell.dto.OrderDTO;
import com.zth.sell.service.OrderService;
import com.zth.sell.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

/**
 * Author: 3zZ.
 * Date: 2019/10/25 7:09 下午
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ProductService productService;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        // 1. 查询商品（数量、价格
        for (OrderDetail orderDetail : orderDTO.getOrderDetailList()) {
            ProductInfo productInfo = productService.findOne(orderDetail.getDetailId());
        }

        // 2. 计算总价

        // 3. 写入订单数据库(orderMaster和orderDetail)

        // 4. 扣库存
        return null;
    }

    @Override
    public OrderDTO findOne(OrderDTO orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
