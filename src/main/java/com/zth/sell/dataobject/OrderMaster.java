package com.zth.sell.dataobject;

import com.zth.sell.enums.OrderStatusEnum;
import com.zth.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Author: 3zZ.
 * Date: 2019/10/21 7:05 下午
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    /** 订单id. */
    @Id
    private String orderId;
    /** 买家名字. */
    private String buyerName;
    /** 买家手机号. */
    private String buyerPhone;
    /** 买家地址. */
    private String buyerAddress;
    /** 买家微信Openid. */
    private String buyerOpenid;
    /** 订单总金额. */
    private BigDecimal orderAmount;
    /** 订单状态, 默认为0新下单 */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /** 支付状态, 默认为0未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;
}
