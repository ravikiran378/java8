package com.design.patterns.behavioral.visitor;

public class FlatDiscountDecider implements Visitor{

	@Override
	public int calculatePrice(int mrp) {
		return mrp-250;
	}

}
