package q07_Client;
import q07_Developer.*;

import java.lang.reflect.Constructor;

public class Q07_ClientCode {
	
	static Object returnObject(String name) {
		Class c=null;
		try {
			c = Class.forName(name);
			Constructor con = c.getConstructor();
			Object obj=con.newInstance();
			return obj;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f=(First) returnObject("q07_Developer.First");
		System.out.println(f);
//		Second s=(Second) returnObject("q07_Developer.Second");
//		Third t=(Third) returnObject("q07_Developer.Third");
//		Fourth fh=(Fourth) returnObject("q07_Developer.Fourth");
//		System.out.println(s);
//		System.out.println(t);
//		System.out.println(fh);
	}

}
