package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check for perfect number :");
		int user_input = scanner.nextInt();
		int sum = 0;
		for(int index = 1; index < user_input; index++)
        {
            if(user_input % index == 0)
            {
                sum = sum + index;
            }
        }
        if(sum == user_input)
        {
            System.out.println("Given number is Perfect");
        }
        else
        {
            System.out.println("Given number is not Perfect");
        }    
	}
}
