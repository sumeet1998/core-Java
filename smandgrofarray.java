/*
  27. Write a program to fine the smallest and greatest number present in the array of integer type.
*/

 class smandgrofarray{
     public static void main(String args[]) 
	 {
         int arr[] = new int[]{20,10,12,23,54,30,32,4};
        //  int min = 0;
        //  int max = 0;
         for( int i=0; i<arr.length; i++){
             if(arr[0] > arr[i])
             arr[0]=arr[i];
         }
         System.out.println("Min number in array = "+arr[0]);

         for(int i=0; i<arr.length;i++){
             if(arr[0] < arr[i])
             arr[0]=arr[i];
         }
         System.out.println("Max number in array = "+arr[0]);
     }
 }