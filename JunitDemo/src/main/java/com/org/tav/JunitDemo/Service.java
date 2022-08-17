package com.org.tav.JunitDemo;

public class Service {
	 
    private Database database;
 
    public Service(Database database) {
        super();
        this.database = database;
    }

    public boolean query(String query) {
        return database.isAvalilable();
    }
 
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Using database with id : " + String.valueOf(database.getUniqueId());
    }


}