package com.nagarro.training.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@WebMvcTest(controllers = CalculatorController.class)
@ExtendWith(MockitoExtension.class)
public class CalculatorControllerTests {
	
	@Autowired
	private MockMvc mockMvc;

	@InjectMocks
	private CalculatorController calculatorController;
	
	@Test
	public void calculatorController_Addition_ReturnsSumOfNumbers() throws Exception {
		
		ResultActions response =  mockMvc.perform(get("/api/add")
				.contentType(MediaType.APPLICATION_JSON)
				.param("num1", "1")
				.param("num2", "5"));
		
		response.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("6.0"));
	}

}
