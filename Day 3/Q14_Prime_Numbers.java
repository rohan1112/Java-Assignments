//14) display prime numbers from 2 to 20

import java.util.Scanner;

public class Q14_Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		for(int i=start;i<end;i++) {
			boolean flag=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println(i);
			}
		}

	}

}
