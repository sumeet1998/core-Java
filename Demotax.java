/*48 Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. 
create abstract method calcTax(). 
a. Create class Employee(empId,name,salary) and implement Taxable to 
calculate incomeTax on yearly salary. 
b. Create class Product(pid,price,quantity) and implement Taxable to 
calculate salesTax on unit price of product. 
c. Create class for main method(Say XYZ), 
accept employee information and a product information from user and 
print income tax and sales tax respectively
*/
package demo;

import java.util.Scanner;

interface Taxable{
    double salesTax = 0.07;
    double incomeTax = 0.105;
    abstract void calcTax();
}

class Employee implements Taxable{
    Scanner sc = new Scanner(System.in);
    int empId = sc.nextInt();

    String name = sc.next();

    double salary = sc.nextDouble();

    public void calcTax()
    {
	    double total = (salary * 12 * incomeTax);
	    System.out.println(total);
    }
	
}

class Product implements Taxable{
    Scanner sc = new Scanner(System.in);
    int pid = sc.nextInt();

    float price = sc.nextFloat();

    double quantity = sc.nextDouble();

    public void calcTax(){
	double amt = (int) (price * salesTax * quantity);
	System.out.println(amt);
    }

}

class Demotax{
        public static void main(String[] args) {
//	    Product p = new Product();
//	    p.calcTax();
    
        Employee e = new Employee();
	    e.calcTax();
        }
}