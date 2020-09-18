/*
12.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. 
    If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]
*/
import java.util.Scanner;

class Gross{
	public static void main(String args[])
	{
 
		double gs;
		double sal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		sal=sc.nextDouble();
 
			if(sal<10000)
			{
				gs=sal+(sal*0.1)+(sal*0.9);
				System.out.println("Gross Salary:"+gs);
 
			}
			else{
				gs=sal+(sal*0.2)+(sal*0.98);
				System.out.println("Gross Salary:"+gs);
 
				}
	}

}
