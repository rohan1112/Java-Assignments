//Define a class “MyClass”. Define a class “Everything” and define a member function with variable no. of argument inside it. Define  a class Demo1  and define main function in it. From main function , call the function of class Everything and make sure you can pass any arguments , it will take and display. It should even take instance of “MyClass” and display.

class MyClass{

}
class Everything{
	void getBackEverything(Object ...varargs) {
		for(int i=0;i<varargs.length;i++) {
			System.out.println(varargs[i]);
		}
	}
}
public class Q01_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Everything e=new Everything();
		MyClass c=new MyClass();
		e.getBackEverything(1,"dww",true,5.2f,454.25,'A',c);
	}

}
