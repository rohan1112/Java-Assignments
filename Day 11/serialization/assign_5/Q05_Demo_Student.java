//5) create a class "Student" with
//	int rollno, String name, String qualification,String hobbies,String bloodgroup,String emailid
//		setters,getters
//
//define a class "Demo" with main.
//inside main function create one object of student and then while serializing and deserializing make sure u store and retrieve only rollno,name and qualification of student. [ use Externalizable ]

package assign_5;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Externalizable{
	private int rollno;
	private String name;
	private String qualification;
	private String hobbies;
	private String bloodgroup;
	private String emailid;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public Student(){
		
	}
	

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(rollno);
		out.writeUTF(name);
		out.writeUTF(qualification);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		rollno=in.readInt();
		name=in.readUTF();
		qualification=in.readUTF();
	
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", qualification=" + qualification + ", hobbies="
				+ hobbies + ", bloodgroup=" + bloodgroup + ", emailid=" + emailid + "]";
	}
//	public Student(int rollno, String name, String qualification, String hobbies, String bloodgroup, String emailid) {
//		this.rollno = rollno;
//		this.name = name;
//		this.qualification = qualification;
//		this.hobbies = hobbies;
//		this.bloodgroup = bloodgroup;
//		this.emailid = emailid;
//	}
	
		
}

public class Q05_Demo_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setRollno(1);
		s.setName("Abc");
		s.setQualification("BE");
		
		try {
			FileOutputStream fos=new FileOutputStream("Serialization Folder\\Student_5.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s);
			System.out.println("Object Stored Succesfully");
			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s=null;
		System.out.println("Making Object "+s);
		FileInputStream fis;
		try {
			fis = new FileInputStream("Serialization Folder\\Student_5.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			s=(Student)ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After Reading Object From file"+ s);

	}

}
