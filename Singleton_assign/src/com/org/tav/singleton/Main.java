package com.org.tav.singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DBCon db=DBCon.getInstance(20);
		System.out.println(db.value);
		

	}

}
