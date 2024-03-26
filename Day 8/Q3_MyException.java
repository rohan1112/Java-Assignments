import java.util.Scanner;

class MyException extends Exception{
	MyException(String message){
		super(message);
	}
}


public class Q3_MyException {
	public void show1() {
		try {
			show2();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public void show2() throws MyException {
	show3();
		
	}
public void show3()throws MyException {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	if(num>10) {
		throw new MyException("Number shoukd be less than 10");
	}
	System.out.println(num);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q3_MyException m=new Q3_MyException();
		m.show1();

	}

}