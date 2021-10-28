package ch04_Ex27;

import java.util.Scanner;

public class FlowEx27 {

	public static void main (String args[]) {
		
		int num;
		int sum = 0;
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요. (끝낼려면 0일 입력)");
		
		while(flag) {
			System.out.print(">>");
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {
				sum += num;
			}else {
				flag = false;
			}
		}
		System.out.println("합계: "+sum);
	}
}
