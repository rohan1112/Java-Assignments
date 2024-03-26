//write a program to display the method names inside the class which is passed as a command line argument.
import java.lang.reflect.Method;

public class Q06_RelectionAPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c=null;
		try {
			c=Class.forName(args[0]);
			
			Method m[]=c.getDeclaredMethods();
			
			for(int i=0;i<m.length;i++) {
				System.out.println(m[i]);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			

e.printStackTrace();
		}

	}

}
