package com.design.patterns.visitor;

public class Book implements Visitable{
	int mrp = 500;
	int decidedPrice = 0;
	@Override
	public int checkForDiscounts(Visitor v) {
		return v.calculatePrice(mrp);
	}
	
	public static void main(String a[]) {
		Book b = new Book();
		System.out.println(b.checkForDiscounts(new FlatDiscountDecider()));
		System.out.println(b.checkForDiscounts(new PriceDecider()));
	}
}
