package com.org.tav.AbstractFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory f1=new MercedesFactory();
		f1.makeHeadlight().on();
		f1.makeHeadlight().off();
		f1.makeTire().tirediameter();
		f1.makeTire().tirewidth();
		Factory f2=new Audifactory();
		f2.makeHeadlight().on();
		f2.makeHeadlight().off();
		f2.makeTire().tirediameter();
		f2.makeTire().tirewidth();

	}

}
