package client_assig4;



import developer.InvalidLengthException;

public class Authenticator {
	public Authenticator(String password) throws InvalidLengthException{
		// TODO Auto-generated constructor stub
		if(password.length()<5 || password.length()>9) {
			throw new InvalidLengthException("Password length must be greater than 5 and and less than 9");
		}
		
	}
	
	public void done() {
		System.out.println("Done");
	}

}
