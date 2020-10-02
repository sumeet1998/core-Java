/* 34.	Create a class Circle that has two data members, one to store 
        the radius and another to store area and three methods first 
        init() method to input radius from user, second calculateArea() 
        method to calculate area of circle and third display() method to 
        display values of radius and area. Create class CircleDemo 
        ( main class) that creates the Circle object and calls init(), 
        calculateArea() and display() methods
*/

import java.util.Scanner;

class circle{
    private int radius;
    private float area;

    void firstinit(int radius){
        this.radius=radius;
        
    }

    float calculatearea(){
        area = 3.14f *(radius * radius);
        return area;
    }

    void display(){
        System.out.println("area = "+area);
    }
}

class Circledemo{
    public static void main(String args[]){
        circle c = new circle();
       
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        c.firstinit(r);
        c.calculatearea();
        c.display();
    }
}