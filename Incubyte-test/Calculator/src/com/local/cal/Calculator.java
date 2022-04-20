package com.local.cal;

public class Calculator {
	private int Add(String numbers) {
		if (numbers == null || numbers.trim().length()==0) {
			return 0;
		}
		
		String delimiter = ",";
		int num1 = 0;
		int num2 = 0;
		
		numbers = numbers.replaceAll("\n", "");
		String[] splitArray = numbers.split(delimiter);
		if (splitArray.length == 1) {
			if (splitArray[0].trim().length() > 0) {
				try {
					num1 = Integer.parseInt(splitArray[0].trim());
				} catch (Exception e) {
				}
			}
		} else {
			if (splitArray[0].trim().length() > 0) {
				try {
					num1 = Integer.parseInt(splitArray[0].trim());
				} catch (Exception e) {
				}
			}
			
			if (splitArray[1].trim().length() > 0) {
				try {
					num2 = Integer.parseInt(splitArray[1].trim());
				} catch (Exception e) {
				}
			}
		}
		
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		String numbers = "1, 2";
		int result = new Calculator().Add(numbers);
		System.out.println("Result : "+result);
	}
}
