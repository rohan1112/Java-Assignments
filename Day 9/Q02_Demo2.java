//Define a class Sample with member variable “char ch” and a parameterized constructor. Create some instances(at least 2) of this class by passing any alphabet.  Now achieve following tasks:
//
//a) when you print the reference it should be display the character which was passed during instantiation.
//b) if two instances have same character or an alphabet, their "equals()" should return true and obviously "hashCode()" also should be same.

import java.util.Objects;

class Sample{
	char ch;
	
	Sample(char ch){
		this.ch=ch;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ch);
	}

	@Override
	public boolean equals(Object obj) {
		return this.ch==((Sample)obj).ch;
	}



	@Override
	public String toString() {
		return "[ch=" + ch + "]";
	}
}
public class Q02_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1=new Sample('A');
		Sample s2=new Sample('B');
		Sample s3=new Sample('A');
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		if(s3.equals(s1)) {
			System.out.println("S3 and S1 Both have same Characters");
		}else {
			System.out.println("Both have Different Characters");
		}
		
		System.out.println(s1+" "+s1.hashCode());
		System.out.println(s3+" "+s3.hashCode());
	}

}
