/*
18.	Program to check whether number is prime or not.
*/

 import java.util.Scanner;

 class prime{
     public static void main(String args[])
	 {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter a number");
         int num = sc.nextInt();
         int flag = 0;

        for (int i = 2; i <= num/2; ++i)
		{
            if (num % i == 0)
			{
                flag = 1;
                break;
            }
        }
            if(flag == 0)
            System.out.println(num+ " is a Prime number");
            else
            System.out.println(num+ " is not a Prime number");
     }
 }