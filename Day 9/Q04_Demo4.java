//create a parent class "Artist" with a member function "void perform()".
//now derive following child classes from "Artist"
//	Actor,Singer and Musician and override "perform" in these classes to write the specific task.
//inside "Actor" class define one more method
//	void changeGateUp()
//	{
//		S.o.p("as per the role demands");
//	}
//
//now create a Demo class with main function.
//inside main function create array of "Artist" with size 3.
//store instances of the above child classes in it.
//Now traverse through the array and invoke "perform" of each child class. In addition to this wherever "Actor" object is there inside the array , also perform "changeGateUp()" method.

class Artist {
	void perform() {

	}
}

class Actor extends Artist {
	void perform() {
		System.out.println("Actor Performing");
	}

	void changeGateUp() {
		System.out.println("as per the role demands");
	}
}

class Singer extends Artist {
	void perform() {
		System.out.println("Singer singing");
	}
}

class Musician extends Artist {
	void perform() {
		System.out.println("Musician Performing");
	}
}

public class Q04_Demo4 {

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
