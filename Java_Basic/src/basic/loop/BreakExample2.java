package basic.loop;

import java.util.Scanner;

public class BreakExample2 {

	public static void main(String[] args) {
		
		/*
        # 무한 루프
        
        - 무한 루프는 반복 횟수를 정하지 않고 무한하게 반복문을
         실행하는 구조입니다.
         
        - 처음 반복문을 구성할 때, 개발자가 사전에 정확한 반복 횟수를
         파악할 수 없다면, 무한루프를 일단 구성해 두고
         특정 조건을 통해 종료할 수 있도록 코드를 설계합니다.
         
        - 일반적으로 정확한 반복 횟수를 알고 있다면 for문을 사용하고,
         정확한 반복 횟수를 모른다면 while을 통한 무한 루프를 형성하여
         사용합니다. while(true), for(;;)
        */
		
		int i = 1; 
		
		while(true) {
			if(i>10) break;
			
			System.out.println("안녕하세요" +i);
			i++;
		}
	//break가 없으면 미완성 코드이기 때문에 
	//마무리 코드(break)를 꼭 작성해야함
		
		
		
		System.out.println("------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("15 x 6 = ?");
			System.out.println("정답을 모를 경우 0을 입력하면 종료됩니다.");
			System.out.print("> ");
			int answer = sc. nextInt();
			
			if(answer == 90) {
				System.out.println("정답입니다!");
				break;
			}else if(answer == 0) {
				System.out.println("정답은 90이 였습니다~!");
			}else {
				System.out.println("틀렸지롱 ~!");
			}
			
		}
		
		sc.close();
	}

}
