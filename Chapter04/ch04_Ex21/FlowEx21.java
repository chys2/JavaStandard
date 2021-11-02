package ch04_Ex21;

public class FlowEx21 {

	public static void main (String args[]) {
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				if(i==j) {		//같을 때만 출력
					System.out.printf("[%d, %d]", i, j);
				}else {			//같이 않을 때는 공백 출력
					System.out.printf("%6c", ' ');
				}
			}
			System.out.println();
		}
		
	}
}
