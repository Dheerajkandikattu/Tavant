package com.org.tav;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.org.tav.Service.ApiService;

public class ApiServiceTest {
	@Test
	public void apiResponseTest1() throws IOException {
		ApiService apiService = new ApiService();
		String address = "VIT VELLORE";
		assertEquals(true, apiService.validation(address));
	}
    @Test
	public void apiResponseTest2() throws IOException {
		ApiService apiService = new ApiService();
		String address = "Hogwarts";
		assertEquals(false, apiService.validation(address));
	}
}
