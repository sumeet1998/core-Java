/*
20.Print all prime numbers between two given numbers. [ break continue ]
*/

import java.util.Scanner;

class primebetween{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
	
    System.out.println("Enter two Range");
    int ll = sc.nextInt();
    int ul = sc.nextInt();
    int temp;
	
    for(int i = ll ; i <= ul ; i++) 
    {
	  temp = 0;
	  for(int j = 1 ; j <= i ; j++)	
	  {
	   if(i % j == 0)
	   {
	   temp = temp+1;
	   }
	  }
	 if(temp == 2)
	 {
	  System.out.println(i); 
	 }
    }
  }
}