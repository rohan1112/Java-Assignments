//10)	Define an interface “Vechicle” with “start()” function . Now derive  classes like “TwoWheeler”, “ThreeWheeler”,”FourWheeler” etc. from “Vehicle” and override “start()” function. Define a class “VDemo” in which  write  main()  function. In the main function create a reference to Vehicle  class referring to any of the sub class. Using this reference, call “start" method.
package q10;

interface Vehicle{
	void start();
}

class TwoWheeler implements Vehicle{
	public void start() {
		System.out.println("TwoWheeler Start");
	}
}

class ThreeWheeler implements Vehicle{
	public void start() {
		System.out.println("ThreeWheeler Start");
	}
}

class FourWheeler implements Vehicle{
	public void start() {
		System.out.println("FourWheeler Start");
	}
}
public class q10_VDemo {
	
	static void start(Vehicle v) {
		v.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start(new TwoWheeler());
		start(new ThreeWheeler());
		start(new FourWheeler());
		
	}

}
