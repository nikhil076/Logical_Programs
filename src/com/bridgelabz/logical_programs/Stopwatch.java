package com.bridgelabz.logical_programs;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Stopwatch
{
	public static void main(String[] args)
	{	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter '1' to start the stopwatch");
		int start_of_stopwatch = scanner.nextInt();
		long start_time = 0;
		long end_time = 0;
		
		if(start_of_stopwatch == 1)
		{
			//to get the full time format
			Format format_time = new SimpleDateFormat("HH.mm.ss");
			String start_full_time = format_time.format(new Date());
			System.out.println(start_full_time);
			// to display time in milliseconds
			start_time=System.currentTimeMillis();
			System.out.println("System time in millisecond ="+start_time);
		} 
		else 
		{
			System.out.println("invalid number");
		}
		System.out.println("Enter '2' to end the stopwatch");
		int end_of_stopwatch = scanner.nextInt();
		if(end_of_stopwatch == 2) 
		{
			//to get the full time format
			Format format_time = new SimpleDateFormat("HH.mm.ss");
			String end_full_time = format_time.format(new Date());
			System.out.println(end_full_time);
			// to display time in milliseconds
			end_time = System.currentTimeMillis();
			System.out.println("Sytem time in millisecond "+end_time);
			// to calculate the elaped time i.e in millisecs
			long time = end_time - start_time+1;
			System.out.println("the elapsed time in millis is :"+time);
			//to convert the millisec to mins and secs
			long elapsed_sec = time/1000;
			
				if (elapsed_sec/60 == 0)
				{
					System.out.println(elapsed_sec+" secs");
				}
				else {
					int elapsed_secs = (int) (elapsed_sec % 60);
					int elapsed_min = (int) (elapsed_sec/60);
					System.out.println(elapsed_min+" min"+elapsed_sec+" secs");
				}
		}
		else
		{
			System.out.println("invalid number");
		}
	}
}
