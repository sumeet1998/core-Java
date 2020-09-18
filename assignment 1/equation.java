/*
03.	Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the 
    given expression and initialize variables by any random value.
	A. y = x2 + 3x - 7 (print value of y) 
	B. y = x++ + ++x (print value of x and y) 
	C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
	D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ] */

class equation {
	public static void main(String args[]){
		int x=2;
		int y=(x*x)+(3*x)-7;
		System.out.println("A). y = "+y);
		
		int y1=(x++) + (++x);
		System.out.println("B). y = "+y1+", x = "+x); 
		
		int z=(x++) - (--y) - (--x) + (x++); 
		System.out.println("C). z = "+z);
		
		/*boolean x2=0,y2=0;
		boolean z1=x2 && y2 || !(x2 || y2);
		System.out.println("D). z = "+z1);*/
	}
	
}
