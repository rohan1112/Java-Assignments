//2) accept a number and display whether it is divisible by 7 or not.

import java.util.Scanner;

public class Q2_DivisibleBySeven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num<0) {
			System.out.println("Number must be greater than zero");
		}
		
		if(num%7==0) {
			System.out.println("Number is divisible by 7");
		}else {
			
			System.out.println("Not Divisible by 7");
		}
	}

}
