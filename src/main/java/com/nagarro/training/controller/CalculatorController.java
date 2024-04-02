package com.nagarro.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.training.constants.Constants;

@RestController
@RequestMapping("/api")
public class CalculatorController {
	
	
	@GetMapping("/help")
	public String help() {
		return Constants.ENDPOINTS;
	}
	@GetMapping("/add")
	public Double addition(@RequestParam Double num1,@RequestParam Double num2) {
		return num1+num2;
	}
	@GetMapping("/substract")
	public Double substraction(@RequestParam Double num1,@RequestParam Double num2) {
		return num1-num2;
	}
	@GetMapping("/multiply")
	public Double multiply(@RequestParam Double num1,@RequestParam Double num2) {
		return num1*num2;
	}
	@GetMapping("/divide")
	public Double divide(@RequestParam Double num1,@RequestParam Double num2) {
		if(num2==0) {
			throw new IllegalArgumentException("Division by 0 is not allowed");
		}
		return num1/num2;
	}
}
