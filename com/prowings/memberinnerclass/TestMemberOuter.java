package com.prowings.memberinnerclass;

public class TestMemberOuter {

	private int data = 30;
	
	class Inner{
		
		void message()
		{
			System.out.println("The data from outer class is : "+data);
		}
	}
	
	public void display()
	{
		System.out.println("inside display() of outer class");
		Inner in = new Inner();
		in.message();
	}
	
	public static void main(String[] args) {
		
		TestMemberOuter obj = new TestMemberOuter();
		obj.display();
		
	}
	
}
