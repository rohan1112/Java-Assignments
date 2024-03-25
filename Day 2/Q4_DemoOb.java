//4) Define a class "DemoOb". 
//create an instance of it.
//now create a reference and assign the reference created in the above statement.
//	Discuss what happens?
//Now since u have 2 references, take one of the reference and assign a new instance of the class.
//	Discuss what happens?
//(For ur discussion, write necessary comments in the program)

public class Q4_DemoOb {
	
	private int cnt=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q4_DemoOb ob1=new Q4_DemoOb(); //create an instance(New Object gets Created in the heap)
		Q4_DemoOb ob2=ob1;  //assign the reference created (here ob2 refers to the same object where ob1 is referring to)
		
		ob2=new Q4_DemoOb(); //here new object will get created in the heap and ob2 will refer to that new object;
		
		
		

	}

}
