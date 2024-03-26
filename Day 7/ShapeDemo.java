
abstract class Shape{
	abstract void draw();
	void show() {
		System.out.println("Inside Show Method");
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
public class ShapeDemo {
	static void perform(Shape shape) { //1->Shape=new Circle(); 2->Shape=new Triangle(); 3->Shape=new Rectangle();
		shape.show();
		shape.draw();
	}
	public static void main(String[] args) {
		Shape[] s=new Shape[3];
		s[0]=new Circle();
		s[1]=new Triangle();
		s[2]=new Rectangle();
		for(int i=0;i<s.length;i++) {
			perform(s[i]);
		}
		
		
		
	}

}