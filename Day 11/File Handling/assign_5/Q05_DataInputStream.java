package assign_5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q05_DataInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		try {
			FileOutputStream fos = new FileOutputStream("FileStore\\storeNumbers.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			int num;
			while ((num = sc.nextInt()) != 0) {
				dos.writeInt(num);
			}
			fos.close();
			dos.close();
			System.out.println("Storing the numbers");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		try (FileInputStream fis = new FileInputStream("FileStore\\storeNumbers.txt")) {
			DataInputStream dis = new DataInputStream(fis);
			while(dis.available()!=0) {
				int k=dis.readInt();
				System.out.println(k);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
