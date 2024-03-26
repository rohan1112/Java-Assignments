

package client;

import developer.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath m=new MyMath();
		try {
			m.disp(8);
		} catch (NumberNotDivisibleBySevenException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
