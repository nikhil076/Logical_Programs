package com.bridgelabz.logical_programs;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber 
{

	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of random required :");
		int number_of_random_digit = scanner.nextInt();
		
		int array_random_numbers[] =new int[number_of_random_digit];	
		Random random = new Random();
		
		for(int index=0;index<number_of_random_digit;index++)
		{
			array_random_numbers[index] = random.nextInt(900)+99;
			System.out.println(array_random_numbers[index]);
		}
		for (int i = 0; i < array_random_numbers.length; i++) 
		{ 
			for (int j = i + 1 ; j < array_random_numbers.length; j++) 
			{
				if (array_random_numbers[i]==(array_random_numbers[j]))
				{ 
					System.out.println(array_random_numbers[i] +" duplicate value");
				}
			}
		}

	}
}
