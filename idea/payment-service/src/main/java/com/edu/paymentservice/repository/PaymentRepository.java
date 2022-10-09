package com.edu.paymentservice.repository;

import com.edu.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer>
{

	Payment findByOrderId(int orderId);

}
