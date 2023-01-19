package com.phoenix.demos;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterfaceEx {

	public static void main(String[] args) {

        Function<Integer, Double> function = c -> { return new Double((c*9/5) + 32);};
	     int c= 100;
	     
	     System.out.println(function.apply(c));
	     
	     BiFunction<Integer, Integer, Long> bifunction =(a, b) -> 
	     {
	    	 return (long) (a+b);
	    			 
	     };
	     System.out.println(bifunction.apply(500, 590));
	}

}
