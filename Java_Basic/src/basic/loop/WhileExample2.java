package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		
		int i = 48;
		while(i<=150) {
			if(i%8 ==0) {
				System.out.print(i + " ");
				}
			i++;
	}
		System.out.println();// 단순 줄 개행
		
		//1~100까지의 정수 중 4의 배수이면서 
		//8의 배수는 아닌 수를 가로로 출력해 보세요.
		
		int n = 1;
		while(n<=100) {
			if(n%4==0 && n%8!=0){
				System.out.print(n + " ");
			}

			
		System.out.println();
		
		//1~30000까지의 정수 중 258의 배수의 개수를 출력.
		
		int a =1;
		int total2 =0;//배수의 개수를 세 줄 변수
		while(a<=30000) {
			if(a%258 == 0) {
				total2++;
				
			}
			a++;
		}
		System.out.println("1~30000중 258의 배수의 개수:" +total2+"개");
		
		//1000의 약수의 개수를 구하세요.
		
		 int b = 1;
		 int res =0;
		 while(b<=1000) {
			 if(1000%b == 0) {
				 res++;
			 }
			 b++; 
		 }
		
		System.out.println("1000의 약수의 개수는: " +res+ "개");
		
		}
	
  }
}

