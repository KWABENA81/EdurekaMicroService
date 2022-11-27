package com.edu.paymentservice.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PAYMENT_TB")
public class Payment 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentId;
	private String paymentStatus;
	private String transactionId;
	private int orderId;
	private double amount;

//	public String getPaymentStatus() {
//		return paymentStatus;
//	}
//	public void setPaymentStatus(String paymentStatus) {
//		this.paymentStatus = paymentStatus;
//	}
//	public String getTransactionId() {
//		return transactionId;
//	}
//	public void setTransactionId(String transactionId) {
//		this.transactionId = transactionId;
//	}
//	public int getOrderId() {
//		return orderId;
//	}
//	public void setOrderId(int orderId) {
//		this.orderId = orderId;
//	}
//	public double getAmount() {
//		return amount;
//	}
//	public void setAmount(double amount) {
//		this.amount = amount;
//	}

	
}
