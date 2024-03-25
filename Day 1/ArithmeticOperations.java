import java.util.Scanner;

public class  ArithmeticOperations{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Addition is: "+a+b);
		System.out.println("Subtraction is is: " +(a-b));
		System.out.println("Multiplication is: "+a*b);
		if(b>0) {			
			System.out.println("Dividation is: "+a/b);
		}else {
			System.out.println("divider must be greater than 0");
		}
		
		if(a>b) {
			System.out.println("First number is greater than second");
		}else if(b>a) {
			System.out.println("Second number is greater than First");
		}else {
			System.out.println("Both are equals");
		}
	}

}
