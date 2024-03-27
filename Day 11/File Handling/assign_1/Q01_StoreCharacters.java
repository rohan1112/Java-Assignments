//1)accept 10 characters from a user ( use Scanner).
//store these 10 characters in a file. (FileWriter)
//Now open a file and read all these characters.

package assign_1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q01_StoreCharacters{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		char ch[]=new char[10];
		for(int i=0;i<ch.length;i++) {
			ch[i]=sc.next().charAt(0);
		}
		
		try (FileWriter fw=new FileWriter("FileStore\\Character.txt")){
			fw.write(ch);
			System.out.println("File writed succesfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		char arr1[]=null;
		
		
		try(FileReader fr=new FileReader("FileStore\\Character.txt");) {
			
			System.out.println("Reading the File");
			
			arr1=new char[(int)new File("FileStore\\Character.txt").length()];
			fr.read(arr1);
			
			for(int i=0;i<arr1.length;i++) {
				System.out.println(arr1[i]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
