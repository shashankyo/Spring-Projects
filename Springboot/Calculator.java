package com.example.MyCaclculatorApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Calculator {
	@GetMapping(value= "/add")
	public int addition()
	{
		int a = 10, b = 20;
		return a + b;
	}
	@GetMapping(value= "/sub")
	public int subtraction()
	{
		int a = 10, b = 20;
		return a - b;
		
	}
	@GetMapping(value= "/mul")
	public int multiplication()
	{
		int a = 10, b = 20;
		return a * b;
	}
	@GetMapping(value= "/div")
	public int division()
	{
		int a = 10, b = 20;
		return a / b;
	}

//	public static void main(String[] args) {
//		Calculator calci = new Calculator();
//		calci.addition(10,20);
//		calci.subtraction(10,20);
//		calci.multiplication(10,20);
//		calci.division(10,20);
//	}
}
