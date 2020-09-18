/*
15.	Accept person’s gender (character m for male and f for female), 
    age (integer), as input and then check whether person is eligible for marriage or not.
*/

import java.util.Scanner;
class marriage{
	public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the persons gender");
	  char gender=sc.next().charAt(0);
	  System.out.println("Enter the age of the person");
	  int age=sc.nextInt();
	  
	  if(gender=='m' || gender=='M')
	  {
		  if(age>=21 && age<=32)
		  {
			  System.out.println("person is eligible for marriage");
		  }
		  else
		  {
			  System.out.println("person is not eligible for marriage");
		  }
	  }
	  
	  
	   if(gender=='f' || gender=='F')
	  {
		  if(age>=18 && age<=26)
		  {
			  System.out.println("person is eligible for marriage");
		  }
		  else
		  {
			  System.out.println("person is not eligible for marriage");
		  }
	  }
	}

}