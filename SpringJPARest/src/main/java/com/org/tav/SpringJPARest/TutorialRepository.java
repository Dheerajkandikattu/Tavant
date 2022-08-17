package com.org.tav.SpringJPARest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {
	
}
