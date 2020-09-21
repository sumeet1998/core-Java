/*
  31. Create a class Student with 2 data members rno and name. Create one method setData() that takes roll number and student name as parameter and stores them in data members rno and name. Create one more method showData() to print the data member values. Create another class ( main class) StudentDemo that creates Student class object and calls setData() and showData() methods.
*/


class student{

    private int rno;
    private String name;
	
    void setData(int id, String Name){
        rno = id;
        name = Name;
    }
    
    void showData(){
        System.out.println(rno+" "+name);
    }
}

class studentinfo{
    public static void main(String args[]) {
        student s  = new student();
        s.setData(45,"Ram");
        s.showData();
    }
}