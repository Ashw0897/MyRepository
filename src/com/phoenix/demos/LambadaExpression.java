package com.phoenix.demos;

interface Demo
{
	abstract public void test(int a, int b);
}

public class LambadaExpression {

	public static void main(String[] args) {

     Demo t =(int a, int b) ->{
    	   System.out.println(a+b);
    	   System.out.println("Lambada Expression");
    	   System.out.println("Java 8 Feature");
       };
       t.test(10, 80);
	}

}
