//12) accept 2 numbers and display whether
//	a) first number is greater
//	b) second number is greater
//	c) both are equal

import java.util.Scanner;

public class Q12_CompareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println(a+" is greater than "+b);
		}else if(b>a){
			System.out.println(a+" is less than "+b);
		}else {
			System.out.println(a+" is equal to "+b);
		}
	}

}
