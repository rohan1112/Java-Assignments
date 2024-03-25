//2) Define a class "MyClass" and make sure clients can instantiate it , 
//a) without any argument
//b) with one int argument
//c) with two int arguments

class MyClass{
	private int num;
	private int num2;
	
	MyClass(){
		
	}
	MyClass(int num){
		this.num=num;
	}
	
	MyClass(int num,int num2){
		this.num=num;
		this.num2=num2;
	}
	@Override
	public String toString() {
		return "MyClass [num=" + num + ", num2=" + num2 + "]";
	}
}
public class Q2_MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass m1=new MyClass();
		MyClass m2=new MyClass(10);
		MyClass m3=new MyClass(10,20);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		

	}



}
