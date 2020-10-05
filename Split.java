/* 53. Input data exactly in the following format, 
   and print sum of all integer values. “67, 89, 23, 67, 12, 55, 66”.   
   (Hint use String class split method and Integer class parseInt method) .
*/

package demo;

import java.util.Scanner;

class Split {

	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the  String");
     
      String temp = sc.nextLine();
      
      int len = temp.length();
      
      String array[] = temp.split(",");
      
       int size = array.length;
      
      int sum = 0;
      
      int numarray[] = new int[size];
      
      for(int i = 0 ; i<array.length ; i++)
      {
    	  
    	  String var = array[i];
    	 
    	  numarray[i] = Integer.parseInt(var); 
    	  
      }
      
        for(int i = 0 ; i<numarray.length ; i++)
        {
        	sum = sum+numarray[i];
        }
        
          System.out.println("sum od split array is = "+sum);

	}

}