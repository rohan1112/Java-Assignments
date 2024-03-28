//6) create a class "MyClass".
//create 5 different objects of it.
//add them in a ArrayList.
//store ArrayList in file.
//Now open a file, read ArrayList and display all objects.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MyClass implements Serializable{
	private int num;
	
	MyClass(int num){
		this.num=num;
	}

	@Override
	public String toString() {
		return "MyNum [num=" + num + "]";
	}
}

public class Q06_MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m1=new MyClass(100);
		MyClass m2=new MyClass(200);
		MyClass m3=new MyClass(300);
		MyClass m4=new MyClass(400);
		MyClass m5=new MyClass(500);
		
		List<MyClass> list=new ArrayList<MyClass>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		try {
			FileOutputStream fos=new FileOutputStream("Files\\mynum.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(list);
			System.out.println("Object Store SucessFully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list=null;
		try {
			
			FileInputStream fis=new FileInputStream("Files\\mynum.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			list=(List<MyClass>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
