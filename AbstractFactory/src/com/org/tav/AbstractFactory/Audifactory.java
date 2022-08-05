package com.org.tav.AbstractFactory;

public class Audifactory extends Factory {

	@Override
	public HeadLight makeHeadlight() {
		// TODO Auto-generated method stub
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

}
