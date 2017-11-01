package com.javagain;

public class App {
	
	public static void main(String[] args) {
		
		IceCream chocolate = IceCreamFactory.getIceCream("Chocolate");
		IceCream strawberry = IceCreamFactory.getIceCream("Strawberry");
		IceCream vanilla = IceCreamFactory.getIceCream("Vanilla");
				
		chocolate.make();
		strawberry.make();
		vanilla.make();
	}
}
