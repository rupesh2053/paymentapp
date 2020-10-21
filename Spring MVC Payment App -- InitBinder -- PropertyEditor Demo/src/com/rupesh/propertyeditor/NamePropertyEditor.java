package com.rupesh.propertyeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String formattedText = text.toUpperCase();
		setValue(formattedText);
	}

	
}
