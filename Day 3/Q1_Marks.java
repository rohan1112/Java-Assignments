//1) accept marks from user. if marks are
//	> 75  display "Distinction"
//	> =60 and < =75 display "first class"
//	> =45 and < 60 display "second class"
//	>=35 and < 45 display "pass class"
//	<35 display "fail"


import java.util.Scanner;

public class Q1_Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		
		if(marks<0 || marks>100) {
			System.out.println("Invalid Marks: Must be between 0 to 100");
		}
		
		if(marks<=100&& marks>=75) {
			System.out.println("First Class with Distinction");
		}else if(marks<=74&& marks>=60) {
			System.out.println("First Class");
		}else if(marks<=59&& marks>=45) {
			System.out.println("Second Class");
		}else if(marks<=44&& marks>=35) {
			System.out.println("pass class");
		}else {
			System.out.println("Fail");
		}

	}

}
