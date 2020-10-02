/* 41.	Write a program to demonstrate this() construct functionality.
*/

class demo{
    demo(){
        System.out.println("Default Constructor");
    }

    demo(int i){
        this();
        int j=i;
        System.out.println("parameterized Constructor "+j);
    }
}

class thisconstructor{
    public static void main(String[] args) {
        demo d = new demo(20);
    }
    
}