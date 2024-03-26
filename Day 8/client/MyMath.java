package client;

import developer.NumberNotDivisibleBySevenException;

public class MyMath {
	public void disp(int num)throws NumberNotDivisibleBySevenException {
		if(num%7!=0) {
			throw new NumberNotDivisibleBySevenException("Number is not divisible by seven");
		}
		System.out.println(num);
	}

}
