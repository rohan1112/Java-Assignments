//5)	Using if…….else if….  Else,  display whether result is  fail, pass, second class , first class, Distinction etc.  

import java.util.Scanner;

public class If_Else_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		
		if(marks<0 || marks>100) {
			System.out.println("Invalid Marks: Must be between 0 to 100");
		}
		
		if(marks<=100&& marks>=75) {
			System.out.println("First Class with Distinction");
		}else if(marks<=74&& marks>=50) {
			System.out.println("First Class");
		}else if(marks<=49&& marks>=40) {
			System.out.println("Second Class");
		}else {
			System.out.println("Fail");
		}

	}

}
