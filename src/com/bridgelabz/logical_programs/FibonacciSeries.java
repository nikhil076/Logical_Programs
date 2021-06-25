package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class FibonacciSeries
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number till the series is required :");
		int num_of_series = scanner.nextInt();
		int starting_point = 0;
		int next_point = 1;
		int sum = 0;
		
		System.out.println(starting_point);
		
		for(int index=1;index<num_of_series;index++)
		{
			sum=starting_point+next_point;
			starting_point= next_point;
			next_point= sum;
			System.out.println(starting_point);
		}
	}

}
