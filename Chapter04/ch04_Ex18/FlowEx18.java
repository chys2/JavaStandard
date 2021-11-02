package ch04_Ex18;

public class FlowEx18 {

	public static void main (String args[]) {
		
		for(int i=2; i<10; i++) {		//구구단, 2단부터 10단까지
			
			for(int j=1; j<10; j++) {	//1 ~ 9까지 곱셈
				
				System.out.printf("%d x %d = %d %n", i, j , i * j);
			}
		}
		
	}
}
