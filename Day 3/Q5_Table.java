import java.util.Scanner;

public class Q5_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int i=1;
		while(i<11) {
			System.out.println(num +" x " + i +" = " + num*i);
			i++;
		}
		System.out.println("******************************");
		int j=1;
		do{
			System.out.println(num +" x " + j +" = " + num*j);
			j++;
		}while(j<11);
		
		for(int k=1;k<11;k++) {
			System.out.println(num+" x "+k+" = "+num*k);
		}

	}

}
