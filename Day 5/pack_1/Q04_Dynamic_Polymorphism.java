//4) Create a class "Top1" with "disp1()" method.
//From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
//Now show how will u achieve dynamic polymorphism.

package pack_1;

class Top1{
	void disp1() {
		System.out.println("Top 1");
	}
}

class Bottom1 extends Top1{
	void disp1() {
		System.out.println("Bottom 1");
	}
}
class Bottom2 extends Top1{
	void disp1() {
		System.out.println("Bottom 2");
	}
}
class Bottom3 extends Top1{
	void disp1() {
		System.out.println("Bottom 3");
	}
}

public class Q04_Dynamic_Polymorphism {
	
	static void perform(Top1 ref) {
		ref.disp1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(new Bottom1());
		perform(new Bottom2());
		perform(new Bottom3());

	}

}
