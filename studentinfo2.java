/*
  32. Modify the above program (no. 31) to count the no of Student objects created. [ In this program static variable is required ]
*/


class student{

    private int rno;
    private String name;
    private static int no;
	
    void setData(int id, String Name){
        rno = id;
        name = Name;
        no++;
    }
    
    void showData(){
        System.out.println(no+"    "+rno+"     "+name);
    }
}

class studentinfo2{
    public static void main(String[] args) {
        System.out.println("SrNo RollNo Name");
        student s  = new student();
        s.setData(10,"Sumeet");
        s.showData();

        student s1  = new student();
        s1.setData(20,"Rohan");
        s1.showData();

        student s2  = new student();
        s2.setData(30,"Ankit");
        s2.showData();
    }
}