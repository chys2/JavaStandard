package ch04_Ex05;

import java.util.Scanner;

public class FlowEx05 {

	public static void main (String args[]) {

		int score = 0;
		
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력하세여.>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();		//점수 입력
		
		System.out.printf("당신의 점수는 %d입니다. %n", score);
		
		if(score >= 90 ) {				//90점 이상
			grade = 'A';
			if(score >= 98) {			//90점 이상이면서 98점 이상이면 A+
				opt='+';
			}else if(score < 94) {		//90점 이상이면서 94점 미만이면 A-
				opt='-';
			}
		}else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt='+';
			}else if(score < 84) {
				opt='-';
			}
		}else if(score >=70) {
			grade = 'C';
			if(score >= 78) {
				opt='+';
			}else if(score < 74) {
				opt='-';
			}
		}else {
			grade = 'D';
		}
		
		//저 사이 조건이 맞지 않으면 0출력 (A0, B0)
		System.out.printf("당신의 학점은 %c%c입니다",grade,opt);
	}
}
