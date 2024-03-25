//    * 
//   * * 
//  * * * 
// * * * * 
//  * * * 
//   * * 
//    * 

public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++) {  //for row
			for(int j=0;j<4-i-1;j++) {  //for space in column
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");	//for printing stars in column
			}
			System.out.println();
		}
		for(int i=0;i<3;i++) {  //for row
			for(int j=0;j<i+1;j++) {  //for space in column
				System.out.print(" ");
			}
			for(int j=0;j<3-i;j++) {
				System.out.print("* ");	//for printing stars in column
			}
			System.out.println();
		}
	}

}
