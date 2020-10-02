/* 39.	Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values for all three data members.  
Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument) in Product class to calculate and return total amount spent on all products. ( amount spent on single product = price of product * quantity of product )

*/

import java.util.Scanner;

class Product{
    int pid;
    int price;
    int quantity;

    Product(int pid,int price,int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    static int total(Product ar[]){
        Product a;
        int sum = 0;
        for(int i=0;i<ar.length;i++){
            a=ar[i];
            sum =sum+(a.price * a.quantity);
        }
        return sum;
    }
}

class Productdemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Product ar[] = new Product[5];

        for(int i=0;i<ar.length;i++){
            System.out.println("pid");
            int pid = sc.nextInt();

            System.out.println("price");
            int price = sc.nextInt();

            System.out.println("quantity");
            int quantity = sc.nextInt();

            Product p = new Product(pid,price,quantity);
            ar[i] = p;
        }

        int max = 0;
        for(int i=0;i<ar.length;i++){
            if(ar[i].price > max){
                max = ar[i].price;
            }
        }
        System.out.println("pId of product with highest price : "+max);
        

        for(int i=0; i<ar.length;i++){
            if(max == ar[i].price){
                System.out.println("pId of product with highest price : "+ar[i].pid);
            }
        }

        int total = Product.total(ar);
        System.out.println("Total amount spent on the product : "+total);
        
    }
}