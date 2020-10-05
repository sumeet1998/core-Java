/* 59. Create a class Voter(voterId, name, age) with parameterized constructor.
   The parameterized constructor should throw a checked exception if age
   is less than 18. The message of exception is “invalid age for voter ”

*/

package demo;

import java.io.IOException;
import java.util.Scanner;
class Voter{
	int voterId;
	String name;
	int age;
	public Voter(int voterId, String name, int age){
		super();
		this.voterId = voterId;
		this.name = name;
		this.age = age;
	}
	 void age1()throws IOException
	  {
		  if(age<=18)
		  {
			  throw new ArithmeticException("invalid age for voter");  
		  }
		  
		  else
		  {
			  System.out.println("Welcome to voter list");
		  }
	  }
}
public class Exceptiondemo {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Voter ID : ");
		int vi = sc.nextInt();
		
		System.out.println("Enter the Voter Name : ");
		String vn = sc.next();
		
		System.out.println("Enter the Age");
		int va = sc.nextInt();
		
		Voter v1 = new Voter(vi,vn,va);
		v1.age1();
		
	}

}