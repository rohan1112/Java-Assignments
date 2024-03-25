//10) accept 5 numbers in an array and display their sum.

import java.util.Scanner;

public class Q10_DisplaySum {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	System.out.println(sum);
	
	
}
}
