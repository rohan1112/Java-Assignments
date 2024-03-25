//1)create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access these attributes directly.
//provide accessor methods on these attributes and allow them to call from outside of your class.

class Shape{
	private int width;
	private int height;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
public class Q1_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape=new Shape();
		
		shape.setHeight(100);
		shape.setWidth(50);
		
		System.out.println(shape.getHeight());
		System.out.println(shape.getWidth());
	}

}
