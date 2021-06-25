package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class MonthlyPayment 
{

	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Principal Loan :");
		double principal_loan = scanner.nextInt();
		System.out.println("Enter the Years of Loan :");
		double year_of_loan = scanner.nextInt();
		System.out.println("Enter the interest Percentage :");
		double interest_of_loan = scanner.nextInt();
		
		
		double period = 12 * year_of_loan;
		double rate =interest_of_loan/(12*100);
		
		double payment =( principal_loan * rate*Math.pow(1+rate, period))/(Math.pow(1+rate,period)-1);
		System.out.println("the monthly payemnt :" +payment);
	}

}
