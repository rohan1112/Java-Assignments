package client_assig4;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Authenticator auth=new Authenticator("qwtydw");
			auth.done();
			Authenticator auth2=new Authenticator("qwt");
			auth.done();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
