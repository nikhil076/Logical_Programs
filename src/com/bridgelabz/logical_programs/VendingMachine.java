package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class VendingMachine 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount to check for change :");
		int amount = scanner.nextInt();
		int thousand_count =0;
		int five_hundred_count=0;
		int hundred_count=0;
		int fifty_count=0;
		int ten_count=0;
		int five_count=0;
		int two_count=0;
		int one_count=0;
		
		while(amount-1000>=0)
		{
			thousand_count++;
			amount =amount-1000;
			System.out.println("updated amount :"+amount);
		}
		while(amount-500>=0)
		{
			five_hundred_count++;
			amount=amount-500;
			System.out.println("updated amount :"+amount);
		}
		while(amount-100>=0)
		{
			hundred_count++;
			amount=amount-100;
			System.out.println("updated amount is :"+amount);
		}
		while(amount-50>=0)
		{
			fifty_count++;
			amount=amount-50;
			System.out.println("updated amount is :"+amount);
		}
		while(amount-10>=0)
		{
			ten_count++;
			amount=amount-10;
			System.out.println("updated amount is :"+amount);
		}
		while(amount-5>=0)
		{
			five_count++;
			amount=amount-5;
			System.out.println("updated amount is :"+amount);
		}
		while(amount-2>=0)
		{
			two_count++;
			amount=amount-2;
			System.out.println("updated amount is :"+amount);
		}
		while(amount-1>=0)
		{
		one_count++;
		amount=amount-1;
		System.out.println("updated amount is :"+amount);
		}
		
		System.out.println("number of 1000 is :"+thousand_count);
		System.out.println("number of 500 is :"+five_hundred_count);
		System.out.println("number of 100 is :"+hundred_count);
		System.out.println("number of 50 is :"+fifty_count);
		System.out.println("number of 10 is :"+ten_count);
		System.out.println("number of 5 is :"+five_count);
		System.out.println("number of 2 is :"+two_count);
		System.out.println("number of 1 is :"+one_count);
	}

}
