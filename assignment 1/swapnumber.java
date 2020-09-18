/*
11.	Write a program to swap two numbers without using third variable.
*/

import java.util.Scanner;
class swapnumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		System.out.println("value of a and b before swapping  "+a+"  "+b);
		int c;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("value of a and b after swapping  "+a+"  "+b);
		
		
	}
}