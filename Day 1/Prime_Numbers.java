//6) display all prime numbers between 3 to 30

import java.util.Scanner;

public class Prime_Numbers {

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
