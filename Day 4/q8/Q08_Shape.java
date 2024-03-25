//8)	Define a parent class with one function. Define child class with the function having same name as of parent class function, but having different argument.
//Create an instance of child class and call the functions. Make sure u have followed the concept of “function overloading “ in inheritance.

package q8;

class Shape{
	void area(int a,int b) {
		System.out.println("Area is: "+a*b);
	}
}

class circle extends Shape{
	
	public void area(int r ) {
		System.out.println("Area of circle is: "+ 3.14*r*r);
	}

	
}

public class Q08_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		s.area(10, 20);
		
		circle c=new circle();
		c.area(2);

	}

}
