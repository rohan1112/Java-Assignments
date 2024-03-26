package calculator;


import java.util.Scanner;

public class MyCalcApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result;
		
		Calculator c=new Calculator();
		try {
			result=c.calDouble(num);
			System.out.println(result);
		}
		catch (MyArithException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
