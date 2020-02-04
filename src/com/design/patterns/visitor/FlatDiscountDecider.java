package com.design.patterns.visitor;

public class FlatDiscountDecider implements Visitor{

	@Override
	public int calculatePrice(int mrp) {
		return mrp-250;
	}

}
