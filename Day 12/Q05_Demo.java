//5) create a class MyNum with
//		private int num;
//		parameterized constructor
//
//	
//Demo class with main
//	create 4 objects of MyNum by passing different integers.
//	store these 4 objects inside "ArrayList"
//	and now store that ArrayList inside file system.
//	
//	read ArrayList from file and traverse it using Iterator.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MyNum implements Serializable{
	private int num;
	
	MyNum(int num){
		this.num=num;
	}

	@Override
	public String toString() {
		return "MyNum [num=" + num + "]";
	}
}

public class Q05_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNum m1=new MyNum(10);
		MyNum m2=new MyNum(20);
		MyNum m3=new MyNum(30);
		MyNum m4=new MyNum(40);
		
		List<MyNum> list=new ArrayList<MyNum>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
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
			list=(List<MyNum>) ois.readObject();
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
