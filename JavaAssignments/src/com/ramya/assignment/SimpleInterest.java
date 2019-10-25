package com.ramya.assignment;

import java.util.Scanner;

public class SimpleInterest 
{
	public static void main(String[] args) 
	{
		double amount=0, si, ci;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter principle");
		double principle=scanner.nextDouble();
		System.out.println("enter the rate");
		double rate=scanner.nextDouble();
		System.out.println("enter the time");
		double time=scanner.nextDouble();
		 amount=(principle)*Math.pow((1+rate/100), time);
		 ci=amount-principle;
		 si=(principle*time*rate)/100;
		 System.out.println("simple interest is"+" "+si);
		 System.out.println("compound interest is"+" "+ci);
		 scanner.close();
	}

}
