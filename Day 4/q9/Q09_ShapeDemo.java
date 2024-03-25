//9)	Define a class “Shape” with “draw()” function . Now derive  classes like “Circle”, “Polygon”,”Rectangle” etc. from “Shape” and override “draw()” function. Define a class “ShapeDemo” in which  write  main()  function. In the main function create a reference to Shape class referring to any of the sub class. Using this reference, call “draw()” and check the result.

package q9;

class Shape{
	void draw() {
		System.out.println("Draw Shape");
	}

}

class Circle extends Shape{
	void draw() {
		System.out.println("Draw Circle");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Draw Triangle");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Draw Rectangle");
	}
}
public class Q09_ShapeDemo {
	static void perform(Shape Shape) { //1->Shape=new Circle(); 2->Shape=new Triangle(); 3->Shape=new Rectangle();
		Shape.draw();
	}
	public static void main(String[] args) {
		perform(new Circle());
		perform(new Triangle());
		perform(new Rectangle());
		
		
		
	}

}