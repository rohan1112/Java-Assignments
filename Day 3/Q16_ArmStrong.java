//16) accept 3 digit number and display whether it is armstrong or not.
//	[ A number is called as armstrong number if sum of cubes of digits of number is equal to the number itself ] eg//153 = (1*1*1)+(5*5*5)+(3*3*3)=153

import java.util.Scanner;

public class Q16_ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int original=num;
		
		while(num!=0) {
			int digit =num%10;
			sum=digit*digit*digit+sum;
			num=num/10;
			
		}
		if(original==sum) {
			System.out.println("It is ArmStrong Number");
		}
		else {
			System.out.println("Not ArmStrong Number");
		}
		
		

	}

}
