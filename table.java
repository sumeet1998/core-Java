/*
  16. Write a program to print table of any entered number using loop.
 */

 import java.util.Scanner;

 class table{
     public static void main(String args[])
	 {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter Number :");
         int num = sc.nextInt();

         for(int i=1; i<=10;i++)
		 {
             System.out.print(num+" * "+i+" = ");
             System.out.print(num * i);
             System.out.println(" ");
         }
     }
 } 