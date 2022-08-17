package com.org.tav.SpringBootDemo2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.org.tav.SpringbootDemo1.SprinJdbcApplication;
@SpringBootApplication

public class MainApp implements CommandLineRunner{
 
	@Autowired
    private JdbcTemplate jdbcTemplateObj;

 
    public static void main(String[] args) throws SQLException {
        // Code To Set Driver Class Name, Database URL, Username & Password
    	SpringApplication.run(MainApp.class, args);
        
 
        
    }


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		if(null != jdbcTemplateObj) {
			 
            // SQL Operation #1 - SQL INSERT Operation
            String sqlInsertQuery = "INSERT INTO contact (name, email, address, telephone) VALUES (?, ?, ?, ?)";
            for(int j=101; j<106; j++) {
                jdbcTemplateObj.update(sqlInsertQuery, "Editor " + j, "editor" + j +"@javacodegeek.com", "Greece", "0123456789");
            }
 
            // SQL Operation #2 - SQL UPDATE Operation
            String sqlUpdateQuery = "UPDATE contact set email=? where name=?";
            jdbcTemplateObj.update(sqlUpdateQuery, "administrator101@javacodegeek.com", "Editor 101");
 
            // SQL Operation #3 - SQL READ Operation
            String sqlSelectQuery = "SELECT name, email, address, telephone FROM contact";
            List<Contact> listContacts = jdbcTemplateObj.query(sqlSelectQuery, new RowMapper() {
                public Contact mapRow(ResultSet result, int rowNum) throws SQLException {
                    Contact contactObj = new Contact();
                    contactObj.setName(result.getString("name"));
                    contactObj.setEmail(result.getString("email"));
                    contactObj.setAddress(result.getString("address"));
                    contactObj.setPhone(result.getString("telephone"));
                    return contactObj;
                }
            });
 
            // Displaying The SQL Records
            for (Contact contactDetail : listContacts) {
                System.out.println(contactDetail.toString());
            }
 
            // SQL Operation #4 - SQL DELETE Operation
            String sqlDeleteQuery = "DELETE FROM contact where name=?";
            jdbcTemplateObj.update(sqlDeleteQuery, "Editor 104");
        } else {
            System.out.print("Application Is Not Able To Bind With The Database! Please Check!");
        }
		
	}
}
