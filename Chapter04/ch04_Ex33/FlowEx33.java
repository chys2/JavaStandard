package ch04_Ex33;

import java.util.Scanner;

public class FlowEx33 {

	public static void main (String args[]) {
		
		Loop1:
		for(int i =2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				if(j==5) {
//					break Loop1;		//Loop1 이름의 for문 종료
//					break;			//바로 위에 포문 종료
//					continue Loop1;		//Loop1 이름의 for문 시작
//					continue;			//5건너뛰기
				}
				System.out.println(i +"*" + j + "=" + i * j);
			}
			
		}
	}
}
