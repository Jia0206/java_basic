package basic.method;

public class Practice {
	static int calcTotal(int x){
		int total = 0;
		for (int i = 1; i<=x; i++) {
			total +=i;
		}
		return total;
	}
	public static void main(String[] args) {
		
		int total = calcTotal(10);
	    System.out.println(total);
	}

}
