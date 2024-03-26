package calculator;



public class Calculator {
	public int calDouble(int num) throws MyArithException{
		
		if(num==0) {
			throw new MyArithException("Zero not allowed");
		}else if(num<0) {
			throw new MyArithException("negative not allowed");
		}else {
			
			return 2*num;
		}
	}
}
