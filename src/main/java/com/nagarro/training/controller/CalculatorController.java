package com.nagarro.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	@GetMapping("/add")
	public Double addition(@RequestParam Double num1,@RequestParam Double num2) {
		return num1+num2;
	}
}
