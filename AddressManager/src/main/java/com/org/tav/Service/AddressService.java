package com.org.tav.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.org.tav.Entity.Address;
import com.org.tav.Repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	AddressRepository adrepo;
	@Autowired
	ApiService api;
	
	
	public Address saveaddr(Address address)
	{
		return adrepo.save(address);
	}
	public List<Address> getsimilar(String s)
	{
		List<Address> ad=adrepo.findBySimilarity(s);
		
		return ad;
	}
	public List<Address> fileupload(MultipartFile file) throws IOException
	{
		List<Address> addresses = new ArrayList<>();
	     InputStream inputStream = file.getInputStream(); 
	     BufferedReader bufferReader =   new BufferedReader(new InputStreamReader(inputStream));
	     String addressLine;
	     while ((addressLine = bufferReader.readLine()) != null) {
	    	 if(api.validation(addressLine))
	    	 {
	    		 addresses.add(new Address(addressLine));
	    		 
	    	 }
	    	 
	        
	     }
	     List<Address> ad=new ArrayList<>();
	    for(Address addr:addresses)
	    	ad.add(adrepo.save(addr));
	    return(ad);
	}
	public List<String> search()
	{
		return adrepo.search();
	}

}
