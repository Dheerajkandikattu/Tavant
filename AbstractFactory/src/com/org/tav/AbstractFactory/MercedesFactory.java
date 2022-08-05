package com.org.tav.AbstractFactory;

public class MercedesFactory extends Factory {

	@Override
	public HeadLight makeHeadlight() {
		// TODO Auto-generated method stub
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new MercedesTire();
	}

}
