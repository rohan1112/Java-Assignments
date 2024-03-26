package client_assig5;

import developer_resource.MyResource;
import developer_resource.ResourceNotAllocatedException;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(MyResource res=new MyResource(200);) {
			
			res.display();
		} catch (ResourceNotAllocatedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}