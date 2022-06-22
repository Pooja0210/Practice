package com.zenar;
/*
 *  Exception Handling - During RunTime & Abnormal Condition
 *  Simple Way of Try/Catch block
 *  try
 *  {
 *   code...10//possibility error: error prone statements
 *   }catch(TypeException e)
 *   {
 *     //handling code..
 *    }
 */
public class Example {
	public static void main(String[] args) {
		System.out.println("Started...");
		try {
		int n1 =Integer.parseInt(args[0]);
		int n2 =Integer.parseInt(args[1]);
		System.out.println("We have got two Numbers");
		int result = n1/n2;
		System.out.println("Division is " +result);
		}
		catch(ArithmeticException e) {
			System.out.println("n2 can not be 0!!");
			System.out.println(e.getMessage());
			//System.out.println(e.getCause());
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid Numbers !!");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("error!!");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Terminated...");
	}

}
