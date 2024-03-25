interface Vehicle { 
    
    // all are the abstract methods. 
    void changeGear(int a); 
    void speedUp(int a); 
    void applyBrakes(int a); 
} 

class FourWheeler implements Vehicle
{
	private int gear;
	private static int speedUp;
		public void changeGear(int a)
		{
			// how to change gear in FourWheeler
			this.gear=a;
		}
		public void speedUp(int a)
		{
			// how to speed up FourWheeler
			speedUp+=a;
		}
		public void applyBrakes(int a)
		{
			// how to apply brakes of FourWheeler
			this.speedUp-=a;
		}
		public String toString() {
			// TODO Auto-generated method stub
			return "FourWheeler [gear="+ gear+" speed="+speedUp+"]";
		}
}


class TwoWheeler implements Vehicle
{
	private int gear;
	private static int speedUp;
		public void changeGear(int a)
		{
			// how to change gear in FourWheeler
			this.gear=a;
		}
		public void speedUp(int a)
		{
			// how to speed up FourWheeler
			speedUp+=a;
		}
		public void applyBrakes(int a)
		{
			// how to apply brakes of FourWheeler
			this.speedUp-=a;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "TwoWheeler[gear="+ gear+" speed="+speedUp+"]";
		}
}
public class VehicleDemo {

	/**
	 * @param args
	 */
	static void perfom(Vehicle v) {
		v.changeGear(2);
		v.speedUp(40);
		v.applyBrakes(4);
		System.out.println(v.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perfom(new TwoWheeler());
		perfom(new FourWheeler());
		

	}

}
