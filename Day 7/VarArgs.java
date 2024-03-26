
public class VarArgs {
	
	static void disp(int ...var) {
		int sum=0;
		for(int i=0;i<var.length;i++) {
			sum+=var[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disp(1,5,6,8,9,7);
	}

}
