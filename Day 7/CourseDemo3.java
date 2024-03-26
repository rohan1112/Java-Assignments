
interface Course2 {
	public void start();

	public void stop();

}

class DACDBDACourse2 implements Course2 {
	public void start() {
		System.out.println("Starting DACDBDA");
	}

	public void stop() {
		System.out.println("Stop DACDBDA course");
	}

	public void orientation() {
		System.out.println("orientation of DACDBDA course");
	}
}

class MSCitCourse2 implements Course2 {
	public void start() {
		System.out.println("Starting MSCitCourse1");
	}

	public void stop() {
		System.out.println("Stop MSCitCourse1 course");
	}

}

class Basic1 implements Course2 {
	public void start() {
		System.out.println("Starting Basic");
	}

	public void stop() {
		System.out.println("Stop Basic course");
	}
}

public class CourseDemo3 {
	static void perform(Course2 c) {
		c.start();
		if (c instanceof DACDBDACourse2) {
			((DACDBDACourse2) c).orientation();
		}
		c.stop();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course2[] cc = new Course2[3];
		cc[0] = new DACDBDACourse2();
		cc[1] = new MSCitCourse2();
		cc[2] = new Basic1();
		for (Course2 c : cc) {
			perform(c);
		}

	}

}
