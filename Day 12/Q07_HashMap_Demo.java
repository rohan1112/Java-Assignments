//7) create a HashMap.
//store  prn no. and students name of 10 students inside the HashMap.
//display it using iterator.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Q07_HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Tejas");
		map.put(2, "Pratik");
		map.put(3, "Yash");
		map.put(4, "Saurabh");
		map.put(5, "Rohan");
		map.put(6, "Shubham");
		map.put(7, "Avinash");
		map.put(8, "PQR");
		map.put(9, "XYZ");
		map.put(10, "ABC");
		
		Set<Entry<Integer,String>> set=map.entrySet();
		Iterator itr =set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> me= (Entry<Integer, String>) itr.next();
			System.out.println("Key: "+ me.getKey()+ " " + "Value: "+ me.getValue());
		}

	}

}
