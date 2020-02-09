package com.design.patterns.structural.decorator;

public interface Phone {
	void newPhone();
	
	public static void main(String[] args) {
		
		/*-------------------------- Without decorator. -------------------------*/
		
		Phone p1 = new TamperedGlassPhone();
		Phone p2 = new BackCoveredPhone();
		Phone p3 = new TamperedGlassWithBackCoverPhone();
		
		/* What if other type comes say HoldingTagPhone 
		 & You want all the TamperedGlass + BackCover + Holding Tag.
		 It is not Good idea to build 2 new classes like "HoldingTagPhone" &
		 TamperedBackCoveredAndHoldingTagPhone. 
		 And think about scenario if some one wants only tampered glass and holding tag.
		*/
		
		p1.newPhone();
		p2.newPhone();
		p3.newPhone();
		// What the hell here... i want phone with tampered glass and Holding tag.
		
		/*--------------------------- Decorator in rescue. ------------------------*/
		
		Phone q1 = new PhoneDecorator(new BasicPhone());
		//q1.newPhone();
		Phone q2 = new BackCoverDecorator(q1);
		//q2.newPhone();
		Phone q3 = new TamperedGlassDecorator(q2);
		//q3.newPhone();
		
		Phone q4 = new PhoneDecorator(new BasicPhone());
		Phone q5 = new TamperedGlassDecorator(q4);
		Phone q6 = new HoldingTagDecorator(q5);
		
		q6.newPhone();
		/*----------------------------- I am happy now -----------------------------*/
	}
}
