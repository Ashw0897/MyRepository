package com.phoenix.demos;

public class ThreadUsingLambda {

	public static void main(String[] args) {

         Runnable thread=()-> {
        	 System.out.println("Thread in Execution");
        	 };
        	 
        	 thread.run();
	}

}
