/* 55.	Write a program to count no of words in the String.
*/

package demo;
import java.util.Scanner;
public class Countword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		
		int temp = 0;
		
		int len = s.length();
		System.out.println(len);
		
      System.out.println("The length of Given String : " +len);

		for(int i = 0 ; i<=len-1 ; i++)
		{
			temp = temp+1;
		}
		
		 System.out.println("Number of words in the String are = "+temp);

	}

}