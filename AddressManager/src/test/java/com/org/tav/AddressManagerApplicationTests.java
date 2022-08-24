package com.org.tav;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockMultipartFile;

import com.org.tav.Entity.Address;
import com.org.tav.Repository.AddressRepository;
import com.org.tav.Service.AddressService;

@SpringBootTest
class AddressManagerApplicationTests {
	
	@Autowired
	private AddressService service;
	
	@MockBean
	private AddressRepository repo;
	
	
	
	
	@Test
	public void saveAddressTest()
	{
		Address ad=new Address("Amalapuram,Kakinada");
		when(repo.save(ad)).thenReturn(ad);
		assertEquals(ad, service.saveaddr(ad));
	}
	
	@Test
	public void getSimilarTest()
	{
		String s="Nellore";
		when(repo.findBySimilarity(s)).thenReturn(Stream.of(new Address("Nellore,Andhra"),new Address("Nellore,Andhra Pradesh")).collect(Collectors.toList()));
		assertEquals(2,service.getsimilar(s).size());
	}
	@Test
	public void fileuploadtest() throws IOException
	{
		MockMultipartFile file = new MockMultipartFile("data", "filename.txt", "text/plain", "Amaravathi\nKadapa".getBytes());
		Address ad1=new Address("Amaravathi");
		Address ad2=new Address("Kadapa");
		when(repo.save(ad1)).thenReturn(ad1);
		when(repo.save(ad2)).thenReturn(ad2);
		assertEquals(2, service.fileupload(file).size());

	}
	@Test
	public void searchTest()
	{
		when(repo.search()).thenReturn(Stream.of("Kakinada","Rajahmundry").collect(Collectors.toList()));
		assertEquals(2, service.search().size());
	}
	
	

}
