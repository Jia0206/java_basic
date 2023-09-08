package etc.enum_basic;

import java.nio.file.spi.FileSystemProvider;

public class MainClass {

	public static void main(String[] args) {
		
		
		Developer kim =new Developer();
		kim.name= "김철수";
		kim.career = 3;
		kim.lang = Languages.JAVA;
//		kim.lang = "한국어";(X)
		
		
		Developer hong = new Developer();
		kim.name= "홍길동";
		kim.career = 10;
		hong.lang =Languages.PYTHON;
		
		Developer park = new Developer();
		kim.name= "박뚜띠";
		kim.career = 5;
		park.lang =Languages.CPP;
		
		
		System.out.println("kim의 주력 언어: " +kim.lang.getName());
		// string 으로 바뀌는 것 -> .getName으로 작성함으로써 
		System.out.println("hong의 주력 언어: " +hong.lang.getName());
		System.out.println("park의 주력 언어: " +park.lang.getName());
		 
		
		//values(): 열거형 타입에 존재하는 모든 상수를 배열에 담아서 리턴.
		for(Languages lang : Languages.values()) {
			System.out.println(lang);
		}
		
		//ordinal(): 열거형 타입에 열거되어 있는 순서를 정수값으로 리턴
		System.out.println(park.lang.ordinal());// 몇 번째이니?

		//valueOf(str): 매개값으로 전달된 문자열과 일치하는 요소를 리턴
		System.out.println(Languages.valueOf("CPP"));
//		System.out.println(Languages.valueOf("Merrong"));(x)
	}

}
