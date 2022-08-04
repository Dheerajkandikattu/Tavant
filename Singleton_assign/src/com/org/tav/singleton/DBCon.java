package com.org.tav.singleton;

public class DBCon {
	static DBCon db;
	public int value;
	
	private DBCon(int value)
	{
		super();
		try {
			this.value=value;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	static DBCon getInstance(int value)
	{
		if(db==null)
			return db=new DBCon(value);
		else
			return db;
	}
	

}
