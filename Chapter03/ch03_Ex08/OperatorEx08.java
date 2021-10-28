package ch03_Ex08;

public class OperatorEx08 {
	public static void main(String[] args) {
		
		int a = 1_000_000;		//1,000,000
		int b = 2_000_000;		//2,000,000
		
		long c = (long)a * b;	//a * b = 2,000,000,000,000 이 출력 될거 같지만, 결과가 이미 int타입의 값 (-1454759936)
		
		System.out.println(c);
	}
}
