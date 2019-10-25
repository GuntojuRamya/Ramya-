package com.ramya.assignment;

public class ComplexNumbers
{
	double real,img;

	public ComplexNumbers(double real, double img) 
	{
	super();
	this.real = real;
	this.img = img;
    }
 public static ComplexNumbers sum(ComplexNumbers c1,ComplexNumbers c2)
 {
	 ComplexNumbers temp=new ComplexNumbers(0, 0);
	 temp.real=c1.real+c2.real;
	 temp.img=c1.img+c2.img;
	 return temp;
 }
 public static ComplexNumbers diff(ComplexNumbers c1,ComplexNumbers c2)
 {
	 ComplexNumbers temp1=new ComplexNumbers(0, 0);
	 temp1.real=c1.real-c2.real;
	 temp1.img=c1.img-c2.img;
	 return temp1;
 }
 public static ComplexNumbers product(ComplexNumbers c1,ComplexNumbers c2)
 {
	 
		 ComplexNumbers temp2=new ComplexNumbers(0, 0);
		 temp2.real=c1.real*c2.real-c1.img*c2.img;
		 temp2.img=c1.img*c2.real+c2.img*c1.real;
		 return temp2;
		 
 }
 public static void swap(ComplexNumbers c1,ComplexNumbers c2)
 {
	 ComplexNumbers temp3=new ComplexNumbers(0, 0);
	 temp3.real=c1.real;
	 c1.real=c2.real;
	 c2.real=temp3.real;
	 temp3.img=c1.img;
	 c1.img=c2.img;
	 c2.img=temp3.img;
	 System.out.println("swapped numbers are :"+" "+c1.real+"+"+c1.img+"i"+" & "+c2.real+"+"+c2.img);
 }
 
 
	public static void main(String[] args) 
	{
		ComplexNumbers c1 = new ComplexNumbers(1, 2);
		ComplexNumbers c2 = new ComplexNumbers(3, 4);
	    ComplexNumbers temp = sum(c1, c2);
	    System.out.println("Sum is: "+ temp.real+" + "+ temp.img +"i");
	    ComplexNumbers temp1 = diff(c1, c2);
	    System.out.println("difference is: "+ temp1.real+" + "+ temp1.img +"i");
	    ComplexNumbers temp2 = product(c1, c2);
	    System.out.println("product is: "+ temp2.real+" + "+ temp2.img +"i");
	    swap(c1,c2);

	}

}
