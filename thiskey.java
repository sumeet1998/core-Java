/* 33.	Write a program to demonstrate functionalities of this keyword in java. */

class demo{
    int id;
    String name;

    public demo(int id,String name){
        this.id= id;
        this.name=name;
    }

    void show(){
        System.out.println(id +" "+name);
    }
}

class thiskey{
    public static void main(String args[]){
        demo d=new demo(101,"sumeet");
        d.show();
    }
}