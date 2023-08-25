package basic.ifquiz;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		
		/*
        - 정수 3개를 입력 받습니다.
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        
        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수의 최대값을 구합니다.");
		
		System.out.print("a의 값: ");
		int a = sc.nextInt();
		
		System.out.print("b의 값: ");
		int b = sc.nextInt();
		
		System.out.print("c의 값: ");
		int c = sc.nextInt();
		
		int max, mid, min;
		
		if (a>b && a>c) {//num1이 max다!
			max = a;
			if(b>c) {
				mid = b; min = c;
			}else {
				mid = c; min =b;
			}
			
		}else if(b>a && b>c) {//b가 max다!
			max = b;
			if(a>c) {
				mid =a; min = c;
			}else {
				mid=c; min=a;
				
			}
		}else {//c가 max다!
			max = c;
			if(a>b) {
				mid=a; min =b;
			}else {
				mid = b; min =a;
			}
		}
		
		System.out.println("------------------");
		System.out.println("최대값: " + max);
		System.out.println("중간값: " + mid);
		System.out.println("최소값: " + min);
		
		
		
	}

}
