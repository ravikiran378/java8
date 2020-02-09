package com.design.patterns.structural.decorator;

public class BackCoverDecorator extends PhoneDecorator {

	public BackCoverDecorator(Phone phone) {
		super(phone);
	}

	@Override
	public void newPhone() {
		phone.newPhone();
		System.out.println("Back cover decorated.");
	}
	
}
