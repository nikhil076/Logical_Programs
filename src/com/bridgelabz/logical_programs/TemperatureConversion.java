package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class TemperatureConversion
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to calculate celsius to fahrenheit");
		System.out.println("Enter 2 to calculaate farenheit to celsius");
		int user_input =scanner.nextInt();
		int celsius =0;
		int fahrenheit =0;
		double celsius_to_fahrenheit =0;
		double fahrenheit_to_celsius =0;
		
		if(user_input == 1)
		{
			System.out.println("Enter the value to convert it into Fahrenheit");
			celsius = scanner.nextInt();
			celsius_to_fahrenheit= (celsius * 9.0/5.0) + 32;
			System.out.println("The conversion of celsius to fahrenheit is "+celsius_to_fahrenheit);
		}
		else if(user_input ==2)
		{
			System.out.println("Enter the value to convert it into celsius");
			fahrenheit = scanner.nextInt();
			fahrenheit_to_celsius = (fahrenheit - 32) * 5.0/9.0;
			System.out.println("The conversion of Fahrenheit to celsius is "+fahrenheit_to_celsius);
		}
		else
			System.out.println("Invalid input");
	}

}
