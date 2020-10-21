package com.rupesh.controllers;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rupesh.model.CreditCardDto;
import com.rupesh.model.PaymentDto;
import com.rupesh.propertyeditor.CreditCardEditor;
import com.rupesh.propertyeditor.CurrencyPropertyEditor;
import com.rupesh.propertyeditor.NamePropertyEditor;

@Controller
public class PaymentController {

	@RequestMapping("/")
	public String home(@ModelAttribute("paymentDto") PaymentDto paymentDto) {

		CreditCardDto creditCardDto = new CreditCardDto();
		creditCardDto.setFirstFourDigit("1111");
		creditCardDto.setSecondFourDigit("2222");
		creditCardDto.setThirdFourDigit("3333");
		creditCardDto.setFourthFourDigit("4444");

		paymentDto.setCreditCardDto(creditCardDto);

		return "home";
	}

	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public String success(@Valid @ModelAttribute("paymentDto") PaymentDto paymentDto, BindingResult result) {
		if (result.hasErrors()) {
			return "home";
		}
		return "success";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		// editor for date field
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("dd-MM-yyyy"), true);
		binder.registerCustomEditor(Date.class, "date", dateEditor);

		// editor for payment field
		CustomNumberEditor numberEditor = new CustomNumberEditor(BigDecimal.class, new DecimalFormat("##,###.##"),
				false);
		binder.registerCustomEditor(BigDecimal.class, "amount", numberEditor);

		// custom property editor for name field
		NamePropertyEditor nameEditor = new NamePropertyEditor();
		binder.registerCustomEditor(String.class, nameEditor);

		// custom property editor for currency code
		CurrencyPropertyEditor currencyEditor = new CurrencyPropertyEditor();
		binder.registerCustomEditor(Currency.class, "currency", currencyEditor);
		
		//adding credit card formatter here
		//binder.addCustomFormatter(new CreditCardNumberFormatter());
		
		//credit card editor -- exactly same as credit card formatter
		CreditCardEditor cardEditor = new CreditCardEditor();
		binder.registerCustomEditor(CreditCardDto.class, cardEditor);

	}
}
