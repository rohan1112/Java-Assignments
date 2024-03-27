//3) write a file copy program using byte streams.
//( FileOutputStream and FileInputStream )
package assign_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q03_CopyProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("FileStore\\Message.txt");
		
		try(FileInputStream fis=new FileInputStream(f);FileOutputStream fos=new FileOutputStream("FileStore\\Copy.txt");) {
			
			byte[] arr=new byte[(int)f.length()];
			fis.read(arr);
			System.out.println("Content readed Successfully");
			
			fos.write(arr);
			System.out.println("Content Copied Successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
