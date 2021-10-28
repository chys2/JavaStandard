package ch03_Ex09;

public class OperatorEx09 {
	public static void main(String[] args) {
		
		long a = 1_000_000 * 1_000_000;		//오버플로우
		long b = 1_000_000 * 1_000_000L;	//1000000000000 
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}
}
