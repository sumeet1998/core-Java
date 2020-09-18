/*
07.	Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. 
    Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.
*/

import java.util.Scanner;
class percentage {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the mark of Subject 1");
		int sub1=sc.nextInt();
		System.out.println("Enter the mark of Subject 2");
		int sub2=sc.nextInt();
		System.out.println("Enter the mark of Subject 3");
		int sub3=sc.nextInt();
		System.out.println("Enter the mark of Subject 4");
		int sub4=sc.nextInt();
		
		float per=(sub1+sub2+sub3+sub4)/4;
		System.out.println( "percentage marks = "+per+" %");
	}
	
}