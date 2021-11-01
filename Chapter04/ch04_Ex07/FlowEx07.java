package ch04_Ex07;

import java.util.Scanner;

public class FlowEx07 {

	public static void main (String args[]) {

	
		System.out.print("현재 월을 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
	
			switch(month) {
			
				case 3:
				case 4:
				case 5:
					System.out.println("현재 계절은 봄입니다");		//3월부터 5월은 봄
					break;
					
				case 6:
				case 7:
				case 8:
					System.out.println("현재 계절은 여름입니다");		//6월부터 8월은 여름
					break;
					
				case 9:
				case 10:
				case 11:
					System.out.println("현재 계절은 가을입니다");		//9월부터 10월은 가을
					break;

				default:
				//case 12: case 1: case 2:
					System.out.println("현재 계절은 겨울입니다");		//12월부터 2월은 겨울
					break;

			}
		
		}
}
