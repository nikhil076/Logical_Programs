package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args)
	{	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check for prime number :");
		int is_prime_number = scanner.nextInt();
		int count = 0;
		if(is_prime_number==2)
		{
			System.out.println(is_prime_number+" it is a prime minister");
			
		}
		else
		{
			for(int number=1;number<=is_prime_number;number++)
			{
					if(is_prime_number%number == 0)
					{
						count++;
					}
			}
			if(count == 2)
			{
				System.out.println(is_prime_number+" is a prime number");
			}
			else
				System.out.println(is_prime_number+" is not a prime number");
		}
	}
}
