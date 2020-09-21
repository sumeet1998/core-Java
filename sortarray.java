/*
  22. Sort a ten element array in descending order.
*/

 class sortarray{
     public static void main(String args[])
	 {
          int arr[] = new int[]{54,56,10,4,8,18,70,12,15,2};

          int i,j,k;
          for(i = 1; i<10; i++){
              k = arr[i];
              j = i-1;

              while(j>=0 && arr[j]<k)
			  {
                  arr[j+1] = arr[j];
                  j=j-1;
              }
              arr[j+1] = k;
          }

          for(int a : arr)
		  {
              System.out.println(a);
          }
     }
 }