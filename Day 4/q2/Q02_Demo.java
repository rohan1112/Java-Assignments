//2)	Create a class with static and non-static member variables. Define static and non-static member functions. Create instance of this class and call both static and non-static member functions.
package q2;

class A {
	private int numA;
	private static int cntA;

	public int getNumA() {
		return numA;
	}

	public void setNumA(int numA) {
		this.numA = numA;
	}

	public static int getCntA() {
		return cntA;
	}

	public static void setCntA(int cntA) {
		A.cntA = cntA;
	}
	static 
	{
		System.out.println("In A static block");
	}

}

class B {
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
		B.cntB = cntB;
	}
	static 
	{
		System.out.println("In B static block");
	}
}

public class Q02_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A refOfA = new A();
		B refOfB = new B();

		refOfA.setNumA(10);
		refOfB.setNumB(20);
	

		A.setCntA(100);
		B.setCntB(200);
		
		System.out.println("Not Static : "+ refOfA.getNumA());
		System.out.println("Not Static : "+refOfB.getNumB());
		
		
		System.out.println("Static : "+A.getCntA());
		System.out.println("Static : "+B.getCntB());
	
	}

}
