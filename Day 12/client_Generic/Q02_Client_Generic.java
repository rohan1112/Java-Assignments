package client_Generic;

import Developer_Generic.Q02_Generic;

public class Q02_Client_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q02_Generic<Integer> myClass=new Q02_Generic<Integer>();
		
		myClass.setValue(30);
		int num=myClass.getValue();
		
		System.out.println(num);
		System.out.println(myClass);

	}

}
