//5) create abstract class Shape. declare "draw()" function as abstract. From this class define "Triangle","Polygon" and "Circle" .
//create an array of Shape having 3 elements.
//store child objects into this array . and call
//their draw function.

package pack_1;

abstract class Shape{
	abstract void draw() ;
}

class Triangle extends Shape{
	public void draw() {
		System.out.println("Drawing Triangle");
	}
}

class Polygon extends Shape{
	public void draw() {
		System.out.println("Drawing Polygon");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

public class Q05_Abstract_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape ref[]=new Shape[3];
		ref[0]=new Triangle();
		ref[1]=new Polygon();
		ref[2]=new Circle();
		
		for(int i=0;i<ref.length;i++) {
			ref[i].draw();
		}
		

	}

}
