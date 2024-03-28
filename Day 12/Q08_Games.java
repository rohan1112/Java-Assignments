//8) create a hierarchy as follows
//	interface Game- play() method
//	Derive at least 3 classes from it. ( Cricket, Chess and Football )
//Now Create generic class which can take Game type (i.e. any sub type of Game) as parameter.
//In this class try to call the play() method of the class which is passed to it.

interface Game{
	void play();
}

class Cricket implements Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Cricket");
	}
	
}
class Football implements Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Football");
	}
	
}
class Chess implements Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Chess");
	}
	
}

class MyGame<T extends Game>{
	
	void playGame(T t) {
		t.play();
	}
}

public class Q08_Games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGame<Game> game=new MyGame<Game>();
		
		game.playGame(new Cricket());
		game.playGame(new Football());
		game.playGame(new Chess());
		
	}

}
