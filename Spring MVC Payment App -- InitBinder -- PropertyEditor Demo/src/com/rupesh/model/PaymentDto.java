package com.rupesh.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

public class PaymentDto {

	private String name;
	private Date date;
	private BigDecimal amount;
	private Currency currency;
	private CreditCardDto creditCardDto;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CreditCardDto getCreditCardDto() {
		return creditCardDto;
	}

	public void setCreditCardDto(CreditCardDto creditCardDto) {
		this.creditCardDto = creditCardDto;
	}

}
