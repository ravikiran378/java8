package com.design.patterns.structural.decorator;

public class TamperedGlassPhone implements Phone {

	@Override
	public void newPhone() {
		System.out.println("TamperedGlassPhone");
	}
	
}
