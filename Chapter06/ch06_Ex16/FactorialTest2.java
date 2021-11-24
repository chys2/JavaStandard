package ch06_Ex16;

public class FactorialTest2 {
		
	static long factorial(int n) {
		
		if(n<= 0 || n>20) {		//유효성 검사
			return -1;
		}else if(n<=1) {
			return 1;
		}
		return n * factorial(n - 1);		//재귀함수 factorial(int n) 메서드 호출
	}
	public static void main(String args[]) {
		
		int n = 21;
		
		long result = 0;
		
		for(int i = 1; i<=n; i++) {
			
			result = factorial(i);
			
			if(result == -1) {
				System.out.printf("유효하지 않는 값입니다. (0<n<=20) : %d %n ",n);
				break;
			}
			System.out.printf("%2d!=%20d %n", i, result);
			
		}
	}
}
