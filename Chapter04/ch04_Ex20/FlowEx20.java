package ch04_Ex20;

public class FlowEx20 {

	public static void main (String args[]) {
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) { //1부터 5까지 좌표
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();
		}
		
	}
}
