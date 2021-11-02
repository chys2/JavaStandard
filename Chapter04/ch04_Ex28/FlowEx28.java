package ch04_Ex28;

import java.util.Scanner;

public class FlowEx28 {

	public static void main (String args[]) {
		
		int input = 0, answer =0;
		
		answer = (int)(Math.random()*100)+1;		//랜덤 숫자 1부터 100중 발생
		
		System.out.println(answer);
		
		Scanner scanner = new Scanner(System.in);
		
		do {		//최소한의 한번은 수행될 것을 보장
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			
			input = scanner.nextInt();
			
			if (input> answer) {
				System.out.println("더 작은 수를 다시 입력하세요.");
			}else if (input < answer) {
				System.out.println("더 큰 수로 다시 입력하세요.");
			}
		}while(input != answer);	//같지 않을때 do 조건 실행
		
		System.out.println("정답입니다.");
	}
}
