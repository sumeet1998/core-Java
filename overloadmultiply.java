/* 36.	Create a class MathOperation containing overloaded methods 
        ‘multiply’ to calculate multiplication of following arguments. 
        a.	 two integers 
        b.	 three floats 
        c.	 all elements of array 
        d.	one double and one integer 

*/

class MathOperation{
    int multiply(int i,int j){
        return i*j;
    }

    float multiply(float i,float j,float k){
        return i*j*k;
    }

    double multiply(double i,int j){
        return i*j;
    }

    void multiply(int arr[]){
        int z=1;
        for(int a : arr){
            z = z * a;
        }
        System.out.println("array multiplication : "+z);
    }
}

class overloadmultiply{
    public static void main(String args[]){
        MathOperation t = new MathOperation();

        System.out.println(t.multiply(2,3));

        System.out.println(t.multiply(2.5f,3.2f,1.2f));

        System.out.println(t.multiply(3.14,3));

        int array[] = new int[] {1,2,3,4};
        t.multiply(array);


    }
}