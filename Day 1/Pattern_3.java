//
//8) solve following patten programs:
//
//       * * * * 
//        * * * 
//         * * 
//          * 
public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++) {  //for row
			for(int j=0;j<i;j++) {  //for space in column
				System.out.print(" ");
			}
			for(int j=0;j<4-i;j++) {
				System.out.print("* ");	//for printing stars in column
			}
			System.out.println();
		}
	}

}
