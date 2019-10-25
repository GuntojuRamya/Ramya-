package com.ramya.assignment;

public class LibraryInterfaceDemo 
{
	public static void main(String[] args) 
	{
		KidUser kidUser=new KidUser();
		kidUser.registerAccount(10);
		kidUser.requestBook("kids");
		
		AdultUser adultUser=new AdultUser();
		adultUser.registerAccount(28);
		adultUser.requestBook("friction");
	}

	

}
