package oop.inter.basic;

// 인터페이스 : 객체의 규격(기능)을 표준화해서 명세하는 역할.
public interface Inter extends ParentInter {
	
	//인터페이스에서 변수를 선언하면 상수(static final)로 지정합니다.
	int num = 5;
	
/*	
  Inter(){
	 인터페이스는 생성자를 가질 수 없습니다.(객체화 될 수 없는 개념)	
	 class 선언하고는 사용할 수 있었는데 지금은 불가능.
	}
*/
	
	
	//인터페이스에서 메서드를 선언하면 추상 메서드로 지정됩니다.
	void method1();
	
	public static void staticMethod() {
		System.out.println("가능합니다~ ");
	}
	
}



