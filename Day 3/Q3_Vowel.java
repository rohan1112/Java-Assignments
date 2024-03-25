//3) accept a character and display (using if.. else ) whether it is vowel or not.

import java.util.Scanner;

public class Q3_Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("It is Vowel");
		}else {
			System.out.println("It is consonant");
		}

	}

}
