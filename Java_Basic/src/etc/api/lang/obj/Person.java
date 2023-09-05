package etc.api.lang.obj;

import java.util.Objects;

public class Person implements Cloneable {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	//equals를 오버라이딩 할 때는 hashCode도 함께 오버라이딩을 진행해 주시는 것이 좋습니다.
	//equals를 재 정의한다는 것은 내가 원하는 방식의 동등 비교를 하겠다는 것이기 때문에
	//hashcode의 값도 그에 맞게 같이 재 정의가 되어야 합니다.(hash 주소를 equals에 맞게 정의)
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	@Override
	protected void finalize() throws Throwable {
		//생성된 객체가 사라지는 시점에서 자동으로 호출(garbage collector 가 실행될 때)
		System.out.println(this.name + "이 죽었습니다 ㅜㅜ");
	}
	//객체 복사 메서드
	//Cloneable 구현해야함
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public void personInfo() {
		System.out.println("이름: " +name);
		System.out.println("나이: " + age + "세");
	}
	
}
