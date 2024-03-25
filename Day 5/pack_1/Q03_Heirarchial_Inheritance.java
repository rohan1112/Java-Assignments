//3) Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.

package pack_1;
class P{
	P(){
		System.out.println("Parent P");
	}
}
class Q extends P{
	Q(){
		System.out.println("child Q");
	}
}
class R extends P{
	R(){
		System.out.println("Child R");
	}
	
}
public class Q03_Heirarchial_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q=new Q();
		R r=new R();
	}

}
