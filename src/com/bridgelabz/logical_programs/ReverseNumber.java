package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num to reverse :");
		int is_reverse_number = scanner.nextInt();
		int rev = 0;
		
		while(is_reverse_number!=0)
		{
			rev = rev*10 + is_reverse_number%10;
			is_reverse_number = is_reverse_number / 10;
		}
		System.out.println("the reversed number is :"+rev);
	}
}
