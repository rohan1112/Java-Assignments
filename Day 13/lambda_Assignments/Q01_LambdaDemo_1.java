//1) define a functional interface "First" with an abstract method "void disp1()" , default method "void disp2()" and a static method "void disp3() 
//inside main function using lambda expression invoke "disp1()" and "disp2()" methods.
//also invoke "disp3()" method inside main."
package lambda_Assignments;

@FunctionalInterface
interface First{
	void disp1();
	
	default void disp2() {
		System.out.println("In Default method of Functional Interface");
	}
	
	static void disp3() {
		System.out.println("In Static method of Functional Interface");
		
	}
}


public class Q01_LambdaDemo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		First ref=()->{System.out.println("Accessed by lambda Expression");};
		
		ref.disp1();
		ref.disp2();
		First.disp3();

	}

}
