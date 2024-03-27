//1)create a customer class with following attributes
//	custid
//	custname
//	address
//	age
//create one instance of it and store it in a file. (Serialization).
//now open a file, read the object and read its contents . (Deserialization)

package assign_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable{
	private int custid;
	private String name;
	private String address;
	private int age;
	public Customer(int custid, String name, String address, int age) {
		super();
		this.custid = custid;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}

}

public class Q01_Assign_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c=new Customer(01,"Pratik","Yavatmal",16);
		
		try {
			FileOutputStream fos=new FileOutputStream("Serialization Folder\\Customer.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(c);
			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileInputStream fis;
		c=null;
		try {
			fis = new FileInputStream("Serialization Folder\\Customer.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			c=(Customer)ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c);

	}

}
