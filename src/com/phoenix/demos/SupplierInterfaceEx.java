package com.phoenix.demos;

import java.util.function.Supplier;

public class SupplierInterfaceEx {

	public static void main(String args[])
	{
		
		Supplier<Person> supplier = () ->{return new Person("Swaraj", 26);};
		
		System.out.println(supplier.get().getName());
		System.out.println(supplier.get().getAge());
		
	}
}
