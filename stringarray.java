/*
  28. Initialize one String type of array and print the elements using for each loop.
*/

 class stringarray{
     public static void main(String args[]) 
	 {
         char arr[] = new char[]{'S','u','m','e','e','t','D','e','b','a','d','w','a','r'};

         for(char a : arr){
             System.out.print(a);
         }
     }
 }