/*  52.	Input name of a person and count how many vowels it contains.
    Use String class functions. 
*/

package demo;

import java.util.Scanner;

class Count{
	String name;

	public Count(String name) {
		
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String p) {
		this.name = p;
	}
	@Override
	public String toString() {
		return "Count [p=" + name + "]";
	}

}

public class vowelcount {

	public static void main(String[] args) {
		int vowels=0;
		Scanner sc = new Scanner(System.in);
		String person=sc.nextLine();
		
	
		for(int i = 0; i < person.length(); i++)
        {
            char ch = person.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                
				++vowels;
            }

        }
		
        System.out.println("Vowels: " + vowels);
		Count c=new Count(person);
		
	}

}