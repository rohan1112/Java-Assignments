import java.util.Scanner;

public class Q7_OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0) {
			if(num%2==0) {
				System.out.println("It is even");
			}else{
				System.out.println("It is Odd");
			}
			
		}else {
			System.out.println("It is zero or less than 0");
		}
		
	}

}
