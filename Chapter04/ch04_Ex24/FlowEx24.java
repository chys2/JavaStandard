package ch04_Ex24;

public class FlowEx24 {

	public static void main (String args[]) {
		
		int i = 11;
		
		System.out.println("카운트 다운을 시작합니다.");
		
		while(i-- !=0) {
			System.out.println(i);
			
			for(int j =0; j<2_000_000_000; j++) {
				;		//한번만 수행
			}
		}
		System.out.println("Game Over");
	}
}
