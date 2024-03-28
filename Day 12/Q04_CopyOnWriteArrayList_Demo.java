//4) add 5 numbers inside CopyOnWriteArrayList and show how can you add one more number at the same time of traversal through its iterator.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q04_CopyOnWriteArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new CopyOnWriteArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		Iterator<Integer> itr=list.iterator();
		int i=100;
		while(itr.hasNext()) {
			int num=itr.next();
			if(num==30) {
				list.add(200);
			}
		}
		System.out.println(list);
	}

}
