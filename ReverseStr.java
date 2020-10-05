/*
    54.	Write a program to reverse the given String.
*/

package demo;

import java.util.Scanner;

public class ReverseStr{

	public static void main(String[] args) {

		     Scanner sc = new Scanner(System.in);
		     
		      System.out.println("Enter the String ");
		      
		      String name = sc.nextLine();
		      		      
		      int len = name.length();
		      
		      System.out.println("The length of Given String : " +len);
		      
		      for(int i = len-1 ; i>=0 ; i--)
		      {
		    	  System.out.print(name.charAt(i));
		      }
		      
		   
			}

		}