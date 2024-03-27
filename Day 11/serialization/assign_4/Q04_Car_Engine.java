//4) create two classes
//	Engine
//		private int speed
//		private String type
//			setters and getters
//
//	Car
//		private Engine engine;
//		private String modelname;
//			setters and getters
//
//define class "Demo" with main
//	inside main create object of Car and then pass Engine to its setEngine method.
//	now serialize this object of Car and deserialize it.

package assign_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Engine implements Serializable{
	private int Speed;
	private String type;
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		Speed = speed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [Speed=" + Speed + ", type=" + type + "]";
	}
}

class Car implements Serializable{
	private Engine engine;
	private String modelname;
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", modelname=" + modelname + "]";
	}
	
	
}

public class Q04_Car_Engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		Engine en=new Engine();
		c.setModelname("BMW 3 Series");
		en.setSpeed(80);
		en.setType("V8");
		
		c.setEngine(en);
		
		try {
			FileOutputStream fos=new FileOutputStream("Serialization Folder\\Car.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(c);
			System.out.println("Object Stored Succesfully");
			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c=null;
		System.out.println("Making Object "+c);
		FileInputStream fis;
		try {
			fis = new FileInputStream("Serialization Folder\\Car.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			c=(Car)ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After Reading Object From file"+ c);

	}

}
