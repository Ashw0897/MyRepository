package com.phoenix.demos;

@FunctionalInterface
interface Test
{
	abstract public void addition(int a, int b);
	
}
@FunctionalInterface
interface Display
{
	abstract public void print(String msg);
	
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		
		Test t = (a,b)-> System.out.println(a+b);
		t.addition(40, 90);
		
		Display d = (msg)-> System.out.println(msg);
		d.print("Helllo Java");

	}

}
