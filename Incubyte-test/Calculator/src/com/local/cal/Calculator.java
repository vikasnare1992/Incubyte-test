package com.local.cal;

public class Calculator {
	private int Add(String numbers) {
		if (numbers == null || numbers.trim().length()==0) {
			return 0;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		String numbers = "";
		int result = new Calculator().Add(numbers);
		System.out.println("Result : "+result);
	}
}
