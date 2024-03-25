//9) create interface "Game" , have an abstract method "play()". from this interface implements classes like "Cricket" , "FootBall" and "Tennis".
//Now Define one more class 
//public class Demo with main function.
//In this class have a static method "perform" which will take interface reference as parameter.inside "perform()" see to it that any child object passed ,its "play()" method should be invoked. Call "perform()" method from main function.

package pack_1;

interface Game{
	void play();
}

class Cricket implements Game{
	public void play() {
		System.out.println("Playing Cricket");
	}
}

class Football implements Game{
	public void play() {
		System.out.println("Playing Footbll");
	}
}

class Tennis implements Game{
	public void play() {
		System.out.println("Playing Tennis");
	}
}

public class Q09_GameDemo {
	
	static void perform(Game ref) { //Game ref=new Cricket(); ->Upcasting 
		ref.play();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(new Cricket());
		perform(new Football());
		perform(new Tennis());
		
	}

}
