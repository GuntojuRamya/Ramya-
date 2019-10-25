package com.ramya.assignment;

public class StackUsingArrays
{
	int size;
	int arr[];
	int top;

	StackUsingArrays(int size) 
	{
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int pushedElement) 
	{
		if (!isFull()) 
		{
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed element:" + pushedElement);
		} 
		else 
		{
			System.out.println("Stack is full !");
		}
	}

	public int pop() 
	{
		if (!isEmpty())
		{
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			return arr[returnedTop];

		} 
		else 
		{
			System.out.println("Stack is empty !");
			return -1;
		}
	}

	public int peek()
	{
		if(!this.isEmpty())
			return arr[top];
		else
		{
			System.out.println("Stack is Empty");
			return -1;
		}
	}

	public boolean isEmpty() 
	{
		return (top == -1);
	}

	public boolean isFull()
	{
		return (size - 1 == top);
	}

	public static void main(String[] args) 
	{
		StackUsingArrays stack_Using_Array = new StackUsingArrays(10);
		stack_Using_Array.pop();
		System.out.println("=================");
		stack_Using_Array.push(10);
		stack_Using_Array.push(30);
		stack_Using_Array.push(50);
		stack_Using_Array.push(40);
		System.out.println("=================");
		stack_Using_Array.pop();
		stack_Using_Array.pop();
		stack_Using_Array.pop();
		System.out.println("=================");
	}
}
