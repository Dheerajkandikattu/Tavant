package com.org.tav.RestJunit1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/patient")
public class PatientRecordController {
	@Autowired
	PatientRecordRepository prepo;
	@GetMapping
	public List<PatientRecord> getAllRecords() {
	    return prepo.findAll();
	}

	@GetMapping(value = "{patientId}")
	public PatientRecord getPatientById(@PathVariable(value="patientId") Long patientId) {
	    return prepo.findById(patientId).orElseThrow(()->new InvalidRequestException("PatientRecord"));
	}
	@PostMapping
	public PatientRecord createRecord(@RequestBody PatientRecord patientRecord) {
		
	    return prepo.save(patientRecord);
	}
	@PutMapping
	public PatientRecord updatePatientRecord(@RequestBody PatientRecord patientRecord) throws NotFoundException {
	    if (patientRecord == null || patientRecord.getPatientId() == null) {
	        throw new InvalidRequestException("PatientRecord or ID must not be null!");
	    }
	    Optional<PatientRecord> optionalRecord = prepo.findById(patientRecord.getPatientId());
	    if (optionalRecord.isEmpty()) {
	        throw new InvalidRequestException("Patient with ID does not exist.");
	    }
	    PatientRecord existingPatientRecord = optionalRecord.get();

	    existingPatientRecord.setName(patientRecord.getName());
	    existingPatientRecord.setAge(patientRecord.getAge());
	    existingPatientRecord.setAddress(patientRecord.getAddress());
		
	    return prepo.save(existingPatientRecord);
	}
	@DeleteMapping(value = "{patientId}")
	public void deletePatientById(@PathVariable(value = "patientId") Long patientId) throws NotFoundException {
	    if (prepo.findById(patientId).isEmpty()) {
	        throw new InvalidRequestException("Patient with ID " + patientId + " does not exist.");
	    }
	    prepo.deleteById(patientId);
	}

}
