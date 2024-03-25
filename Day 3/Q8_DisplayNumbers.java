//8) create int array of 5 elements and accept 5 values inside it. Now display all the numbers of array.

import java.util.Scanner;

public class Q8_DisplayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nums[]=new int[5];
		for(int i=0;i<5;i++) {
			nums[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			System.out.println(nums[i]);
		}

	}

}
