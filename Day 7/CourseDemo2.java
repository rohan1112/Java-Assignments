
class Course1 {
	public void start() {
	}

	public void stop() {
	}

}

class DACDBDACourse1 extends Course1 {
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

class MSCitCourse1 extends Course1 {
	public void start() {
		System.out.println("Starting MSCitCourse1");
	}

	public void stop() {
		System.out.println("Stop MSCitCourse1 course");
	}

}

class Basic extends Course1 {
	public void start() {
		System.out.println("Starting Basic");
	}

	public void stop() {
		System.out.println("Stop Basic course");
	}
}

public class CourseDemo2 {
	static void perform(Course1 c) {
		c.start();
		if (c instanceof DACDBDACourse1) {
			((DACDBDACourse1) c).orientation();
		}
		c.stop();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course1[] arr = new Course1[3];
		arr[0] = new DACDBDACourse1();
		arr[1] = new MSCitCourse1();
		arr[2] = new Basic();
		for (Course1 c : arr) {
			perform(c);
		}

	}

}
