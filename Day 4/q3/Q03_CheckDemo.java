package q3;
//3)	Define a class “Check” in which declare member variables using  different accessibility modifiers i.e.  <default>, private ,public and protected.   Define a function “disp”  which should be public.  Define a class “CheckDemo” in which you will write “main()” function. Create an instance of  the class “Check” and  show how many  variables can be accessed directly and how many indirectly.
class Check{
	private int num1=5;
	int num2;
	protected int num3;
	public int  num4;

	public void disp() {
		System.out.println(num1);
	}
}

public class Q03_CheckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c=new Check();
		c.disp(); //private indirectly
		System.out.println(c.num2=10); //default directly
		System.out.println(c.num3 = 40);; //protected directly
		System.out.println(c.num4 = 50);; //public directly;
	}

}
