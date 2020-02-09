package com.design.patterns.structural.decorator;

public class BackCoveredPhone implements Phone {

	@Override
	public void newPhone() {
		System.out.println("BackCoveredPhone");
	}

}
