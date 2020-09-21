/*
  24. Write a program to search an element in the array.
*/

import java.util.Scanner;

class searchelement{
	public static void main(String[] args) 
	{
    int arr[] = {10,20,30,40,50};
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the search element");

    int i, key = sc.nextInt();

    for( i=0; i<arr.length; i++)
    {
      if(arr[i] == key)
       {
         System.out.println(key+" is present at Index:"+(i));
         break;
       }
    }
    if ( i == arr.length)
    {
     System.out.println(key + " not present array Index.");
    }
  }
}