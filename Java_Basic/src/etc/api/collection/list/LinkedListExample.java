package etc.api.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList <String> list= new LinkedList<>();
		//추가
		
		list.add("홍길동");
		list.add("김철수");
		list.add("박영희");
		
		list.addFirst("맨 앞");
		list.addLast("맨 뒤");
		System.out.println(list);
		
		System.out.println(list.get(3)); 
		//3번 인덱스를 받고 싶을 때 쓰는 방법 
		System.out.println(list.getFirst()); 
		System.out.println(list.getLast()); 
		
		list.remove(0);
		System.out.println(list);
		
		//LIFO -> last in first out -> stack
		//push, pop, peek
		list.push("김뽀삐"); //앞에서부터 추가 
		System.out.println(list);
		
		//삭제하면서 데이터를 읽기 
		System.out.println(list.pop());
		System.out.println(list);
		
		//삭제하지 않으면서 읽기
		System.out.println(list.peek());
		System.out.println(list);
		
		//FIFO -> first in first out -> Queue(대기열?)
		//offer, poll, peek
		list.offer("a");
		list.offer("b");
		list.offer("c");
		System.out.println(list);
		
		System.out.println(list.poll());
		System.out.println(list);
		//*먼저 들어온 것이 나간다
		//*나중에 들어온 것이 나가는 개념은 아니다.(first in first out)
		
		
		System.out.println(list.peek());
		System.out.println(list);
	
	
	}

}
