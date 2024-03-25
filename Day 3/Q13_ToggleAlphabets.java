//13) accept 6 characters in an array and toggle them [ only if they are alphabets ]
import java.util.Scanner;

public class Q13_ToggleAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		char ch[]=new char[6];
		
		for(int i=0;i<ch.length;i++) {
			ch[i]=sc.next().charAt(0);
		}
		
		for(int i=0;i<ch.length;i++) {
			if((ch[i]>=65 && ch[i]<=90)) {
				ch[i]=(char)(ch[i]+32);
			}
			else if((ch[i]>=97 && ch[i]<=122)) {
				ch[i]=(char)(ch[i]-32);
			}
		}
		
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	}

}
