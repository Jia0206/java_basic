package basic.ifquiz;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		
		/*
        - 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰 지
        혹은 같은지를 판별하시면 됩니다.
        ex)
        입력받은 수: 4, 7 -> 7이 큰 수 입니다.
        입력받은 수: 10, 3 -> 10이 큰 수 입니다.
        입력받은 수: 5, 5 -> 같은 수 입니다.
       */
		Scanner sc = new Scanner(System.in);
		int a = 5;
		int b = 8;
		
		String result = (a < b? "a가 b보다 작습니다"  : "a가 b보다 큽니다" );
		System.out.println(result);
		
		int i = 16;
		int q = 25;
		
		String result2 = (i<q ? "i가 q보다 작습니다.": "i가 q보다 큽니다.");
		System.out.println(result2);
		
	
		}
		
		
		
	}


