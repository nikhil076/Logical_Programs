package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class BinarySwap 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number to covert it into binary :");
		int user_input = scanner.nextInt();
		System.out.println(swapNibbles(user_input));
	}
	static int swapNibbles(int user_input)
	{
	    return ((user_input & 0x0F) << 4 | (user_input & 0xF0) >> 4);
	}
}
