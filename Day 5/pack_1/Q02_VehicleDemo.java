//2) create a class "Vehicle", define a method "public void start()" in it. From this class derive a class FourWheeler. How will u override "start()" method of parent class ?
package pack_1;

class Vehicle{
	public void start(){
		System.out.println("Vehicle Start");
	}
}

class FourWheeler extends Vehicle{
	public void start() {
		System.out.println("FourWheeler Start");
	}
}

public class Q02_VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new FourWheeler();
		v.start();

	}

}
