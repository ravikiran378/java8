package com.design.patterns.structural.decorator;

public class TamperedGlassWithBackCoverPhone implements Phone {

	@Override
	public void newPhone() {
		System.out.println("TamperedGlassWithBackCoverPhone");
	}
	
}
