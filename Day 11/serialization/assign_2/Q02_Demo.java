//2) Person class implements Serializable with
//	private String name
//	private int age
//
//		getters and setters
//		parameterized constructor
//
//Student extends Person
//	private int rollno
//		getter and setters
//		parameterized constructor accepting name,age and rollno
//			pass name and age to the super constructor
//
//
//Demo class with main
//	create one object of Student, write it inside file and then read.

package assign_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

class Student extends Person{
	private int rollno;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Student(int rollno,String name,int age) {
		super(name,age);
		this.rollno = rollno;
	}
		
}

public class Q02_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(1,"Tejas",22);
		
		try {
			FileOutputStream fos=new FileOutputStream("Serialization Folder\\Student_1.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			System.out.println("Object Stored Succesfully");
			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s1=null;
		System.out.println("Making Object "+s1);
		FileInputStream fis;
		try {
			fis = new FileInputStream("Serialization Folder\\Student_1.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			s1=(Student)ois.readObject();
			fis.close();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After Reading Object From file"+ s1);

	}

}
