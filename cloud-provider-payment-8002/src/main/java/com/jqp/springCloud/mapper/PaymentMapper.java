package com.jqp.springCloud.mapper;

import com.jqp.springCloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentMapper
 * @Author jiangqingpeng
 * @Date 2021/1/5 19:20
 * @Version 2.0
 */
@Mapper
public interface PaymentMapper {

    int insertPayment(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
