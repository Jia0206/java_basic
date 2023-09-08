package etc.inner;

public class MainClass {
	// 뺄셈하는 계산이 하고 싶어서 ??? 클래스 파일 만들기 싫어서 
	
	// 내부 클래스(inner class)
	// 해당 객체와 밀접한 연관이 있는 경우 클래스 내에서 클래스 선언.
	// 일반적인 class를 정의할 때는 private을 사용할 수 없지만 
	// 클래스 내에서 클래스를 선언하는 경우에는 private 선언이 가능. 
	// static -> 메모리 효율을 높이기 위해 선언. (바깥쪽 클래스 호출 시마다 재생성하는 것을 방지)
	private static class SubCalculator implements Calculator{

		@Override
		public int operate(int n1, int n2) {
			// TODO Auto-generated method stub
			return n1- n2;
		}
		
	}

	public static void main(String[] args) {
		
		//덧셈 계산을 하는 계산기를 만들어 쓰고 싶다. 
		Calculator addCal = new AddCalculator();
		System.out.println(addCal.operate(30, 50));
		
		//뺄셈 계산을 하는 계산기가 필요.
		Calculator sub1 = new SubCalculator();
		Calculator sub2 = new SubCalculator();
		Calculator sub3 = new SubCalculator();
		System.out.println(sub1.operate(100, 40));
		
		//곱셈 계산을 하는 계산기가 필요.
		Calculator multiCal = new Calculator() {
			//인터페이스(Calculator)는 클래스를 꼭 함께 해야지만 가능 
			//multiCal만 변수생성가능
			// 익명 클래스를 생성 
			@Override
			public int operate(int n1, int n2) {
				return n1*n2;
			}
		};
			System.out.println(multiCal.operate(5, 7));
			
			// 나눗셈을 하는 계산기 (람다) -> 인터페이스의 추상메서드가 딱 
			// 1개일 경우에만 가능 .
			// 어차피 인터페이스에 추상메서드가 1개이기 때문에 이름을 따로 
			// 명시하지 않음. 
			// 메서드 내부 로직이 단 한 줄이라면 괄호 생략 가능
			// -> return 값으로 취급.
			
			Calculator divCal = (n1,n2) -> n1/n2;
			System.out.println(divCal.operate(25, 5));
		
		/*
		 * Calculator divCal = (n1,n2) -> n1/n2;는 
		 * 
		 -> Calculator multiCal = new Calculator() {
			@Override
			public int operate(int n1, int n2) {
				return n1/n2;
		 */
	}

}
