//2) define a functional interface "Second" with an abstract method "void disp4()".
//
//define a class Demo with main function.
//inside main function create two implementations of "Second" using lambda expression and display their names.


package lambda_Assignments;

@FunctionalInterface
interface Second{
	void disp4();
}
public class Q02_LambdaDemo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second s1=()->{};
		Second s2=()->{};
		
		System.out.println("Name of first Implementation"+ s1.getClass().getName());
		System.out.println("Name of first Implementation"+ s2.getClass().getName());
	}
	

}
