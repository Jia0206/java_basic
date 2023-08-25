package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 1. 삭제할 친구를 입력받아서 삭제를 진행하세요.
		 
		 2. 입력받은 이름이 없다면 없다고 얘기해 주세요.
		 */
		
		Scanner sc =new Scanner(System.in);
		String[]friends ={"가","나","다","라","마"};
		System.out.println("친구의 이름: "+Arrays.toString(friends));
		System.out.println("삭제할 친구를 입력하세요: ");
		String name =sc.next();
		
		boolean flag = false;
		for(int idx=0;idx<friends.length;idx++){
			if(name.equals(friends[idx])) {
				flag =true;
				for(int i=0; i<friends.length-1; i++) {
					friends[i]=friends[i+1];
				}
				break;
			}
		};
		
		if(!flag) {
			System.out.println(name+"없는 이름입니다.");
		}else {
			String[]temp = new String[friends.length-1];
			for(int k=0; k<temp.length; k++) {
				temp[k] = friends[k];
			}
			friends = temp; 
			temp = null;
			
			System.out.println("삭제 후 정보: " + Arrays.toString(friends));
		}

		sc.close();
			
		}
		
		
	}


