package ch04_Ex09;

import java.util.Scanner;

public class FlowEx09 {

	public static void main (String args[]) {
		
		char grade = ' ';
	
		System.out.print("당신의 점수를 입력하세요.(1~100)>");
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();		//점수 입력
	
			switch(score) {
			
				case 100: case 99: case 98: case 97: case 96:
				case 95: case 94: case 93: case 92: case 91: case 90:
				
					grade ='A';		//100부터 90까지 A
					break;
					
				case 89: case 88: case 87: case 86: case 85: 
				case 84: case 83: case 82: case 81: case 80:
				
					grade ='B';		//89부터 80까지 B
					break;
					
				case 79: case 78: case 77: case 76: case 75: 
				case 74: case 73: case 72: case 71: case 70:
				
					grade ='C';		//79부터 70까지 B
					break;
				

				default:		
					grade ='F';		//위의 조건을 제외한 나머지
					

			}
			
		System.out.println("당신의 학점은" + grade + "입니다");
	}
}
