//1)	display a table of a particular number   

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1;i<11;i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}

	}

}
