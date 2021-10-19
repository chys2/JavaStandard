package Chapter02.ch02_Ex06;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);		//Scanner클래스의 객체 생성
			
		System.out.print("두자리 정수를 하나 입력해주세요.>");	//입력 받고 싶은거 출력
		String input = scanner.nextLine();				//변수 String타입의 input 선언, 입력 받은 내용 저장 
		int num = Integer.parseInt(input);				//변수 int타입의 num 저장, 입력 받은 문자열 Integer로 변환
		
		System.out.println("입력 내용 :" + input);			//input 출력	
		System.out.printf("num=%d%n",num);				//num 출력
		
		scanner.close();		//scanner 종료
		
	}

}
