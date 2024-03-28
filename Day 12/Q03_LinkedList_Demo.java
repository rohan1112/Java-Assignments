//
//3) create LinkedList with the values 10,20,30 and 40.
//display it.
//now insert 500 in the beginning.
//	insert 400 at 2nd position.
//	add 1000 at the end.
//display the list again.

import java.util.LinkedList;
import java.util.List;

public class Q03_LinkedList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		list.add(0,500);
		list.add(1,400);
		list.add(1000);
		System.out.println(list);

	}

}
