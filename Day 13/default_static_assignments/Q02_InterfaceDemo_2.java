//2) define interface "Third" with "default void disp1()" and "static void disp2()" methods.
//derive a class "Sub" from "Third" ( do not override "disp1")
//inside main function invoke "disp1" and "disp2" methods.

package default_static_assignments;

interface Third{
	default void disp1() {
		System.out.println("Inside default method display 1");
	}
	
	static void disp2() {
		System.out.println("Inside Static method display 2");
	}
}

class Sub implements Third{
	
}

public class Q02_InterfaceDemo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s=new Sub();
		s.disp1();
		Third.disp2();
	}

}
