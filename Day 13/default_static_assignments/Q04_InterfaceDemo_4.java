//4) define interface "Base1" with "default void fun1()".
//derive an interface "Sub1" from "Base1" with "default void fun2()"
////derive a class "Sub2" from "Sub1". It should have only "public void fun3()" method.
//inside main function, create an object of "Sub2" and make sure when u invoke "fun3", it should call "Sub1's fun2" which should call "Base1's fun1" method.

package default_static_assignments;

interface BaseA{
	default void fun1() {
		System.out.println("Inside BaseA interface default fun1() method");
	}
}

interface SubA extends BaseA{
	default void fun2() {
		BaseA.super.fun1();
		System.out.println("Inside SubA interface default fun2() method");
	}
}

class SubC implements SubA{
	public void fun3() {
		SubA.super.fun2();
		System.out.println("Inside SubC Class default fun3() method");
	}
}
public class Q04_InterfaceDemo_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubC s=new SubC();
		s.fun3();

	}

}
