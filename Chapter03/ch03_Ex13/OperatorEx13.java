package ch03_Ex13;

public class OperatorEx13 {
	public static void main(String[] args) {
		
		char c1 = 'a';
		
//		char c2 = c1 + 1; 		//컴파일 에러
		char c2 = (char) (c1 +1);		//형변환
		
		char c3 = 'a' +1;
		
		System.out.println(c2);
		System.out.println(c3);
	
	}
}
