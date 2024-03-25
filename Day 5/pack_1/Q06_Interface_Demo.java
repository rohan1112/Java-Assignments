//6) Define interface "A" with "disp1()" method.
//Derive from "A", interface "B" with "disp2" method.
//Derive class "C" , from "B".
//Instantiate class "C" and call its members as well as derived from parent interfaces.
package pack_1;

interface X{
	void disp1();
}

interface Y extends X{
	void disp2();
}

class Z implements Y{
	public void disp1() {
		System.out.println("In display 1");
	}
	
	public void disp2() {
		System.out.println("display 2");
	}
}

public class Q06_Interface_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z c=new Z();
		c.disp1();
		c.disp2();

	}

}
