/*
 * 61.	Create a Thread class to print following star (*) pattern on screen with delay of
 *  1 second between each * print. Number of lines in the pattern should be passed
 *   to the constructor of Thread class. *   *  * * * *  * * * * * * * * * *
 *    Use this class in main method and ask user to enter number of lines to print.
 */

package demo;

import java.util.Scanner;

public class Threaddemo {

	public static  void main(String[] args) {
		
		Pattern p = new Pattern();
		p.start();
	}

}
class Pattern extends  Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lines to print star");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.print(" *  ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}