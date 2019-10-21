package com.zth.sell.controller;

import com.zth.sell.Utils.ResultVOUtil;
import com.zth.sell.VO.ProductInfoVO;
import com.zth.sell.VO.ProductVO;
import com.zth.sell.VO.ResultVO;
import com.zth.sell.dataobject.ProductCategory;
import com.zth.sell.dataobject.ProductInfo;
import com.zth.sell.service.CategoryService;
import com.zth.sell.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: 3zZ.
 * Date: 2019/10/21 5:19 下午
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")

    public ResultVO list() {
        // 1.查询所有的上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();
        // 2.查询类目(一次性查询)
        // List<Integer> categoryTypeLIst = new ArrayList<>();
        List<Integer> categoryTypeLIst = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeLIst);
        // 3.数据拼装
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory:productCategoryList){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());
            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo:productInfoList){
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }
}
