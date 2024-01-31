package com.prowings.localinnerclass;

public class Outer {

	private int data = 30;
	
	public void display()
	{
		
		System.out.println("display method started!!");
		final int i = 30;
		
		//local inner class
		
		class Inner{
			public void message()
			{
				System.out.println("Inside message() method of inner class!!");
				System.out.println(i);
				
			}	
		}
		
		Inner in = new Inner();
		in.message();
		System.out.println("display method ended!!");
	}
	
	public static void main(String[] args) {
		
		Outer out = new Outer();
		out.display();
	}
}
