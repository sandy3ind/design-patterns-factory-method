package com.javagain;

/**
 * This is factory class to create ice creams subclasses
 * 
 * @author Sandeep.Sharma
 *
 */
public class IceCreamFactory {
	
	public static IceCream getIceCream(String type) {
		if ("Chocolate".equalsIgnoreCase(type)) {
			return new ChocolateIceCream();
		}
		else if ("Strawberry".equalsIgnoreCase(type)) {
			return new StrawberryIceCream();
		}
		else if ("Vanilla".equalsIgnoreCase(type)) {
			return new VanillaIceCream();
		}
		return null;
	}
}
