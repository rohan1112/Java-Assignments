//3) Define a class "Emp" with private static member "int cnt".
//How will u make sure that outsiders can read the value of cnt ?

class MyClass1{
	private static int cnt;

	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int num) {
		MyClass1.cnt = num;
	}
	
}
public class Q3_MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1.setCnt(10);
		System.out.println(MyClass1.getCnt());
	}

}
