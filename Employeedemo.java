/* 38.	Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a.	Only parameterized constructor. [Do not overload the constructor]
b.	totalSalary always represents salary total of all the employees created.
c.	empNo should be auto incremented.
d.	display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display no. of employees and total of their salaries.

*/

class Employee{
    static int empNo=1;
    float salary;
    float totalSalary;

    Employee(int empNo, float salary,float totalSalary){
        this.empNo = empNo;
        this.salary = salary;
        this.totalSalary = totalSalary;

        empNo++;
    }

    void display(){
        System.out.println("total "+empNo);
    }
}

class Employeedemo{
    public static void main(String args[]){
        Employee e = new Employee(10,10000,200000);
        e.display();

    }
}