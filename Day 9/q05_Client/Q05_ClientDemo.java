package q05_Client;

import q05_Developer.Person;
import q05_Developer.VotingNotAllowedException;

public class Q05_ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Person p=new Person("Tejas Ghude",23);
			System.out.println(p);
		} catch (VotingNotAllowedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Person p=new Person("Pratik Yadav",16);
			System.out.println(p);
		} catch (VotingNotAllowedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
