//9) maintain ICC ranking of at least 5 batsmen in the "HashMap".
//list should be maintain as "rank" "name"
//e.g. "1" "Rohit Sharma".
//Now ask any rank bet'n 1 to 5 from user. ( user input).
//if user asks for a particular rank , retrieve batsman name for that rank from the HashMap.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q09_ICC_Ranking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		map.put("1", "Virat Kholi");
		map.put("2", "Rohit Sharma");
		map.put("3", "Shubman Gill");
		map.put("4", "Suryakumar Yadav");
		map.put("5", "Jasprit Bumrah");
		
		System.out.println("Please Enter Rank To See Player Name: ");
		String rank=sc.next();
		int num=Integer.parseInt(rank);
		if(num>5 || num<0) {
			System.out.println("Sorry but rank must be in between 1 to 5");
		}else {
			System.out.println(map.get(rank));
			
		}
		
		

	}

}
