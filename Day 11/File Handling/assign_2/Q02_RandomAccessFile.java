//2) using RandomAccessFile class create a file.
//accept a message from user and write in a file.
//now read the message which u have stored in a file.
//now again accept a message and write in a file at the end of existing message.
//now read the entire content of file . ( u should be able to read both the messages now)
package assign_2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Q02_RandomAccessFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(RandomAccessFile raf=new RandomAccessFile("FileStore\\Message.txt", "rw")) {
			
			raf.seek(raf.length());
			Scanner sc=new Scanner(System.in);
			byte b[]=new byte[200];
			int k=System.in.read(b);
			raf.write(b,0,k);
			System.out.println("Message Stored Succesfully");
			
			raf.seek(0);
			
			System.out.println("Reading message from the file...");
			byte arr[]=new byte[(int)raf.length()];
			raf.read(arr);
			String storedMessage=new String(arr);
			System.out.println(storedMessage);
			
			raf.seek(raf.length());
			k=System.in.read(b);
			raf.write(b,0,k);
			System.out.println("Message Stored again Succesfully");
			
			raf.seek(0);
			
			System.out.println("Reading message again from the file...");
			arr=new byte[(int)raf.length()];
			raf.read(arr);
			storedMessage=new String(arr);
			System.out.println(storedMessage);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
