package com.zth.sell.dataobject;

import com.sun.tools.corba.se.idl.InterfaceGen;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Author: 3zZ.
 * Date: 2019/10/13 11:11 下午
 */
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;
    /** 名字 */
    private String productName;
    /** 单价 */
    private BigDecimal productPrice;
    /** 库存 */
    private Integer productStock;
    /** 描述 */
    private String productDescription;
    /** 小图 */
    private String productIcon;
    /** 商品状态，0正常，1下架 */
    private Integer productStatus;
    /** 类目编号 */
    private Integer categoryType;
}
