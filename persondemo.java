/* 37.	Create a class Person with properties (name and age) with 
        following features. 
        a.	Default age of person should be 18.
        b.	A person object can be initialized with name and age.
        c.	Method to display name and age of person
    Create another class PersonDemo ( main class ) that demonstrates the
     functionalities of Person class by creating Person object and calling methods.

*/

class person{
    int page;
    String pname;

    person(){
        page=18;
        pname="sumeet";
    }

    public person(int page,String pname){


        this.page=page;
        this.pname=pname;
    }

    void show(){
        if(page==18){
            System.out.println("Defalut age is "+page+" "+pname);
        }else{
        System.out.println(page + " " +pname);
        }
    }
}

class persondemo{
    public static void main(String args[]){
    
        person p1 = new person();
        person p = new person(18,"Rohan");
        p.show();
        p1.show();
    }
}