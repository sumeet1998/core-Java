/*
17.Write a program to reverse a given number.
*/

import java.util.Scanner;
class reverse{
	public static void main(String args[])
	{
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter Number you want to reverse");
		int num = sc.nextInt();
		
		int rev=0;
		
		while(num>0){
			int rem = num%10; //4
			rev = rev * 10 +  rem;//4			
			num = num/10;
			
		}
		System.out.println("Reverse number is : " +rev);
	}
}