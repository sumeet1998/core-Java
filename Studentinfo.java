/* 40.	Create a class Student having data members name, roll no., age 
    and score. Write a program to accept 10 records of student and store
    them in an array. And then arrange the student records based on the 
    score group [0-50], [50-65], [65-80], [80-100].
*/

import java.util.Scanner;

class Student{
    String name;
    int rollno;
    int age;
    int score;

    Student(String name,int rollno,int age,int score){
        this.name=name;
        this.rollno=rollno;
        this.age=age;
        this.score=score;
    }

    void show(){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(age);
        System.out.println(score);
    }

}

class Studentinfo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student arr[] = new Student[1];  //create an array

        for(int i=0;i<arr.length;i++){

            System.out.println("name");
            String name = sc.next();

            System.out.println("rollno");
            int rollno = sc.nextInt();

            System.out.println("age");
            int age = sc.nextInt();

            System.out.println("score");
            int score = sc.nextInt();  

            Student s1 = new Student(name,rollno,age,score);
            arr[i]=s1;
           
        }
       
        for(int j=0;j<arr.length;j++){
            if(arr[j].score > 0 || arr[j].score <= 50){
                System.out.println("Category one score [0-50]");
                arr[j].show();
                
            }
            else if(arr[j].score >50 && arr[j].score <=65){
                System.out.println("Category one score [50-65]");
                arr[j].show();

           
            }             

            else if(arr[j].score >65 && arr[j].score <=80){
                System.out.println("Category one score [65-80]");
                arr[j].show();

     
            }      

            else if(arr[j].score >80 && arr[j].score <=100){

                System.out.println("Category one score [80-100]");
                arr[j].show();
            }      
           
        }
    }
}

