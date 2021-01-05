package com.jqp.springCloud.service;

import com.jqp.springCloud.entity.Payment;

public interface PaymentService {

    int insertPayment(Payment payment);

    Payment getPaymentById(Long id);
}
