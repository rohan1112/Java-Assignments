//3) define a functional interface "MyInterface" with an abstract method "void fun()"
//define a class Demo with two functions "static void perform" and main.
//from main function pass lambda expression, collect it in "perform" method and invoke "fun()" function.

package lambda_Assignments;

@FunctionalInterface
interface MyInterface{
	void fun();
}


public class Q03_LambdaDemo_3 {
	
	static void perform(MyInterface ref) {
		ref.fun();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(()->{System.out.println("Passing lambda function");});
		
	}

}
