//9) create int array of 5 elements and accept 5 values inside it. Now accept one more number and check whether that number is there inside array or not.


import java.util.Scanner;

public class Q9_CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nums[]=new int[5];
		for(int i=0;i<5;i++) {
			nums[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int i;
		for(i=0;i<5;i++) {
			if(nums[i]==target) {
				System.out.println("Present at index " + i);
				break;
			}
		}
		if(i==5) {
			System.out.println("Not in the array");
		}
		
		
	}

}
