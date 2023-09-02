package oop.constructor;

public class Person {
	
	String name;
	int age;
	int height;
	
	// 생성자를 선언하지 않으면 가장 기본 형태의 생성자를 하나 만듬
	
	Person() {}
	
	Person(String pName, int pAge, int pHeight) {
		name = pName;
		age = pAge;
		height = pHeight;
	}
	
	void info() {
		System.out.println("*** 정보 ***");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.println("키: " + height + "cm");
	}

}
