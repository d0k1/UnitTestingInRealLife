package com.unittesting;

public class CalculatorMainTest {

	public static void main(String args[]){
		Calculator calculator = new Calculator();
		long result = calculator.summ(2L, 2L);
		
		if(result!=4){
			System.out.println("Test failed. Expected: "+4+" result: "+result);
		}
	}
}
