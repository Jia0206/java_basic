package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		
		/*
		  int i = 1;
		//제어변수 간단하게 
		int total = 0;
		while(i <= 10) {
			total += 1;
			i++;
		}
		*/
		
		
		
		//while  반복횟수가 불명확할 때 사용 (무한반복)
		int total = 0;
		for(int i = 1; i<=10; i++) {
			total += 1;
		}
		
		
		
		
		
		
		//1~200까지의 정수 중 6의 배수이면서 
		//12의 배수는 아닌 수를 
		//가로로 출력해 보세요 (for)
		
		for (int i =1; i<=200; i++) {
			if(i%6==0 && i%12!=0) {
				System.out.print(i +" ");
			}
			
		}
		
		System.out.println();
		
		//1~60000까지의 정수 중 177의 배수의 개수를 구해보세요.(FOR)
		int count = 0;
		for(int i=1; i<=60000; i++) {
			if(i%177==0) {
				count++;
				
			}
			
		}
		System.out.println("정수의 개수: "+count+"개");
		
		
		
		
		//정수를 하나 입력받아서 
		//입력받은 정수까지의 팩토리얼 값을 구하세요
		//팩토리얼) 5! -> 5x4x3x2x1 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		int fac = 1; //팩토리얼 최종 값을 담을 변수
		/*for(int i=1; i<=num; i++){
			fac *= i;
		}*/
		
		for(int i =num; i>=1; i--) {
			fac *= i;
		}
		
		System.out.printf("%d! = %d\n" , num ,fac);
		
		sc.close();
		
		
		
		
		
	}

}
