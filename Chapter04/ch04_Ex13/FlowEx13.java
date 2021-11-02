package ch04_Ex13;

public class FlowEx13 {

	public static void main (String args[]) {
		
		int sum = 0; 
		
		for(int i =1; i<=10; i++) {		//1부터 10까지
			sum +=i;					//누적 합
			System.out.printf("1부터 %2d의 까지의 합: %2d%n", i,sum);		//55
		
		}
	}
}
