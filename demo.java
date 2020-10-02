/* 35.	Create a class MathOperation that has four static methods. add()
     method that takes two integer numbers as parameter and returns the 
     sum of the numbers. subtract() method that takes two integer numbers 
     as parameter and returns the difference of the numbers. multiply() 
     method that takes two integer numbers as parameter and returns the 
     product. power() method that takes two integer numbers as parameter 
     and returns the power of first number to second number. Create 
     another class Demo (main class) that takes the two numbers from the 
     user and calls all four methods of MathOperation class by providing 
     entered numbers and prints the return values of every method.
*/

import java.util.Scanner;
class MathOperation{

    static int add(int i,int j){
        return i+j;
    }

    static int substract(int i,int j){
        return i-j;
    }

    static int multiply(int i,int j){
        return i*j;
    }

    static int power(int i,int j){
        int  z=1;
        for(int k=1;k<=j;k++){
           
             z = i*z;
           
        }
        return z;
    }
}

class demo{
    public static void main(String args[]){

        MathOperation t = new MathOperation();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int x = sc.nextInt();

        System.out.println("Enter 2nd number");
        int y = sc.nextInt();

        int z = t.add(x,y);
        System.out.println("addition = "+z);

        int z1 = t.substract(x,y);
        System.out.println("Substraction = "+z1);

        int z2 = t.multiply(x,y);
        System.out.println("Substraction = "+z2);

        int z3 = t.power(x,y);
        System.out.println("power = "+z3);

    }
}