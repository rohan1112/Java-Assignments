//7)	Define a parent and a child class . Now explain function overriding with Example.
package q7;

class Shape{
	void area() {
		System.out.println("Area is: ");
	}
}

class Square extends Shape{
	private int height;
	private int width;
	
	

	public void area() {
		System.out.println("Area of Square is: "+ height *width);
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}
}

public class Q07_Shape {
	public static void main(String[] args) {
		Square s=new Square();
		
		s.setHeight(10);
		s.setWidth(20);
		Shape ss=new Shape();
		ss.area();
		s.area();
	}

}
