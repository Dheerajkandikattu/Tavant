package com.org.tav.RestJunit1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name="Patientrecord")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientRecord {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientId;
    
    @NonNull
    private String name;
 
    @NonNull
    private Integer age;
    
    @NonNull 
    private String address;

	
   

}
