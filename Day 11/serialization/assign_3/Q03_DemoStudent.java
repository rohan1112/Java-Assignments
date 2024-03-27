//3) Define a class "Student" with
//	private int rollno and private String name and private int age;
//	setters and getters
//
//	create 2 objects of Student and write them inside filesystem and thereafter read both the objects and display.
package assign_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	private int rollno;
	private String name;
	private int age;
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Student(int rollno,String name,int age) {
		this.rollno = rollno;
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
		
}
public class Q03_DemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(01,"Yash",40);
		Student s2=new Student(02,"Saurabh",26);
		
		try {
			FileOutputStream fos=new FileOutputStream("Serialization Folder\\Student_2.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.writeObject(s2);
			System.out.println("Object Stored Succesfully");
			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s1=null;
		s2=null;
		System.out.println("Making Object "+s1);
		System.out.println("Making Object "+s2);
		FileInputStream fis;
		try {
			fis = new FileInputStream("Serialization Folder\\Student_2.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			s1=(Student)ois.readObject();
			s2=(Student)ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After Reading Object From file"+ s1);
		System.out.println("After Reading Object From file"+ s2);
	}

}
