package ch03_Ex12;

public class OperatorEx12 {
	public static void main(String[] args) {
		
		char c1 = 'a';		//97저장
		char c2 = c1;		//c2에 c1에 저장되어 있는 값을 저장
		char c3 = ' ';
		
		int i = c1 + 1;		//97 + 1
		
		c3 =(char)(c1 + 1);	//b
		c2++;				//최초 a 저장 b로 증감
		c2++;				//c로 증감
		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
		
	
	}
}
