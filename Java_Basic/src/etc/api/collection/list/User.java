package etc.api.collection.list;

public class User {
	
	private String name;
	private int age;
	// private -> getter setter 선택
	
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}// generate constructor using fields


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "이름 =" + name + ", 나이=" + age + "세";
	}
	
	
	
	
	
}
