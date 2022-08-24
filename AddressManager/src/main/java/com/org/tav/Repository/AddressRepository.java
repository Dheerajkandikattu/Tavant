package com.org.tav.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.org.tav.Entity.Address;


public interface AddressRepository extends JpaRepository<Address, Long>{
	
@Query(value="select * from address where similarity(addr,?1)>0.7 order by similarity(addr,?1) desc limit 5;",nativeQuery = true)
	
	public List<Address> findBySimilarity(String s);
	public Address findByAddr(String s);
	
	@Query(value="select addr from address",nativeQuery=true)
	public List<String> search();

}
