package com.rupesh.model;

public class CreditCardDto {

	private String firstFourDigit;
	private String secondFourDigit;
	private String thirdFourDigit;
	private String fourthFourDigit;

	public String getFirstFourDigit() {
		return firstFourDigit;
	}

	public void setFirstFourDigit(String firstFourDigit) {
		this.firstFourDigit = firstFourDigit;
	}

	public String getSecondFourDigit() {
		return secondFourDigit;
	}

	public void setSecondFourDigit(String secondFourDigit) {
		this.secondFourDigit = secondFourDigit;
	}

	public String getThirdFourDigit() {
		return thirdFourDigit;
	}

	public void setThirdFourDigit(String thirdFourDigit) {
		this.thirdFourDigit = thirdFourDigit;
	}

	public String getFourthFourDigit() {
		return fourthFourDigit;
	}

	public void setFourthFourDigit(String fourthFourDigit) {
		this.fourthFourDigit = fourthFourDigit;
	}

	@Override
	public String toString() {
		return getFirstFourDigit() + "-"
				+ getSecondFourDigit() + "-" + getThirdFourDigit() + "-"
				+ getFourthFourDigit();
	}

}
