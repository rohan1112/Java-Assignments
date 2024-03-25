
interface PersistenceMechanism
{
	void writeData(String ref);
	String readData();
}


class FileSystem implements PersistenceMechanism{
	String data;
	public void writeData(String ref)
	{
		// how to write data inside FileSystem
		this.data=ref;
	}
	public String readData()
	{
		// how to read data from FileSystem
		return data;
	}
}

class DatabaseSystem implements PersistenceMechanism
{
	String data;
	public void writeData(String ref)
	{
		// how to write data inside FileSystem
		this.data=ref;
	}
	public String readData()
	{
		// how to read data from FileSystem
		return data;
	}
}

class BigdataSystem implements PersistenceMechanism
{
	String data;
	public void writeData(String ref)
	{
		// how to write data inside FileSystem
		this.data=ref;
	}
	public String readData()
	{
		// how to read data from FileSystem
		return data;
	}
}
public class StoreSystem {
	
	static void writeandread(PersistenceMechanism ref) {
		if(ref instanceof BigdataSystem) {
			ref.writeData("Hello there mate");
			System.out.println(ref.readData());;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersistenceMechanism[] arr=new PersistenceMechanism[3];
		arr[0]=new FileSystem();
		arr[1]=new DatabaseSystem();
		arr[2]=new BigdataSystem();
		
		for (int i = 0; i < arr.length; i++) {
			writeandread(arr[i]);
		}

	}

}
