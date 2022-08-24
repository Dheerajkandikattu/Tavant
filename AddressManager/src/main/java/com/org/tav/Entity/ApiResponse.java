package com.org.tav.Entity;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {
    private String status;
    public Boolean checkResponse(){
        return this.status.equalsIgnoreCase("OK");
    }
}