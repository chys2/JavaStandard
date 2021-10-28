package ch03_Ex06;

public class OperatorEx06 {
	public static void main(String[] args) {
			
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a * b); 		//300이지만 int에서 byte로 형변환 2진수에 의해서 2진수 44
		System.out.println(c);
	}
}
