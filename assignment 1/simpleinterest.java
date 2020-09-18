/*
08.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.
*/

import java.util.Scanner;
class simpleinterest {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the principal amount");
		int p=sc.nextInt();
		System.out.println("Enter the rate of interest");
		float r=sc.nextInt();
		System.out.println("Enter the time");
		int t=sc.nextInt();
		
		double SI=p*r*t/100;
		System.out.println("Simple interest on "+p+" is = "+SI);
		double amount=p+SI;
		System.out.println("Total Amount to pay "+amount+" rs/-");
	
	}
	
}