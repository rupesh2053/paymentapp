package com.rupesh.propertyeditor;

import java.beans.PropertyEditorSupport;

import com.rupesh.model.CreditCardDto;

public class CreditCardEditor extends PropertyEditorSupport {

	@Override
	public String getAsText() {
		CreditCardDto creditCard = (CreditCardDto)getValue();
		return ""+creditCard;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		CreditCardDto creditCard = new CreditCardDto();
		String[] splitString = text.split("-");
		creditCard.setFirstFourDigit(splitString[0]);
		creditCard.setSecondFourDigit(splitString[1]);
		creditCard.setThirdFourDigit(splitString[2]);
		creditCard.setFourthFourDigit(splitString[3]);
		
		setValue(creditCard);
	}
}
