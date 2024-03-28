//1) accept 10 numbers from user and add them inside the ArrayList.
//using ListIterator display all the numbers bidirectionally.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Q01_ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			int num=sc.nextInt();
			list.add(num);
		}
		
		ListIterator<Integer> itr=list.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
