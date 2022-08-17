package com.org.tav.SpringbootDemo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
 
@SpringBootApplication
public class SprinJdbcApplication implements CommandLineRunner{
 
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public static void main(String[] args) {
        SpringApplication.run(SprinJdbcApplication.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
    	 //String sql = "INSERT INTO stud (id, name) VALUES (" + "1, 'ABC')";
        //String sql = "INSERT INTO stud (id, name) VALUES (" + "2, 'xyz')";
        //String sql = "INSERT INTO stud (id, name) VALUES (" + "3, 'xyz')";
        //update
        // String sql = "update stud set name='pqr' where id=2";
        //delete
        //String sql = "delete from stud where id=2";
    	String sql1="DELETE FROM stud WHERE id=2";
        String sql = "INSERT INTO stud (id, name) VALUES ("
    	              + "2, 'PQR')";
                int rows = jdbcTemplate.update (sql1);
                if (rows > 0) {
                System.out.println ("One row inserted.");  
    }
 
}
}
