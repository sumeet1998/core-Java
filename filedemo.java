/*
 * 66.	Write a program to store your shopping details in a binary file(shopping.dat) 
 * with information itemName, price, quantity. (Use ObjectOutputStream to store Item class object ).
 */

package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class filedemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		String itemName = "Mobile";
		double price = 12000.25;
		int quantity = 5;
		try {
		// Creates objectOutStream
		FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\Desktop\\C-DAC\\JAVA\\dir\\shopping.dat");
		ObjectOutputStream obj = new ObjectOutputStream(fos);
		
		// writes objects to output stream
		obj.writeUTF(itemName);
		obj.writeDouble(price);
		obj.writeInt(quantity);
		
		//Reads data using the ObjectInputStream
		FileInputStream fileStream = new FileInputStream("C:\\Users\\HP\\Desktop\\C-DAC\\JAVA\\dir\\shopping.dat");
        ObjectInputStream objStream = new ObjectInputStream(fileStream);
        
        System.out.println("ItemName data : "+ objStream.readObject());
        System.out.println("Price data : " + objStream.readDouble());
        System.out.println("Quantity is : " + objStream.readInt());
       
        obj.close();
        objStream.close();
		
		}
		
		catch(Exception e) {
			System.out.println("" +e);
		}
	}

}