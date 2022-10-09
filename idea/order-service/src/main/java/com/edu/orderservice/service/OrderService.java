package com.edu.orderservice.service;

import com.edu.orderservice.common.Payment;
import com.edu.orderservice.common.TransactionRequest;
import com.edu.orderservice.common.TransactionResponse;
import com.edu.orderservice.entity.Order;
import com.edu.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    @Autowired
    private RestTemplate template;

    public TransactionResponse saveOrder(TransactionRequest request) {
        String response = "";
        Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());

        Payment paymentResponse =
                template.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);

        response = paymentResponse.getPaymentStatus().equals("success") ? "payment processing successful" : "there is a failure";

        repository.save(order);

        return new TransactionResponse();//(order, paymentResponse.getAmount(), paymentResponse.getTransactionId(), response);
        //return TransactionResponse();
    }
}
