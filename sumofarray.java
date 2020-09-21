/*
  26. Create an array of 17 elements in 5 rows.  And calculate sum of all elements. 
*/

 class sumofarray{
     public static void main(String args[])
	 {
         int sum=0;
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		int b[] = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34};
        int c[] = {8,9,5,8,7,9,5,6,3,1,2,3,5,7,8,8,5};
        int d[] = {8,9,53,28,7,9,52,6,3,1,22,3,5,7,8,8,52};
        int e[] = {8,9,5,18,75,9,65,6,73,1,28,3,58,7,88,98,5};
        int arr[][] = new int[5][17];
        arr[0] = a;
		arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        arr[4] = e;

        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Sum is :"+sum);
     }
 }