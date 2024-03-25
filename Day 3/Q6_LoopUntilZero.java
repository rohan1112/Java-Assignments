import java.util.Scanner;

public class Q6_LoopUntilZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		while(num!=0) {
			System.out.println("Enter a Number: ");
			num=sc.nextInt();
		}
		System.out.println("You entered 0");

	}

}
