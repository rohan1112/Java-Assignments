package q05_Developer;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age)throws VotingNotAllowedException {
		super();
		this.name = name;
		if(age<18) {
			throw new VotingNotAllowedException("Age must be greater than 18");
		}
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
