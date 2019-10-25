package com.ramya.assignment;

public class KidUser implements LibraryUser
{
	int age;
	String bookType;
	
	@Override
	public void registerAccount(int age)
	{
		if(age<12)
		{
			System.out.println("u have successfully registered into kids account");
		}
		else
		{
			System.out.println("sorry,Age must be less than 12 to register as a kid");
		}
		
	}
	@Override
	public void requestBook(String bookType) 
	{
		if(bookType.equals("kids"))
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else
		{
			System.out.println("“Oops, you are allowed to take only kids books");
		}
	}
}
