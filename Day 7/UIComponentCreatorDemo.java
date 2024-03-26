class UIComponent
{
}
class Button extends UIComponent
{
}
class TextField extends UIComponent
{
}
class CheckBox extends UIComponent
{
}
abstract class UIComponentCreator
{
	public void show(String type)
	{
		UIComponent comp=createUIComponent(type);
		add(comp);
	}
	public void add(UIComponent component)
	{
		System.out.println("Added the component\t"+component);
	}
	public abstract UIComponent createUIComponent(String type);
}

class WindowsUIComponentCreator extends UIComponentCreator {
	public UIComponent createUIComponent(String type){
		if(type=="button") {
			UIComponent button=new Button();
			return button ;
		}
		if(type=="textfield") {
			UIComponent textfield=new TextField();
			return textfield ;
		}
		if(type=="checkbox") {
			UIComponent checkbox=new CheckBox();
			return checkbox ;
		}
		return null;
	}
	
}
class LinuxUIComponentCreator extends UIComponentCreator {
	public UIComponent createUIComponent(String type){
		if(type=="button") {
			UIComponent button=new Button();
			return button ;
		}
		if(type=="textfield") {
			UIComponent textfield=new TextField();
			return textfield ;
		}
		if(type=="checkbox") {
			UIComponent checkbox=new CheckBox();
			return checkbox ;
		}
		return null;
	}
}
class MacUIComponentCreator extends UIComponentCreator {
	public UIComponent createUIComponent(String type){
		if(type=="button") {
			UIComponent button=new Button();
			return button ;
		}
		if(type=="textfield") {
			UIComponent textfield=new TextField();
			return textfield ;
		}
		if(type=="checkbox") {
			UIComponent checkbox=new CheckBox();
			return checkbox ;
		}
		return null;
	}
}


public class UIComponentCreatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowsUIComponentCreator window=new WindowsUIComponentCreator();
		LinuxUIComponentCreator linux=new LinuxUIComponentCreator();
		MacUIComponentCreator mac=new MacUIComponentCreator();
		
		window.show("button");
		window.show("textfield");
		
		linux.show("checkbox");
		linux.show("textfield");
		
		mac.show("textfeild");
		
		
		

	}

}
