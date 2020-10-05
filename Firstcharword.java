/*
*/

package r1;

import java.util.Scanner;

public class Firstcharword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Words");
		
		String name = sc.nextLine();
		
		String arr[] = name.split(" ");
		
		String nameres = "";
		
		int size = arr.length;
				
		for(int i=0;i<size;i++) {
			String  temp = arr[i];
			String temprev = "";
			int len = temp.length();
			
			for(int j = len-1 ; j>=0 ; j-- )
            {
            	
            	temprev = temprev + temp.charAt(j);
            	
            }

            nameres = nameres + temprev + " " ;
			
		}
		
         System.out.println(nameres);
		
		}
	}
