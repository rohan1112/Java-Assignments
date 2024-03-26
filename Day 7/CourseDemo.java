//public abstract class Course
//{
//	public void start()
//	{
//		// start process
//	}
//	public abstract double getFee();
//	public abstract void evaluate();
//}
//
//define child classes of above abstract class
//	DACDBDACourse extends Course
//	MSCitCourse extends Course
//
//show late binding with the help of "perform()" method.

abstract class Course {
	public void start()
	{
		System.out.println("Starting the course");
	}
	public abstract double getFee();
	public abstract void evaluate();
	
}

class DACDBDACourse extends Course{
	double dac=98000;
	public double getFee() {
		return dac;
	}
	
	public void evaluate() {
		System.out.println("Evaluating DACDBDA...");
	}
}
class MSCitCourse extends Course{
	public double getFee() {
		return 15000;
	}
	
	public void evaluate() {
		System.out.println("Evaluating MSCIT...");
	}
	
}
public class CourseDemo {
	static void perform(Course c) {
		
		System.out.println(c.getFee());
		c.evaluate();
		c.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(new DACDBDACourse());
		perform(new MSCitCourse());

	}

}
