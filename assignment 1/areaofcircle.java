/*
06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. 
    Then calculate and print the area and circumference of the circle.
*/


import java.util.Scanner;
class areaofcircle {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		float r=sc.nextFloat();
		
		double a=(3.14*r*r);
		System.out.println("Area of circle = " +a+" unit");
		
		double c=(2*3.14*r);
		System.out.println("Circumference of circle = "+c+" unit");
		
	}
	
}