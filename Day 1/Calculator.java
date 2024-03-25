//2) declare two numbers and one operator as a character. e.g. '+'
//using switch... case check which operator is declared and accordingly perform the action.


import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter an operator:");
		char ch=sc.next().charAt(0);
		
		switch (ch) {
		case '+': {
			System.out.println("Result is: "+ a+b);
			break;
		}
		case '-': {
			System.out.println("Result is: " + (a-b));
			break;
		}
		case '*': {
			System.out.println("Result is: "+ a*b);
			break;
		}
		case '/': {
			if(b==0) {
				System.out.println("Divider must be greater than 0");
			}
			System.out.println("Result is: "+ a/b);
			break;
		}
		case '%': {
			if(b==0) {
				System.out.println("Divider must be greater than 0");
			}
			System.out.println("Result is: "+ a%b);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
		
		

	}

}
