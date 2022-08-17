package com.org.tav.SwaggerDemo1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "T_Employee")
@Setter
@Getter
@NoArgsConstructor
public class TEmployee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String location;
	private String name;
	
	
	

}
