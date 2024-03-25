//8) Define a class "base1" with only parameterized constructor.
//Derive a class "sub1" from "base1". This class should have following constructors
//	a) Default
//	b) one parameter
//	c) two parameter
//Now try to instantiate "sub1" , using any of the above mentioned constructors.
package pack_1;


class base1{
	int num;
	base1(int num){
		this.num=num;
	}	
}

class sub1 extends base1{
	sub1(){
		super(0);
		
	}
	sub1(int num){
		super(num);
		
	}
	sub1(int num,int num2){
		super(num);
	}
	
	int getNum() {
		return num;
	}
}


public class Q08_Parametrized_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub1 one=new sub1();
		sub1 second=new sub1(10);
		sub1 third=new sub1(20);
		
		System.out.println(one.getNum());
		System.out.println(second.getNum());
		System.out.println(third.getNum());

	}

}
