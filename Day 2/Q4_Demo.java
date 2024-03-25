//5) Define 3 classes A , B and C
//in all these classes create static and nonstatic variables as well as methods.
//	Now Define a class "Demo" ,in which define "main" function. From this main function try to access all the members of A ,B  and C.

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

class C {
	private int numC;
	private static int cntC;

	public int getNumC() {
		return numC;
	}

	public static int getCntC() {
		return cntC;
	}

	public static void setCntC(int cntC) {
		C.cntC = cntC;
	}

	public void setNumC(int numC) {
		this.numC = numC;
	}
	static 
	{
		System.out.println("In C static block");
	}
}

public class Q4_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A refOfA = new A();
		B refOfB = new B();
		C refOfC = new C();

		refOfA.setNumA(10);
		refOfB.setNumB(20);
		refOfC.setNumC(30);

		A.setCntA(100);
		B.setCntB(200);
		C.setCntC(300);
		
		System.out.println(refOfA.getNumA());
		System.out.println(refOfB.getNumB());
		System.out.println(refOfC.getNumC());
		
		System.out.println(A.getCntA());
		System.out.println(B.getCntB());
		System.out.println(C.getCntC());
	}

}
