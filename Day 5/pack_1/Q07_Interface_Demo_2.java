//7) Define class "Parent1" with some data.
//Define interface "Parent2" with some methods.
//Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.

package pack_1;

interface Parent2{
	void speak();
}

class Parent1{
	
	 int num;
	
}

class Child extends Parent1 implements Parent2{
	void setNum(int num) {
		this.num=num;
	}
	
	int getNum() {
		return num;
	}
	
	public void speak() {
		System.out.println("Speaking loudly");
	}
}


public class Q07_Interface_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.setNum(20);
		int returnNumber=c.getNum();
		System.out.println(returnNumber);
		c.speak();

	}

}
