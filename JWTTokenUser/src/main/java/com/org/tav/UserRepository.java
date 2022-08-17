package com.org.tav;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<DAOUser, Long> {

}
