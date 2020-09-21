/*
19.	Calculate  series : 12+22+32+42+.........+n2
*/

/*  12 = 10 + 2
	22 = 20 + 2
	32 = 30 + 2
	42 = 40 + 2
	
	   = [ (( n*(n+1))/2)*10 + 2*n ]
*/

import java.util.Scanner;
class series{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		
		int n=sc.nextInt();
		
		int output= (( n*(n+1))/2)*10 + 2*n ;
		
		System.out.println("12+22+32+42+.........+"+n+"2  =>  "+output);
		
	}
}