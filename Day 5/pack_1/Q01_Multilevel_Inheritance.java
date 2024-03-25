//1) Create a multi-level inheritance , instantiate the child class and observe constructor invocation.Also show, if needed how will u invoke parent class constructor from child class ?
package pack_1;

class A{
	A(){
		System.out.println("GrandParent A");
	}
}

class B extends A{
	B(){
		System.out.println("Parent B");
	}
	
}

class C extends B{
	C(){
		System.out.println("Child C");
	}	
}

public class Q01_Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C class1=new C();
		
	}

}
