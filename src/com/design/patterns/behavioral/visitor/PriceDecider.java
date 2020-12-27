package com.design.patterns.behavioral.visitor;

public class PriceDecider implements Visitor{

	@Override
	public int calculatePrice(int mrp) {
		return mrp-100;
	}

}
