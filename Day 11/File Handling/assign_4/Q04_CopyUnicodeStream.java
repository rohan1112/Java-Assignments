//4) Write a file copy program using unicode character streams.
//( FileWriter and FileReader )


package assign_4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q04_CopyUnicodeStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char chs[]=null;
		try{
			FileReader fr=new FileReader("FileStore\\Message.txt");
			chs=new char[(int)new File("FileStore\\Message.txt").length()];
			fr.read(chs);
			System.out.println("SucessFully Readed the Content");
			fr.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		try{
			FileWriter fw=new FileWriter("FileStore\\CopyUnicode.txt");
			fw.write(chs);
			fw.close();
			System.out.println("SucessFully Copied the Content");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
