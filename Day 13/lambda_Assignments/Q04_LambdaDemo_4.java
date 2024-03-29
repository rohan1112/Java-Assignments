//4) define a functional interface "Calculator" with an abstract method "int multiply(int a,int b)"
//define a class "CalcDemo" with main method.
//inside main using lambda create an implementation of "Calculator" , invoke "multiply()" method and display its result.
package lambda_Assignments;

import java.util.Scanner;

@FunctionalInterface
interface Calculator{
	int multiply(int a,int b);
}

public class Q04_LambdaDemo_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating Implementation of Calculator using Lambda Expression
		Calculator calc=(a,b)->{return a*b;};
		
		//invoking multiply method and storing the result in result
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers which you want to multiply: ");
		int firstNum=sc.nextInt();
		int secondNum=sc.nextInt();
		sc.close();
		
		int result=calc.multiply(firstNum, secondNum);
		
		//Printing result to the console
		System.out.println("Multiplication is: "+ result);
	}

}
