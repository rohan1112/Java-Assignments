//1)	Define 2 classes “First” and “Second” with member variables , member functions and constructors of  your choice. Now define a class “Two” in which define main function . In main function create various instances of First and Second  and call their individual member functions.
package q1;

class First {
	private int num;
	private int num2;
	
	First(){
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	First(int num){
		this.num=num;
	}
	
	First(int num,int num2){
		this.num=num;
		this.num2=num2;
	}
	@Override
	public String toString() {
		return "MyClass [num=" + num + ", num2=" + num2 + "]";
	}
	
}

class Second{
	private int numB;
	private static int cntB;

	public int getNumB() {
		return numB;
	}

	public void setNumB(int numB) {
		this.numB = numB;
	}

	public static int getCntB() {
		return cntB;
	}

	public static void setCntB(int cntB) {
		Second.cntB = cntB;
	}
	
}

public class Q01_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f1=new First();
		First f2=new First(10);
		
		Second s1=new Second();
		
		f1.setNum(10);
		f2.setNum2(30);
		
		s1.setNumB(40);
		
		System.out.println(f1.getNum());
		System.out.println(f2.getNum2());
		System.out.println(s1.getNumB());
		
		
	}

}
