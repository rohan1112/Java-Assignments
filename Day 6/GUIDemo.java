
interface MouseHandler
{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
}
interface WindowHandler
{
	void windowClosing();
	void windowClosed();
}

class WindowGUIApp implements MouseHandler,WindowHandler
{

	@Override
	public void windowClosing() {
		// TODO Auto-generated method stub
		System.out.println("Closing the window");
		
	}

	@Override
	public void windowClosed() {
		// TODO Auto-generated method stub
		System.out.println("Closed the window");
		
	}

	@Override
	public void mouseClicked() {
		// TODO Auto-generated method stub
		System.out.println("Mouse clicked");
		
	}

	@Override
	public void mousePressed() {
		// TODO Auto-generated method stub
		System.out.println("Mouse Pressed");
		
	}

	@Override
	public void mouseReleased() {
		// TODO Auto-generated method stub
		System.out.println("Mouse Released");
		
	}
	
}

public class GUIDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowGUIApp windowGUIApp=new WindowGUIApp();
		windowGUIApp.mouseClicked();
		windowGUIApp.windowClosing();
		windowGUIApp.windowClosed();
		windowGUIApp.mousePressed();
		windowGUIApp.mouseReleased();
		

	}

}
