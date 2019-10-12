package com.zth.sell.service;

import com.zth.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * Author: 3zZ.
 * Date: 2019/10/12 9:10 下午
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
