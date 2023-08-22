package basic.casting;

public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 
		 * 변환할 때는 자바 가상 머신(JVM)이 자동으로 타입을 올려서 
		 * 변환해 줍니다.
		 * */
		byte b = 10;
		int i = b; // byte -> int로 변환된 후 대입 연산 진행. 
		System.out.println(i);
		
		char c = '홓';
		int j = c;
		System.out.println("홓의 문자 번호: " + j); // char가 int 보다 작아서 
		//char의 A 가 65로 전환된다.
		
		int k = 500;
		double d = k;
		System.out.println(d);
		
		
		
		
		
		

	}

}
