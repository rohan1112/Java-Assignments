//5) define interface "First" with "static void disp1()" method.
//class "Base" with "static void disp2()" method.
//derive a class "Sub" from "Base" and "First"
//now define a class Demo in which define "main" method.
//inside main show how many ways you can invoke "disp1" and "disp2" methods.
package default_static_assignments;

interface FirstA{
	static void disp1() {
		System.out.println("Inside FirstA interface disp1() static method");
	}
}

class BaseB{
	static void disp2() {
		System.out.println("Inside BaseB Class disp2() static method");
	}
}

class SubB extends BaseB implements FirstA{
	public void invokeInterface() {
		super.disp2();
	}
}



public class Q05_InterfaceDemo_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Accessed directly through interface and class name: ");
		FirstA.disp1(); //Directly Accessing 
		BaseB.disp2();	//Directly Accessing
		
		SubB b=new SubB();
		System.out.println("**************************");
		System.out.println("Accessed parent method through child class: ");
		b.invokeInterface(); //Accessing disp2 from SubB

	}

}
