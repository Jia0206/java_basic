package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		
		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.
         
        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
       */
			Scanner sc = new Scanner(System.in);
		
			int count1=0;
			int count2=0;
		//계속해서 0으로 포멧되기 때문에 while문 안에 사용하지 않기
			
		while(true){
			//난수 생성은 반복문 안에서 새롭게 계속 나와야하기에 
			//난수는 while문 안에서 사용되어야 한다.
			int num1 =(int)((Math.random()*100)+1);
			int num2 =(int)((Math.random()*100)+1);
			int num = (int) (Math.random()*2);
			
			int correct; // 정답
			if(num == 0) {
				System.out.println(num1+"+"+num2+"=?");
				correct = num1+num2;
				
			}else {
				System.out.println(num1+"-"+num2+"=?");
				correct = num1-num2;
			}
			
			
			System.out.println("문제를 그만 푸시려면 0을 입력하세요.");
			System.out.print("> ");
			int answer = sc.nextInt();
			
			if(answer == 0) {
			 System.out.println("종료합니다.");
			 break;
			}else if(answer ==num1+num2){
			 System.out.println("정답입니다.");
			 count1++;
			}else {
			System.out.println("틀렸습니다.");
			count2++;}
			
			
			System.out.println("-------------------");
			System.out.println("정답 횟수: " +count1 +"회");
			System.out.println("오답 횟수: " +count2 +"회");
			
		
		
		
		
		
		
		
	}
		sc.close();
	}
}
