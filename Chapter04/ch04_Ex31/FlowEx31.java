package ch04_Ex31;

public class FlowEx31 {

	public static void main (String args[]) {
		for(int i=0; i<=10; i++) {
			if(i%3==0) {
				continue;		//반복문 안에서만 사용, 조건이 맞아서 사용되면 건너뛰고 반복문을 실행
			}
			System.out.println(i);
		}
	}
}
