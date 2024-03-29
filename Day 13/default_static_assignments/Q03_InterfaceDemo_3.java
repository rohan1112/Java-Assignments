//3)define interface "Fourth" with "default void disp3()" method.
//define a class "Base1" with "public void disp3()" method,
//now derive a class Sub1 from "Base1" and "Fourth". Sub1 class should have only "public void myfun()" method.
//inside main create an object of "Sub1" and invoke "disp3".
//once you get the result, also try to invoke "disp3" of "Fourth"
package default_static_assignments;

interface Fourth{
	default void disp3() {
		System.out.println("Inside Fourth interface default disp3() method");
	}
}

class Base1{
	public void disp3() {
		System.out.println("Inside Base1 Class disp3() method");
	}
}

class Sub1 extends Base1 implements Fourth{
	public void myfun() {
		Fourth.super.disp3();
	}
}
public class Q03_InterfaceDemo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub1 s=new Sub1();
		s.disp3();
		s.myfun();

	}

}
