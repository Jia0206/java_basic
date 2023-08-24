package basic.loop;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=10;i++) {
			if(i % 2 !=0) continue;
			//홀수 구하는 공식 
			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료!");
		
		

	}

}
