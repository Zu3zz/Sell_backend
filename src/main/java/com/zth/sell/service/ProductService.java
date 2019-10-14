package com.zth.sell.service;

import com.zth.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Author: 3zZ.
 * Date: 2019/10/14 2:31 下午
 */
public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     * 查询所有在驾商品列表
     * @return
     */

    List<ProductInfo> findUpAll();
    Page<ProductInfo> findAll(Pageable pageable);
    ProductInfo save(ProductInfo productInfo);

    // 加库存

    // 减库存
}
