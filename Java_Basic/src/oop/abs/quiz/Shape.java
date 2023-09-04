package oop.abs.quiz;

public abstract class Shape {
//  패키지명: oop.abs.quiz
//  클래스명: Shape

  /*
    
도형의 이름을 저장할 수 있는 변수(name)을 private으로 선언.
생성자를 선언 -> 매개값으로 도형의 이름을 받아서 저장할 수 있도록.

자식 클래스에게 오버라이딩을 강제할 수 있는 메서드 
getArea() 를 선언 (return type -> double)
도형 이름을 출력할 수 있는 메서드 getName()을 선언. (강제 x)
*/

private String name;

  public Shape(String name) { //생성자
      this.name = name;
  }
  public abstract double getArea(); //추상메소드 선언
  //바디가 없음

  public String getName() { //메서드
      return name;
      //name이 private이기 때문에 

  }
  public void setName(String name) {
      this.name = name;
  }
}