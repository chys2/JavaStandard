package ch03_Ex25;

import java.util.Scanner;

public class OperatorEx25 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char ch = ' ';
		
		System.out.printf("믄자를 하나 입력하세여.>");
		
		String input = scanner.nextLine();
		
		scanner.close();
		
		ch = input.charAt(0);  //String으로 저장된 문자열중 한 글자만 선택하여 char 타입으로 변환
		
		if('0'<ch && ch<='9') {		//숫자 조건
			System.out.printf("입력하신 문자는 숫자입니다. %n");
		}
	
		if(('a'<ch && ch<='z')||('A'<ch && ch<='Z')) {		//문자 조건
			System.out.printf("입력하신 문자는 영문자입니다. %n");
		}
	
	}
}
