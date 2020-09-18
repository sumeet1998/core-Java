/*
  13.Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ]  
*/

import java.util.Scanner;
class greatest{
	public static void main(String args[]){
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3 )
		{
			System.out.println("Is Greater " +num1);
			
		}
		else if (num2>num1 && num2>num3)
		{
			System.out.println("Is Greater " +num2);
		}
		else{
			System.out.println("Is Greater " +num3);
		}
		
		System.out.println("\n****Using ternary operater****");

         int temp = (num1>num2) ? num1:num2;

        int result = (num3>temp) ? num3 : temp;

        System.out.println( "\nnumber which is greater = "+result);         

	}
}
