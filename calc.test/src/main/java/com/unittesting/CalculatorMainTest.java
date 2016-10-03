package com.unittesting;

public class CalculatorMainTest {

	public static void main(String args[]){
		Calculator calculator = new Calculator();
		long result = calculator.multiply(2L, 2L);
		long expected = 4;
		
		if(result!=4){
			System.out.println("Test failed. Expected: "+expected+" result: "+result);
		}
	}
}
