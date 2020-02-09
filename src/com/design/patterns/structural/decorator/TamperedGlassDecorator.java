package com.design.patterns.structural.decorator;

public class TamperedGlassDecorator extends PhoneDecorator{

	public TamperedGlassDecorator(Phone phone) {
		super(phone);
	}

	@Override
	public void newPhone() {
		phone.newPhone();
		System.out.println("TamperedGlass Decorated");
	}

}
