//15) accept a number and display whether it is prime or not.
import java.util.Scanner;

public class Q15_Check_Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		int num=sc.nextInt();
		
		for(int i=2;i<num/2;i++) {
			flag=true;
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println(num+ " is a Prime Number");
		}else {
			System.out.println(num+" is not a Prime Number");
		}
	}

}
