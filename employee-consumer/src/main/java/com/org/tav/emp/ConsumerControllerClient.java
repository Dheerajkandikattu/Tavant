package com.org.tav.emp;

import java.io.IOException;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
 
public class ConsumerControllerClient {
 
    public void getEmployee() {
        String baseUrl = "http://localhost:8085/employee" ;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = null;
        try {
            response=restTemplate.exchange(baseUrl, HttpMethod.GET,getHeaders(),String.class);
        }catch (Exception ex) {
            // TODO: handle exception
            System.out.println(ex);
        }
        System.out.println(response.getBody());
    }

    private static HttpEntity<?> getHeaders() throws IOException{
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        return new HttpEntity<>(headers);
    }
}
