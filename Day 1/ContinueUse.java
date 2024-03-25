//4)	Display numbers from 3 to 30 except number 24  using loop.


public class ContinueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=3;i<31;i++) {
			if(i==24) {
				continue;
			}else {
				System.out.println(i);
			}
		}

	}

}
