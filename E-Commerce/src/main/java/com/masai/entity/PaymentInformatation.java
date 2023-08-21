package com.masai.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PaymentInformatation {
	
	private String cardholderName;
	
	private String cardName;
	
	private LocalDate expirationDate;
	
	private String cvv;

}
