package com.design.patterns.structural.decorator;

public class PhoneDecorator implements Phone {
	
	protected Phone phone;

	public PhoneDecorator(Phone phone) {
		super();
		this.phone = phone;
	}

	@Override
	public void newPhone() {
		phone.newPhone();
	}
	
}
