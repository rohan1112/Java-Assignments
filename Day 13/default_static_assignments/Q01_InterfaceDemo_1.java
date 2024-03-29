//1) define interface "First" with "default void fun()" and interface "Second" with "default void fun()". 
//Now derive a class Child from both these interfaces. 
//Inside main function instantiate Child class instance and invoke "fun" method.
package default_static_assignments;

interface First{
	default void fun() {
		System.out.println("Inside first Interface");
	}
}

interface Second{
	default void fun() {
		System.out.println("Inside Second Interface");
	}
}
class MyClass implements First,Second{
	//This function is of MyClass
	public void fun() {                            
		System.out.println("Inside MyClass Class");
	}
}

public class Q01_InterfaceDemo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m=new MyClass();
		m.fun();
	}

}
