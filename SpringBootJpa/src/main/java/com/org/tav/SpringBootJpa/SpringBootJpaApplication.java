package com.org.tav.SpringBootJpa;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
 
@SpringBootApplication
public class SpringBootJpaApplication  implements CommandLineRunner{
 
    @Autowired
    JpaRepository<Person,Long> personRepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaApplication.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub

        System.out.println("Inserting Person records ");
        Person person1 = new Person("Micky Mouse", 35);
        Person person2 = new Person("Donald Duck", 30);

        personRepo.save(person1);
        personRepo.save(person2);

        List<Person> personList = personRepo.findAll();
        personList.forEach(person->System.out.println(person.toString()));
    }
 
}