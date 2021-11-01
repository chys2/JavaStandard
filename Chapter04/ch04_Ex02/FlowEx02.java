package ch04_Ex02;

import java.util.Scanner;

public class FlowEx02 {

	public static void main (String args[]) {

		int input;
		
		System.out.print("숫자를 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();	//화면을 통해 입력받은 내용을 tmp 저장
		input= Integer.parseInt(tmp);		//문자 tmp를 정수로 변환
		
		if(input ==0) {						//변환값이 0일 때
			System.out.println("입력하신 숫자는 0입니다.");
		}
		if(input !=0) {						//변환값이 0이 아닐떄 
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다.", input);
		
		}
	}
}

