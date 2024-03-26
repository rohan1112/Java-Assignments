//create 4 classes A,B,C,D with member functions Afun(),Bfun(),Cfun() and Dfun() respectively.
//now define "Demo" class with main function. Inside main function create array of Object class which will store instances of above mentioned classes. Traverse through this array and call "Cfun()" of class C only.

class A{
	void Afun() {
		System.out.println("A is in fun");
	}
}
class B{
	void Bfun() {
		System.out.println("B is in fun");
	}
	
}
class C{
	void Cfun() {
		System.out.println("C is in fun");
	}
	
}
class D{
	void Dfun() {
		System.out.println("D is in fun");
	}
	
}
public class Q03_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object c[]=new Object[4];
		c[0]=new A();
		c[1]=new B();
		c[2]=new C();
		c[3]=new D();
		
		for(int i=0;i<c.length;i++) {
			if(c[i] instanceof C) {
				((C)c[i]).Cfun();
			}
		}

	}

}
