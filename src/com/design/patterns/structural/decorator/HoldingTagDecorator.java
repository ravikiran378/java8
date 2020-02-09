package com.design.patterns.structural.decorator;

public class HoldingTagDecorator extends PhoneDecorator{
	
	public HoldingTagDecorator(Phone phone) {
		super(phone);
	}

	@Override
	public void newPhone() {
		phone.newPhone();
		System.out.println("HoldingTag Decorated");
	}
}
