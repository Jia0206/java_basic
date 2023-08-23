package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
        # 사용자에게 구구단 단수를 입력받아서
        해당 단수의 구구단을 출력해 보세요.
        ex)
        
        구구단을 입력하세요: 4
        *** 구구단 4 단 ***
        4 x 1 = 4
        4 x 2 = 8
        4 x 3 = 12
        4 x 4 = 16 
        .
        .
        .
        4 x 9 = 36
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단을 입력하세요: ");
		
		int num =sc.nextInt();
		int i = 1;
		while(i<=9) {
			System.out.println(num+"x"+i+"="+num*i);
			i++;
		}

		sc.close();
		
		
		
	}

}
